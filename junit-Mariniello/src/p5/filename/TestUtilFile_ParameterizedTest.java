package p5.filename;

import java.io.File;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestUtilFile_ParameterizedTest {
   final static String S = File.separator;

   @ParameterizedTest
   @CsvFileSource(resources = "utilfile_dataset.csv")
   public String getShortFileName(String path) {
      int index1 = path.lastIndexOf(S);
      int index2 = path.lastIndexOf(".");
      String result = path.substring(index1 + 1, index2);
      return result;
   }
}
