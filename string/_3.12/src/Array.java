public class Array {
    public static void main(String[] args) {
        int[] arrays = new int[]{5,2,1,3,4};

        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + "  ");
        }
        System.out.println();

        for (int element : arrays ){
            System.out.print(element + "  ");
        }
        System.out.println();

        int i = 0;
        while (i < arrays.length){
            System.out.print(arrays[i] + "  ");
            i++;
        }
        System.out.println();

        int j = 0;
        do {
            System.out.print(arrays[j] + "  ");
            j++;
        }while (j < arrays.length);
        System.out.println();
    }
}
