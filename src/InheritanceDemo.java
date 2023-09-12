import java.util.ArrayList;
import java.util.Scanner;

public class InheritanceDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String straightLine = "-";
        for (int i = 0; i < 51; i++) straightLine += "-";

        ArrayList<Worker> workerList = new ArrayList<Worker>();

        // Create 3 Worker instances with hourly pay rates and add them to the list
        for (int i = 0; i < 3; i++) {
            System.out.println("\n" + straightLine);
            System.out.print("\n\tEnter the First Name\n\t");
            String firstName = in.nextLine();

            System.out.print("\n\tEnter the Last Name\n\t");
            String lastName = in.nextLine();

            System.out.print("\n\tEnter weight\n\t");
            double weight = in.nextDouble();
            in.nextLine();

            System.out.print("\n\tEnter height\n\t");
            double height = in.nextDouble();
            in.nextLine();

            System.out.print("\n\tEnter hourly pay rate\n\t");
            double hourlyPayRate = in.nextDouble();
            in.nextLine();

            Worker tempWorker = new Worker(firstName, lastName, weight, height, hourlyPayRate);
            workerList.add(tempWorker);

            System.out.println(straightLine + "\n");
        }

        // Simulate 3 weekly pay periods
        for (int week = 1; week <= 3; week++) {
            System.out.println("\n\n\tSimulating Week " + week);
            double hoursWorked = (week == 2) ? 50.0 : 40.0; // 50 hours in week 2, 40 hours in others
            System.out.println("\nWeekly Pay Details:\n");

            // Display weekly pay for each worker
            for (Worker worker : workerList) {
                System.out.println(worker.displayWeeklyPay(hoursWorked));
            }
        }
    }
}
