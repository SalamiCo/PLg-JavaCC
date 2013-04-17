package plg.proto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class BaseParser {
    
    public static final List<String> patch (List<String> cod, List<Integer> lir, int etq) {
        List<String> newCod = new ArrayList<String>(cod.size());
        
        for (String inst : cod ) {
            String newInst = inst;
            
            
            
            newCod.add(newInst);
        }
        
        return Collections.unmodifiableList(newCod);
    }
    
    protected static final <T> List<T> concat ( List<T>... lists) {
        List<T> res = new ArrayList<T>();
        for ( List<T> list : lists ) {
            res.addAll(list);
        }
        return Collections.unmodifiableList(res);
    }
    
}
