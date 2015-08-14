/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Simarneet
 */
public class OrderedList implements Joinable <Integer, ArrayList<Integer>>
{


    @Override
    public ArrayList<Integer> join (Integer r, ArrayList<Integer>p) 
    { 
        int index=0;
        Iterator iter = p.iterator();
        while (iter.hasNext())
        {
           
            if( (int)iter.next()<r)
            {
                index++;
            }
            else 
                break;
          
        }
        p.add(index, r);
    return p;
    
}
}
