package HackerEarth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Problem
Bob has a playlist of
songs, each song has a singer associated with it (denoted by an integer)

Favourite singer of Bob is the one whose songs are the most on the playlist

Count the number of Favourite Singers of Bob

Input Format

The first line contains an integer
, denoting the number of songs in Bob's playlist.

The following input contains
integers,
integer denoting the singer of the
song.

        Output Format

Output a single integer, the number of favourite singers of Bob

Note: Use 64 bit data type*/
public class FavouriteSinger {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        HashMap<Long, Long> mp = new HashMap<>();
        long mxCnt = 0L;
        for (int i = 0; i < N; i++) {
            Long A = sc.nextLong();
            if (mp.containsKey(A)) {
                mp.put(A, mp.get(A) + 1);
            } else {
                mp.put(A, 1L);
            }
            mxCnt = Math.max(mxCnt, mp.get(A));
        }
        Integer res = 0;
        for (Map.Entry<Long, Long> ent : mp.entrySet()) {
            if (ent.getValue().equals(mxCnt)) {
                res++;
            }
        }
        System.out.println(res);

    }
}