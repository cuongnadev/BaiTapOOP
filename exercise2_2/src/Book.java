public class Book {
    private String name;
    Author authors[];
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuilder authorsString = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            authorsString.append("Author[name=");
            authorsString.append(authors[i].getName()).append(", email=" + authors[i].getEmail()).append(", gender=" + authors[i].getGender());
            authorsString.append("]");
            if (i < authors.length - 1) {
                authorsString.append(", ");
            }
        }

        return "Book[" +
                "name='" + name + '\'' +
                ", author=" + authorsString +
                ", price=" + price +
                ", qty=" + qty +
                ']';
    }
}

