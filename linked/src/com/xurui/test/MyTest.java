package com.xurui.test;

import com.xurui.beans.LinkedList;

public class MyTest {
	public static void main(String[] args) throws Exception {
         LinkedList list = new LinkedList();     //创建一张带有表头的空链表
         for (int i = 0; i < 10; i++) {
             int temp = ((int) (Math.random() * 100)) % 100;
             list.insert(i, temp);
             System.out.print(temp + " ");
         }

        list.delete(4);
        System.out.println("\n------删除第五个元素之后-------");
         for (int i = 0; i < list.size(); i++) {
             System.out.print(list.get(i) + " ");
         }
     }
}
