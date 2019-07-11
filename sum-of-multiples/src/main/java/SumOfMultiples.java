import java.util.HashSet;

class SumOfMultiples {
    private int number;
    private int[] set;
    SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;
    }

    int getSum() {
        HashSet<Integer> multiplesSet = new HashSet<Integer>();
        for (int i : set) {
            if (i == 0) {
                continue;
            }
            int multiple = i;
            while(multiple < number) {
                multiplesSet.add(multiple);
                multiple = multiple + i;
            }
        }
        int sum = 0;
        for(int i : multiplesSet) {
            sum = sum + i;
        }
        return sum;
    }


}
