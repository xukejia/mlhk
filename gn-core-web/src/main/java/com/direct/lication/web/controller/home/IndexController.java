/**
 * com.direct.gn
 */
package com.direct.lication.web.controller.home;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.chobits81.lication.common.IframeConstants;
import com.chobits81.lication.common.MvcConstant;
import com.chobits81.lication.enums.CustomExceptionEnum;
import com.chobits81.lication.pojo.vo.ApplicationVo;
import com.chobits81.lication.pojo.vo.MenuVo;
import com.chobits81.lication.pojo.vo.ResultVO;
import com.chobits81.lication.pojo.vo.UserDetailVo;
import com.chobits81.lication.utils.CommonUtils;
import com.chobits81.lication.utils.CookieUtils;
import com.chobits81.lication.utils.DtoUtil;
import com.chobits81.lication.utils.ExceptionToString;
import com.chobits81.lication.utils.MenuTree;
import com.chobits81.lication.utils.SyscfgUtil;
import com.direct.lication.web.controller.BaseController;
import com.smart.rbac.application.api.ApplicationApi;
import com.smart.rbac.tokenAuth.api.TokenAuthApi;

/**
 * @author cc
 *
 */

@Controller
@RequestMapping(value = "/admin")
public class IndexController extends BaseController {
	private static Logger logger = LoggerFactory.getLogger("log_db_gw");

	@Autowired
	private ApplicationApi applicationApi;

	@Autowired
	private TokenAuthApi tokenAuthApi;

	@RequestMapping(value = "/", method = { RequestMethod.POST, RequestMethod.GET })
	public String home(HttpServletRequest request, ModelMap modelMap) {
		return "index";
	}

	/**
	 * 获取应用secret
	 */
	@RequestMapping(value = "/getsecret", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public Object getsecret() {
		try {
			String secret = SyscfgUtil.getValue(MvcConstant.SECRET);
			if (CommonUtils.isNotBlank(secret)) {
				return DtoUtil.returnDataSuccess(secret);
			} else {
				return DtoUtil.returnFail(CustomExceptionEnum.ERROR_SECRET_NULL.getMsg(),
						CustomExceptionEnum.ERROR_SECRET_NULL.getCode());
			}
		} catch (Exception e) {
			e.printStackTrace();
			return DtoUtil.returnFail(
					CustomExceptionEnum.ERROR_SECRET.getMsg() + ExceptionToString.exceptionToString(e),
					CustomExceptionEnum.ERROR_SECRET.getCode());
		}
	}

	/**
	 * 获取测试回调地址
	 */
	@RequestMapping(value = "/getRefererUrl", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public Object getRefererUrl() {
		try {
			String RefererUrl = SyscfgUtil.getValue(MvcConstant.REFERERURL);
			if (CommonUtils.isNotBlank(RefererUrl)) {
				return DtoUtil.returnDataSuccess(RefererUrl);
			} else {
				return DtoUtil.returnDataSuccess("");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return DtoUtil.returnFail(
					CustomExceptionEnum.ERROR_REFERERURL.getMsg() + ExceptionToString.exceptionToString(e),
					CustomExceptionEnum.ERROR_REFERERURL.getCode());
		}
	}

	/**
	 * 获取应用版本号
	 */
	@RequestMapping(value = "/getVersion", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public Object getVersion() {
		try {
			String version = SyscfgUtil.getValue(MvcConstant.VERSION);
			if (CommonUtils.isNotBlank(version)) {
				return DtoUtil.returnDataSuccess(version);
			} else {
				return DtoUtil.returnFail(CustomExceptionEnum.ERROR_VERSION_NULL.getMsg(),
						CustomExceptionEnum.ERROR_VERSION_NULL.getCode());
			}
		} catch (Exception e) {
			e.printStackTrace();
			return DtoUtil.returnFail(
					CustomExceptionEnum.ERROR_VERSION.getMsg() + ExceptionToString.exceptionToString(e),
					CustomExceptionEnum.ERROR_VERSION.getCode());
		}
	}

	/**
	 * 生成测试token
	 */
	@RequestMapping(value = "/gettestToken", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public Object gettestToken() {
		try {
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			if (null != uuid && !"".equals(uuid)) {
				return DtoUtil.returnDataSuccess(uuid);
			} else {
				return DtoUtil.returnFail(CustomExceptionEnum.ERROR_TOKEN_FAIL.getMsg(),
						CustomExceptionEnum.ERROR_TOKEN_FAIL.getCode());
			}
		} catch (Exception e) {
			e.printStackTrace();
			return DtoUtil.returnFail(CustomExceptionEnum.ERROR_TOKEN.getMsg() + ExceptionToString.exceptionToString(e),
					CustomExceptionEnum.ERROR_TOKEN.getCode());
		}
	}

	/**
	 * 将Cookie存入其他应用域
	 */
	@RequestMapping(value = "/addCookie", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public Object addCookie(HttpServletRequest request, HttpServletResponse response) {
		String loginToken = request.getParameter("loginToken");
		try {
			Cookie cookie = new Cookie(IframeConstants.LOGINTOKEN, loginToken);
			cookie.setPath("/");
			response.addCookie(cookie);
			System.out.println("客户端存入cookie成功");
			return DtoUtil.returnDataSuccess(loginToken);
		} catch (Exception e) {
			e.printStackTrace();
			return DtoUtil.returnFail(
					CustomExceptionEnum.ERROR_ADDCOOKIE.getMsg() + ExceptionToString.exceptionToString(e),
					CustomExceptionEnum.ERROR_ADDCOOKIE.getCode());
		}

	}

	@RequestMapping(value = "/load", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public Object load(HttpServletRequest request, HttpSession session) {

		// 获取当前登录用户信息
		try {
			String secret = SyscfgUtil.getValue(MvcConstant.SECRET);
			String loginToken = CookieUtils.getLoginToken(request);

			String resultVoJson = tokenAuthApi.getCurrentUserDetailVoBysecret(loginToken, secret);
			if (null != resultVoJson && !"".equals(resultVoJson)) {
				ResultVO resultVO = JSON.parseObject(resultVoJson, ResultVO.class);
				if (null != resultVO) {
					if (resultVO.getCode() == 0) {
						return DtoUtil.returnFail(resultVO.getMsg() + resultVO.getError(),
								CustomExceptionEnum.USER_INFO_ERROR.getCode());
					} else if (resultVO.getCode() == 1) {
						if (CommonUtils.isBlank(resultVO.getData())) {
							return DtoUtil.returnFail(CustomExceptionEnum.COMMON_ERROR_LOGINUSER.getMsg(),
									CustomExceptionEnum.COMMON_ERROR_LOGINUSER.getCode());
						}
						UserDetailVo userDetailVo = JSON.parseObject(resultVO.getData(), UserDetailVo.class);
						if (CommonUtils.isNotBlank(userDetailVo.getRealname())) {
							if (null != userDetailVo.getMenuJsonString()
									&& !"".equals(userDetailVo.getMenuJsonString())) {
								List<MenuVo> menuVoList = JSON.parseArray(userDetailVo.getMenuJsonString(),
										MenuVo.class);
								MenuTree.setMenuChilren(menuVoList, userDetailVo.getId().toString());

								String MenuJsonString = JSON.toJSONString(menuVoList);
								userDetailVo.setMenuJsonString(MenuJsonString);
							}

							// 将用户信息存入session
							session.setAttribute(IframeConstants.SEESION_USER, userDetailVo);
							return DtoUtil.returnDataSuccess(userDetailVo);
						}
						return DtoUtil.returnFail(CustomExceptionEnum.COMMON_ERROR_LOGINUSER.getMsg(),
								CustomExceptionEnum.COMMON_ERROR_LOGINUSER.getCode());
					}
				}
			}
			return DtoUtil.returnFail(CustomExceptionEnum.USER_INFO_NULL.getMsg(),
					CustomExceptionEnum.USER_INFO_NULL.getCode());
		} catch (Exception e) {
			e.printStackTrace();
			return DtoUtil.returnFail(
					CustomExceptionEnum.USER_INFO_ERROR.getMsg() + ExceptionToString.exceptionToString(e),
					CustomExceptionEnum.USER_INFO_ERROR.getCode());
		}
	}

	@RequestMapping(value = "/appload", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public Object appload(HttpServletRequest request) {
		try {
			String resultVoJson = applicationApi.getApplicationVoJson();
			ResultVO resultVO = JSON.parseObject(resultVoJson, ResultVO.class);
			if (null != resultVO) {
				if (resultVO.getCode() == 0) {
					return DtoUtil.returnFail(resultVO.getMsg() + resultVO.getError(),
							CustomExceptionEnum.ERROR_APPLOAD.getCode());
				} else if (resultVO.getCode() == 1) {
					String appVoJson = resultVO.getData();
					if (null != appVoJson && !"".equals(appVoJson)) {
						List<ApplicationVo> list = JSON.parseArray(appVoJson, ApplicationVo.class);

						String appname = SyscfgUtil.getValue(MvcConstant.APPNAME);
						if (CommonUtils.isNotBlank(appname)) {
							for (int i = 0; i < list.size(); i++) {
								if (appname.equals(list.get(i).getAppname())) {
									String appnamelist = list.get(i).getAppname();
									String refererUrlList = list.get(i).getRefererUrl();
									list.remove(i);
									ApplicationVo appVO = new ApplicationVo();
									appVO.setAppname(appnamelist);
									appVO.setRefererUrl(refererUrlList);
									list.add(0, appVO);
									break;
								}
							}
						}

						appVoJson = JSON.toJSONString(list);
					}
					if (null != appVoJson && !"".equals(appVoJson)) {
						return DtoUtil.returnDataSuccess(appVoJson);
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			return DtoUtil.returnFail(
					CustomExceptionEnum.ERROR_APPLOAD.getMsg() + ExceptionToString.exceptionToString(e),
					CustomExceptionEnum.ERROR_APPLOAD.getCode());
		}
		return DtoUtil.returnFail(CustomExceptionEnum.ERROR_APPLOAD_NULL.getMsg(),
				CustomExceptionEnum.ERROR_APPLOAD_NULL.getCode());
	}

	private void writeStream(JSONObject result, String string) {
		// TODO Auto-generated method stub

	}

	@RequestMapping(value = "/logout", method = { RequestMethod.POST, RequestMethod.GET })
	public String logout(HttpServletRequest request, SessionStatus sessionStatus, HttpSession session,
			ModelMap modelMap) {
		sessionStatus.setComplete();
		session.removeAttribute(IframeConstants.SEESION_USER);

		UserDetailVo userDetailVo = null;
		try {

			String secret = SyscfgUtil.getValue(MvcConstant.SECRET);
			String loginToken = CookieUtils.getLoginToken(request);
			String resultVoJson = tokenAuthApi.getCurrentUserDetailVoBysecret(loginToken, secret);
			ResultVO resultVO = JSON.parseObject(resultVoJson, ResultVO.class);
			if (null != resultVO) {
				if (resultVO.getCode() == 0) {
					return "index";
				} else if (resultVO.getCode() == 1) {
					userDetailVo = JSON.parseObject(resultVO.getData(), UserDetailVo.class);
				}
			}

			if (null != userDetailVo) {
				tokenAuthApi.logOut(CookieUtils.getLoginToken(request));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "index";
	}

	@RequestMapping(value = "/index", method = { RequestMethod.POST, RequestMethod.GET })
	public String index(HttpServletRequest request, ModelMap modelMap) {
		return "index";
	}
	
	@RequestMapping(value = "/pwdModify", method = { RequestMethod.POST, RequestMethod.GET })
	public String pwdModify(HttpServletRequest request, ModelMap modelMap) {
		return "pwdModify";
	}
	
	@RequestMapping(value = "/modifyCurrentUserPwd", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public Object modifyCurrentUserPwd(HttpServletRequest request, HttpSession session) {
		String submit = request.getParameter("submit");
		// 新密码
		String password = request.getParameter("password");
		// 旧密码
		String op = request.getParameter("op");
		UserDetailVo userDetailVo = null;
		try {
			if (CommonUtils.isNotBlank(submit)) {
				String resultVoJson = tokenAuthApi.getCurrentUserDetailVoBysecret(CookieUtils.getLoginToken(request),
						SyscfgUtil.getValue(MvcConstant.SECRET));
				if (null != resultVoJson && !"".equals(resultVoJson)) {
					ResultVO resultVO = JSON.parseObject(resultVoJson, ResultVO.class);
					if (null != resultVO) {
						if (resultVO.getCode() == 0) {
							return DtoUtil.returnFail(resultVO.getMsg() + resultVO.getError(),
									CustomExceptionEnum.COMMON_ERROR_LOGINUSER.getCode());

						} else if (resultVO.getCode() == 1) {
							if (CommonUtils.isBlank(resultVO.getData())) {
								return DtoUtil.returnFail(CustomExceptionEnum.COMMON_ERROR_LOGINUSER.getMsg(),
										CustomExceptionEnum.COMMON_ERROR_LOGINUSER.getCode());
							}
							userDetailVo = JSON.parseObject(resultVO.getData(), UserDetailVo.class);
							if (CommonUtils.isNotBlank(userDetailVo.getRealname())) {
								String resultModifyPwdJson = tokenAuthApi.modifyCurrentUserPwd(
										CookieUtils.getLoginToken(request), userDetailVo.getUsername(), op, password);
								ResultVO resultModifyPwdVo = JSON.parseObject(resultModifyPwdJson, ResultVO.class);
								if (null != resultModifyPwdVo) {
									if (resultModifyPwdVo.getCode() == 0) {
										return DtoUtil.returnFail(
												resultModifyPwdVo.getMsg() + resultModifyPwdVo.getError(),
												CustomExceptionEnum.USER_MODIFY_PWD_ERROR.getCode());
									} else if (resultModifyPwdVo.getCode() == 1) {
										if (CommonUtils.isBlank(resultModifyPwdVo.getData())) {
											return DtoUtil.returnFail(
													CustomExceptionEnum.USER_MODIFY_PWD_ERROR.getMsg(),
													CustomExceptionEnum.USER_MODIFY_PWD_ERROR.getCode());
										}
										return DtoUtil.returnSuccess("修改密码成功");
									}
								} else {
									if (CommonUtils.isBlank(resultModifyPwdVo.getData())) {
										return DtoUtil.returnFail(CustomExceptionEnum.USER_MODIFY_PWD_ERROR.getMsg(),
												CustomExceptionEnum.USER_MODIFY_PWD_ERROR.getCode());
									}
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return DtoUtil.returnFail(ExceptionToString.exceptionToString(e),
					CustomExceptionEnum.USER_MODIFY_PWD_ERROR.getCode());
		}
		return DtoUtil.returnFail(CustomExceptionEnum.COMMON_ERROR_LOGINUSER.getMsg(),
				CustomExceptionEnum.COMMON_ERROR_LOGINUSER.getCode());
	}

}
