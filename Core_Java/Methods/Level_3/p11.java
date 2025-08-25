package Level_3;

public class p11 {
    public static int[][] generateEmployeeData(int n) {
        int[][] data = new int[n][2]; // [salary, yearsOfService]
        for (int i = 0; i < n; i++) {
            int salary = 10000 + (int)(Math.random() * 90000); // 5-digit salary
            int years = 1 + (int)(Math.random() * 10); // years of service between 1 to 10
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateNewSalaryAndBonus(int[][] data) {
        int n = data.length;
        double[][] newData = new double[n][2]; // [newSalary, bonus]
        for (int i = 0; i < n; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }
        return newData;
    }

    // Method to calculate totals
    public static void displayTotals(int[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Emp No", "OldSalary", "Years", "Bonus", "NewSalary");

        for (int i = 0; i < oldData.length; i++) {
            int oldSalary = oldData[i][0];
            int years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-10d %-10d %-10.2f %-10.2f\n", (i + 1), oldSalary, years, bonus, newSalary);
        }

        System.out.println("-----------------------------------------------------");
        System.out.printf("%-10s %-10.2f %-10s %-10.2f %-10.2f\n", "Total", totalOldSalary, "", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int n = 10; // 10 employees
        int[][] employeeData = generateEmployeeData(n);
        double[][] newData = calculateNewSalaryAndBonus(employeeData);
        displayTotals(employeeData, newData);
    }
}
