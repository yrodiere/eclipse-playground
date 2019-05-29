package org.hibernate.eclipse.bugs.selfgenerics;

public abstract class AbstractDslStep1<E>
		implements DslStep1<DslStep2<?, E>, E> {

}
