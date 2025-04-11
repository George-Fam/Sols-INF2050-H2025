package ca.uqam.info;

import java.io.IOException;
import org.jsoup.Jsoup;

/**
 * This class represents a dependency requiring an internet connection (inconvenient for testing,
 * because a dependency to this class means we can only test when online!
 */
public class ServerFileDownloader {

  // Static reference to the site to download
  String webpage = "https://en.wikipedia.org/wiki/Java_(programming_language)";

  /**
   * Download webpage and return code. Calling this method required an internet connection.
   *
   * @return raw html webpage content as String.
   */
  public String getWebpageContent() throws IOException {
    String html = Jsoup.connect(webpage).get().html();
    return html;
  }
}
