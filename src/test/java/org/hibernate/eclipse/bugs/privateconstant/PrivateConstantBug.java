package org.hibernate.eclipse.bugs.privateconstant;

public class PrivateConstantBug {

	/**
	 * As far as I know, private members of inner classes should be accesible in the context
	 * of the outer class.
	 * This compiles fine with Javac, not with ECJ.
	 */
	@SuppressWarnings( InnerClass.CONSTANT )
	public static class InnerClass {
		private static final String CONSTANT = "someValue";
	}

}
