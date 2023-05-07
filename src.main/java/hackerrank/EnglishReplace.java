package hackerrank;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class EnglishReplace {
  public static void main(String[] args) throws IOException, URISyntaxException {
    var content = readWholeFile(EnglishReplace.class.getClassLoader().resources("read.txt").findAny().orElseThrow().toURI());
    try (FileWriter writer = new FileWriter("D:\\IdeaProjects\\practice\\src.main\\resources\\result.txt"))  {
      System.out.println(content);
      writer.write(content);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static String readWholeFile(URI file) {
    StringBuilder builder = new StringBuilder();
    Pattern pattern = Pattern.compile("^([)(\\-A-Za-z\\s]+/)+");
    Path filePath = createPathFromFileName(file);
    try (Stream<String> fileLinesStream = openFileLinesStream(filePath)) {
      fileLinesStream.forEach(str -> {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
          builder.append(matcher.group(0), 0, matcher.group(0).lastIndexOf("/")).append("\n");
        }
      });
      return String.valueOf(builder);
    }

  }

  public static Path createPathFromFileName(URI path) {
    Objects.requireNonNull(path);
    return Paths.get(path);

  }

  private static Stream<String> openFileLinesStream(Path filePath) {
    try {
      return Files.lines(filePath);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }
}
