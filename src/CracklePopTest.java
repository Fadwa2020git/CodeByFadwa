import org.hamcrest.CoreMatchers;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class CracklePopTest {

    @org.junit.jupiter.api.Test
    void cracklePopMethodTest3and5() {
        CracklePop cracklePop = new CracklePop();
        String print = cracklePop.cracklePopMethod(15);
        Assert.assertThat(print, CoreMatchers.is("CracklePop"));
    }

    @org.junit.jupiter.api.Test
    void cracklePopMethodTest3() {
        CracklePop cracklePop = new CracklePop();
        String print = cracklePop.cracklePopMethod(9);
        Assert.assertThat(print, CoreMatchers.is("Crackle"));
    }

    @org.junit.jupiter.api.Test
    void cracklePopMethodTest5() {
        CracklePop cracklePop = new CracklePop();
        String print = cracklePop.cracklePopMethod(50);
        Assert.assertThat(print, CoreMatchers.is("Pop"));
    }
}