package com.weilaicheng.demo.bitmap;

/**
 * author by beijita@weilaicheng.com
 * 2020/1/14
 *
 * @author xiangzhi.meng
 */
public class MyBitMap {

    /**
     * 每一个word 都是long 类型元素 存储 64 位 bit
     */
    private long[] words;

    /**
     * bitMap的位数大小
     */
    private int size;

    public MyBitMap() {
    }

    public MyBitMap(int size) {
        this.words = new long[getWordIndex(size - 1) + 1];
        this.size = size;
    }


    private int getWordIndex(int bitIndex) {
        //右移6位--->除以64
        return bitIndex >> 6;
    }


    /**
     * 获取 bitMap中 某一位的状态
     *
     * @param bitIndex
     * @return
     */
    public boolean getBit(int bitIndex) {

        if (bitIndex < 0 || bitIndex > size - 1) {
            throw new ArrayIndexOutOfBoundsException("超过bitMap范围");
        }

        int wordIndex = getWordIndex(bitIndex);

        return (words[wordIndex] & 1L << bitIndex) != 0;

    }


    /**
     * 将某一位设置为true
     *
     * @param bitIndex
     */
    public void setBit(int bitIndex) {

        if (bitIndex < 0 || bitIndex > size - 1) {
            throw new ArrayIndexOutOfBoundsException("超过bitMap范围");
        }

        int wordIndex = getWordIndex(bitIndex);

        words[wordIndex] |= (1L << bitIndex);

    }
}
