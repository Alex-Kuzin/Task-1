
public class Main {
    public static void main(String[] args) {
        bonusMilesService service = new bonusMilesService();
        int price = 10_000;
        int result = service.calculate(price); // должно получиться 500
        System.out.println(result);
    }
}
