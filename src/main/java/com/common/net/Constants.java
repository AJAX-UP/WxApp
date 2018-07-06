/**
 * Alipay.com Inc. Copyright (c) 2004-2010 All Rights Reserved.
 */
package com.common.net;

import org.apache.log4j.Logger;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

/**
 * @author youmeng
 * @version $Id: Constants.java,v 1.13 2012/02/09 05:36:46 chenc Exp $
 */
public class Constants {
    
    private static final Logger LOG = Logger.getLogger(Constants.class);
    
    public static String IMG_SIZE;
    static {
            Resource resource = new ClassPathResource("/configure.properties");
            Properties props = null;
            try {
                props = PropertiesLoaderUtils.loadProperties(resource);
            } catch(IOException e) {
                LOG.info(e);
            }
            IMG_SIZE = props.getProperty("VerificationFilterType");
        }
    
	/**
	 * 渠道标志 空 wap 1 wap
	 */
	public static final String API_CHANNEL = "api_Channel";
	// public static final String API_CHANNEL = "T";

	public static final String API_URL = "/api/x.htm";

	public static final String PARAMS = "params";

	public static final String USER_VERIFY_CODE = "user_verify_code";

	/**
	 * 视频url
	 */
	public static final String url = "http://218.108.172.226";
	/**
	 * api constants
	 */
	public static final String API_NAME = "api_name";
	public static final String API_REQUEST_PARAMS = "params";
	public static final String SESSION_ID = "SessionID";
	public static final String API_SESSION_ID = "session_id";
	public static final String API_SESSION_ID2 = "S";

	public static final String API_APP_ID = "app_id";
	public static final String API_APP_KEY = "app_key";
	public static final String API_HUATUO_APP_ID = "appId";
	public static final String API_HUATUO_APP_KEY = "passwd";
	public static final String API_CLIENT_SESSION = "client_session";
	public static final String API_CLIENT_SESSION_USER_ID = "user_id";

	public static final String PAGE_NO = "pageNo";
	public static final String PAGE_SIZE = "pageSize";
	public static final String PAGE_KEY = "searchName"; // 搜索的名字

	/**
	 * 短信发送
	 */
	public static final String SESSION_ID_MSG = "sessionId";
	public static final String MSG_RESULT_NEW = "result";
	public static final String MSG_CONTENT_NEW = "msg";

	public static final String MSG_RESULT = "Result";
	public static final String MSG_CONTENT = "Msg";
	public static final String MSG_DELIVER_URL = "/msgDeliver.htm";

	/**
	 * 管理员Session
	 */
	public static final String ADMIN_SESSION = "pt_admin";
	public static final String VERIFY_CODE_SESSION = "verify.code.session";
	public static final String VERIFY_TOKEN = "verify.token";
	public static final int VERIFY_TOKEN_LEN = 16;
	public static final String PHONE = "phone";
	/**
	 * 软件版本
	 */
	public static final String SITE_VSERSION = "1.0.0";

	/**
	 * file upload root directory
	 */
	public static final String API_UPLOAD_ROOT = "c:/api_upload/";

	public static final String WD_IMG_URL = "http://zyyyimg.ucmed.cn/";

	/**
	 * api flow
	 */

	public static final String CLIENT_CHANNEL = "api_Channel";
	public static final String CLIENT_MOBILE = "client_mobile";
	public static final String CLIENT_MOBILE_TYPE = "client_mobile_type";
	public static final String CLIENT_MOBILE_SDK = "client_mobile_sdk";
	public static final String CLIENT_VERSION = "client_version";
	public static final String CLIENT_DATE = "client_date";
	public static final String CLIENT_TRANSNAME = "api_name";
	public static final String IP = "ip";
	public static final String PARAM_ID = "param_id";
	public static final String TMP1 = "tmp1";
	public static final String TMP2 = "tmp2";
	public static final String TMP3 = "tmp3";
	public static final String TMP4 = "tmp4";
	public static final String TMP5 = "tmp5";

	/**
	 * push message
	 */
	public static final String PUSH_SENDER_ID = "sender_id";
	public static final String PUSH_ACCEPT_ID = "accept_id";
	public static final String PUSH_TYPE = "type";
	public static final String PUSH_CONTENT = "content";
	public static final String PUSH_TARGET_ID = "target_id";
	public static final String PUSH_TMP1 = "tmp1";
	public static final String PUSH_TMP2 = "tmp2";
	public static final String PUSH_TMP3 = "tmp3";
	public static final String PUSH_TMP4 = "tmp4";

	/**
	 * 缓存微信access_token
	 */
	public static final String WX_ACCESS_TOKEN = "wx_access_token";

	public static final String CACHE_PAY_ITEM_LIST = "cache-pay-item_list";

	public static final String ACCESS_TOKEN = "access_token";

	public static final int DOCTOR_QUESTION_COUNT = 10;

	public static final int PRICE_CHANGE = 10;

	/**
	 * UTF-8字符集 .
	 */
	public static final String CHARSET_UTF8 = "UTF-8";

	/**
	 * GBK字符集 .
	 */
	public static final String CHARSET_GBK = "GBK";
	/**
	 * rubik x
	 */
	public static final String USER_SESSIONRKX = "user_sessionrkx";
	public static final String USER_OPENIDRKX = "user_openidrkx";

	public static final String USER_SESSION = "user_session";
	public static final String URL_SESSION = "url_session";
	/**
	 * 健康资讯图片路径
	 */
	public static final String IMAGE_URL = "http://21.254.47.18:9000";// "/images/bendi";//"http://218.108.175.10:9000";//"http://202.91.232.182:9000";//"http://api.ucmed.cn";

	public static final String stoken = "stoken";

	public static final String WECHAT = "wechat"; // 用户微信号
	public static final String CODE = "code";
	public static final String PATH = "path"; // 拦截前path
	public static final String ACTION = "action"; // 拦截前action
	public static final String DOCTORNAME = "doctorname";
	public static final String DOCTORTITLE = "doctortitle";
	public static final String DOCTORID = "doctorid";
	public static final String DEPTNAME = "deptname";
	public static final String DESCR = "descr";
	// public static String HOSPITALNAME = "金华市中医医院";
	public static String HOSPITALADDR = "hospitalAddr";
	public static String REFERER = "referer";
	public static String HOSPITALID = "3283";
	// public static String HOSPITALID="1525";
	public static String APPID = "appId";
	public static String APPSECRET = "appsecret";
	// title
	public static String TITLE = "titleName";
	public static String SMALLWEB = "微官网";
	public static String BUILD = "楼层导航";
	public static String DOCTORDEPT = "医生排班";
	public static String DOCTORlIST = "专家列表";
	public static String ORDER = "预约挂号";
	public static String ORDERVIEW = "预约信息确认";
	public static String REGISTVIEW = "挂号信息确认";
	public static String REGISTCERT = "挂号凭证";
	public static String ORDERDOCTOR = "专家预约";
	public static String ORDERLIST = "预约记录";
	public static String REGISTLIST = "挂号记录";
	public static String CANPAY = "取消成功";
	public static String ORDERLISTDETAILS = "预约详情";
	public static String ORDERCERT = "预约凭证";
	public static String REGISTLISTDETAILS = "挂号详情";
	public static String LOGINSUCCESS = "个人资料";
	public static String PERSONCENTER = "个人中心";
	public static String DEPTLIST = "科室列表";
	public static String PBLIST = "专家门诊排班";
	public static String SEARCHERDOCTOR = "搜索医生";
	public static String CHANGEPASSWORD = "修改密码";
	public static String FORGETPASSWORD = "忘记密码";
	public static String LOGIN = "用户登录";
	public static String USERREGIEST = "用户注册";
	public static String ANNOUNCE = "新闻公告";
	public static String EVALUATION = "服务评价";
	public static String EXAMINEINSPECT = "取报告单";
	public static String EXAMINE = "检验单列表";
	public static String EXAMINEDETAILSPT = "普通检验单详情";
	public static String EXAMINEDETAILSWSW = "微生物检验单详情";
	public static String INSPECT = "检查单列表";
	public static String INSPECTETAILS = "检查单详情";
	public static String HOSPTITALVIDEO = "医院视频";
	public static String BOUNDCARDLIST = "已绑定就诊人";
	public static String BOUNDCARD = "绑定就诊人";
	public static String BASEPATIENTLIST = "就诊人信息";
	public static String MANYIDU = "就诊评价";
	public static String QUEUEDETAILS = "候诊信息";
	// public static final String
	// REDIRECT_URL="http://111.1.55.5:13000/out/";//科室医生测试地址
	public static final String REDIRECT_URL = "http://api.ucmed.cn/out/";// 科室医生生产地址
	public static final Integer ACCESSTOKENTIME = 90 * 60;
	public static final String TREATECARD = "treateCard123";
	public static final String NAME = "name123";
	public static String MSGTYPE = "msgtype";
	public static String MEDIAID = "MediaId";
	public static String CONTENT = "content";
	public static String IMAGEURL = "imageUrl";
	public static String SOURCETYPE = "sourceType";

	public static String MENUTYPE = "menuType";
	/**
	 * 返回代码
	 */
	public static final String R = "R";
	/**
	 * 返回错误描述（开发）
	 */
	public static final String M = "M";
	/**
	 * 返回错误描述（用户）
	 */
	public static final String I = "I";
	/**
	 * 用户会话
	 */
	public static final String S = "S";
}
