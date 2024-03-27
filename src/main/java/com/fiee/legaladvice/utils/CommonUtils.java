package com.fiee.legaladvice.utils;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: Fiee
 * @ClassName: com.fiee.legaladvice.utils
 * @Date: 2024/3/3
 * @Version: v1.0.0
 **/
public class CommonUtils {

    /**
     * 检测邮箱是否合法
     *
     * @param username 用户名
     * @return 合法状态
     */
    public static boolean checkEmail(String username) {
        String rule = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(.[a-zA-Z0-9_-]+)+$";
        //正则表达式的模式 编译正则表达式
        Pattern p = Pattern.compile(rule);

        //正则表达式的匹配器
        Matcher m = p.matcher(username);
        //进行正则匹配
        return m.matches();
    }
    /**
     * 生成6位随机验证码
     *
     * @return 验证码
     */
    public static String getRandomCode(int length) {
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            str.append(random.nextInt(10));
        }
        return str.toString();
    }

}