public class volumeOfCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        
        double volume = Math.PI * radius * radius * height;
        
        System.out.printf("Volume of the cylinder: %.2f%n", volume);
    }
}

