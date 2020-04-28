/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Tuấn Anh
 */
public class Singleton
{
    private static Singleton singleton;
    int count;

    protected Singleton()
    {
        count =0;
    }
    
    public static Singleton createInstance()
    {
        if(singleton==null)
            singleton = new Singleton();
        return singleton;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }
    
    
}
