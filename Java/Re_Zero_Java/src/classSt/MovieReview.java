package classSt;

public class MovieReview {
    String title;
    String review;

    public static void main(String[] args) {
        MovieReview movie1 = new MovieReview();
        MovieReview movie2 = new MovieReview();
        movie1.title = "인셉션";
        movie1.review = "so so";

        movie2.title = "물고기나이프";
        movie2.review = "better";

        System.out.println("영화제목 : " + movie1.title + " 리뷰 : " + movie1.review);
        System.out.println("영화제목 : " + movie2.title + " 리뷰 : " + movie2.review);
    }
}
