package firstcrudproject.repository;

import firstcrudproject.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long> {

}
