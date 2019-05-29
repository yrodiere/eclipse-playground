package org.hibernate.eclipse.bugs.selfgenerics;

/**
 * @param <S> Self type.
 * @param <E> Some other generic. The bug won't show up without this.
 */
public interface DslStep2<S extends DslStep2<? extends S, E>, E> {

	S doSomething();

}
