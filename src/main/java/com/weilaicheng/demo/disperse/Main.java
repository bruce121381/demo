package com.weilaicheng.demo.disperse;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * author by beijita@weilaicheng.com
 * 2020/2/14
 *
 * @author xiangzhi.meng
 */
public class Main {


    public static void main(String[] args) {
        String dateStr = "2019-11-22 09:10:10";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = simpleDateFormat.parse(dateStr);
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("should be log.error");
        }
    }

}
