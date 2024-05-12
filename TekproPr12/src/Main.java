public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe");
        Movie movie1 = new Movie("Inception", Movie.REGULAR);
        Movie movie2 = new Movie("Toy Story", Movie.CHILDREN);
        Movie movie3 = new Movie("Avengers: Endgame", Movie.NEW_RELEASE);

        Rental rental1 = new Rental(movie1, 3);
        Rental rental2 = new Rental(movie2, 2);
        Rental rental3 = new Rental(movie3, 5);

        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        System.out.println(customer.statement());
    }
}
