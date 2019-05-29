package org.hibernate.eclipse.bugs.selfgenerics;

/**
 * @param <N> Type of the next step.
 * @param <E> Some other generic. The bug won't show up without this.
 */
public interface DslStep1<N extends DslStep2<? extends N, E>, E> {

	N nextStep();

}
