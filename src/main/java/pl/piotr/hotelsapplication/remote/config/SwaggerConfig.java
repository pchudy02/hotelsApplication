package pl.piotr.hotelsapplication.remote.config;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("pl.piotr.hotels"))
                .build()
                .useDefaultResponseMessages(false)
                .ignoredParameterTypes()
                .apiInfo(new ApiInfo("Pizza information", "","","",new Contact("","","")
                        ,"","", Collections.emptyList()));
    }
}