package BY.BELHARD.BH24.HW.HW05.TASK1;

/*1) Описать класс Книга. Поля:
название,
количество страниц,
 автор,
 формат.
Автор – тоже класс, содержит имя, фамилию, возраст.

        При создании экземпляров описанных классов нужно проверять, что введены валидные данные
        (количество страниц и возраст должны быть больше 2, название книги и имя-фамилия автора – не пустые.
        Если данные не проходят валидацию, то присваивать полям какие-то дефолтные значения). Уделите внимание правильному описанию всех частей класса:
        приватные поля, методы доступа к полям (геттеры и сеттеры), подумайте, какой доступ вы хотите предоставить,
        а какой – ограничить. Не забудьте про метод toString().
        1*) доп1. Поле автор замените на поле авторы. Это должен быть массив, хранящий список авторов.
        2*) доп2. Опишите класс Картотека.
        Он должен содержать метод, который будет принимать 3 параметра:
        массив книг, имя и фамилию.
        Возвращать этот метод должен массив книг этого автора (либо пустой массив, если книг этого автора нет).
*/




public class Book {

    private String bookName;
    private int pageQuantity;
    private Author author;
    private BookFormat bookFormat;

    public Book() {
        bookName = "unknown name";
        pageQuantity = 0;
        author = new Author("Unknown name", "Unknown surname", 100);
        bookFormat = BookFormat.NORMALBOOK;
    }

    public Book(String bookName, int pageQuantity, Author author, BookFormat bookFormat) {
        this.bookName = bookName;
        if (pageQuantity <=2)
            pageQuantity = 2;
        this.pageQuantity = pageQuantity;
        this.author = author;
        this.bookFormat = bookFormat;
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println(book1.toString());
        Book book2 = new Book("Idiot", 456, new Author("Fedor", "Dostoyevskiy", 40),BookFormat.NORMALBOOK);
        System.out.println(book2.toString());
        Book book3 = new Book("Kolobok", 1,new Author("Narod", "Narod", 0) ,BookFormat.NORMALBOOK);
        System.out.println(book3.toString());
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", pageQuantity=" + pageQuantity +
                ", author=" + author.toString() +
                ", bookFormat=" + bookFormat +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        if (bookName.isEmpty())
            this.bookName = "UnknownBookName";
        else this.bookName = bookName;
    }

    public int getPageQuantity() {
        return pageQuantity;
    }

    public void setPageQuantity(int pageQuantity) {
        this.pageQuantity = pageQuantity;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public BookFormat getBookFormat() {
        return bookFormat;
    }

    public void setBookFormat(BookFormat bookFormat) {
        this.bookFormat = bookFormat;
    }
}
