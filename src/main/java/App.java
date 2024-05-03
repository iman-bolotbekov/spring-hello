import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) context.getBean("helloworld");
        HelloWorld bean1 = (HelloWorld) context.getBean("helloworld");
        Cat cat = (Cat) context.getBean("cat");
        Cat cat1 = (Cat) context.getBean("cat");

        System.out.println(cat == cat1); // false
        System.out.println(bean == bean1); // true
    }
}