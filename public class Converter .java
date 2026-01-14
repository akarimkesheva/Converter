class Converter {
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    
    public static void main(String[] args) {
        System.out.println("Feet     Meters       Meters     Feet");
        System.out.println("--------------------------------------");

        double feet = 1.0;
        double meters = 20.0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("%4.1f     %5.3f         %4.1f     %7.3f\n", feet, footToMeter(feet), meters, meterToFoot(meters));
            feet += 1.0;
            meters += 5.0;
        }
    }
}

