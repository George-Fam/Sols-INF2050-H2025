package ca.uqam.info;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TagCounterTest {

  // SUT:
  @InjectMocks
  private TagCounter tagCounter;
  // Mock:
  @Mock
  private ServerFileDownloader serverFileDownloader;

  @Before
  public void prepareTests() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  public void testTagCounterOnSampleWebPage() throws IOException {

    // TODO: Use when-thenReturn syntax to have Mock return a fake webpage to test...
    String sampleWebPage = "<h1>Sample Web Page</h1>";
    when(serverFileDownloader.getWebpageContent()).thenReturn(sampleWebPage);
    int tagCount = tagCounter.countTags();
    assertEquals(2, tagCount);
  }
}
