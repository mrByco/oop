package myproducts;

public class Main {
    public static void main(String args[]){
        Bread bread = new Bread("Generic kenyer", 400, 14, 1);
        Product kifli = new Product("Croisant", 20, 14);
        print(bread);
        print(kifli);

        print("Compare bread to kifli: " + bread.compare(kifli));

        Product product2 = new Bread("Teljeskiorlesu lofasz (izletes)", 399, 14, 1);
        print(product2.toString());

        Bread bread2 = new Bread("Ocso-Jo", 5, 14, 1);

        print("Compare bread2 to product2: " + Bread.compareBreads(bread2, (Bread) product2));
    }

    public static <T> void print(T obj){
        System.out.println(obj);
    }
}