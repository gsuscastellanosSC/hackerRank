public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public int computeDifference() {
        int aux = 0;
        for (int index = 0; index < this.elements.length; index++) {
            for (int i = index + 1; i < this.elements.length; i++) {
                aux = this.elements[index] - this.elements[i] > 0 ? this.elements[index] - this.elements[i] : (this.elements[i] - this.elements[index]);
                if (aux > this.maximumDifference) {
                    this.maximumDifference = aux;
                }
            }
        }
        return this.maximumDifference;
    }

}
