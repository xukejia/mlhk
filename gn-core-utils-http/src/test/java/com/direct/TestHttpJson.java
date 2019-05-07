package com.direct;
import com.direct.gn.utils.HttpClientUtil;

/**
 * com.direct.gn
 */

/**
 * @author cc
 *
 */
public class TestHttpJson
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		///ota/qunar
		String res = HttpClientUtil.getInstance().sendHttpPostByJson("http://localhost:8082/ota/qunar/search", "111");
		
		System.out.println(res);
	}

}
