package rutkoski.paulo.adapter.out.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rutkoski.paulo.adapter.out.entity.ProductEntity;

@Repository
public interface ProductJPARepository extends JpaRepository<ProductEntity, Long> {
}
