public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // Duck!
        System.out.println("🦆");
        
        boolean isDuck = true;
        if (isDuck) {
            System.out.println("It's a duck!");
        } else {
            System.out.println("It's not a duck.");
        }
        // This is a super change!
        printCube();
    }

    public static void printCube() {
        System.out.println("+----+\n|    |\n|    |\n+----+");
    }
}