public class Zad23{
    public static void main(String arg[]){
        double eurBuy = 4.5940;
        double eurSell = 4.6250;
        double spread = eurSell-eurBuy;
        System.out.printf("Bank buys EUR: ");
        System.out.printf("%,.4f\n", eurBuy);
        System.out.printf("Bank sells EUR: ");
        System.out.printf("%,.4f\n", eurSell);
        System.out.printf("Spread: ");
        System.out.printf("%,.4f\n", spread);
    }
}
