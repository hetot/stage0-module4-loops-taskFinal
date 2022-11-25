package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int r = cathetusLength - 1;
        int l = r;
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < cathetusLength * 2 - 1; j++) {
                if (j > r)
                    break;
                if (j >= l) {
                    System.out.print(Math.abs(cathetusLength - 1 - j) + 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            r++;
            l--;
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
