public class AppL {

    public static void main(String[] args) {

        Document[] documents = {
                new Document("text1"),
                new Document("text2"),
                new Document("text3")
        };

        WritebleDocument[] writebleDocuments = {
                new WritebleDocument("text1"),
                new WritebleDocument("text2"),
                new WritebleDocument("text3")
        };

        Project project = new Project(documents, writebleDocuments);
        project.openAll();
        project.saveAll();

    }

}