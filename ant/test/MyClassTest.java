import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by clouway on 16-4-12.
 */
public class MyClassTest {
  @Test
  public void dummyTest() {
    assertThat(1, is(equalTo(1)));
  }
}
