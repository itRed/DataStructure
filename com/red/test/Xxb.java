package com.red.test;

/**
 * 线性表
 * @author Red
 */
public class Xxb {

    private final static int[] LIST = {2, 3, 9, 1, 5, 6, 7};

    /**
     * 初始化列表，建立一个空的列表
     * @return
     */
    public int[] InitList() {
        int[] L = new int[20];
        return L;
    }

    /**
     * 判断线性表是否为空
     * @param L
     * @return
     */
    public boolean ListEmpty(int[] L) {
        if (L.length == 0)
            return true;
        else return false;
    }

    /**
     * 清空线性表
     * @param L
     */
    public int[] ClearList(int[] L) {
        L = new int[0];
        return L;
    }

    /**
     * 将线性表L中第i个位置的元素赋值给e，并返回e
     * @param L
     * @param i
     * @return
     */
    public int GetElem(int[] L, int i) {
        int e = 0;
        for (int j = 0; j < L.length; j++) {
            if (j == i) {
                e = L[i];
                break;
            }
        }
        return e;
    }

    /**
     * 在线性表中查找与给定值e相等的元素，成功返回改元素的序列号，失败返回0
     * @param L
     * @param e
     * @return
     */
    public int LocateElem(int[] L, int e) {
        int value = 0;
        for (int i = 0; i < L.length; i++) {
            if (e == L[i]) {
                value = i;
                break;
            }
        }
        return value;
    }

    /**
     * 线性表L中第i个位置插入一个元素e
     * @param L
     * @param i
     * @param e
     * @return
     */
    public static int[] ListInsert(int[] L, int i, int e) {
        int[] List = new int[L.length + 1];
        for (int j = 0; j < L.length; j++) {
            List[j] = L[j];
        }
        for (int j = i; j < List.length - 1; j++) {
            List[j + 1] = L[j];
        }
        List[i] = e;
        L = List;
        return L;
    }

    /**
     * 删除线性表L中第i个元素，并用e返回
     * @param L
     * @param i
     * @param e
     * @return
     */
    public static int ListDelete(int[] L, int i, int e) {
        int[] List = new int[L.length];
        for (int j = 0; j < L.length; j++) {
            List[j] = L[j];
        }
        for (int j = i; j < List.length + 1; j++) {
            List[j - 1] = L[j];
        }
        e = L[i];
        return e;
    }

    /**
     * 返回线性表的长度
     * @param L
     * @return
     */
    public static int ListLength(int[] L) {
        return L.length;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.print(ListInsert(LIST, 2, 12)[2]);
    }

}
