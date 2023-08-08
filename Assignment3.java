import java.util.Scanner;

public class Assignment3 {
    private static final Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        final String Colour_RED_BOLD="\033[31;1m";
        final String Reset="\033[30;0m";

        String name;
        int age;
        String subject1;
        String subject2;
        String subject3;
        double marks1;
        double marks2;
        double marks3;
        

        app:{

        System.out.println("Enter Your Name");
        name=scanner.nextLine().strip();

        if (name.length()==0){
            System.out.printf("%sInvalid name%s",Colour_RED_BOLD,Reset);
            System.exit(1);  //other option-->assert false:"invalid name" // break app;
        }

        System.out.println("Enter your age");
        age=scanner.nextInt();
        scanner.nextLine();  //other option   scanner.skip.System.lineSeperator()

        if (age<10 || age>18){
            System.out.printf("%sInvalid age%s",Colour_RED_BOLD,Reset);
            
            break app;
        }

        System.out.println("Enter Subject1");
        subject1=scanner.nextLine().strip();
        if (subject1.isBlank()){
            System.out.printf("%ssubject cant be empghty%s",Colour_RED_BOLD,Reset);
            break app;
        }
        else if(!subject1.startsWith("SE-")){
            System.out.printf("%sinvalid subjects",Colour_RED_BOLD,Reset);
            break app;

       }

       System.out.printf("Enter marks for %s",subject1);
       marks1=scanner.nextDouble();
       scanner.nextLine();

       if(marks1<0 ||marks1 >100){
        System.out.printf("%sinvalid marks%s",Colour_RED_BOLD,Reset);
        break app;

       }


       ////////////

       System.out.println("Enter Subject2");
        subject2=scanner.nextLine().strip();
        if (subject2.isBlank()){
            System.out.printf("%ssubject cant be empghty%s",Colour_RED_BOLD,Reset);
            break app;
        }
        else if(!subject2.startsWith("SE-")){
            System.out.printf("%sinvalid subjects",Colour_RED_BOLD,Reset);
            break app;

       }

       System.out.printf("Enter marks for %s",subject2);
       marks2=scanner.nextDouble();
       scanner.nextLine();

       if(marks2<0 ||marks2 >100){
        System.out.printf("%sinvalid marks%s",Colour_RED_BOLD,Reset);
        break app;

       }


       ////////

       System.out.println("Enter Subject3");
        subject3=scanner.nextLine().strip();
        if (subject3.isBlank()){
            System.out.printf("%ssubject cant be empghty%s",Colour_RED_BOLD,Reset);
            break app;
        }
        else if(!subject3.startsWith("SE-")){
            System.out.printf("%sinvalid subjects",Colour_RED_BOLD,Reset);
            break app;

       }

       System.out.printf("Enter marks for %s",subject3);
       marks3=scanner.nextDouble();
       scanner.nextLine();

       if(marks3<0 ||marks3 >100){
        System.out.printf("%sinvalid marks%s",Colour_RED_BOLD,Reset);
        break app;

       }
       double total=marks1+marks2+marks3;
       double avg=total/3;

       String status;   //overall statement
       String subject1Status;
       String subject2Status;
       String subject3Status;


        //determine the overall statement
        if (avg>=75) status="distinguish pass";
        else if (avg>=65) status="credit pass";
        else if (avg>=55) status="pass";
        else status="fail(f)";
        System.out.println(status);

        //subject 1 status
       
        if (marks1>=75) subject1Status="distinguish pass";
        else if (marks1>=65) subject1Status="credit pass";
        else if (marks1>=55) subject1Status="pass";
        else subject1Status="fail(f)";

          //subject 2 status
       
        if (marks2>=75) subject2Status="distinguish pass";
        else if (marks2>=65) subject2Status="credit pass";
        else if (marks2>=55) subject2Status="pass";
        else subject2Status="fail(f)";

          //subject 3 status
           if (marks3>=65) subject3Status="credit pass";
          else if (marks3>=55) subject3Status="pass";
          else subject3Status="fail(f)";
  
          // subject1=String.format("SE-03d",Integer.valueOf(subject1.substring(beginIndex:3)));
  
          //lets generate the table
          System.out.println("+".concat("-".repeat(50)).concat("+"));
          System.out.printf("|%10s: %-38s|\n","name",name.toUpperCase());
          System.out.printf("|%10s: %-38s|\n","age",age+"years old");
          System.out.printf("|%10s: %-38s|\n","status",status.toUpperCase());
          System.out.printf("|%10s: %-38s|\n","total",String.format("%2f",total));
          System.out.println("+".concat("-".repeat(50)).concat("+"));
  
          final String LINE = "+".concat("-".repeat(10).concat("+"))
          .concat("-".repeat(12).concat("+"))
          .concat("-".repeat(26).concat("+"));
  // System.out.println(LINE);
  System.out.printf("|%-10s|%-12s|%-26s|\n", "Subject", "Marks", "Grade");
  System.out.println(LINE);
  System.out.printf("|%-10s|%-12.2f|%-26s|\n", subject1, marks1, subject1Status);
  System.out.printf("|%-10s|%-12.2f|%-26s|\n", subject2, marks2, subject2Status);
  System.out.printf("|%-10s|%-12.2f|%-26s|\n", subject3, marks3, subject3Status);
  System.out.println("+".concat("-".repeat(50).concat("+")));
       
        if (marks3>=75) subject3Status="distinguish pass";
        else if (marks3>=65) subject3Status="credit pass";
        else if (marks3>=55) subject3Status="pass";
        else subject3Status="fail(f)";

        // subject1=String.format("SE-03d",Integer.valueOf(subject1.substring(beginIndex:3)));

        //lets generate the table
        System.out.println("+".concat("-".repeat(50)).concat("+"));
        System.out.printf("|%10s: %-38s|\n","name",name.toUpperCase());
        System.out.printf("|%10s: %-38s|\n","age",age+"years old");
        System.out.printf("|%10s: %-38s|\n","status",status.toUpperCase());
        System.out.printf("|%10s: %-38s|\n","total",String.format("%2f",total));
        System.out.println("+".concat("-".repeat(50)).concat("+"));

        // final String LINE = "+".concat("-".repeat(10).concat("+")).concat("-".repeat(12).concat("+")).concat("-".repeat(26).concat("+"));
// System.out.println(LINE);
System.out.printf("|%-10s|%-12s|%-26s|\n", "Subject", "Marks", "Grade");
System.out.println(LINE);
System.out.printf("|%-10s|%-12.2f|%-26s|\n", subject1, marks1, subject1Status);
System.out.printf("|%-10s|%-12.2f|%-26s|\n", subject2, marks2, subject2Status);
System.out.printf("|%-10s|%-12.2f|%-26s|\n", subject3, marks3, subject3Status);
System.out.println("+".concat("-".repeat(50).concat("+")));


   
   
   
    }

    




    }}
