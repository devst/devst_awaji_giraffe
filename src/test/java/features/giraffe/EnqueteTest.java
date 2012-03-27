package features.giraffe;

import static features.Assert.isFeatureImplement;

import org.junit.Test;

public class EnqueteTest {

	@Test
	public void testImplemented() {
		isFeatureImplement(getClass(), features.Enquete.class);
	}
}
