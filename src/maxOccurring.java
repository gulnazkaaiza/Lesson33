import java.util.LinkedHashMap;
import java.util.Map;

public class maxOccurring {
    public static void maxOccur(String ip){

        LinkedHashMap<Character, Integer> map = new LinkedHashMap();
        for(int i = 0; i<ip.length();i++)
        {
            char ch = ip.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch, (map.get(ch)+1));

            }
            else
            {
                map.put(ch, 1);
            }
        }

        Map.Entry<Character, Integer> maxEntry = null;
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(maxEntry == null)
            {
                maxEntry = entry;
            }

            else if(maxEntry.getValue() < entry.getValue())
            {
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry.getKey());


    }
}
