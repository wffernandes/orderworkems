package tech.buildrun.orderworkems;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(ServiceConnectionConfig.class)
@SpringBootTest
class OrderworkemsApplicationTests {

	@Test
	void contextLoads() {
	}

}
