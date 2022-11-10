package MyRunner;

import java.io.File;
import java.io.FilenameFilter;

public class DirScan
{
    public static void main(String[] args)
    {
        File root = new File("C:\\Users\\sumit.goyal.IRISSOFTWARE\\Downloads");
        FilenameFilter beginswithm = new FilenameFilter()
        {
         public boolean accept(File directory, String filename) {
              return filename.startsWith("student_roster");
          }
        };

        File[] files = root.listFiles(beginswithm);
        for (File f: files)
        {
            System.out.println(f);
        }
    }
}