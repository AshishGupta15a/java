import java.util.Scanner;
public class Student
{
    int roll_no;
    int code;
    Scanner sc=new Scanner(System.in);
    void put_no()
    {
        System.out.println("enter roll number:");
        code=sc.nextInt();
    }
    void get_no()
    {
        System.out.println("enter the roll_no"+roll_no);
    }

    public interface Sports{
        float sport_wt=6;
        void put_wt();
    }
    public class Test extends Student
    {
        int M1;
        int M2;
        int total=0;
        
        Scanner sc=new Scanner(System.in);
        void put_marks()
        {
            System.out.println("enter Marks 1");
            M1=sc.nextInt();
            System.out.println("enter Marks 2");
            M2=sc.nextInt();
            total=M1+M2;
        }
        void get_marks()
        {
            System.out.println("enter Marks1"+M1);
            System.out.println("enter Marks2 "+M2);
        }
    }
    public class Result extends Test implements Sports
    {
        void display()
        {
            System.out.println("enter the total: "+total);
        }
        public void put_wt()
        {
            System.out.println("enter the weight"+sport_wt);
        }
    }

public static void main(String[] args)
{
    
        Student st1=new Student();
        
        Result r1=st1.new Result();
        r1.put_no();
        r1.put_marks();
        r1.put_wt();
        r1.get_no();
        r1.get_marks();
        r1.display();

 }

}
 