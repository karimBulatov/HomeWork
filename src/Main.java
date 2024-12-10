import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("И никого не стало", "Агата Кристи");
        Book book2 = new Book("Гарри Поттер и философский камень", "Джоан Роулинг", 1997, false);
        Book book3 = new Book("Властелин колец", "Джон Рональд Руэл Толкин", 1954, false);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.printAvailableBooks(); // Вывод доступных книг

        book1.borrowBook();// Забираем книгу и снова выводим доступные книги
        library.printAvailableBooks(); // Доступные книги после


        List<Book> booksByAuthor = library.findBooksByAuthor("aгата Кристи");
        for (Book book : booksByAuthor) {
            book.displayInfo();
        }

    }
}