
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary;

/**
 *
 * @author yasin
 */

public class demo {
    
    static int prime(int k){
        for(int i=2;i<(k);i++){
            if( (k%i)==0){
                return -1;
            }
        }
        return 1;
    }
    
    public static void main(String[] args) {
        int sum=0;
        int cnt = 0;
        for(int i=2;;i++){
            int res = prime(i);
            
            if(res==1){
                sum +=i;
                cnt +=1;
                System.out.print(i+" ");
                if(cnt==100){
                    break;
                }
            }
        }
        
        System.out.println();
        System.out.println("sum : "+sum);
    }
}
