public class Calculator {
     static int a;
     static int b;

     public static void multiplication(){
          System.out.println("a*b=" +a +"*" +b +"=" +a*b);
     }
     public static void division(){
          System.out.println("a/b=" +a +"/" +b +"=" + a/b);
     }
     public static  int sum(int s){
          System.out.println(s +"+b=" +s +"+" +b +"=" +(s+b));
          System.out.println(s +"+a=" +s +"+" +a +"=" +(s+a));
     return s;
     }
     public static int deduct(int d){
          System.out.println(d +"-b=" +d +"-" +b +"=" +(d-b));
          System.out.println(d +"-a=" +d +"-" +a +"=" +(d-a));
          return d;
     }
}
