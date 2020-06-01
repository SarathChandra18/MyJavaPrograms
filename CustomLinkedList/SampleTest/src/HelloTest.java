import org.junit.Test;

public class HelloTest {

	@Test
	public void test() {
		
		System.out.println("test method");
	}
	
	@Test
	public void somethingElse() {
		
		System.out.println("something else method executed");
	}
	
	@Test
	public void iAmNotATest() {
		System.out.println("i am not a test");
	}
	
	
	public void iAmTheLastTest() {
		System.out.println("i am the last test");
	}
}
