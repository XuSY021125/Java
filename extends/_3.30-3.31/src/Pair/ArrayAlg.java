package Pair;

public class ArrayAlg {
    public static class Pair {
        private double first;
        private double second;

        public Pair(double first, double second) {
            this.first = first;
            this.second = second;
        }

        public double getFirst() {
            return first;
        }

        public void setFirst(double first) {
            this.first = first;
        }

        public double getSecond() {
            return second;
        }

        public void setSecond(double second) {
            this.second = second;
        }

        public String toString() {
            return "Pair{" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }
    }

    public static Pair minmax(double[] d){
        double min = d[0];
        double max = d[0];

        for (double element : d) {
            if (min < element){
                min = element;
            }
            if (max > element){
                max = element;
            }
        }
        return new Pair(min,max);
    }
}
