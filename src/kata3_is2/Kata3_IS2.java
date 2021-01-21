package kata3_is2;

/**
 * @author Pablo
 */
public class Kata3_IS2 {
  
    public static void main(String[] args) {
        Histogram<String> histo = new Histogram<>();
        histo.increment("ulpgc.es");
        histo.increment("ulpgc.es");
        histo.increment("ulpgc.es");
        histo.increment("ull.es");
        /**/
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM", histo);
        histogramDisplay.execute();
    }
    
}
