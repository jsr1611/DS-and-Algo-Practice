import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Day009 {
    /*
    @description 1108. Defanging an IP address
    @author jsr1611
    @reference https://leetcode.com/problems/defanging-an-ip-address/
     */
    public String defangIPaddr(String address){
        int len = address.length();
        StringBuilder defAddr = new StringBuilder();
        for(int i=0; i < len; i++){
            if(address.charAt(i) == '.'){
                defAddr.append("[").append(".").append("]");
            }else {
                defAddr.append(address.charAt(i));
            }
        }
        return defAddr.toString();
    }

    public String CHARS =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    public Map<String, String> store = new HashMap<>();

    /*
    @description 535. Encode and Decode TinyURL
    @author jsr1611
    @reference https://leetcode.com/problems/encode-and-decode-tinyurl/
    // Encodes a URL to a shortened URL.
     */
    public String encode(String longUrl){
        StringBuilder link = new StringBuilder();
        Random rnd = new Random();
        String tinyUrl;
        while (link.length() < 7){
            int index = (int) (rnd.nextFloat() * CHARS.length());
            link.append(CHARS.charAt(index));
        }
        tinyUrl = rnd.toString();
        store.put(tinyUrl, longUrl);
        return tinyUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl){
        return store.get(shortUrl);
    }
}
