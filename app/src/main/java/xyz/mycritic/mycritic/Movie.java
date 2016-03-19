package xyz.mycritic.mycritic;

/**
 * Created by alexrosenfeld10 on 3/19/16.
 */
public class Movie {
    int id;
    String name;

    Movie(int i, String n){
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Movie name, id: " + name + " " + id;
    }
}