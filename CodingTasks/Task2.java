package Group.CodingTasks;

import com.syntax.class24.Student;

public class Task2 {
}
abstract class Marks{
     double []marks;

   abstract double getPercentage();
}
class StudentA extends Marks{
    StudentA(double...marks){
    this.marks=marks;
}
    @Override
    double getPercentage() {
    double sum = 0;
    for(double x:marks){
        sum+=x;
    }
    double Percentage=sum/marks.length;
        return Percentage;
    }

    public static void main(String[] args) {
   StudentA student=new StudentA(80,80,80);
        System.out.println(student.getPercentage());
}
}

class StudentB extends Marks{
    StudentB(double...marks){
        this.marks=marks;
    }

    @Override
    double getPercentage() {
        double sum=0;
        for(double x:marks){
            sum+=x;
        }
        double Percentage=sum/marks.length;
        return Percentage;
    }

    public static void main(String[] args) {
        StudentB student=new StudentB(99,89,45,78);
        System.out.println(student.getPercentage());
    }

}
