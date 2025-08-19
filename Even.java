import java.util.*;
class Even{

    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
        for(int i=2;i<n;i++){
            boolean c = false;
            for(int j = 2;j<i;j++){
                if(i%j==0){
                    c = true;
                    break;
                }
            }
            if(c){
                System.out.println(i);
            }
        }
    }
    
}