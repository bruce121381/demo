package com.weilaicheng.demo;

/**
 * author by beijita@weilaicheng.com
 * 2020/2/9
 *
 * @author xiangzhi.meng
 */
public class TestTry {


    public static void main(String[] args) {

        int hello = hello();
        System.out.println(hello);

    }


    public static int hello() {
        try {
            System.out.println("try");
            int num = 10 / 2;
            return num;
        } catch (Exception e) {
            System.out.println("catch");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
        return 0;
    }


}
