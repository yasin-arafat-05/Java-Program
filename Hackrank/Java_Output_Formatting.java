public class Java_Output_Formatting {
    public static void main(String[] args) {
        String s="I LOVE MY COUNTRY";
        char c=s.charAt(0);
        System.out.println(""+c);
        int p=s.codePointAt(0);
        System.out.println(""+p);
        int q=s.indexOf('M');
        System.out.println(""+q);
        int r=s.lastIndexOf('Y');
        System.out.println(""+r);
         String s1="     I LOVE  MY  COUNTRY     ";
        
        String s2=s.trim();
        System.out.println(""+s2);
        
        String a="my name is udita";
        String b=a.replace("udita","arnob" );
        System.out.println(""+a);
        System.out.println(""+b);
        String []c = a.split(" ");
        for(String x: c)
        {
            System.out.println(x);
        }
    }
}