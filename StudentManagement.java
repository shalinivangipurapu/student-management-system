import java.util.*;
public class StudentManagement{
    ArrayList<Student> list=new ArrayList<>();
    Scanner sc=new Scanner(System.in);

    Student find(int r){
        for(Student s:list) if(s.rollNo==r) return s;
        return null;
    }
    void add(){
        System.out.print("Roll No: "); int r=sc.nextInt(); sc.nextLine();
        System.out.print("Name: "); String n=sc.nextLine();
        System.out.print("Department: "); String d=sc.nextLine();
        System.out.print("Marks: "); int m=sc.nextInt();
        list.add(new Student(r,n,d,m));
        System.out.println("Student Added!");
    }
    void view(){
        if(list.isEmpty()){System.out.println("No Records");return;}
        for(Student s:list){System.out.println("---------------");System.out.println(s);}
    }
    void search(){
        System.out.print("Enter Roll No: ");int r=sc.nextInt();
        Student s=find(r);
        System.out.println(s==null?"Not Found":s);
    }
    void update(){
        System.out.print("Enter Roll No: ");int r=sc.nextInt();
        Student s=find(r);
        if(s==null){System.out.println("Not Found");return;}
        System.out.print("New Marks: ");s.marks=sc.nextInt();
        System.out.println("Updated");
    }
    void delete(){
        System.out.print("Enter Roll No: ");int r=sc.nextInt();
        Student s=find(r);
        if(s==null){System.out.println("Not Found");return;}
        list.remove(s); System.out.println("Deleted");
    }
}