public class kmTomiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        double miles = kilometers * 0.621371;

        System.out.printf("Distance in miles: %.2f%n", miles);

      }
}

