public class Shopping {
    private int numPencils;
    private int numLinedPaper;
    private int numPens;
    private int numNotebooks;

    private double totalPencilPrice;
    private double totalPaperPrice;
    private double totalPenPrice;
    private double totalNotebookPrice;
    //prices
    private final double pencilPrice = 0.19;
    private final double paperPrice = 1.25;
    private final double penPrice = 0.39;
    private final double notebookPrice = 2.13;
    private final double tax = 0.085;

    double subTotal;


    //overflow
    public Shopping(int pencils, int paper, int pens, int notebooks) {
        numPencils = pencils;
        numLinedPaper = paper;
        numPens = pens;
        numNotebooks = notebooks;

        totalPencilPrice = (double) (pencils * pencilPrice);
        totalPaperPrice = (double) (paper * paperPrice);
        totalPenPrice = (double) (pens * penPrice);
        totalNotebookPrice = (double) (notebooks * notebookPrice);
    }

    public Shopping(int pencils, int paper, int pens) {
        numPencils = pencils;
        numLinedPaper = paper;
        numPens = pens;

        totalPencilPrice = (double) (pencils * pencilPrice);
        totalPaperPrice = (double) (paper * paperPrice);
        totalPenPrice = (double) (pens * penPrice);
    }

    public Shopping(int pencils, int paper) {
        numPencils = pencils;
        numLinedPaper = paper;

        totalPencilPrice = (double) (pencils * pencilPrice);
        totalPaperPrice = (double) (paper * paperPrice);
    }

    public Shopping(int pencils) {
        numPencils = pencils;

        totalPencilPrice = (double) (pencils * pencilPrice);
    }
    //getters
    public int getPencils() {
        return numPencils;
    }
    public int getLinedPaper() {
        return numLinedPaper;
    }
    public int getPens() {
        return numPens;
    }
    public int getNotebooks() {
        return numNotebooks;
    }
    //setters
    public void setPencils(int pencils) {
        numPencils = pencils;
        totalPencilPrice = (double) (pencils * pencilPrice);
    }
    public void setLinedPaper(int paper) {
        numLinedPaper = paper;
        totalPaperPrice = (double) (paper * paperPrice);
    }
    public void setPens(int pens) {
        numPens = pens;
        totalPenPrice = (double) (pens * penPrice);
    }
    public void setNoteBooks(int notebooks) {
        numNotebooks = notebooks;
        totalNotebookPrice = (double) (notebooks * notebookPrice);
    }


    public String toString() {
        subTotal = (totalPencilPrice + totalPaperPrice + totalPenPrice + totalNotebookPrice) * (tax + 1);
        return String.format("Your subtotal is: $%.2f", subTotal);
    }

}