package org.hibernate.eclipse.bugs.selfgenerics;

/**
 * @param <S> Self type.
 */
public interface DslStep2<S extends DslStep2<? extends S>> {

	S doSomething();

}
