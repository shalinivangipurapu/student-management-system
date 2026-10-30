import java.util.*;
public class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  StudentManagement sm=new StudentManagement();
  while(true){
   System.out.println("\n1.Add\n2.View\n3.Search\n4.Update\n5.Delete\n6.Exit");
   System.out.print("Choice: ");
   int c=sc.nextInt();
   switch(c){
    case 1: sm.add(); break;
    case 2: sm.view(); break;
    case 3: sm.search(); break;
    case 4: sm.update(); break;
    case 5: sm.delete(); break;
    case 6: System.out.println("Thank You"); return;
    default:System.out.println("Invalid Choice");
   }
  }
 }
}