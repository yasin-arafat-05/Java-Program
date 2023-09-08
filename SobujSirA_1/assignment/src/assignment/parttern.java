/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author yasin
 */

public class parttern{
    void parttern1(){
        String s = "Java";
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }
    }
    void parttern2(){
        String s = "java";
        for(int i=0;i<s.length();i++){
            if(i>=1){
                System.out.print(s.charAt(i)+" ");
            }
            System.out.print(s.charAt(i)+" ");
        }
    }
    void pattern3(){
        String s = "Java";
        for(int i=0;i<s.length();i++){
            if(i%2==1){
                System.out.print(s.charAt(i)+""+s.charAt(i)+""+s.charAt(i)+""+s.charAt(i)+""+s.charAt(i)+" ");
            }else{
                System.out.print(s.charAt(i)+" "+s.charAt(i)+" ");
            }
        }
    }
    void pattern4(){
        String s = "Java";
        for(int i=0;i<s.length();i++){
            if(i%2!=1){
                System.out.print(s.charAt(i)+" "+s.charAt(i)+" ");
            }else{
                System.out.print(s.charAt(i)+" ");
            }
        }
    }
    public static void main(String args[]){
        parttern pd = new parttern();
        pd.parttern1();
        System.out.println();
        pd.parttern2();
        System.out.println();
        pd.pattern3();
        System.out.println();
        pd.pattern4();
    }
}
