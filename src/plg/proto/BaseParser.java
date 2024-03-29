package plg.proto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class BaseParser {
    
    public static final List<String> patch (List<String> cod, List<Integer> lir, int etq) {
        System.out.printf("%npatch(%s, %s, %d) %n", cod, lir, etq);
        List<String> newCod = new ArrayList<String>(cod);
        
        // NOTA: Después de intentar realizar el parcheo mediante la lista lir de 3 y 4
        // maneras diferentes, he llegado a la conclusión de que realizar un parcheo a lo
        // bruto da mejor resultado. Corrijo: Da ALGÚN resultado.
        for (int i = 0; i < cod.size(); i++) {
            String patched = patch(cod.get(i), etq);
            newCod.set(i, patched);
            System.out.printf("> patch(%d, %s, %d) ==> %s%n", i, cod.get(i), etq, newCod.get(i));
        }

        System.out.printf("%s%n", newCod);
        return Collections.unmodifiableList(newCod);
    }
    
    private static String patch (String instr, int etq) {
        return instr.replaceAll("\\?", String.valueOf(etq));
    }
    
    protected static final <T> List<T> concat (List<? extends T>... lists) {
        
        List<T> res = new ArrayList<T>();
        for (List<? extends T> list : lists) {
            res.addAll(list);
        }

        System.out.printf("%nconcat(%s) ==> %s%n", Arrays.toString(lists), res);
        return Collections.unmodifiableList(res);
    }
    
    protected static final String instr (String name, Object... args) {
        StringBuilder sb = new StringBuilder(name).append('(');
      
        boolean first = true;
        for (Object arg : args) {
            if (!first) {
                sb.append(", ");
                first = false;
            }
            sb.append(arg.toString());
        }
        return sb.append(')').toString();
    }
    
}
