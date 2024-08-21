import org.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AnotherLionTest {
    String sex;

    @Parameterized.Parameters
    public static Object [][] SexLion() {
        return new Object[][] {
                {"something"},
                {null},
                {"indifined"},

        };
    }
    public AnotherLionTest(String sex) {
        this.sex = sex;
    }

    @Test(expected = Exception.class)
    public void doesHaveMane() throws Exception {
        new Lion(sex, null);
    }
}