package com.common.net;

import org.apache.log4j.Logger;

import java.io.InputStream;
import java.util.Properties;

public class RedirectConstants {
	private static final Logger LOG = Logger.getLogger(RedirectConstants.class);

	public static String REDIRECT_URL = null;
	public static String CHANGZHENG_ID = null;
	public static String THEAPIURL = null;
	public static String HTTPKEY = null;
	
	//数据统计使用
	public static String PLATFORM_HOSPITAL_ID = null;
	public static String VC_PROJECTID = null;
	public static String HOSPITAL_NAME = null;
	public static String STATISTICS_URL = null;
	
	static {
		Properties prop = new Properties();
		InputStream in;
		try {
			in = RedirectConstants.class.getResourceAsStream("/configure.properties");
			prop.load(in);
			REDIRECT_URL = prop.getProperty("redirect.url");
			CHANGZHENG_ID = prop.getProperty("changzheng.id");
			THEAPIURL = prop.getProperty("the.api.url");
			HTTPKEY = prop.getProperty("httpKey");
			PLATFORM_HOSPITAL_ID = prop.getProperty("platform.Hospital.id");
			VC_PROJECTID = prop.getProperty("vc.projectId");
			HOSPITAL_NAME = prop.getProperty("statistics.hospital.name");
			STATISTICS_URL = prop.getProperty("statistics.url");
		} catch(Exception e) {
			LOG.info("", e);
		}
	}
}
