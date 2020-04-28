/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creationalpattern59cntt2;

import singleton.Singleton;

/**
 *
 * @author Tuấn Anh
 */
public class CreationalPattern59CNTT2
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Singleton s1 =Singleton.createInstance();
        Singleton s2 = Singleton.createInstance();
        
        s1.setCount(1);
        System.out.println("gia tri count: " + s1.getCount());
        
        s2.setCount(2);
        System.out.println("gia tri count: " + s1.getCount());
    }
    
}
