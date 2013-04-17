package plg.proto;

import java.io.FileInputStream;
import java.util.List;

public class Main {
    public static void main (String[] args) throws Exception {
        Parser p = new Parser(new FileInputStream("input.txt"));
        
        Attr a = Attr.create();
        p.s(a);
        
        List<String> instrs = a.cod();
        for (int i = 0; i < instrs.size(); i++) {
            System.out.printf("%3d: %s%n", i+1, instrs.get(i));
        }
    }
}
