import java.util.Arrays;

public class Project {

    private Document[] allDocuments;

    private WritebleDocument[] writebleDocuments;

    public Project(Document[] allDocuments, WritebleDocument[] writebleDocuments) {
        this.allDocuments = allDocuments;
        this.writebleDocuments = writebleDocuments;
    }

    public void openAll() {
        Arrays.asList(allDocuments).forEach(Document::open);
    }

    public void saveAll() {
        Arrays.asList(writebleDocuments).forEach(WritebleDocument::save);
    }

}
