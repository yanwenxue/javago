package com.ywx.javago;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：yanwenxue
 * @date ：Created in 2020/5/29 17:34
 * @description：remove测试
 * remove遇到的坑太多
 * @modified By：
 * @version: 1.0
 */
public class ArrayListTest {
    /**
     * 问题一
     * java.lang.UnsupportedOperationException
     *
     * Arrays.asList()产生的List中add、remove方法时报异常，
     * 这是由于Arrays.asList()返回的是Arrays的内部类ArrayList，而不是java.util.ArrayList。
     * Arrays的内部类ArrayList和java.util.ArrayList都是继承AbstractList，remove、add等方法在AbstractList中是默认throw UnsupportedOperationException而且不作任何操作。
     * java.util.ArrayList重写这些方法而Arrays的内部类ArrayList没有重写，所以会抛出异常。
     *
     */
    @Test
    public void test_arrays_add(){
//        String[] array = {"1","2","3","4","5"};
//        List<String> list = Arrays.asList(array);
//        list.add("6");//会报异常 java.lang.UnsupportedOperationException

        //解决方法如下：
        String[] array = {"1","2","3","4","5"};
        List<String> list = new ArrayList<>(Arrays.asList(array));
        list.add("6");
    }
}
