package com.company;

import java.util.HashMap;
import java.util.Map;

public class CharFinder {
    public char findFirstNonRepeatingChar(String str){
        Map<Character, Integer>map=new HashMap<>();
        var chars=str.toCharArray();
        for (var ch : chars){
            /* // in each iteration we've to see if we've this char in our Hash Table
            if (map.containsKey(ch)){
                // we've to read that value
                var count=map.get(ch);
                // then we update it
                map.put(ch,count);
            } else // if we don't have this character
              map.put(ch, 1); */

            // or we can consolidate this iteration using ternary operator :
            var count=map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count+1);
        }

        for (var ch : chars)
            if (map.get(ch)==1)
                return ch;

        return Character.MIN_VALUE;
    }
}
