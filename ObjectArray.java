  class Account {                                               /*publicبدون كتابة  class يجب كتابه*/
    int a;
    int b;
    public void setData(int c,int d){
    a=c;
    b=d;
}
    public void showData(){
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
    }
}
public class ObjectArray{
    public static void main(String[] args){
        Account Obj[]= new Account[2];
        Obj[0]=new Account();
        Obj[1]=new Account();
        Obj[0].setData(1,2);
        Obj[1].setData(3,4);
        System.out.println("For Array Element 0");
        Obj[0].showData();
        System.out.println("For Array Element 1");
        Obj[1].showData();
    }
}