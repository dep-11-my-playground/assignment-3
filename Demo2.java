public class Demo2 {
    public static void main(String[] args) {
        String name = "ruwini thakshila";
        int age = 18;

        String subject1 = "SE-1";
        String subject2 = "SE-2";
        String subject3 = "SE-3";

        double marks1 = 67.678;
        double marks2 = 67.89;
        double marks3 = 52.50;

        String status = "pass";
        String status1 = "Dp";
        String status2 = "CP";
        String status3 = "P";

        double total = marks1 + marks2 + marks3;
        double avg = total/3;
        


        System.out.printf("%s \n", "-".repeat(45));
        System.out.printf("| %-18s%s%s%s%s| \n", "Name :", "\033[34;1m", name.toUpperCase()," ".repeat(24-name.length()), "\033[0m");
        System.out.printf("| %-18s%d %s%12s| \n", "Age :", age,"years old"," ");
        System.out.printf("| %-18s%s%s%s%s| \n", "Status :","\033[0;1m", status, " ".repeat(24-status.length()), "\033[0m");
        System.out.printf("| %s%-16.2f%s%.2f%-7s| \n", "Total : ", total,"Avg : ", avg,"%");
        System.out.printf("%s \n", "-".repeat(45));
        System.out.printf("| %-11s| %-6s| %-21s| \n", "Subject", "Marks","Status");
        System.out.printf("%s \n", "-".repeat(45));
        System.out.printf("| SE-%03d%5s| %-6.2f| %-21s| \n", Integer.valueOf(subject1.substring(3))," ", marks1, status1);
        System.out.printf("| SE-%03d%5s| %-6.2f| %-21s| \n", Integer.valueOf(subject2.substring(3))," ", marks2, status2);
        System.out.printf("| SE-%03d%5s| %-6.2f| %-21s| \n", Integer.valueOf(subject3.substring(3))," ", marks3, status3);
        System.out.printf("%s \n", "-".repeat(45));



    }
}
