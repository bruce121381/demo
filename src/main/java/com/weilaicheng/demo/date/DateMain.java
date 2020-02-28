package com.weilaicheng.demo.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * author by beijita@weilaicheng.com
 * 2020/1/14
 *
 * @author xiangzhi.meng
 */
public class DateMain {


    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(1577721600000L);
        String format = simpleDateFormat.format(date);
        System.out.println("Y +" + format);
        System.out.println("y +" + dateFormat.format(date));


    }
}
