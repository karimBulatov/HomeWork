class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    public Book(String title, String author, int year, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
        this.year = 2000;
        this.isAvailable = true;
    }

    public void borrowBook(){ //забрал книгу
        if(isAvailable){
            isAvailable = false;
            System.out.println("Вы забрали книгу");
        }else{
            System.out.println("Книга не доступна");
        }
    }
    void returnBook(){ //вернул книгу
        isAvailable = true;
        System.out.println("Вы вернули книгу");
    }
    void displayInfo(){ //выводит на экран информацию о книге
        System.out.format("Название книги: %s\nАвтор: %s\nГод выпуска: %d\nОна в бибилиотеке? %b \n", title, author, year, isAvailable );
    }
@Override
    public String toString() {
        return String.format("Название: %s, Автор: %s, Год: %d, Доступна: %b",
                title, author, year, isAvailable);
    }

    boolean isAvailable() {
        return isAvailable;
    }

    String getAuthor() {
        return author;
    }

}
