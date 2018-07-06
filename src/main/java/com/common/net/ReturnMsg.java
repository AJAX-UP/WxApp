package com.common.net;

public class ReturnMsg {

	public static final int FAIL = -100; // 失败
	public static final String FAIL_WX = "-100";

	public static final int SUCCESS = 200; // 成功
	public static final String SUCCESS_WX = "200";
	public static final String SUCCESS_MSG = "成功";
	public static final String SUCCESS_MSG1 = "获取验证码成功，请查看您的手机短信";
	public static final String SUCCESS_MSG2 = "获取密码成功，请查看您的手机短信";
	public static final String SUCCESS_MSG3 = "记住你的新密码";
	public static final String SUCCESS_MSG4 = "取消成功，详细请看短信通知！";
	public static final String SUCCESS_MSG5 = "预约成功";
	public static final String SUCCESS_MSG6 = "挂号成功";
	public static final String SUCCESS_MSG7 = "支付成功";
	public static final String SUCCESS_MSG8 = "退费";

	public static final String SUCCESS_EVALUATION = "提交成功，谢谢您的合作！";
	public static final String FAIL_EVALUATION = "提交失败，请稍后重试！";

	public static final int PARAMETER_ERROR = 400; // 请求参数有误
	public static final String PARAMETER_ERROR_MSG = "请求参数有误";

	public static final int LOGIN_AFTER_ACCESS = 401; // 需要登录后访问
	public static final String LOGIN_AFTER_ACCESS_MSG = "登录超时，请重新登录";

	public static final int NO_BASEPATIENTLIST_SESSION = 402; // 就诊人列表session失效
	public static final String NO_BASEPATIENTLIST_SESSION_MSG = "请重试";

	public static final int VERIFICATION_FAILURE = 403; // api key验证失败(K)
	public static final String VERIFICATION_FAILURE_MSG = "api key验证失败(K)";

	public static final int CAN_NO_FIND_API = 404; // 找不到对应的api
	public static final String CAN_NO_FIND_API_MSG = "找不到对应的api";

	public static final int NO_JSON = 405; // 不是一个json格式
	public static final String NO_JSON_MSG = "不是一个json格式";

	public static final int UNKNOWN_ERROR = 500; // 服务器发生未知错误
	public static final String UNKNOWN_ERROR_MSG = "服务器发生未知错误";

	public static final int NUTS_SYSTEM_RETURN_ERROR = 501; // 坚果系统（医院前置）返回错误
	public static final String NUTS_SYSTEM_RETURN_ERROR_MSG = "坚果系统（医院前置）返回错误";

	public static final int CONNECT_TIMEOUT = 601; // 连接服务器响应超时
	public static final String CONNECT_TIMEOUT_MSG = "连接服务器响应超时";
	public static final String CONNECT_TIMEOUT_MSG1 = "连接坚果系统响应超时";

	public static final int NO_RELEVANT_DATA = 602; // 暂无相关数据
	public static final String NO_RELEVANT_DATA_MSG = "暂无相关数据";
	public static final String NO_RELEVANT_DATA_MSG1 = "无法连接到坚果系统";
	public static final String NO_RELEVANT_DATA_MSG2 = "向记录表中更新医院返回数据时出错";
	public static final String NO_RELEVANT_DATA_MSG3 = "向记录表插入数据时出错";

	public static final int CACHE_ERROR = 603; // 获取缓存异常（科室代码、医生代码异常）
	public static final String CACHE_ERROR_MSG = "获取缓存异常（科室代码、医生代码异常）";
	public static final String CACHE_ERROR_MSG1 = "该科室代码未缓存";
	public static final String CACHE_ERROR_MSG2 = "该医生代码未缓存";
	public static final String CACHE_ERROR_MSG3 = "预约记录未缓存";

	public static final int CACHE_NO_AVAILABLE = 639; // 缓存中得不到数据（缓存时间已到）
	public static final String CACHE_NO_AVAILABLE_MSG = "缓存中得不到数据（缓存时间已到";

	public static final int FORMAT_ERROR = 640; // 格式错误（手机号、身份证、type等）
	public static final String FORMAT_ERROR_MSG1 = "手机格式不符";
	public static final String FORMAT_ERROR_MSG2 = "身份证格式不符";
	public static final String FORMAT_ERROR_MSG3 = "TYPE类型不符";
	public static final String FORMAT_ERROR_MSG4 = "用户名不能为空";
	public static final String FORMAT_ERROR_MSG5 = "请输入正确的姓名";
	public static final String FORMAT_ERROR_MSG6 = "该用户已经绑定4张就诊卡";
	public static final String FORMAT_ERROR_MSG7 = "身份证查询暂时不开放";

	public static final int PHONE_HAS_REG = 641; // 手机号已注册,或未注册
	public static final String PHONE_HAS_REG_MSG1 = "手机号已注册";
	public static final String PHONE_HAS_REG_MSG2 = "手机号未注册";

	public static final int VERIFICATION_CODE_FAILURE = 642; // 验证码获取失败
	public static final String VERIFICATION_CODE_FAILURE_MSG = "验证码获取失败 ";

	public static final int VERIFY_CODE_ERROR = 643; // 验证码失效或者输入不正确
	public static final String VERIFY_CODE_ERROR_MSG = "验证码失效或者输入不正确";

	public static final int REG_FAILURE = 644; // 注册失败
	public static final String REG_FAILURE_MSG = "注册失败";

	public static final int USERS_NO_EXIST = 645; // 用户不存在
	public static final String USERS_NO_EXIST_MSG = "用户不存在";

	public static final int PASSWORD_ERROR = 646; // 密码错误
	public static final String PASSWORD_ERROR_MSG = "密码错误";
	public static final String PASSWORD_ERROR_MSG1 = "原密码错误";

	public static final int PASSWORD_FAILURE = 647; // 获取密码失败
	public static final String PASSWORD_FAILURE_MSG = "获取密码失败 ";

	public static final int IMPROVE_FAILURE = 648; // 完善信息失败
	public static final String IMPROVE_FAILURE_MSG = "完善信息失败 ";

	public static final int IDCARD_USED = 649; // 同一张身份证一天最多预约一个专家号
	public static final String IDCARD_USED_MSG = "同一张身份证一天最多预约一个号";
	public static final String IDCARD_USED_MSG2 = "同一就诊日一张身份证最多预约一个号";
	public static final String IDCARD_USED_MSG3 = "每半天(上午、下午、晚)每个就诊人只能约1个号源";
	public static final String IDCARD_USED_MSG4 = "超出预约总量，连续七日内预约总量不得超过3个号源";

	public static final int REGISTER_FAILURE = 650; // 向医院注册失败
	public static final String REGISTER_FAILURE_MSG = "向医院注册失败";

	public static final int SOURCE_BOOKING = 651; // 号源已经被预约
	public static final String SOURCE_BOOKING_MSG = "号源已经被预约";

	public static final int ORDER_FAILURE = 652; // 预约失败
	public static final String ORDER_FAILURE_MSG = "预约失败,请重新预约";

	public static final int CANCEL_ERROR = 653; // 已经取消预约或您还未预约
	public static final String CANCEL_ERROR_MSG = "已经取消预约或您还未预约";

	public static final int CANCEL_ERROR1 = 654; // 预约已过期,无法取消
	public static final String CANCEL_ERROR1_MSG = "预约已过期,无法取消";

	public static final int CANCEL_ERROR2 = 655; // 取消预约失败
	public static final String CANCEL_ERROR2_MSG = "取消预约失败";
	public static final String CANCEL_ERROR3_MSG = "取消预约短信发送失败";

	public static final int NO_RESERVATION = 656; // 暂无任何预约记录
	public static final String NO_RESERVATION_MSG = "暂无任何预约记录";
	public static final String NO_RESERVATION_MSG2 = "暂无任何挂号记录";

	public static final int NO_INSPECTION_RECORD = 657; // 暂无检查单记录
	public static final String NO_INSPECTION_RECORD_MSG = "暂无检查单记录";

	public static final int NO_EXAMINE_RECORD = 658; // 暂无检验单记录
	public static final String NO_EXAMINE_RECORD_MSG = "暂无检验单记录";

	public static final int WECHAT_NULL = 659; // 微信号为空
	public static final String WECHAT_NULL_MSG = "微信号为空";
	public static final String WECHAT_NULL_MSG1 = "此微信未绑定用户";

	public static final int FIND_ERROR = 660; // 卡号和信息不匹配或无法找到该卡信息
	public static final String FIND_ERROR_MSG = "卡号和信息不匹配或无法找到该卡信息 ";

	public static final int LIMIT_NUMBER = 661; // 您预约该医生同一天排班超过两个号
	public static final String LIMIT_NUMBER_MSG = "您预约该医生同一天排班超过两个号";

	public static final int BOOKED_FULL = 662; // 该医生号已被预约满
	public static final String BOOKED_FULL_MSG = "该医生号已被预约满";

	public static final int INTERNAL_ERROR = 663; // 内部错误，如：排班序号不存在
	public static final String INTERNAL_ERROR_MSG = "内部错误，如：排班序号不存在";
	public static final String INTERNAL_ERROR_MSG1 = "读取就诊卡列表失败";
	public static final String INTERNAL_ERROR_MSG2 = "添加就诊卡失败";
	public static final String INTERNAL_ERROR_MSG3 = "删除就诊卡失败";
	public static final String INTERNAL_ERROR_MSG4 = "忘记密码失败";
	public static final String INTERNAL_ERROR_MSG5 = "暂无排班信息";
	public static final String INTERNAL_ERROR_MSG6 = "取排班信息出错";
	public static final String INTERNAL_ERROR_MSG7 = "该就诊人您已经绑定";
	public static final String INTERNAL_ERROR_MSG8 = "查询异常";

	public static final int NO_LUNBO = 664; // 暂无轮播图
	public static final String NO_LUNBO_MSG = "暂无轮播图";

	public static final int NO_PAYFLOW = 665; // 记录未支付或已退款
	public static final String NO_PAYFLOW_MSG = "记录未支付或已退款";

	public static final int REFUNDRECORD_ERROR = 666; // 生成退款订单失败
	public static final String REFUNDRECORD_ERROR_MSG = "生成退款订单失败";

	public static final int NO_WECHAT = 667; // 微信号失效
	public static final String NO_WECHAT_MSG = "微信号失效，即将重新登录";

	public static final int NO_BASEPATIENT_LIST = 668; // 已绑定就诊人为空
	public static final String NO_BASEPATIENT_LIST_MSG = "暂无已绑定就诊人";

	public static final String NO_BASEPATIENT_MSG = "暂无就诊人信息，请检查输入是否正确！";

	public static final int NO_SCHEDULE_LIST = 669;// 排班记录为空
	public static final String NO_SCHEDULE_LIST_MSG = "暂无该医生排班信息";

	public static final int NO_QUEUE_LIST = 670;// 排队叫号列表为空
	public static final String NO_QUEUE_LIST_MSG = "暂无排队叫号信息";

	public static final int NO_DATA = 700; // 暂无数据
	public static final String NO_DATA_MSG = "暂无数据";

	public static final int NO_DEPTLIST = 701; // 暂无科室
	public static final String NO_DEPTLIST_MSG = "暂无可选科室";

	public static final int NO_DOCLIST = 702; // 暂无医生
	public static final String NO_DOCLIST_MSG = "暂无可选医生";

	public static final int NO_DOCSCHEDULELIST = 703; // 暂无任何预约记录
	public static final String NO_DOCSCHEDULELIST_MSG = "暂无该医生的排班";

	public static final int NO_WXW_EXAMINE_DETAIL = 704;// 暂无该检验单信息
	public static final String NO_WXW_EXAMINE_DETAIL_MSG = "暂无该检验单信息";

	public static final int INTERNAL_ERROR1 = 712; // 内部错误，短信发送失败
	public static final String INTERNAL_ERROR1_MSG = "短信发送失败";

	public static final int FAILURE = -1; // 失败
	public static final String FAILURE_MSG = "失败";

	public static final int SYSTEM_BUSY = 502; // 系统繁忙，请稍后再试
	public static final String SYSTEM_BUSY_MSG = "系统繁忙，请稍后再试";

	public static final int NET_BUSY = 503; // 网络繁忙，请稍后再试，不能访问到接口
	public static final String NET_BUSY_MSG = "网络繁忙，请稍后再试";

	public static final String ret_code = "retCode";// 返回代码
	public static final String ret_info = "retInfo";// 返回提醒信息
	public static final String R = "R"; // 返回代码
	public static final String I = "I"; // 返回信息
	public static final String M = "M"; // 错误信息（开发）
	public static final String PAGE_COUNT = "pageCount"; // 单页显示条数
	public static final String TOTAL_COUNT = "totalCount";// 总页数
	public static final String PAGE_COUNT_HUATUO3 = "page_count"; // 单页显示条数
	public static final String TOTAL_COUNT_HUATUO3 = "total_count";// 总页数
	public static final String TYPE = "type";// 1预约/2挂号

	public static final int NUMBER = 6; // 验证码位数
	public static final int NUMBER1 = 4; // 一个用户最多绑定卡的数量
	public static final int NUMBER2 = 15; // 身份证最短长度

	public static final int PAY_NOT_NEED = 900; // 支付
	public static final String PAY_NOT_NEED_MSG = "该订单已支付或已取消"; // 该订单已支付或已取消

	public static final int FAIL_ORDER_QUERY = 901; // 未找到对应的支付订单(微信)
	public static final String FAIL_ORDER_QUERY_MSG = "未找到对应的支付订单(微信)";

	public static final int FAIL_REFUND = 902; // 未找到对应的支付订单(微信)
	public static final String FAIL_REFUND_MSG = "发起退费失败";

	public static final int FAIL_EXCEPTION = 903; // 支付异常
	public static final String FAIL_EXCEPTION_MSG = "支付异常";

	public static final String EXCECODE1 = "1001"; // 异常代码1001(未收到回调信息，第三方查询不到订单信息）
	public static final String EXCECODE2 = "1002"; // 支付通知his失败
	public static final String EXCECODE3 = "1003"; // 生成退费订单失败
	public static final String EXCECODE4 = "1004"; // 退费通知his失败
}
