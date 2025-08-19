import java.util.*;
class Amstrong{
    static int calSize(int n){
        int c = 0;
        while(n>0){
            c += 1;
            n /=10;

        }
        return c;
    }
    static int calAmstrong(int n,int size){
        int ams = 0;
        while(n>0){
            int rem = n%10;
            ams += Math.pow(rem,size);
            n /=10;

        }
        return ams;
    }
    public static void main(String[]args){
        
        Scanner s = new Scanner(System.in);
        for(int i=1;i<10000;i++){
            int n = i;
            int size = calSize(n);
            int calAms = calAmstrong(n,size);
            if(n==calAms){
                System.out.print(calAms + " , ");
            }
        }
        
    }
}