package io.zolaton;

/**
 * Hello world!
 *
 */
public class BackEnd 
{
    public static void main(String[] args)
    {
        System.out.println(new BackEnd().greet("world"));
    }

    public String greet(String name) {
        return "Hello " + name + " from BackEnd";
    }
}
