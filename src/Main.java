public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 63;
        double height = 168;
        double bodyMassIndex = service.calculate(weight, height);
        System.out.println(bodyMassIndex);
    }
}