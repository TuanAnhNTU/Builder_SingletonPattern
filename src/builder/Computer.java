/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Tuấn Anh
 */
public class Computer
{
    String CPU, RAM, screen;
    protected Computer(Builder builder)
    {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.screen = builder.screen;        
    }

    @Override
    public String toString()
    {
        return "Computer{" + "CPU=" + CPU + ", RAM=" + RAM + ", screen=" + screen +
                '}';
    }
       
    public static class Builder // khai báo static để lớp bên ngoài có thể truy cập từ bên ngời quan tên lớp ngoài
    {
        String CPU, RAM, screen;

        public Builder()
        {
        }
        
        public Builder addCPU(String CPU)
        {
            this.CPU = CPU;
            return this;
        }
        public Builder addRAM(String RAM)
        {
            this.RAM = RAM;
            return this;
        }
         
        public Builder addScreen(String screen)
        {
            this.screen = screen;
            return this;
        }
        
        public Computer build()
        {
            return new Computer(this);
        }
    }
}
