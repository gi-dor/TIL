package classSt;

public class MovieReview2 {
    String title;
    String review;

    public static void main(String[] args) {
        MovieReview2 movie1 = new MovieReview2();
        MovieReview2 movie2 = new MovieReview2();

        MovieReview2[] reviews = new MovieReview2[2];

        movie1.title = "인셉션";
        movie1.review = "so so";
        reviews[0] = movie1;

        movie2.title = "물고기나이프";
        movie2.review = "better";
        reviews[1] = movie2;

        for(MovieReview2 re : reviews) {
            System.out.println("영화제목 : " + re.title + ", 리뷰 : " + re.review);
        }

        System.out.println("===========================================================");
        System.out.println("영화제목 : " + reviews[0].title + ", 리뷰 : " + reviews[0].review);
        System.out.println("영화제목 : " + movie2.title + ", 리뷰 : " + movie2.review);
    }
}
