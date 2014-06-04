package Chapter1;

/**
 * NxNの行列に書かれた、1つのピクセルが4バイト四方の画像を90度回転させる。
 */
public class Chapter1_6 {

    public static int[][] turnImage(int[][] matrix, int n) {
        for (int layer = 0; layer < n / 2; ++layer) {
            int last = n - 1 - layer;
            for (int i = layer; i < last; ++i) {
                int offset = i - layer;
                int top = matrix[layer][i];

                matrix[layer][i] = matrix[last - offset][layer];
                matrix[last - offset][layer] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        return matrix;
    }

}