package plg.proto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Attr {
    
    private int etq;
    
    private int etqh;
    
    private final List<Integer> lirv;
    
    private final List<Integer> lirvh;
    
    private final List<Integer> lirf;
    
    private final List<Integer> lirfh;
    
    private final List<String> cod;
    
    private Attr () {
        lirv = new ArrayList<Integer>();
        lirvh = new ArrayList<Integer>();
        lirf = new ArrayList<Integer>();
        lirfh = new ArrayList<Integer>();
        cod = new ArrayList<String>();
    }
    
    public static Attr create () {
        return new Attr();
    }
    
    public static Attr copy (final Attr attr) {
        return Attr.create().etq(attr.etq()).etqh(attr.etqh()).lirv(attr.lirv()).lirvh(attr.lirvh()).lirf(attr.lirf())
            .lirfh(attr.lirfh());
    }
    
    public int etq () {
        return etq;
    }
    
    public int etqh () {
        return etqh;
    }
    
    public List<Integer> lirv () {
        return Collections.unmodifiableList(lirv);
    }
    
    public List<Integer> lirvh () {
        return Collections.unmodifiableList(lirvh);
    }
    
    public List<Integer> lirf () {
        return Collections.unmodifiableList(lirf);
    }
    
    public List<Integer> lirfh () {
        return Collections.unmodifiableList(lirfh);
    }
    
    public List<String> cod () {
        return Collections.unmodifiableList(cod);
    }
    
    public Attr etq (final int etq) {
        this.etq = etq;
        return this;
    }
    
    public Attr etqh (final int etqh) {
        this.etqh = etqh;
        return this;
    }
    
    public Attr lirv (final List<Integer> lirv) {
        return lirvClear().lirvAdd(lirv);
    }
    
    public Attr lirvClear () {
        this.lirv.clear();
        return this;
    }
    
    public Attr lirvAdd (final List<Integer> lirv) {
        this.lirv.addAll(lirv);
        return this;
    }
    
    public Attr lirvh (final List<Integer> lirvh) {
        this.lirvh.clear();
        this.lirvh.addAll(lirvh);
        return this;
    }
    
    public Attr lirf (final List<Integer> lirf) {
        this.lirf.clear();
        this.lirf.addAll(lirf);
        return this;
    }
    
    public Attr lirfh (final List<Integer> lirfh) {
        this.lirfh.clear();
        this.lirfh.addAll(lirfh);
        return this;
    }
    
    public Attr cod (final List<String> cod) {
        this.cod.clear();
        this.cod.addAll(cod);
        return this;
    }
}
