package com.string;
//

//
//public class Anagram {
//    /*i/p:mary
//      o/p:army
//     */
//    public static void main(String[] args) {
//        String a="Radeon";
//        String b="Adreno";
//        int count = 0;
//        boolean flag = true;
//        char[] c1=a.toCharArray();
//        char[] c2=b.toCharArray();
//        Arrays.sort(c1);
//        Arrays.sort(c2);
//        if (c1.length==c2.length) {
//            for (int i = 0; i < c1.length; i++) {
//                        String s1=" "+c1[i];
//                for (int j = 0; j < c2.length; j++) {
//                        String s2=" "+c2[i];
//                    if (s1.equalsIgnoreCase(s2)) {
//                        count++;
//                        c2[j]=0;
//                        break;
//                    }
//                }
//            }
//            if (c1.length==count){
//                System.out.println("Anagram");
//                flag=false;
//            }
//        }
//        if (flag)
//            System.out.println("Not Anagram");
//
//    }
//}
//        /*
//        Arrays.sort(a1);
//        Arrays.sort(b1);
//        String s1 = "";
//        String s2 = "";
//        System.out.println(Arrays.toString(a1));
//        System.out.println(Arrays.toString(b1));
//        if (a1.length == b1.length) {
//            for (int i = 0; i < a1.length; i++) {
//                s1 = s1 + a1[i];
//                s2 = s2 + b1[i];
//            }
//            if (s1.equalsIgnoreCase(s2)) {
//                flag = false;
//                System.out.println("Anagram");
//            }
//        }
//        if (flag) {
//            System.out.println("not Anagram");
//        }
//        */
//
//
class Anagram_1{
    public static void main(String[] args) {
        String s1="Army";
        String s2="apleo";
        int count=0;
        boolean flag=true;
        char c[]=s1.toCharArray();
        char d[]=s2.toCharArray();
        if (c.length==d.length){
            for (int i=0;i<c.length;i++){
                String s3=" "+c[i];
                for (int j=0;j<d.length;j++){
                    String s4=" "+d[j];
                    if (s3.equalsIgnoreCase(s4)){
                        d[j]=0;
                        count++;
                        break;
                    }
                }
            }
                if (c.length==count){
                    flag=false;
                    System.out.println("Anagram");
                }
        }
        if(flag)
            System.out.println("not anagram");
    }
}