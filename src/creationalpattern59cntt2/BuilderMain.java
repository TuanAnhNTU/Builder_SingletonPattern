/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creationalpattern59cntt2;

import builder.Computer;

/**
 *
 * @author Tuấn Anh
 */
public class BuilderMain
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Computer computer = new Computer.Builder()
                .addCPU("Core i7 8900")
                .addRAM("16GB 2400 MHz")
                .addScreen("Full HD 24 inch")
                .build();
        
        System.out.println(computer.toString());
    }
    
}
