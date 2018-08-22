
import java.util.Arrays;

public class InsertionSort {
    
    public static void main(String[] args) {
        int xy[] = {5, 3, 64, 675, 40, 2, 500, 23, 54, 85, 304, 36, 23, 99, 64, 65, 390, 239};
        
        for (int i = 0; i < xy.length; i++) {
            for (int j = 0; j < xy.length - 1; j++) {
                if (xy[j + 1] < xy[j]) {
                    int aux = xy[j];
                    xy[j] = xy[j + 1];
                    xy[j + 1] = aux;
                }
            }
        }
        
        System.out.println(Arrays.toString(xy));
        
    }
}
