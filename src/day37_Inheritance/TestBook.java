package day37_Inheritance;

public class TestBook {
    public static void main(String[] args) {
        AudioBook book2 = new AudioBook();
        book2.length = 35.5;
        book2.author = "Payami Safa";
        book2.title = "9. hariciye kogusu";
        book2.listen();
        System.out.println();
        EBook book1 = new EBook();
        book1.title = "Calikusu";
        book1 = new EBook();
        book1.title = "Güle güle";
        book1.page = 45;
        book1.readBook();
    }
}
