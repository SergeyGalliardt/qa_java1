import org.example.Cat;
import org.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;
    Cat cat;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }

    @Test
    public void catMakesMeow() {
        assertEquals("Кошки говорят совсем по-другому","Мяу", cat.getSound());
    }

    @Test
    public void catEatMeat() throws Exception {
        List<String> catEat = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(catEat);
        assertEquals("Кошки едят что-то другое",catEat, cat.getFood());
    }
}
