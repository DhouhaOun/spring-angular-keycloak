package secure.app.keyclock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import secure.app.keyclock.entities.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
}

