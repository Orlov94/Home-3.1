public class BonusMilesService {
    public int calculate(int price) {
        int percent = 5;
        int miles = price * percent / 100;
        return miles;
    }
}
