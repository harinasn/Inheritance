public class Worker extends Person {

    private double hourlyPayRate;

    public Worker(String firstName, String lastName, double height, double weight, double hourlyPayRate) {
        super(firstName, lastName, height, weight);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }
    // Method to calculate the weekly pay based on the number of hours worked.
    public double calculateWeeklyPay(double hoursWorked) {
        double regularHours = Math.min(hoursWorked, 40.0); // Calculate regular hours (up to 40)
        double overtimeHours = Math.max(hoursWorked - 40.0, 0); // Calculate overtime hours (minimum 0)
        double regularPay = regularHours * hourlyPayRate; // Calculate regular pay
        double overtimePay = overtimeHours * (hourlyPayRate * 1.5); // Calculate overtime pay
        return regularPay + overtimePay; // Total pay is the sum of regular and overtime pay
    }

    // Method to display weekly pay details, including regular and overtime pay.
    public String displayWeeklyPay(double hoursWorked) {
        double regularHours = Math.min(hoursWorked, 40.0); // Calculate regular hours (up to 40)
        double overtimeHours = Math.max(hoursWorked - 40.0, 0); // Calculate overtime hours
        double regularPay = regularHours * hourlyPayRate; // Calculate regular pay
        double overtimePay = overtimeHours * (hourlyPayRate * 1.5); // Calculate overtime pay
        double totalPay = regularPay + overtimePay; // Calculate total pay

        // Create a formatted string to display weekly pay details
        String result = String.format("\n\nWeekly pay details for %s %s:\n", getFirstName(), getLastName());
        result += "------------------------------------------\n";
        result += String.format("Regular Hours Worked: %.2f\n", regularHours);
        result += String.format("Regular Pay Rate: $%.2f\n", hourlyPayRate);
        result += String.format("Regular Pay: $%.2f\n", regularPay);
        result += "------------------------------------------\n";
        result += String.format("Overtime Hours Worked: %.2f\n", overtimeHours);
        result += String.format("Overtime Pay Rate: $%.2f\n", hourlyPayRate * 1.5);
        result += String.format("Overtime Pay: $%.2f\n", overtimePay);
        result += "------------------------------------------\n";
        result += String.format("Total Pay: $%.2f\n", totalPay);
        result += "------------------------------------------\n";

        return result; // Return the formatted result
    }
}
