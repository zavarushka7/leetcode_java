import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public boolean isAnagram1(String s, String t) {
        if (s.length() == t.length()){
            Map<Character, Integer> charCount = new HashMap<>();
            for (char c : s.toCharArray()){
                // getOrDefault(c, 0) возвращает текущее количество символа c или 0, если его еще нет в HashMap
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
            for (char c: t.toCharArray()){
                charCount.put(c, charCount.getOrDefault(c, 0) - 1);
                if (charCount.get(c) < 0){
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public boolean isAnagram2(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort, tSort);
    }

    public boolean isAnagram3(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : s.toCharArray()){
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()){
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        return sMap.equals(tMap);
    }

    public boolean isAnagram4(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            // charAt возвращает значение char по указанному индексу
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return countS.equals(countT);
    }

    public boolean isAnagram5(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int val: count){
            if (val != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.isAnagram5("abc", "cab"));
    }
}

