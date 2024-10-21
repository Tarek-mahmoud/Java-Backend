
import java.io.File;

public class ZipArchiver implements Archiver {

    @Override
    public void archiveFiles(File... files) {
        System.out.println("Method of Zip Archiver is called");
    }

    // overload
    public void archiveFiles(int maxArchiveSize, File... files) {
        // some method for the demo purpose
    }
}
