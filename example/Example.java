//Using import
import java.math.BigDecimal;

//Unused import
import java.math.BigInteger;

public class Example
{


    //keyword
    public static void main(String[] args)
    { //Bracket

        //Class
        String string = "This is String yet.";

        //Warn
        Example clazz = new Example("This is class yet.");

        //String error and Compile error
        String stringErrors = "\i " ";
        //and typo
        HogeHoge hoge;

        //Primitive
        int integer = 114514;

        switch (integer)
        {
            case 0:
                return;
            case 114514:
                //static method and field
                System.out.println(114514);
                break;
            default:
                return;
        }

    }

    public Example(String a)
    {
        BigDecimal s = null;
    }
}
