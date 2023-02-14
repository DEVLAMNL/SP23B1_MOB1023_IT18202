/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson7_DemoCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class Collection {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(1);
        l.add(2);
        //
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(5);
        System.out.println("" + l);
        System.out.println("" + s);
        s.addAll(l);
        l.addAll(s);
        System.out.println("" + l);
        System.out.println("" + s);
        Collections.shuffle(l);
        System.out.println(""+l);
    }
}
