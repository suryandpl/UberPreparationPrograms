package com.wipro.misc;
public class Temp 
{
    public static void mythrow() 
    {
        System.out.print("L0 ");
        throw new RuntimeException();
    }
    public static void main(String [] args) 
    {
        try 
        {
            System.out.print("L1 ");
            mythrow();
        }
        catch(Exception e) 
        {
            System.out.print("L2 ");
        }
        finally 
        {
            System.out.print("L3 ");
        }
        System.out.println("L4 ");
    }
}