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
public class MaxOfInt implements Joinable<Integer, Integer>
{

    @Override
    public Integer join(Integer p, Integer r) 
    {
    if(p>r)
        return p;
    else
        return r;
    
}
}
