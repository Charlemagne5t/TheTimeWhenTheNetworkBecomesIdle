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
    @Test
    public void test3() {
        int[][] edges = {
                {3, 8},
                {4, 13},
                {0, 7},
                {0, 4},
                {1, 8},
                {14, 1},
                {7, 2},
                {13, 10},
                {9, 11},
                {12, 14},
                {0, 6},
                {2, 12},
                {11, 5},
                {6, 9},
                {10, 3}
        };
        int[] patience = {0,3,2,1,5,1,5,5,3,1,2,2,2,2,1};
        int expected = 20;
        int actual = new Solution().networkBecomesIdle(edges, patience);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test4() {
        int[][] edges = {
                {5, 7},
                {15, 18},
                {12, 6},
                {5, 1},
                {11, 17},
                {3, 9},
                {6, 11},
                {14, 7},
                {19, 13},
                {13, 3},
                {4, 12},
                {9, 15},
                {2, 10},
                {18, 4},
                {5, 14},
                {17, 5},
                {16, 2},
                {7, 1},
                {0, 16},
                {10, 19},
                {1, 8}
        };
        int[] patience = {0,2,1,1,1,2,2,2,2,1,1,1,2,1,1,1,1,2,1,1};
        int expected = 67;
        int actual = new Solution().networkBecomesIdle(edges, patience);

        Assert.assertEquals(expected, actual);
    }
}
