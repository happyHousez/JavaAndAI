package com.zujiale.variable;

public class VariableDemo1 {
    public static void main(String[] args) {
        /* 微信余额0元
           支付宝余额10元
           银行卡余额20元
           问题一：请问现在的余额是多少？
           问题二：微信收了10元红包，又发了两元红包，现在余额是多少？
        * */

        // 定义一个变量记录微信的余额
        int weixin = 0;
        // 定义一个变量记录支付宝的余额
        int alipay = 10;
        // 定义一个变量记录银行卡的余额
        int bank = 20;
        //输出现在一共有多少元
        System.out.println("现在余额为：" + (weixin + alipay + bank));
        //微信收了10元红包，又发了两元红包
        weixin = weixin + 10-2;
        System.out.println("现在微信余额为：" + weixin);
    }

}
