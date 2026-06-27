import java.util.*;
class Strings_methods{
    public static void main(String[] args) {
        String str1="abc";
        String str2="abc";
        String str3=new String("abc");
         String str4=new String("abc");
        String str5=new String("I am Batman");
        System.out.println(str3.equals(str4));
        System.out.println(str3.charAt(2));
        System.out.println(str5.length());
        System.out.println(str5.substring(2,5));
        System.out.println(str5.contains("Bat"));
        System.out.println(str5.startsWith("I"));
        System.out.println(str5.endsWith("n"));
        String str6=str5.replace("Batman", "Bruce wayne");
        System.out.println(str6);
        String str7=str5.replace("[a,e,i,o,u]", "_");
        System.out.println(str7);
    }
}