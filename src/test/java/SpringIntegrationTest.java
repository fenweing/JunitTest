import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SpringExtension.class)
@Transactional
@ContextConfiguration({ "classpath:test-spring-context.xml" })
public class SpringIntegrationTest {
}
