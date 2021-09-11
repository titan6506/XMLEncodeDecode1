package source;

import java.util.ArrayList;
import java.util.List;

public class DVD {
    private List<Movie> movie = new ArrayList<Movie>();

    public DVD(){

    }
    public void add(Movie movies){
        movie.add(movies);
    }

    public List<Movie> getMovie() {
        return movie;
    }

    public void setMovie(List<Movie> movie) {
        this.movie = movie;
    }

    public String toString(){
        String titulos = "";
        for(Movie movie : getMovie()){
            titulos += movie.getName()+ ",";
        }
        return titulos;
    }
}
