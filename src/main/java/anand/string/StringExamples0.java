package anand.string;

public class StringExamples0
{
    public static void main(String[] args)
    {
        String s1 = "JAVA";
 
        String s2 = "JAVA";
 
        System.out.println(s1 == s2);         //Output : true
 
        s1 = s1 + "J2EE";
 
        System.out.println(s1 == s2);         //Output : false
        
        String s3 = "JAVAJ2EE";
        
        System.out.println("s1 =" +s1+" and address of s1 = "+s1.hashCode());
        System.out.println("s2 =" +s2+" and address of s2 = "+s2.hashCode());
        System.out.println("s3 =" +s3+" and address of s3 = "+s3.hashCode());

        System.out.println(s1 == s3);   //??????????????
        System.out.println(s1.equals(s3));
                
        System.out.println("-----------------------------------");
        String s4 = "FB";        
        String s5 = "Ea";
        
        System.out.println(s4 == s5);   
        System.out.println(s4.equals(s5));
        System.out.println(s4.hashCode()==s5.hashCode());  // ????
    }
}
