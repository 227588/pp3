public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setName("Jabłko");
        p1.setVege(true);

        System.out.printf("Name: %s\nVege:%s\n",p1.getName(),p1.isVege());
    }
}
