package plg.proto;

import java.io.FileInputStream;


public class Main {
  public static void main(String[] args) throws Exception {   
      Parser p = new Parser(new FileInputStream("input.txt"));
      p.s();
  }
}
