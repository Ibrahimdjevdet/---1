package bg.tu_varna.sit;

public class Hall{
        private int hallNumber;
        private int numRows;
        private int numSeatsPerRow;
        private boolean[][] seats;

        public Hall(int hallNumber, int numRows, int numSeatsPerRow){
            this.hallNumber = hallNumber;
            this.numRows = numRows;
            this.numSeatsPerRow = numSeatsPerRow;
            this.seats = new boolean[numRows][numSeatsPerRow];
        }

    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumSeatsPerRow(int numSeatsPerRow) {
        this.numSeatsPerRow = numSeatsPerRow;
    }

    public int getNumSeatsPerRow() {
        return numSeatsPerRow;
    }
}