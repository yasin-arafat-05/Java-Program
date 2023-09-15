/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercisethree;
import java.util.Scanner;
/**
 * @author yasin
 */
public class countSWN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char []arr = s.toCharArray();
        int cntL=0,cntS=0,cntN=0,other=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='0' && arr[i]<='9'){
                cntN++;
            }else if((arr[i]>='a' && arr[i]<='z')||(arr[i]>='A' && arr[i]<='Z')){
                cntL++;
            }else if(arr[i]==' '){
                cntS++;
            }else{
                other++;
            }
        }
        System.out.println("Letter : "+cntL+"\n"+"Number : "+cntN);
        System.out.println("Space : "+cntS+"\n"+"others : "+other);
    }
}
