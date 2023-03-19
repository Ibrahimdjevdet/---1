package bg.tu_varna.sit;

public class Seat {
    private int rowNumber;
    private int seatNumber;

    public Seat(int rowNumber, int seatNumber ){
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;

    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}
