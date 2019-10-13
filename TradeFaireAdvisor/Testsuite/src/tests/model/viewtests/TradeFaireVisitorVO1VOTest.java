package tests.model.viewtests;

import oracle.jbo.ViewObject;

import org.junit.After;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

import tests.model.mainfixture.AppModuleAMFixture;

public class TradeFaireVisitorVO1VOTest {
    private AppModuleAMFixture fixture1 = AppModuleAMFixture.getInstance();

    public TradeFaireVisitorVO1VOTest() {
    }

    @Test
    public void testAccessToTradeFaireVisitorVO() {
        ViewObject view = fixture1.getApplicationModule().findViewObject("TradeFaireVisitorVO1");
        assertNotNull(view);
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}
