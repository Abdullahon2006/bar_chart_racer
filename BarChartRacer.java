import java.util.Arrays;

public class BarChartRacer { 
    public static void main(String[] args) {
        String fileName = args[0];
        int top = Integer.parseInt(args[1]);
        In myReader = new In(fileName);
        String title = myReader.readLine().strip();
        String xLabel = myReader.readLine().strip();
        String source = myReader.readLine().strip();
        
        BarChart bc = new BarChart(title, xLabel, source);

        myReader.readLine();
        StdDraw.setCanvasSize(1000, 700);
        StdDraw.enableDoubleBuffering();
        while (myReader.hasNextLine()) {
            int number =  Integer.parseInt(myReader.readLine().strip());
            String date = "";
            Bar[] bars = new Bar[number];
            for (int i = 0; i < number; i++) {
                String line = myReader.readLine().strip();
                String[] line1 = line.split(",");
                date = line1[0].strip();
                String name = line1[1].strip();
                int value = Integer.parseInt(line1[3].strip());
                String category = line1[4].strip();
                bars[i] = new Bar(name, value, category);
            }
            Arrays.sort(bars);
            for (int i = number - 1; i >= number - top; i--) {
                String name = bars[i].getName();
                int value = bars[i].getValue();
                String category = bars[i].getCategory();
                bc.add(name, value, category);
                if (i - 1 < 0) {
                    break;
                }
            }
            bc.setCaption(date);
            myReader.readLine();
            bc.draw();
            StdDraw.show();
            StdDraw.pause(120);
            bc.reset();
            StdDraw.clear();
        }
        myReader.close();
    }
}