package com.biosimilarity.lift.lib.kvdbJSON.Absyn; // Java Package generated by the BNF Converter.

public abstract class NetLocation implements java.io.Serializable {
  public abstract <R,A> R accept(NetLocation.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.lift.lib.kvdbJSON.Absyn.DNSAddr p, A arg);

  }

}