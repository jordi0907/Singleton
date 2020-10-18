import org.junit.Assert;
import org.junit.Test;

public class I18NManagerTest {

    @Test
    public void testKeys() throws Exception {
        Assert.assertEquals("hola", I18NManager.getInstance().getText("ca","l1"));
        Assert.assertEquals("adeu", I18NManager.getInstance().getText("ca","l2"));
        Assert.assertEquals("hello", I18NManager.getInstance().getText("en","l1"));
        Assert.assertEquals("adiós", I18NManager.getInstance().getText("es","l2"));

    }
}
