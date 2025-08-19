static class Retail{
    String name;
    int qut;
    int price;
    Retail(string a,int bint c){
        name=a;
        qut=b;
        price=c;
    }
    void retaildisplay(){
        System.out.println("name; "+name);
        System.out.println("qut: "+qut);
        System.out.println("price: "+price);
    }
   static class Purchase extends Retail{
        String pname;
        int pqut;
        int pprice;
        Purchase(String a,int b,int c,String d,int e,int f)
        {
            super(a,b,c);
            pname=d;
            pqut=e;
            pprice=f;
        }
        }
        void calculate(){
            int Bill=pqut*pprice;
            System.out.println("Bill: "+Bill);
        }
        void purchasedisplay(){
            System.out.println("Retail info:")
            retaildisplay();
            System.out.println("product name: "+pname);
            System.out.println("product quantity: "+pqut);
            System.out.println("Product price: "+pprice);
            System.out.println("purchase info: ");
            calculate();
        }
    }
    class Bill2{
        public static void main(String[]args){
            Purchase p=new Purchase("harish",840,200,"charan",220,250);
            p.purchassedisplay
        }
        
    }
}