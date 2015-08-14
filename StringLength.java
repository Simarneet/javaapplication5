/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Simarneet
 */
public class StringLength implements Joinable<String,Integer>
{

    @Override
    public Integer join(String p, Integer r) 
    {
        int x = p.length();
      if(x>r)
       
          return x;
      
      else return r;
    
    
}
}
