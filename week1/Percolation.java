import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    private Boolean[][] map; // QUESTION: Boolean[][] or Integer[][]?
    private Integer size;
    private WeightedQuickUnionUF uf;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        }
        // Initialize all sites
        size = n;
        map = new Boolean[size][size];
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                map[r][c] = false;
            }
        }
        // Initialize the UF
        uf = new WeightedQuickUnionUF(size*size+2); // map(r,c) <=> uf[row*size + col + 1]
        for (int c = 0; c < size; c++) {
            // Union the first and last layer to the virtual site
            uf.union(0, c+1);
            uf.union(size*size+1, (size-1)*size+c+1);
        }
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) { 
        if (row <= 0 || row > size || col <= 0 || col > size) {
            throw new IllegalArgumentException("row and col must be between 1 and " + size);
        }
        map[row-1][col-1] = true;
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        if (row <= 0 || row > size || col <= 0 || col > size) {
            throw new IllegalArgumentException("row and col must be between 1 and " + size);
        }
        return map[row-1][col-1];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        if (row <= 0 || row > size || col <= 0 || col > size) {
            throw new IllegalArgumentException("row and col must be between 1 and " + size);
        }
        // The site is full as long as it's in the same group with uf[0]
        return (uf.find(row*size + col +1) == uf.find(0));
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        Integer opens = 0;
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (map[r][c]) {
                    opens ++;
                }
            }
        }
        return opens;
    }

    // does the system percolate?
    public boolean percolates() {
        return (uf.find(0) == uf.find(size*size+1));
    }

    // test client (optional)
    public static void main(String[] args) {}

}