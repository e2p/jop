/*
 * Created on 30.07.2005
 *
 */
package jvm.obj;

import jvm.TestCase;

/**
 * @author Martin Schoeberl (martin@jopdesign.com)
 *
 */
public class Iface extends TestCase {
	
	public String getName() {
		return "Interface";
	}
	
	static interface A {
		int x = 10;		// is implicit final
		int funca();
	}
	
	static interface B {
		
		int x = 20;		// is implicit final
		int funcb();
	}
	static interface C extends  A, B {
		
		int funcc();
	}
	
	static class D implements C {

		public int funcc() {
			return 3;
		}

		public int funca() {
			return 1;
		}

		public int funcb() {
			return 2;
		}
		
	}
	
	static class X implements A {

		public int funca() {
			return 11;
		}
	}
	
	static class Y implements B {

		public int funcb() {
			return 22;
		}
	}
	
	static class Z implements A, B {

		public int funca() {
			return 31;
		}

		public int funcb() {
			// TODO Auto-generated method stub
			return 32;
		}

		
	}
	public boolean test() {
		
		boolean ok = true;
		
		D d = new D();
		X x = new X();
		Y y = new Y();
		Z z = new Z();
		
		A a = d;
		B b = d;
		C c = d;
	
		ok = ok && (d.funca()==1);
		ok = ok && (d.funcb()==2);
		ok = ok && (d.funcc()==3);
		ok = ok && (c.funca()==1);
		ok = ok && (c.funcb()==2);
		ok = ok && (c.funcc()==3);
		ok = ok && (a.funca()==1);
		ok = ok && (b.funcb()==2);
		ok = ok && (x.funca()==11);
		ok = ok && (y.funcb()==22);
		ok = ok && (z.funca()==31);
		ok = ok && (z.funcb()==32);
		a = x;
		b = y;
		ok = ok && (a.funca()==11);
		ok = ok && (b.funcb()==22);
		a = z;
		b = z;
		ok = ok && (a.funca()==31);
		ok = ok && (b.funcb()==32);
		
		
		return ok;
	}

}