package com.direct.gn.web.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.direct.gn.utils.Constant;

/**
 * @Title:
 * @Description: 验证码相关的工具类
 * @author Baker Hou
 * @date 2013年12月28日
 */
public class VerifyCodeUtil
{
	private final static Random random = new Random();

	/**
	 * 图片验证码长度
	 */
	private final static int CODE_LENGHTH = 4;

	/**
	 * 手机短信验证码长度
	 */
	private final static int SMS_CODE_LENGHTH = 6;

	/**
	 * 验证码字符集
	 */
	private final static char[] VERIFY_CODE_CHARS = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N',
	        'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k',
	        'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '2', '3', '4', '5', '6', '7', '8', '9' };

	/**
	 * 
	 * description: 获取随机颜色
	 * 
	 * @param fc
	 * @param bc
	 * @return
	 * @author Baker
	 */
	public static Color getRandomColor(int fc, int bc)
	{

		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}

	/**
	 * 
	 * description: 用给定的字符串生成图片
	 * 
	 * @param codeStr
	 * @return
	 * @author Baker
	 */
	public static BufferedImage createCodePicture(String codeStr)
	{

		// codeStr = codeStr.toUpperCase();

		int width = 80, height = 30;// 图片宽高
		int fontSize = 22;
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_4BYTE_ABGR);
		Graphics2D g = image.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
		// g.setRenderingHint(RenderingHints.KEY_TEXT_LCD_CONTRAST, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
		Random random = new Random();
		// g.setColor(Color.LIGHT_GRAY);//背景色
		g.fillRect(0, 0, width, height);// 画矩形
		g.setFont(new Font("王汉宗空心勘亭简", Font.BOLD, fontSize));
		// g.setFont(new Font("华文彩云", Font.BOLD, fontSize));
		// g.setColor(getRandomColor(160, 200));
		// for (int i = 0; i < 100; i++)//画100条背景线
		// {
		// int x = random.nextInt(width);
		// int y = random.nextInt(height);
		// int xl = random.nextInt(55);
		// int yl = random.nextInt(14);
		// g.drawLine(x, y, x + xl, y + yl);
		// }
		g.setColor(new Color(0XFF5783));

		// 画横线的y坐标
		// int h1 = random.nextInt(fontSize-8) + (height-fontSize)/2+4;
		// int h2 = random.nextInt(fontSize-8) + (height-fontSize)/2+4;
		// g.drawLine(0, h1, 80, h2);
		// g.drawLine(0, h1+1, 80, h2+1);

		for (int i = 0; i < codeStr.length(); i++)
		{
			// g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));

			// g.drawString(String.valueOf(codeStr.charAt(i)), 18 * i + 3, 20);

			AffineTransform affine = new AffineTransform();
			affine.setToRotation(Math.PI / 4 * random.nextDouble() * (random.nextBoolean() ? 1 : -1),
			        (width / CODE_LENGHTH) * i + fontSize / 2, height / 2);
			g.setTransform(affine);

			g.drawString(String.valueOf(codeStr.charAt(i)), ((width - 10) / CODE_LENGHTH) * i + 5,
			        (height - fontSize) / 2 + fontSize - 5);
		}

		g.dispose();

		return image;
	}

	/**
	 * 
	 * description: 产生长度为CODE_LENGHTH的随机字符串，包含字母的，图片验证码用
	 * 
	 * @return
	 * @author Baker
	 */
	public static String getCodeString()
	{

		StringBuilder codeString = new StringBuilder(CODE_LENGHTH);
		for (int i = 0; i < CODE_LENGHTH; i++)
		{
			char aChar = VERIFY_CODE_CHARS[random.nextInt(VERIFY_CODE_CHARS.length)];
			codeString.append(aChar);
		}
		return codeString.toString();
	}

	/**
	 * 
	 * 生成随机的长度为SMS_CODE_LENGHTH的，纯数字的字符串，短信验证码用
	 * 
	 * @return
	 * @author Baker
	 */
	public static String getRandomSMSCodeString()
	{

		StringBuilder codes = new StringBuilder(SMS_CODE_LENGHTH);
		for (int i = 0; i < SMS_CODE_LENGHTH; i++)
		{
			int aChar = random.nextInt(10);
			codes.append(aChar);
		}
		return codes.toString();
	}

	/**
	 * 
	 * description: 判断给定的字符串和session中的验证码是否相等
	 * 
	 * @param req
	 * @param code
	 * @return
	 * @author Baker
	 */
	public static boolean isCodeEquals(HttpServletRequest req, String code)
	{

		if (null == code || code.length() != CODE_LENGHTH)
			return false;

		HttpSession session = req.getSession(false);
		if (session == null)
			return false;

		String codeSession = (String) session.getAttribute(Constant.VERIFY_CODE_PICTRUE_SESSION_KEY);
		if (codeSession == null)
			return false;

		boolean result = codeSession.equalsIgnoreCase(code);
		// 相等时移除验证码，防止不加载验证码图片时可多次使用第一次的验证码漏洞
		if (result)
		{
			session.removeAttribute(Constant.VERIFY_CODE_PICTRUE_SESSION_KEY);
		}
		return result;

	}

}
