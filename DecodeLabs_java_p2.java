 import java.util.*;
class Grade
{
    public void gradeCalculator()
    {
        System.out.println("enter the number of subjects");
        Scanner sc=new Scanner(System.in);
        int subjectsNumber=sc.nextInt();
        int totalMarks=0;
        double average;
        for(int i=1;i<=subjectsNumber;i++)
        {
            System.out.println("enter the marks of subject "+ i);
            int marks=sc.nextInt();
            if(marks>100 || marks<0)
            {
                System.out.println(" invalid marks , please enter marks between 0 to 100");
                i--;
                continue;
            }
            
            totalMarks=totalMarks+marks;
        }
        int maxMarks=subjectsNumber*100;
        System.out.println(" your total marks are " + totalMarks  +  " out of " + maxMarks);
        average=(double)totalMarks/subjectsNumber;
        System.out.println("Average Percentage is " + average);
        if(average>=90)
        {
            System.out.println("your grade is A");
        }
        else if(average>=80)
        {
            System.out.println("your grade is B");
        }
        else if(average>=70)
        {
            System.out.println("your grade is C");
        }
        else if(average>=60)
        {
            System.out.println("your grade is D");
        }
        else if(average>=50)
        {
            System.out.println("your grade is E");
        }
        else
        {
            System.out.println("you failed");

        }
        


    }
}
class Calculator
{
    public static void main(String args[])
    {
        Grade obj=new Grade();
        obj.gradeCalculator();
    }

}
