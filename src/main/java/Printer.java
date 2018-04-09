public class Printer {
    public int paperLeft;
    public int tonerVolume;

    public Printer(int paperLeft, int tonerVolume){
        this.paperLeft = paperLeft;
        this.tonerVolume  = tonerVolume;
    }

    public void print(int pages, int copies){
        int total = pages * copies;

        if(total < this.paperLeft) {
            this.paperLeft -= total;
            this.tonerVolume -= total;
            System.out.println(total + " pages printed. " + this.paperLeft + " paper left.");
        }
        else {
            System.out.println("Not enough paper!");
        }
    }

    public void refillPaper(int amount){
        this.paperLeft += amount;
    }



}
