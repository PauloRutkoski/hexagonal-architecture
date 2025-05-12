package rutkoski.paulo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rutkoski.paulo.adapter.out.ProductRepositoryAdapter;
import rutkoski.paulo.port.in.CreateProductUseCase;
import rutkoski.paulo.port.in.GetProductByIdUseCase;
import rutkoski.paulo.port.in.impl.CreateProductUseCaseImpl;
import rutkoski.paulo.port.in.impl.GetProductByIdUseCaseImpl;

@Configuration
public class PortsConfiguration {
    @Bean
    public CreateProductUseCase createProductUseCase(ProductRepositoryAdapter productRepository) {
        return new CreateProductUseCaseImpl(productRepository);
    }

    @Bean
    public GetProductByIdUseCase getProductByIdUseCase(ProductRepositoryAdapter productRepository) {
        return new GetProductByIdUseCaseImpl(productRepository);
    }
}
