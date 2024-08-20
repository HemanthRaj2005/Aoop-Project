public class Main {
    public static void main(String[] args) {
        // Create SQL and NoSQL storage backends
        StorageBackend sqlBackend = new SQLStorageBackend();
        StorageBackend noSqlBackend = new NoSQLStorageBackend();

        // Create ContentManager instances with different storage backends
        ContentManager sqlContentManager = new ContentManagerImpl(sqlBackend);
        ContentManager noSqlContentManager = new ContentManagerImpl(noSqlBackend);

        // Demonstrate adding and retrieving content with SQL backend
        System.out.println("Using SQL Backend:");
        sqlContentManager.addContent("1", "SQL Job Posting: Java Developer");
        System.out.println("Content ID 1: " + sqlContentManager.getContent("1"));

        // Demonstrate updating content with SQL backend
        sqlContentManager.updateContent("1", "SQL Job Posting: Senior Java Developer");
        System.out.println("Updated Content ID 1: " + sqlContentManager.getContent("1"));

        // Demonstrate deleting content with SQL backend
        sqlContentManager.deleteContent("1");
        System.out.println("Deleted Content ID 1: " + sqlContentManager.getContent("1"));

        // Demonstrate adding and retrieving content with NoSQL backend
        System.out.println("\nUsing NoSQL Backend:");
        noSqlContentManager.addContent("1", "NoSQL Job Posting: Python Developer");
        System.out.println("Content ID 1: " + noSqlContentManager.getContent("1"));

        // Demonstrate updating content with NoSQL backend
        noSqlContentManager.updateContent("1", "NoSQL Job Posting: Senior Python Developer");
        System.out.println("Updated Content ID 1: " + noSqlContentManager.getContent("1"));

        // Demonstrate deleting content with NoSQL backend
        noSqlContentManager.deleteContent("1");
        System.out.println("Deleted Content ID 1: " + noSqlContentManager.getContent("1"));
    }
}
