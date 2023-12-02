package JAY.RETRY;

import java.util.*;

public class RE_영어끝말잇기 {
    public static int n = 3;
    public static String[] words ={"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

    public static void main(String[] args) {
        int[] answer = new int[2];
        ArrayList<String> list = new ArrayList<>();

        list.add(words[0]);

        for(int i=1;i<words.length;i++){
            char last = words[i-1].charAt(words[i-1].length()-1);
            char now = words[i].charAt(0);

            if(list.contains(words[i])||last!=now){
                answer[0]=i%n+1;
                answer[1]=i/n+1;
                break;
            }

            list.add(words[i]);
        }

        System.out.println(Arrays.toString(answer));
    }
}
