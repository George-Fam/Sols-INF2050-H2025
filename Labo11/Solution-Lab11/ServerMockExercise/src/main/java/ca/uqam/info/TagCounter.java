package ca.uqam.info;

import java.io.IOException;
import org.apache.commons.lang3.StringUtils;

public class TagCounter {

  private final ServerFileDownloader serverFileDownloader;
  public TagCounter(ServerFileDownloader serverFileDownloader) {

    this.serverFileDownloader = serverFileDownloader;
  }
  public int countTags() {

    String rawPageHtml = null;
    try {
      rawPageHtml = serverFileDownloader.getWebpageContent();
      // Count the '<' occurrences, which is equivalent to counting the tags.
      // Technically not, because there might be math formulas in javascript, but we don't care
      // about this detail for now.
      return StringUtils.countMatches(rawPageHtml, '<');
    } catch (IOException e) {
      throw new RuntimeException("You are offline !");
    }
  }
}
