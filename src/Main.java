import homework.Author;
import homework.Book;

public class Main {
    public static void main(String[] args) {
        Author bloch = new Author("Джошуа","Блох");
        Author martin = new Author("Роберт","Мартин");
        Book philosophyJava = new Book("Чистый код",martin,2005);
        Book javaEffective = new Book("java эффективное рограммирование",bloch,2022);
        System.out.println(philosophyJava.getYearOfPublication());
        philosophyJava.setYearOfPublication(2007);
        System.out.println(philosophyJava.getYearOfPublication());
        System.out.println(javaEffective);
        System.out.println(philosophyJava);
    }
}