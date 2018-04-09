public class Runner {
    public static void main(String[] args) {

        WaterBottle bottle = new WaterBottle(100);
        bottle.drink();
        bottle.drink();
        bottle.printVolume();
        bottle.empty();
        bottle.printVolume();
        bottle.fill();
        bottle.printVolume();

        Printer printer = new Printer(400, 800);
        printer.print(24,3);
        printer.print(57, 6);
        printer.refillPaper(400);
        printer.print(46, 3);

        Calculator.add(34,2);
        Calculator.subtract(8, 12);
    }
}
