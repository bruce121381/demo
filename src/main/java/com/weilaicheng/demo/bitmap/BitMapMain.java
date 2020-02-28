package com.weilaicheng.demo.bitmap;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * author by beijita@weilaicheng.com
 * 2020/1/14
 *
 * @author xiangzhi.meng
 */
public class BitMapMain {

    public static void main(String[] args) {
        MyBitMap bitMapTemp = new MyBitMap(336);
        bitMapTemp.setBit(0);
        bitMapTemp.setBit(1);
        bitMapTemp.setBit(335);
        System.out.println(bitMapTemp.getBit(0));
        System.out.println(bitMapTemp.getBit(335));


        try {
            Class<MyBitMap> clazz = MyBitMap.class;
            Method getWordIndex = clazz.getDeclaredMethod("getWordIndex",int.class);
            getWordIndex.setAccessible(true);
            int invoke = (int) getWordIndex.invoke(clazz.newInstance(),128);
            System.out.println(invoke);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }



}
