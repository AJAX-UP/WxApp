package com.common.util;

/**
 * 
 * @author wesion
 *	字符串工具类	
 *
 */
public class StringUtil {
	
	public static boolean isBlank(String str) {
		
		if (str == null || str.equals("") || str.trim().equals("")) {
			return true;
		}
		
		return false;
	}
}
