/* Generated By:JavaCC: Do not edit this line. Parser.java */
package plg.proto;

import java.util.*;

class Parser extends BaseParser implements ParserConstants {

/* Reglas sintacticas */
  final public void s(Attr a) throws ParseException {
                Attr ia;
                 ia = Attr.create().etqh(1);
    i(ia);
    jj_consume_token(0);
                 a.cod(ia.cod());
  }

  final public void i(Attr a) throws ParseException {
                Attr ea, ia1, ia2;
                Token t;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IF:
      jj_consume_token(IF);
                        ea = Attr.copy(a);
      e(ea);
      jj_consume_token(THEN);
                        ia1 = Attr.create().etqh(ea.etq() + 1);
      i(ia1);
      jj_consume_token(ELSE);
                        ia2 = Attr.create().etqh(ia1.etq() + 1);
      i(ia2);
      jj_consume_token(FI);
                        a.etq(ia2.etq())
                                .cod(patch(ea.cod(), concat(ea.lirv(), ea.lirf()), ea.etq()))
                                        .codAdd(instr("ir_f",ia1.etq()+1))
                                        .codAdd(ia1.cod())
                                        .codAdd(instr("ir_a",ia2.etq()))
                                        .codAdd(ia2.cod());
      break;
    case WRITE:
      jj_consume_token(WRITE);
      t = jj_consume_token(STRING);
                        a.etq(a.etqh() + 2).codAdd(instr("apila_str",t.toString()), instr("escribe"));
      break;
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void e(Attr a) throws ParseException {
                Attr ta, rea;
                        ta = Attr.copy(a);
    t(ta);
                        rea = Attr.create().etqh(ta.etq()).lirvh(ta.lirv()).lirfh(ta.lirf()).codh(ta.cod());
    re(rea);
                        a.cod(rea.cod()).etq(rea.etq()).lirv(rea.lirv()).lirf(rea.lirf());
  }

  final public void re(Attr a) throws ParseException {
                Attr ta, rea;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case OR:
      jj_consume_token(OR);
                        ta = Attr.create().etqh(a.etqh() + 3);
      t(ta);
                        rea = Attr.create()
                                .etqh(ta.etq())
                                .lirvh(a.lirvh())
                                        .lirvhAdd(ta.lirv())
                                        .lirvhAdd(a.etqh() + 1)
                                .lirfh(ta.lirf())
                                .codh(patch(a.codh(), a.lirfh(), a.etqh() + 2))
                                        .codhAdd(instr("copia"), instr("ir_v", "?"), instr("desapila"))
                                        .codhAdd(ta.cod());
      re(rea);
                        a.cod(rea.cod()).etq(rea.etq()).lirv(rea.lirv()).lirf(rea.lirf());
      break;
    default:
      jj_la1[1] = jj_gen;
                        a.cod(a.codh()).etq(a.etqh()).lirv(a.lirvh()).lirf(a.lirfh());
    }
  }

  final public void t(Attr a) throws ParseException {
                Attr fa, rta;
                        fa = Attr.create().etqh(a.etqh());
    f(fa);
                        rta = Attr.create().codh(fa.cod()).etqh(fa.etq()).lirvh(fa.lirv()).lirfh(fa.lirf());
    rt(rta);
                        a.cod(rta.cod()).etq(rta.etq()).lirv(rta.lirv()).lirf(rta.lirf());
  }

  final public void rt(Attr a) throws ParseException {
                Attr fa, rta;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case AND:
      jj_consume_token(AND);
                        fa = Attr.create().etqh(a.etqh() + 3);
      f(fa);
                        rta = Attr.create()
                                .etqh(fa.etq())
                                .lirvh(fa.lirv())
                                .lirfh(a.lirfh())
                                        .lirfhAdd(fa.lirf())
                                        .lirfhAdd(a.etqh() + 1)
                                .codh(patch(a.codh(), a.lirvh(), a.etqh() + 2))
                                        .codhAdd(instr("copia"), instr("ir_f", "?"), instr("desapila"))
                                        .codhAdd(fa.cod());
      rt(rta);
                        a.cod(rta.cod()).etq(rta.etq()).lirv(rta.lirv()).lirf(rta.lirf());
      break;
    default:
      jj_la1[2] = jj_gen;
                        a.cod(a.codh()).etq(a.etqh()).lirv(a.lirvh()).lirf(a.lirfh());
    }
  }

  final public void f(Attr a) throws ParseException {
                Attr ea;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case TRUE:
      jj_consume_token(TRUE);
                 a.codAdd(instr("apila_true")).etq(a.etqh() + 1).lirvClear().lirfClear();
      break;
    case FALSE:
      jj_consume_token(FALSE);
                 a.codAdd(instr("apila_false")).etq(a.etqh() + 1).lirvClear().lirfClear();
      break;
    case PAP:
      jj_consume_token(PAP);
                 ea = Attr.create().etqh(a.etqh());
      e(ea);
      jj_consume_token(PCIERRE);
                 a.cod(ea.cod()).etq(ea.etq()).lirv(ea.lirv()).lirf(ea.lirf());
      break;
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  /** Generated Token Manager. */
  public ParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[4];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x410,0x4,0x8,0xb00,};
   }

  /** Constructor with InputStream. */
  public Parser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Parser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Parser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Parser(ParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[14];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 4; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 14; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
