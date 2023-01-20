import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class checkForOutlierTest {

    @Test
    void checkOutlier() {
        checkForOutlier outlier = new checkForOutlier();
        int[] arr = {5, 7, 9, 13, 8};
        outlier.checkOutlier(arr);
        assertEquals(8, outlier.getResult());
    }
}