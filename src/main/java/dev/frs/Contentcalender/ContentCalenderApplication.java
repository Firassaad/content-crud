package dev.frs.Contentcalender;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableAutoConfiguration
public class ContentCalenderApplication {

	public static void main(String[] args) {
	
	//	ConfigurableApplicationContext context = SpringApplication.run(ContentCalenderApplication.class, args);
	//	Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		SpringApplication.run(ContentCalenderApplication.class, args);
	}


	/*/	@Bean
		CommandLineRunner commandLineRunner(ContentRepository repository){
			return args -> {
				Integer id = Integer.valueOf(1);
				Content c = new Content(
					id,
					 "addfrom commandLine runner",
					"addfrom commandLine runner desc", 
				 Status.COMPLETED,
				  Type.ARTICLE,
				   LocalDateTime.now(),
				   LocalDateTime.now(),
					"http:www");
			
					repository.save(c);
			};
		}*/
}
