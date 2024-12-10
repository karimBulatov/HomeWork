import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books = new ArrayList();

    public void addBook(Book book){//
        books.add(book);
    }
    public void printAvailableBooks(){ //выводит все доступные книги.
        for(Book book : books){
            if (book.isAvailable()) {
                book.displayInfo();
            }
        }
    }
    public List<Book> findBooksByAuthor(String author){// возвращает книги автора
        List<Book> result = new ArrayList<>();
        for (Book book : books){
            if(book.getAuthor().equalsIgnoreCase(author)){
                result.add(book);
            }
        }
        return result;
    }
}
