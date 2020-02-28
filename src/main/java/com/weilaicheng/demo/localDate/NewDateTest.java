package com.weilaicheng.demo.localDate;

import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * author by beijita@weilaicheng.com
 * 2020/1/13
 *
 * @author xiangzhi.meng
 */
@Data
public class NewDateTest {


    public static void main(String[] args) throws ParseException {
        LocalDate localDate = LocalDate.of(2019,12,30);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
        Date parse = simpleDateFormat.parse("2019-12-30");
        System.out.println(simpleDateFormat.format(parse));

    }


}
