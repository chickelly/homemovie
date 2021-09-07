package homemovie;

public class MovieCancelled extends AbstractEvent {

   // private Long id;
    private Long appId;
    private String userId;
    private String movieName;
    private Long movieId;
    private String status;

    public MovieCancelled(){
        super();
    }

   // public Long getId() {
   //     return id;
   // }

   // public void setId(Long id) {
   //     this.id = id;
   // }

    public Long getAppId() {
        return appId;
    }
    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }
    
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

}
