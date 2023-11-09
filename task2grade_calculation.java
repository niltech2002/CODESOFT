import java.util.Scanner;
    
  
public class task2grade_calculation {

    public static void main(String[] args) {
        System.out.println("subjects:");
        Scanner sc= new Scanner(System.in);
        System.out.println("math:");
       float a= sc.nextFloat();
         System.out.println("eng:");
         float b= sc.nextFloat();
         System.out.println("science:");
         float c= sc.nextFloat();
         float total_marks=a+b+c;
         System.out.println(total_marks);
         float percentage=(total_marks)/3;  
         System.out.println(percentage);
         if(percentage>90 && percentage<=100){
          System.out.println("grade:O");
         }
         else if(percentage>80 && percentage<=90){
          System.out.println("grade:A");
         }
         else if(percentage>60 && percentage<=80){
          System.out.println("grade:B");
         }
          else if(percentage>40 && percentage<=60){
          System.out.println("grade:C");
          }
          else{
            System.out.println("fail");
          }
        
      
      sc.close();  
        }
}  







         
