public class DemoWrapper {
    public static void main(String[] args) {

        //primitive to object
        Integer number1= Integer.valueOf(10);
        Integer fromString=Integer.valueOf("55");
        Integer directlyFromPrimitive=20;

        //Object to primitive
        //type typeValue();
        //int intValue();
        //double doubleValue();
        int n1= number1.intValue();
       double d1=number1.doubleValue();


       Long l1=Long.valueOf(1234567898L);//boxing
       long longFromObject=l1.longValue();//Unboxing

       //AutoBoxing and auto unboxing
        Integer i1=10;//Auto boxing
        int num1=i1;//Auto unboxing

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Double.NEGATIVE_INFINITY = " + Double.NEGATIVE_INFINITY);

        Boolean b1=Boolean.valueOf(true);
        Boolean b2=Boolean.valueOf(false);

        Boolean b3=Boolean.valueOf("true");
        Boolean b4=Boolean.valueOf("false");
        Boolean b5=Boolean.valueOf("ture");

        System.out.println("b5 = " + b5);
        System.out.println("b4 = " + b4);
        System.out.println("b3 = " + b3);



    }
}
