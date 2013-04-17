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
    
    public static Attr copy ( Attr attr) {
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
    
    public Attr etq ( int etq) {
        this.etq = etq;
        return this;
    }
    
    public Attr etqh ( int etqh) {
        this.etqh = etqh;
        return this;
    }
    
    public Attr lirv ( List<Integer> lirv) {
        return lirvClear().lirvAdd(lirv);
    }
    
    public Attr lirvClear () {
        this.lirv.clear();
        return this;
    }
    
    public Attr lirvAdd ( List<Integer> lirv) {
        this.lirv.addAll(lirv);
        return this;
    }
    
    public Attr lirvAdd( Integer... lirv ) {
        Collections.addAll(this.lirv, lirv);
        return this;
    }
    
    public Attr lirvh ( List<Integer> lirvh) {
        return lirvhClear().lirvhAdd(lirvh);
    }
    
    public Attr lirvhClear () {
        this.lirvh.clear();
        return this;
    }
    
    public Attr lirvhAdd ( List<Integer> lirvh) {
        this.lirvh.addAll(lirvh);
        return this;
    }
    
    public Attr lirvhAdd( Integer... lirvh ) {
        Collections.addAll(this.lirvh, lirvh);
        return this;
    }
    
    public Attr lirf ( List<Integer> lirf) {
        return lirfClear().lirfAdd(lirf);
    }
    
    public Attr lirfClear () {
        this.lirf.clear();
        return this;
    }
    
    public Attr lirfAdd ( List<Integer> lirf) {
        this.lirf.addAll(lirf);
        return this;
    }
    
    public Attr lirfAdd( Integer... lirf ) {
        Collections.addAll(this.lirf, lirf);
        return this;
    }
    
    public Attr lirfh ( List<Integer> lirfh) {
        return lirfhClear().lirfhAdd(lirfh);
    }
    
    public Attr lirfhClear () {
        this.lirfh.clear();
        return this;
    }
    
    public Attr lirfhAdd ( List<Integer> lirfh) {
        this.lirfh.addAll(lirfh);
        return this;
    }
    
    public Attr lirfhAdd( Integer... lirfh ) {
        Collections.addAll(this.lirfh, lirfh);
        return this;
    }
    
    public Attr cod ( List<String> cod) {
        return codClear().codAdd(cod);
    }
    
    public Attr codClear () {
        this.cod.clear();
        return this;
    }
    
    public Attr codAdd ( List<String> cod) {
        this.cod.addAll(cod);
        return this;
    }
    
    public Attr codAdd( String... cod ) {
        Collections.addAll(this.cod, cod);
        return this;
    }
}
