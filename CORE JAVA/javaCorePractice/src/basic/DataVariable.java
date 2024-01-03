package basic;
import java.util.*;
import java.io.*;

//different types of variables
//different types of datatypes 

public class DataVariable
{ 

    public static String name=""; //static variable 

    //instance variables 
    public  int age;
    public double sub1_marks=86;
    public double sub2_marks=90;
    public double sub3_marks=98;

    public void useDatatypes()
    {
        //local variables

        byte byte_var=127;
        short short_var=10000;
        int int_var=-200000;
        long long_var=100000L;

        float float_var=234.5f;
        double double_var=234.5;

        boolean boolean_var=false;
        
        char char_var='m';
        String string_var="Good Morning";

        System.out.println("Byte: "+byte_var+"\tShort: "+short_var+"\tInteger: "+"\tLong: "+long_var+"\nFloat: "+float_var+"\tDouble: "+double_var+"\nBoolean: "+boolean_var);
        System.out.println("Character: "+char_var+"\tString: "+string_var);


    }
    public static void main(String args[])
    {
        //to access the instance variables, object concept 
        DataVariable object=new DataVariable();


        object.useDatatypes();

        double average=(object.sub1_marks+object.sub2_marks+object.sub3_marks)/3.0;



    }

}