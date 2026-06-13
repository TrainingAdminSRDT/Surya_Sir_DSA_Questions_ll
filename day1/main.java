public class main {
    public static void main(String[] args) {
        //swap two numbers without using third variable
        // int a=5;
        // int b=6;
        // a=a+b;
        // b=a-b;
        // a=a-b;
        // System.out.println("a="+a);
        // System.out.println("b="+b);

        int i=-1,j=-1,k=-1,l=2;
        int m=((i++ && j++ && k++) || l++);
        System.out.println("i="+i);
        System.out.println("j="+j); 
        System.out.println("k="+k);
        System.out.println("l="+l);
        System.out.println("m="+m);
    }
}