import java.util.Scanner;

class Sum1{
        public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the size okfk an array1: ");
         int n=sc.nextInt();
             int a[] = new int[n];
             System.out.println("enter " +n "size of array numbers");
             for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
        }
      
        System.out.println("enter the size ok an array2: ");
        int m=sc.nextInt();
             int b[] = new int[m];
             for(int i=0;i<m;i++){
               b[i]=sc.nextInt();
    }
       int s=(m>n)?m:n;
       int c=new int[n+m];
       if(n<m){
         for(int i=0;i<n;i++){
            c[i]=a[i]+b[i];
         }
         for(int i=n;i<m;i++);{
            c[i]=b[1];
         }
      }
         else{
           for(int i=0;i<m;i++){
           c[i]=a[i]+b[i];
         }
         for(int i=m;i<n;i++);{
            c[i]=a[1];
         } 
         }
         System.out.println("the elements of merged array:");
         for(int i=o;i<s;i++){
            System.out.println(arr3[i]+ "");
         }
       }
      }

