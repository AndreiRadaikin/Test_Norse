public class second {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 7, 8};
        int[] arr2 = {1, 3, 4, 8, 9};
        int i = 0;
        int i1 = 0;
        int i2 = 0;
        int length1 = arr1.length;
        int length2 = arr2.length;
        int length = length1 + length2;
        int[] result = new int[length];

        while(i < length)
            if (i1 == length1) result[i++] = arr2[i2++];
            else if (i2 == length2) result[i++] = arr1[i1++];
            else {
                 if (arr1[i1] >= arr2[i2]) result[i++] = arr2[i2++];
                 else if (arr1[i1] < arr2[i2]) result[i++] = arr1[i1++];
            }

        for(int j = 0; j < length; j++)   System.out.println(result[j]);
    }
}