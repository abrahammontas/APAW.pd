package es.upm.miw.pd.singleton.factory.solution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class ReferencesFactoryTest {

    @Test
    public void testReferencesFactoryIsSingleton() {
        assertSame(ReferencesFactory.getFactory(), ReferencesFactory.getFactory());
    }

    @Test
    public void testReferencesFactorySingletonNotNull() {
        assertNotNull(ReferencesFactory.getFactory());
    }

    @Test
    public void testReferencesFactory() {
        assertEquals(0, ReferencesFactory.getFactory().getReference("cero"));
        assertEquals(1, ReferencesFactory.getFactory().getReference("uno"));
        ReferencesFactory.getFactory().removeReference("cero");
        assertEquals(2, ReferencesFactory.getFactory().getReference("cero"));
    }
}
