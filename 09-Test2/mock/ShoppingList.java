// public class ShoppingList {
//     private Product[] list = {};
//     private int index=0;
//     public void add(Product product){
//         list[index]=product;
//         index++;
//     }
//     public String toString() {
//         String str = "";
//         for (int i = 0; i < index; i++) {
//             str += list[i].getName() +","+list[i].getQuantity()+"\n";
//         }
//         return str;
//     }
//     public int total(){
//         return index;
//     }
    

//     public static void main(String[] args) {
//         Product p1 = new Product("chleb", 2);
//         Product p2 = new Product("masło", 5);
//         Product p3 = new Product("jabłko", 22);
//         ShoppingList sl1 = new ShoppingList();
//         sl1.add(p1);
//         sl1.add(p2);
//         sl1.add(p3);
//         System.out.println(sl1);
//         System.out.println(sl1.total());
//     }
// }

import java.util.ArrayList;

public class ShoppingList {
    private ArrayList<Product> list = new ArrayList<Product>();
    // private Product[] list = {};
    private int index=0;
    public void add(Product product){
        list.add(product);
    }
    public String toString() {
        String str = "";
        for (Product product : list) {
            str+=product.getName()+", "+product.getQuantity()+"\n";
        }
        return str;
    }
    public int total(){
        return index;
    }
    

    public static void main(String[] args) {
        Product p1 = new Product("chleb", 2);
        Product p2 = new Product("masło", 5);
        Product p3 = new Product("jabłko", 22);
        ShoppingList sl1 = new ShoppingList();
        sl1.add(p1);
        sl1.add(p2);
        sl1.add(p3);
        System.out.println(sl1);
        System.out.println(sl1.total());
    }
}
