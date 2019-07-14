import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import service.AnnotatedService;
import service.InXmlService;

@ExtendWith(SpringExtension.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class SpringIntegrationTest {
    @Autowired
    private InXmlService inXmlService;
    @Autowired
    private AnnotatedService annotatedService;

    @Test
    void inXmlTest() {
        System.out.println(inXmlService.getName());
    }

    @Test
    void annotatedTest() {
        System.out.println(annotatedService.getName());
    }
}
