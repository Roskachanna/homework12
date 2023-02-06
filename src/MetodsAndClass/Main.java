package MetodsAndClass;

public class Main {
    public static void main(String[] args) {

        Autors lev = new Autors("Лев", "Толстой");
        Autors aleksandr = new Autors("Александр", "Пушкин");

        Book warAndPeace = new Book("Война и Мир" ,1867, lev);
        System.out.println(lev.getName());
        System.out.println(lev.getSurname());
        System.out.println(warAndPeace.getPublishingYear());
        warAndPeace.setPublishingYear(1868);
        System.out.println(warAndPeace.getPublishingYear());
    }
}
