package com.company;

public class Stack_implementation {
    private int top;
    private int []data ;
    public static final int DEFAULT_CAPACITY = 10;
    public Stack_implementation() throws Exception
    {
        this(DEFAULT_CAPACITY);
    }
    public Stack_implementation(int capacity) throws Exception
    {
        if (capacity<1)
        {
            throw new Exception("capacity cannot be zero");
        }
        this.data = new int[capacity];
        this.top = -1;
    }
    public int size()
    {
        return this.top+1;
    }
    public boolean isempty()
    {
        return this.top==-1;
    }
    public int push(int value) throws Exception
    {
        if (this.data.length ==this.top+1)
        {
            throw new Exception("stack is full");
        }
        int rv = this.top ++;
        this.data[this.top] = value;
        return rv;
    }
    public int pop() throws Exception
    {
        if (this.top==-1)
        {
            throw new Exception("stack underflow !!");
        }
        int rv = this.data[this.top] = 0;
        this.top--;
        return rv;
    }
    public int top() throws Exception
    {
        if (this.top==-1)
        {
            throw new Exception("stack underflow !!");
        }
        return this.data[this.top];
    }
    public void display()
    {
        for (int i=this.top;i>=0;i--)
        {
            System.out.print(this.top + " ");
        }
        System.out.println("END");

    }
}
