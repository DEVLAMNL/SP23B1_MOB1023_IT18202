/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson7_DemoCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class DemoMap {

    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("SP1", 100000);
        m.put("SP2", 200000);
        m.put("SP3", 300000);
        m.put("SP4", 400000);
        List list = new ArrayList();
        list.add(m);
//        System.out.println(m);
        Collections.sort(list);
        System.out.println(list);
    }
}
