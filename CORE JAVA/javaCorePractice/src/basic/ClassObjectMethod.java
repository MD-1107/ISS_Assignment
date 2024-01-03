package Basic;
import java.util.*;

public class ClassObjectMethod
{
    //instance variables
    public int integer_val;
    public double double_val;
    public float float_val;
    public String string_val;
    

    //non static method 
    public void setValues(int integer_val, double double_val, float float_val, String string_val)
    {
        //when mentioning this with the variable, it means that the variable mentioned is the instance variables 
        this.integer_val=integer_val;

        this.double_val=double_val;

        this.float_val=float_val;

        this.string_val=string_val;

        System.out.println("\nNon-Static Method Called using object Creation");

        System.out.println("Integer: "+integer_val+"\tDouble: "+double_val+"\tFloat: "+float_val+"\tString: "+string_val);
    }

    public static void displayValues(int integer_val, double double_val, float float_val, String string_val)
    {
        System.out.println("Static Method directly called");

        System.out.println("Integer: "+integer_val+"\tDouble: "+double_val+"\tFloat: "+float_val+"\tString: "+string_val);        
    }

    //static main method 
    public static void main(String args[])
    {
        //object creation as calling the non-static method from a static method
        ClassObjectMethod object=new ClassObjectMethod();

        //local variables;
        int local_int=5;

        double local_double=6.8;

        float local_float=6;

        String local_string="Hello World";

        //method calling through object creation
        object.setValues(local_int, local_double, local_float, local_string);

        displayValues(local_int, local_double, local_float, local_string);


        

    }


}