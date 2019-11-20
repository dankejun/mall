package com.macro.mall.portal.util;
/**
 * @author fourous
 * @date: 2019/11/14
 * @description: 添加发送短信工具类
 */

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

public class SendSms {
    /**
     * 发送单次短信服务
     *
     * @param phoneNum
     * @param code
     */
    public static void sendSms(String phoneNum, String code) {
        String ACCESS_KEY_ID = "LTAI4Fvdit7VZS3JKbEyVbeb";
        String ACCESS_SECRETE = "r5AyIAwt30ahIk290l5cjlLHPfnFFw";

        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", ACCESS_KEY_ID, ACCESS_SECRETE);
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phoneNum);
        request.putQueryParameter("SignName", "福聚商城");
        request.putQueryParameter("TemplateCode", "SMS_177545622");
        request.putQueryParameter("TemplateParam", "{\"code\":\"" + code + "\"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
    /**
     * TODO 这里需要加一个，当订单生成以后，发送短信到用户手机上
     */

}
