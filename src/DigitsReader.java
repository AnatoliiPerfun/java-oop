public class DigitsReader extends FileReader{
    public DigitsReader(String filePath) {
        super(filePath);
    }

    @Override
    protected String parseLine(String line) {
        return line.replaceAll("\\D", "");
    }
}
