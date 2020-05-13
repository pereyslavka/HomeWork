public class Day01 {
    public static void main(String[] args){
    }
    public static void ex02(){
        int a = 123;
        float s = 123.523f;
        byte q =123;
        short w = 1234;
        long e = 465789;
        double r = 456.789f;
        boolean t = true;
        char tyu = 'q';
        String tre = "qwerty";
    }
    public static int ex03(int a,int b,int c,int d){
        int q = a * (b + (c / d));
        return (q);
    }
    public static boolean ex04(int a, int b){
        if((a+b>10)&&(a+b<=20))
        return (true);
        return(false);
    }
    public static void ex05(int a){
        if (a>=0)
            System.out.println("положительное");
        else System.out.println("отрицательное");
    }
    public static boolean ex06(int a){
        if (a<0)
            return (true);
        else return (false);
    }
    public static void ex07(String a){
        System.out.println("Привет, "+a+"!");
    }
    public static void ex08(int a){
        if(((a%4 == 0)&&(a%100!=0))||(a%400==0))
            System.out.println("Этот год високосный");
        else System.out.println("Этот год невисокосный");
    }
}
