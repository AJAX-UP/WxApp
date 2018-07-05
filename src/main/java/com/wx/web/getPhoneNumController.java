package com.wx.web;

import com.common.weixin.AesUtil;
import com.common.weixin.HttpRequest;
import com.wx.dto.ResponseResult;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ucmed on 2018/7/5.
 */
@RestController
@RequestMapping("/wxInfo")
public class getPhoneNumController {

    /**
     * 添加后台用户
     *
     *            后台管理用户
     * @return responseResult: 响应结果 {code = 1 , message = "成功" }
     */
    @RequestMapping(value = "/getPhoneNum",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult addUser(@RequestParam Map<String,String> map) {
        JSONObject res = new JSONObject();
        String encryptedData =map.get("encryptedData");
        String iv =map.get("iv");
        String code =map.get("code");
        //登录凭证不能为空
        if (code == null || code.length() == 0) {
            res.put("status", 0);
            res.put("msg", "code不能为空");
        }
        //小程序唯一标识   (在微信小程序管理后台获取)
        String wxspAppid = "wx47c73f64b60ac54c";
        //小程序的 app secret (在微信小程序管理后台获取)
        String wxspSecret = "ec9f3351fcfec124a43d64ae7a06e724";
        //授权（必填）
        String grant_type = "authorization_code";
        //////////////// 1、向微信服务器 使用登录凭证 code 获取 session_key 和 openid ////////////////
        //请求参数
        String params = "appid=" + wxspAppid + "&secret=" + wxspSecret + "&js_code=" + code + "&grant_type=" + grant_type;
        //发送请求
        String sr = HttpRequest.sendGet("https://api.weixin.qq.com/sns/jscode2session", params);
        //解析相应内容（转换成json对象）
        JSONObject json = JSONObject.fromObject(sr);
        //获取会话密钥（session_key）
        String session_key = json.get("session_key").toString();
        //用户的唯一标识（openid）
        String openid = (String) json.get("openid");

        //////////////// 2、对encryptedData加密数据进行AES解密 ////////////////
        try {
            String result = AesUtil.decrypt(encryptedData, session_key, iv, "UTF-8");
            if (null != result && result.length() > 0) {
                res.put("status", 1);
                res.put("msg", "解密成功");
                JSONObject userInfoJSON = JSONObject.fromObject(result);
                Map userInfo = new HashMap();
                userInfo.put("openId", userInfoJSON.get("openId"));
                userInfo.put("nickName", userInfoJSON.get("nickName"));
                userInfo.put("gender", userInfoJSON.get("gender"));
                userInfo.put("city", userInfoJSON.get("city"));
                userInfo.put("province", userInfoJSON.get("province"));
                userInfo.put("country", userInfoJSON.get("country"));
                userInfo.put("avatarUrl", userInfoJSON.get("avatarUrl"));
                userInfo.put("unionId", userInfoJSON.get("unionId"));
                userInfo.put("phoneNumber", userInfoJSON.get("phoneNumber"));
                res.put("userInfo", userInfo);
                //return map;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseResult(0, "失败",null);
    }
}
