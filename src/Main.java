import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter type of Employee: ");
        char type = scanner.next().charAt(0);

        System.out.print("Enter hours worked: ");
        int hours = scanner.nextInt();

        Hourly hourly = new Hourly();
        Commission commission = new Commission();

        hourly.setTotalHours(hours);
        commission.setItemSold(hours);

        switch (type){
            case 'H':
                System.out.println("Salary: " + hourly.computeSalary());
                break;
            case 'C':
                System.out.println("Salary: " + commission.computeSalary());
                break;
        }

    }
}
