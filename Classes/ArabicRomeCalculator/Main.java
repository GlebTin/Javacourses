public class Main {
        // Функция Merge
        public static void merge(int[] A, int p, int q, int r) {
            int n1 = q - p + 1;
            int n2 = r - q;

            // Создаем временные массивы
            int[] L = new int[n1];
            int[] R = new int[n2];

            // Копируем данные во временные массивы L[] и R[]
            for (int i = 0; i < n1; ++i) {
                L[i] = A[p + i];
            }
            for (int j = 0; j < n2; ++j) {
                R[j] = A[q + 1 + j];
            }

            // Слияние временных массивов в основной массив A
            int i = 0, j = 0, k = p;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    A[k] = L[i];
                    i++;
                } else {
                    A[k] = R[j];
                    j++;
                }
                k++;
            }

            // Копируем оставшиеся элементы L[], если они есть
            while (i < n1) {
                A[k] = L[i];
                i++;
                k++;
            }

            // Копируем оставшиеся элементы R[], если они есть
            while (j < n2) {
                A[k] = R[j];
                j++;
                k++;
            }
        }

    public static void main(String[] args) {
        int[] arr = {122, 1, 9, 33, 23, 71};
        int p = 0;
        int r = arr.length - 1;
        int q = (p + r) / 2;

        System.out.println("Исходный массив:");
        printArray(arr);

        // Вызываем функцию Merge
        merge(arr, p, q, r);

        System.out.println("\nОтсортированный массив:");
        printArray(arr);
    }

    // Вспомогательная функция для печати массива
        private static void printArray ( int[] arr){
            for (int value : arr) {
                System.out.print(value + " ");
            }
        }
}