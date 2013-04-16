package plg.proto;

public final class Attr {

	private int etq;
	private int etqh;
	private int lirv;
	private int lirvh;
	private int lirf;
	private int lirfh;

	private Attr(){}
	
	public static Attr create() {
		return new Attr();
	}

	public static Attr copy(Attr attr) {
		return Attr.create().etq(attr.etq()).etqh(attr.etqh()).lirv(attr.lirv()).lirvh(attr.lirvh()).lirf(attr.lirf())
			.lirfh(attr.lirfh());
	}

	public int etq() {
		return etq;
	}

	public int etqh() {
		return etqh;
	}

	public int lirv() {
		return lirv;
	}

	public int lirvh() {
		return lirvh;
	}

	public int lirf() {
		return lirf;
	}

	public int lirfh() {
		return lirfh;
	}

	public Attr etq(int etq) {
		this.etq = etq;
		return this;
	}

	public Attr etqh(int etqh) {
		this.etqh = etqh;
		return this;
	}

	public Attr lirv(int lirv) {
		this.lirv = lirv;
		return this;
	}

	public Attr lirvh(int lirvh) {
		this.lirvh = lirvh;
		return this;
	}

	public Attr lirf(int lirf) {
		this.lirf = lirf;
		return this;
	}

	public Attr lirfh(int lirfh) {
		this.lirfh = lirfh;
		return this;
	}
}
