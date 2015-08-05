package com.red.test;

public class Gaosi {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        long start = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        System.out.println(Gaosi(10000000));
        long end = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        System.out.println(end - start);
        System.out.println(System.currentTimeMillis());
    }

    /**
     * output: 相差15ms. 利用高斯进行计算不存在ms差
     */

    /**
     * 高斯定理
     * @return
     */
    public static int Gaosi(int n) {
        int sum = 0;
        sum = (n + 1) * n / 2;
        return sum;
    }

    /**
     * for循环
     */
    public static int GetByFor(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
