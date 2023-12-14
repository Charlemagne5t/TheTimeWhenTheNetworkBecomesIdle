import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int[][] edges = {
                {0, 1},
                {1, 2}
        };
        int[] patience = {0, 2, 1};
        int expected = 8;
        int actual = new Solution().networkBecomesIdle(edges, patience);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[][] edges = {
                {0, 1},
                {0, 2},
                {1, 2}
        };
        int[] patience = {0, 10, 10};
        int expected = 3;
        int actual = new Solution().networkBecomesIdle(edges, patience);

        Assert.assertEquals(expected, actual);
    }
}
