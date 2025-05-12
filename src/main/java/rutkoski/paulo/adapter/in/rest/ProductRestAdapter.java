package rutkoski.paulo.adapter.in.rest;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rutkoski.paulo.adapter.in.dto.CreateProductDTO;
import rutkoski.paulo.adapter.in.dto.ProductDTO;
import rutkoski.paulo.adapter.in.mapper.CreateProductDTOMapper;
import rutkoski.paulo.adapter.in.mapper.ProductDTOMapper;
import rutkoski.paulo.domain.model.Product;
import rutkoski.paulo.port.in.CreateProductUseCase;
import rutkoski.paulo.port.in.GetProductByIdUseCase;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductRestAdapter {
    private final CreateProductUseCase createProductUseCase;
    private final GetProductByIdUseCase getProductByIdUseCase;
    private final ProductDTOMapper productDTOMapper = Mappers.getMapper(ProductDTOMapper.class);
    private final CreateProductDTOMapper createProductDTOMapper = Mappers.getMapper(CreateProductDTOMapper.class);

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable("id") Long id) {
        Product product = getProductByIdUseCase.getProductById(id);
        return ResponseEntity.ok(productDTOMapper.toDTO(product));
    }

    @PostMapping
    public ResponseEntity<ProductDTO> getProductById(@RequestBody CreateProductDTO request) {
        Product createProduct = createProductDTOMapper.toModel(request);
        Product product = createProductUseCase.createProduct(createProduct);
        return ResponseEntity.ok(productDTOMapper.toDTO(product));
    }
}
