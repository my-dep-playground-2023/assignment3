public class table {
    public static void main(String[] args) {
        final String Colour_RED_BOLD="\033[31;1m";
        final String Reset="\033[30;0m";

        String name="kalana mihiranga";
        int age=15;
        String subject1="SE-1";
        String subject2="SE-2";
        String subject3="SE-3";
        double marks1=32.23;
        double marks2=95.89;
        double marks3=87.45;

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


    }
}
