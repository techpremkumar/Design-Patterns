public abstract class DataProcessor {

    // Template method
    public final void process() {
        readFile();
        parseData();
        validateData();
        saveData();
    }

    protected abstract void readFile();

    protected abstract void parseData();

    protected void validateData() {
        System.out.println("Validating data...");
    }

    protected void saveData() {
        System.out.println("Saving data...");
    }
}