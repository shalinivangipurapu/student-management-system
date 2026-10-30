public class Student {
    int rollNo;
    String name;
    String department;
    int marks;

    Student(int rollNo,String name,String department,int marks){
        this.rollNo=rollNo;
        this.name=name;
        this.department=department;
        this.marks=marks;
    }

    String getGrade(){
        if(marks>=90) return "A+";
        if(marks>=80) return "A";
        if(marks>=70) return "B";
        if(marks>=60) return "C";
        return "Fail";
    }

    public String toString(){
        return "Roll No: "+rollNo+"\nName: "+name+"\nDepartment: "+department+
               "\nMarks: "+marks+"\nGrade: "+getGrade();
    }
}