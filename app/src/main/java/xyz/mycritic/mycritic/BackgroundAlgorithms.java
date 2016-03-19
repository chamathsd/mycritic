package xyz.mycritic.mycritic;

/**
 * Created by alexrosenfeld10 on 3/19/16.
 */

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.sql.*;
import java.util.Scanner;


public class BackgroundAlgorithms {



    public LinkedList<Integer> otherLikes(String email, int movie_id, boolean preference){

        Scanner s = new Scanner(System.in);

        LinkedList<Integer> likes = new LinkedList<Integer>();

        int count = 0;
        while(hasNewUser()) { // Loop through table, add all who also like into similars
            if (user.preference == true) {
                likes.addLast(movie_id);
                count++;
            }
        }
        return likes;
    }

    public LinkedList<Integer> otherDislikes(String email, int movie_id, boolean preference){

        Scanner s = new Scanner(System.in);

        LinkedList<Integer> dislikes = new LinkedList<Integer>();

        int count = 0;
        while(hasNewUser()) { // Loop through table, add all who also like into similars
            if (user.preference == false) {
                dislikes.addLast(movie_id);
                count++;
            }
        }
        return dislikes;
    }

    Scanner s = new Scanner(System.in);
    
}
