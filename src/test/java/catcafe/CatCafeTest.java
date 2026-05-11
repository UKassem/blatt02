
package catcafe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatCafeTest {

    @Test
    void testAddCatIncreasesSize() {
        CatCafe cafe = new CatCafe();
        FelineOverLord cat = new FelineOverLord("Mimi", 4);

        cafe.addCat(cat);

        assertEquals(1, cafe.getCatCount());
    }

    @Test
    void givenCatInCafe_whenGetCatByName_thenReturnCat() {
        CatCafe cafe = new CatCafe();
        FelineOverLord cat = new FelineOverLord("Mimi", 4);

        cafe.addCat(cat);

        assertEquals(cat, cafe.getCatByName("Mimi"));
    }

    @Test
    void givenEmptyCafe_whenGetCatByName_thenReturnNull() {
        CatCafe cafe = new CatCafe();

        assertNull(cafe.getCatByName("Mimi"));
    }

    @Test
    void givenCatInCafe_whenGetCatByWeightInRange_thenReturnCat() {
        CatCafe cafe = new CatCafe();
        FelineOverLord cat = new FelineOverLord("Mimi", 4);

        cafe.addCat(cat);

        assertEquals(cat, cafe.getCatByWeight(3, 5));
    }

    @Test
    void givenCatInCafe_whenGetCatByWeightOutOfRange_thenReturnNull() {
        CatCafe cafe = new CatCafe();
        FelineOverLord cat = new FelineOverLord("Mimi", 10);

        cafe.addCat(cat);

        assertNull(cafe.getCatByWeight(1, 5));
    }

    @Test
    void givenCatInCafe_whenGetCatByNameNull_thenReturnNull() {
        CatCafe cafe = new CatCafe();
        FelineOverLord cat = new FelineOverLord("Mimi", 4);

        cafe.addCat(cat);

        assertNull(cafe.getCatByName(null));
    }

    @Test
    void givenMultipleCats_whenGetCatByName_thenReturnCorrectCat() {
        CatCafe cafe = new CatCafe();
        FelineOverLord mimi = new FelineOverLord("Mimi", 4);
        FelineOverLord luna = new FelineOverLord("Luna", 6);

        cafe.addCat(mimi);
        cafe.addCat(luna);

        assertEquals(luna, cafe.getCatByName("Luna"));
    }

    @Test
    void givenMultipleCats_whenGetCatByWeight_thenReturnMatchingCat() {
        CatCafe cafe = new CatCafe();
        FelineOverLord a = new FelineOverLord("A", 5);
        FelineOverLord b = new FelineOverLord("B", 7);

        cafe.addCat(a);
        cafe.addCat(b);

        FelineOverLord result = cafe.getCatByWeight(4, 6);

        assertEquals(a, result);
    }

    @Test
    void givenCatAtBoundary_whenGetCatByWeight_thenReturnCat() {
        CatCafe cafe = new CatCafe();
        FelineOverLord cat = new FelineOverLord("Edge", 3);

        cafe.addCat(cat);

        assertEquals(cat, cafe.getCatByWeight(3, 10));
    }

    @Test
    void givenFullCafe_whenCheckingAllOperations_thenWorkCorrectly() {
        CatCafe cafe = new CatCafe();

        FelineOverLord c1 = new FelineOverLord("Mimi", 4);
        FelineOverLord c2 = new FelineOverLord("Luna", 6);

        cafe.addCat(c1);
        cafe.addCat(c2);

        assertEquals(2, cafe.getCatCount());
        assertEquals(c1, cafe.getCatByName("Mimi"));
        assertEquals(c2, cafe.getCatByName("Luna"));
        assertNull(cafe.getCatByName("Ghost"));
    }
}