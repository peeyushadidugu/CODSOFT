import java.util.Scanner;
class Task2 
{
    public static void main(String args[])
    { int sum=0,avgper;
    Scanner sc=new Scanner(System.in);
    
    System.out.println("ENTER MARKS OBTAINED IN MATHS");
    int m= sc.nextInt();
    if(m<0 || m>100)
    {
        System.out.println("INVALID INPUT");
        return;
    }
    System.out.println("ENTER MARKS OBTAINED IN PHYSICS");
    int p= sc.nextInt();
    if(p<0 || p>100)
    {
        System.out.println("INVALID INPUT");
        return;
    }
    System.out.println("ENTER MARKS OBTAINED IN CHEMISTRY");
    int c= sc.nextInt();
    if(c<0 || c>100)
    {
        System.out.println("INVALID INPUT");
        return;
    }
    System.out.println("ENTER MARKS OBTAINED IN ENGLISH");
    int e= sc.nextInt();
    if(e<0 || e>100)
    {
        System.out.println("INVALID INPUT");
        return;
    }
    System.out.println("ENTER MARKS OBTAINED IN BIOLOGY");
    int b= sc.nextInt();
    if(b<0 || b>100)
    {
        System.out.println("INVALID INPUT");
        return;
    }
    
    sum=m+p+c+e+b;
    System.out.printf("TOTAL MARKS ARE:%d\n",sum);
    avgper=sum/5;
    System.out.printf("AVERAGE PERCENTAGE IS:%d\n",avgper);
    if(avgper<40)
    {System.out.println("GRADE OBTAINED F");}
    else if(avgper>=40 && avgper<50)
    {System.out.println("GRADE OBTAINED P");}
    else if(avgper>=50 && avgper<60)
    {System.out.println("GRADE OBTAINED B");}
    else if(avgper>=60 && avgper<70)
    {System.out.println("GRADE OBTAINED B+");}
    else if(avgper>=70 && avgper<80)
    {System.out.println("GRADE OBTAINED A");}
    else if(avgper>=80 && avgper<90)
    {System.out.println("GRADE OBTAINED A+");}
    else
    {System.out.println("GRADE OBTAINED O");}
    
    }
}