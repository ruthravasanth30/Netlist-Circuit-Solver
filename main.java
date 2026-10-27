import java.util.Scanner;

public class NetlistCircuitSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== NETLIST CIRCUIT SOLVER ===");

        System.out.print("Enter supply voltage (V): ");
        double voltage = sc.nextDouble();

        System.out.print("Enter resistor R1 (ohms): ");
        double r1 = sc.nextDouble();

        System.out.print("Enter resistor R2 (ohms): ");
        double r2 = sc.nextDouble();

        if (voltage < 0 || r1 <= 0 || r2 <= 0) {
            System.out.println("Invalid input!");
        } else {
            // Series circuit calculations
            double totalResistance = r1 + r2;
            double current = voltage / totalResistance;

            double v1 = current * r1;
            double v2 = current * r2;

            System.out.println("\n--- CIRCUIT RESULTS ---");
            System.out.println("Total Resistance = "
                    + totalResistance + " ohms");

            System.out.println("Circuit Current = "
                    + current + " A");

            System.out.println("Voltage across R1 = "
                    + v1 + " V");

            System.out.println("Voltage across R2 = "
                    + v2 + " V");
        }

        sc.close();
    }
}
