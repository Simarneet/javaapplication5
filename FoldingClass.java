/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Simarneet
 */
public class FoldingClass {

    public static <P,R> R fold(Collection<P> c , Joinable<P,R>i, R r)
    {
        Iterator <P> iter = c.iterator();
        if(iter.hasNext())
        {
            P p = iter.next();
            iter.remove();
            return i.join(p,FoldingClass.fold(c, i, r) );
            
        }
        else return r;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
       arr.add(25);
        arr.add(30);
        arr.add(56);
        arr.add(40);
        arr.add(80);
        arr.add(20);
        arr.add(70);
        arr.add(90);
        arr.add(20);
        arr.add(10);
        arr.add(60); 
        
        System.out.println("Function 1: Array List" + arr);
        System.out.println();
        System.out.println("Sum of all the elements of the list :" + FoldingClass.fold(arr, new AddingInt(), 0));
        System.out.println();
        
        arr.add(25);
        arr.add(30);
        arr.add(56);
        arr.add(40);
        arr.add(80);
        arr.add(20);
        arr.add(70);
        arr.add(90);
        arr.add(20);
        arr.add(10);
        arr.add(60);
        
        System.out.println("Function 2: Array list" + arr);
        System.out.println();
        System.out.println("Max of two numbers :" + FoldingClass.fold(arr, new MaxOfInt(), Integer.MIN_VALUE));
        System.out.println();
        
        
        ArrayList<String> ar = new ArrayList<String>();
        
        ar.add("Popoye");
        ar.add("Bruno");
        ar.add("Sophieturner");
        ar.add("Nataliedormer");
        ar.add("KurtKobain");
        
         
        System.out.println("String Array List" + ar);
        System.out.println();
        System.out.println("Function 3: Max of String and Int :" + FoldingClass.fold(ar, new StringLength(), 8));
        System.out.println();
        
       
        ar.add("Keysha");
        ar.add("AnneHathaway");
        ar.add("DemetriaGeneGuynes");
         
        System.out.println("String Array List" + ar);
        System.out.println();
        System.out.println("Function 3: Max of String and Int :" + FoldingClass.fold(ar, new StringLength(), 28));
        System.out.println();
        
        
        arr.add(11);
        arr.add(15);
        arr.add(7);
        arr.add(1);
        arr.add(8);
        arr.add(90);
        arr.add(14);
        arr.add(20);
        arr.add(33);
        arr.add(38);
        arr.add(17);
        arr.add(9);
        arr.add(6);
        arr.add(89);
        
        System.out.println("Unsorted array list is:" + arr);
        System.out.println();
        
        arr.add(32);
        System.out.println("Element to be added is : " + 32 );
        System.out.println();
        ArrayList<Integer> ordarray = FoldingClass.fold(arr, new OrderedList(), new ArrayList<Integer>());
        System.out.println("Function 4: Sorted array list after adding element:" + ordarray);
        
        
        
    }
}
    

