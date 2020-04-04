package com.multy.thread.block02extend;

import java.util.ArrayList;
import java.util.List;

public class ExtendThread01 {
    public static void main(String[] args) {
        List<Object> dataList = new ArrayList<>() ;
        dataList.add("A");
        dataList.add("B");
        dataList.add("C");
        // 把一个大的集合按照每个子集合的2个元素切割
        List<List<Object>> splitList = splitList(dataList,2);
        for (List<Object> list:splitList){
            System.out.println(list);
        }
        // 多线程处理
        for (List<Object> childList:splitList){
            ListTask listTask = new ListTask(childList) ;
            Thread runThread = new Thread(listTask);
            runThread.start();
        }
    }
    /**
     * List 集合切割
     */
    private static List<List<Object>> splitList (List<Object> list, int childSize) {
        if (list == null || list.size() == 0 || childSize < 1) {
            return null;
        }
        List<List<Object>> result = new ArrayList<>();
        int size = list.size();
        int count = (size + childSize - 1) / childSize ;
        for (int i = 0; i < count; i++) {
            List<Object> subList = list.subList(i * childSize, ((i + 1) * childSize > size ? size : childSize * (i + 1)));
            result.add(subList);
        }
        return result;
    }
}
class ListTask implements Runnable {
    private List<Object> list ;
    public ListTask (List<Object> list){this.list=list;}
    @Override
    public void run() {
        for (Object object:list){
            System.out.println(Thread.currentThread().getName()+"=="+object);
        }
    }
}