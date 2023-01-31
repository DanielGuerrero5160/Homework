package class17HW;

public class Students {
    int mathGrade;
    int scienceGrade;
    int historyGrade;

    Students(int sMathGrade,int sScienceGrade, int sHistoryGrade){
        mathGrade=sMathGrade;
        scienceGrade=sScienceGrade;
        historyGrade=sHistoryGrade;
    }
    char avGrade(){
        int avg=(mathGrade+scienceGrade+historyGrade)/3;
        if(avg>=90){
        return 'A';
        } else if (avg>=80) {
            return 'B';
        } else if (avg>=70) {
            return 'C';
        }else if(avg>=60){
            return 'D';
        }else {
            return 'F';
        }
    }

    /*
    Write a java Class Students that have a constructor which
    takes students name and 3 subject grades. Inside your class
    also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks. Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
     */
    public static void main(String[] args) {
        Students student1=new Students(90,80,75);
        Students student2=new Students(95,60,75);
        Students student3=new Students(42,89,65);
        Students student4=new Students(95,90,95);
        Students student5=new Students(24,50,5);
        System.out.println("Student1's average mark is "+student1.avGrade());
        System.out.println("Student2's average mark is "+student2.avGrade());
        System.out.println("Student3's average mark is "+student3.avGrade());
        System.out.println("Student4's average mark is "+student4.avGrade());
        System.out.println("Student5's average mark is "+student5.avGrade());
    }
}
