package xyz.ieden.demo.entity;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2020/3/18 21:44
 */
public class BookEntity extends BaseEntity {

    private String name;
    private String bookName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
