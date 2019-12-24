
import java.util.HashMap;
import java.util.Map;

public class renkTasi {
       
    private static Map<String, renk> colorMap = new HashMap<String, renk>();  
       
    static 
    { 
        colorMap.put("mavi", new maviRenk()); 
        colorMap.put("siyah", new siyahRenk()); 
    } 
       
    public static renk renkGoster(String renkAdi) 
    { 
        return (renk) colorMap.get(renkAdi).clone(); 
    } 
}
