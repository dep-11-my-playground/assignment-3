import java.util.Scanner;

public class Assignment3 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  
        
        if (name.length() > 0 & name.strip()!=""){
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            if (age >=10 & age <=18){
                System.out.print("Enter your subject1: ");
                String subject1 = scanner.nextLine();

                if (subject1.startsWith("SE-") & subject1.strip()!=""){
                    System.out.print("Enter your Marks for subject1: ");
                    double marks1 = scanner.nextDouble();

                    if(marks1 > 0 & marks1 <=100){
                        System.out.print("Enter your subject2: ");
                        scanner.nextLine();
                        String subject2 = scanner.nextLine();
                        

                        if ((subject1 != subject2) && (subject2.startsWith("SE-")) & (subject2.strip()!="")){
                            System.out.print("Enter your Marks for subject2: ");
                            double marks2 = scanner.nextDouble();

                            if (marks2 > 0 & marks2 <=100){
                                System.out.print("Enter your subject3: ");
                                scanner.nextLine();
                                String subject3 = scanner.nextLine();
                                

                                if ((subject3 !=subject1 | subject3 !=subject2) && (subject3.startsWith("SE-")) & (subject3.strip()!="")) {
                                    System.out.print("Enter your Marks for subject3: ");
                                    double marks3 = scanner.nextDouble();
                                    
                                    if (marks3 > 0 & marks3 < 100){
                                        
                                        double total = marks1 + marks2 + marks3;
                                        double avg = total /3;
                                        String statusDP = "\033[34mDistinguish Pass(DP)";
                                        String statusCP = "\033[32mCredit Pass(CP)";
                                        String statusP = "\033[33mPass(P)";
                                        String statusF = "\033[31mFail";

                                        String status1 = "";
                                        String status2 = "";
                                        String status3 = "";

                                        String status ="";
                                        
                                        if (avg >= 75) status = statusDP;                                       
                                        else if (avg >= 65) status = statusCP;
                                        else if (avg >= 55) status = statusP;
                                        else status = statusF;

                                        System.out.println();

                                        if (marks1 >= 75) status1 = statusDP;                                        
                                        else if (marks1 >= 65) status1 = statusCP;
                                        else if (marks1 >= 55) status1 = statusP;
                                        else status1 = statusF;

                                        if (marks2 >= 75) status2 = statusDP;                                        
                                        else if (marks2 >= 65) status2 = statusCP;
                                        else if (marks2 >= 55) status2 = statusP;
                                        else status2 = statusF;

                                        if (marks3 >= 75) status3 = statusDP;                                        
                                        else if (marks3 >= 65) status3 = statusCP;
                                        else if (marks3 >= 55) status3 = statusP;
                                        else status3 = statusF;
                                        
                                       

                                        System.out.printf("%s \n", "-".repeat(45));
                                        System.out.printf("| %-18s%s%s%s%s| \n", "Name :", "\033[34;1m", name.toUpperCase()," ".repeat(24-name.length()), "\033[0m");
                                        System.out.printf("| %-18s%d %s%12s| \n", "Age :", age,"years old"," ");
                                        System.out.printf("| %-18s%s%s%s%s| \n", "Status :","\033[0;1m", status, " ".repeat(29-status.length()), "\033[0m");
                                        System.out.printf("| %s%-16.2f%s%.2f%-7s| \n", "Total : ", total,"Avg : ", avg,"%");
                                        System.out.printf("%s \n", "-".repeat(45));
                                        System.out.printf("| %-11s| %-6s| %-21s| \n", "Subject", "Marks","Status");
                                        System.out.printf("%s \n", "-".repeat(45));
                                        System.out.printf("| SE-%03d%5s| %-6.2f| %-26s%s| \n", Integer.valueOf(subject1.substring(3))," ", marks1, status1, "\033[0m");
                                        System.out.printf("| SE-%03d%5s| %-6.2f| %-26s%s| \n", Integer.valueOf(subject2.substring(3))," ", marks2, status2, "\033[0m");
                                        System.out.printf("| SE-%03d%5s| %-6.2f| %-26s%s| \n", Integer.valueOf(subject3.substring(3))," ", marks3, status3, "\033[0m");
                                        System.out.printf("%s \n", "-".repeat(45));

                                    }else{
                                        System.out.println("invalid marks");
                                    }

                                

                                }else{
                                    if (subject3.equals(subject1) | subject3.equals(subject2)){
                                        System.out.println("\033[31mSubject already exists");
                                    } else{
                                        System.out.println("\033[31mInvalid subject");
                                    }
                                    
                                    
                                }

                            }else{
                                System.out.println("\033[31Invalid marks");
                            }

                        }else{
                            if (subject1.equals(subject2)){
                            System.out.println("\033[31mSubject already exists");
                            } else {
                                System.out.println("\033[31mInvalid subject!");
                            }
                            
                        }
                    }else{
                        System.out.println("\033[31mInvalid marks");
                    }

                }else {
                    System.out.println("\033[31mInvalid subject!");
                }
            }else{
                System.out.println("\033[31mInvalid age");
                
            }

        }else{
            System.out.println("\033[31mInvalid name");
        }

        
    



        

        

        

    

        
        
    }
}
