import java.util.*;
public class Main{
    String name="";
    int cal=0;
    int salary=0;
    int bonous=0;
    void insert(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter name :");
        name=s.nextLine();    
        System.out.println("enter salary :");
        salary=s.nextInt();
        System.out.println("enter bonous :");
        bonous=s.nextInt();
    }
    void cal()
    {
        cal=salary+bonous;
        System.out.println(cal);
    }
    void display(){
        System.out.println(name);
        System.out.println(salary);
        System.out.println(bonous);
        System.out.println(cal);
    }
    public static void main(String s[])
    {
        Main m=new Main();
        m.insert();
        m.cal();
        m.display();
    }
}
