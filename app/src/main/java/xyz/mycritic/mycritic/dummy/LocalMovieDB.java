package xyz.mycritic.mycritic.dummy;


import java.util.Hashtable;

/**
 * Created by Jake on 3/19/2016.
 */

public class PrefTuple<User, Pref> {
    public final User x;
    public final Pref y;
    public PrefTuple(User x, Pref y) {
        this.x = x;
        this.y = y;
    }
}

public class LocalMovieDB {

    Hashtable localMovieDB = new Hashtable();

    localMovieDB.put("one", 1);
}
