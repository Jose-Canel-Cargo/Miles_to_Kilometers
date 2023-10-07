public class MilesToKilometers {
    public static void main(String[] args) throws Exception {
        final double Kilometers = 1.609;
        Double Miles;
        int Count = 1;

        System.out.println("Miles     Kilometers");

        while (Count < 11){
            Miles = Count * Kilometers;
            System.out.println(Count + "          " + Miles);
            Count++;
        }
    }
}
