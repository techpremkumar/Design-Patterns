public class CSVProcessor extends DataProcessor {

    @Override
    protected void readFile() {
        System.out.println("Reading CSV file...");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing CSV data...");
    }
}