package com.dxc.day9;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap
{
    public static void main(String[] args)
    {
        Map<Integer,String> map1=new HashMap<Integer,String>();
        map1.put(1001,"narmu");
        map1.put(1002,"nandhu");
        map1.put(1003,"padma");
        System.out.println(map1.get(1003));
        Set<Integer> keys= map1.keySet();
        for(Integer i:keys)
        {
            System.out.println("keys :"+i);
        }
        map1.replace(1001,"narmu","narmadha");
        System.out.println(map1.size());
        Collection<String> val= map1.values();
        for(String str:val)
        {
            System.out.println(str);
        }
        Set<Integer> keys1= map1.keySet();
        for(Integer i:keys1)
        {
            System.out.println("keys1 :"+i+" values is:"+map1.get(i));
        }

    }
}
