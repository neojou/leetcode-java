package com.nj.algo.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stackoverflow20221214 {
    public class Myclass {
        String barId;
        String foo;
        String bar;
    };

    public class Smallerclass {
        String barId;
        String bar;
    }

    List<Myclass> bL = new ArrayList<Myclass>();
    List<Smallerclass> sL = new ArrayList<Smallerclass>();

    public void setup() {
        for (int i = 0; i < 100; i++) {
            Myclass mc = new Myclass();
            mc.barId = Integer.toString(i);
            mc.foo = Integer.toString(i + 1);
            mc.bar = Integer.toString(i + 2);
            bL.add(mc);
        }
        //showMainclassList(bL);

        for (int i = 0; i < 100; i++) {
            Smallerclass mc = new Smallerclass();
            mc.barId = Integer.toString(i);
            mc.bar = Integer.toString(i - 1);
            sL.add(mc);
        }
        //showSmallerclassList(sL);
    }

    public void mergeList(List<Myclass> completeList, List<Smallerclass> smallList) {
        Map<String, Smallerclass> map = new HashMap<>();
        for (Smallerclass obj : smallList) {
            map.put(obj.barId, obj);
        }

        for (Myclass myClass : completeList) {
            Smallerclass obj = map.get(myClass.barId);
            if (obj != null) {
                myClass.bar = obj.bar;
            }
        }
    }

    public void mergeTwoList() {
        mergeList(bL, sL);
        showMainclassList(bL);
    }

    static public void showMainclassList(List<Myclass> bL) {
        for (Myclass obj : bL) {
            System.out.println("barId: " + obj.barId);
            System.out.println("foo: " + obj.foo);
            System.out.println("bar: " + obj.bar);
        }
    }

    static public void showSmallerclassList(List<Smallerclass> sL) {
        for (Smallerclass obj : sL) {
            System.out.println("barId: " + obj.barId);
            System.out.println("bar: " + obj.bar);
        }
    }
}

