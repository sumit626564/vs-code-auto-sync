package JavaCore.Array.HashSetDublicate;

import java.util.*;

public class DublicateStringArrayRemove {
    public static void main(String[] args) {
        String[] words = {"apple","banana","apple","orange","banana","grapes"};

        // Step: 1 Convert array to List
        List<String> array_list =  Arrays.asList(words);
        System.out.println(array_list);

        // Step 2:- Convert to HashSet (Remove duplicates)
        HashSet<String> uniqueWords = new HashSet<>(array_list);
        System.out.println(uniqueWords);

        // Step 3:- Convert back to array if you want
        String[] uniqueArray = uniqueWords.toArray(new String[0]);

        System.out.println(uniqueWords);
    }
}

/* If you want to Preserve Order -- Using {LinkedHashSet} 
 *  Syntax:-
 *          LinkedHashSet<String> unique = new LinkedHashSet<>(Arrays.asList(words));
*/