package com.assignment2Q1;

public class Calculator
{
    private String identity;

    public double fAdd(double a, double b)
    {

        return(a + b);
    }

    public int iAdd( int a, int b)
    {
        return(a + b);
    }

    public double  fDivide(double a, double b)
    {
        /*if( b == 0)
        {
            System.out.println("Can't divide by 0");
            return 1;
        }
        else*/
            return (a / b);
    }

    public int iMultiply(int a, int b)
    {
        return (a * b);
    }

    public int iBiggerThan(int a, int b)
    {
        if(a > b)
            return a;
        else
            return b;
    }

    public int iSmallerThan(int a, int b)
    {
        if(a < b)
            return a;
        else
            return b;
    }

    public String identity(String identity)
    {
        this.identity = identity;

        return this.identity;
    }

}
