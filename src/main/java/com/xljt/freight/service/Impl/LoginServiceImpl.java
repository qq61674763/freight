package com.xljt.freight.service.Impl;

import com.xljt.freight.domain.ResultMessage;
import com.xljt.freight.service.LoginService;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import javax.crypto.Cipher;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

/**
 * The type Login service.
 *
 * @author xu
 * @date 2020.04.14
 */
public class LoginServiceImpl implements LoginService {

    /**
     * 登录请求，获取token
     *
     * @return the string
     * @author xu
     * @date 2020.04.10
     */
    @Override
    public String login() throws Exception {
        WebClient webClient = WebClient.create();
        String userName = "";
        String oldPassword = "";
        String publicKey = "";
        String password = encrypt(oldPassword, publicKey);

        Map<String, String> user = new HashMap<>(2);
        user.put("userName", userName);
        user.put("password", password);

        Mono<ResultMessage> resultMessageMono = webClient.post().uri("http://bj.zhihuihuoyun.cn")
                .bodyValue(user).retrieve().bodyToMono(ResultMessage.class);
        ResultMessage block = resultMessageMono.block();
        return (String) block.getData();
    }

    /**
     * RSA公钥加密
     *
     * @param str 加密字符串
     * @param publicKey 公钥
     * @return 密文
     * @throws Exception the exception
     * @author xu
     * @date 2020.04.14
     */
    public static String encrypt(String str, String publicKey) throws Exception {
        //base64编码的公钥
        byte[] decoded = Base64.decodeBase64(publicKey);
        RSAPublicKey pubKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decoded));
        //RSA加密
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, pubKey);
        String outStr = Base64.encodeBase64String(cipher.doFinal(str.getBytes("UTF-8")));
        return outStr;
    }
}
