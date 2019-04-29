package com.kgisl.unittest;
// import java.util.Arrays;

class Arrays {
    public static void main(String[] args) {
        String[][] deepArray = new String[][] {{"John", "Mary"}, {"Alice", "Bob"}};

        // System.out.println(Arrays.deepToString(deepArray));

        for (int i = 0; i < deepArray.length; i++) {
            for(int j = 0; j < deepArray[i].length;j++) {
               System.out.println(deepArray[i][j]);
            }
    }
}
}
    

