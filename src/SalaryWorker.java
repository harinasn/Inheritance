public class SalaryWorker extends Worker {

    public SalaryWorker(String firstName, String lastName, double height, double weight, double hourlyPayRate) {
        super(firstName, lastName, height, weight, hourlyPayRate);
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        // Calculate the weekly pay based on the hourly pay rate and hours worked
        if (hoursWorked <= 40.0) {
            return hoursWorked * getHourlyPayRate();
        } else {
            double regularPay = 40.0 * getHourlyPayRate();
            double overtimePay = (hoursWorked - 40.0) * (getHourlyPayRate() * 1.5);
            return regularPay + overtimePay;
        }
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        // Your display code here (same as before)


    String straightLine = "-";
        for (int i = 0; i < 51; i++) {
            straightLine += "-";
        }
        String result = String.format("\n\nPay Breakdown for %-15s:\n%s\nWeekly Pay is:\t$%.2f\n%s\nWeekly salary calculated by dividing the annual salary by 52.\n\n",
                getFirstName() + " " + getLastName(), straightLine, calculateWeeklyPay(0), straightLine);
        return result;
    }
}
