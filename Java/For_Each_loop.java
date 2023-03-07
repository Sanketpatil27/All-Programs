class For_Each_loop {

    public static void main(String[] abcd) {

        int[] marks = {78,98,99,67,88,79};
        int total = 0;

        // for(int i = 0; i < marks.length; i++) {
        //     total = total + marks[i];
        // }
        
        for(int element: marks) {
            total = total + element;
        }

        float avg = total / marks.length ;
        System.out.println("Average of Physics marks = "+ avg);
    }
}