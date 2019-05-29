package org.hibernate.eclipse.bugs.selfgenerics;

public class CallBug {

	public void doesNotCompileWithEcj(DslStep1 step1) {
		// Note we need three chained calls for the problem to show up. Two is not enough.
		step1.nextStep().doSomething().doSomething().doSomething();
	}

}
