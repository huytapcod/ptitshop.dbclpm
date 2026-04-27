package ptitshop.ptithcm.dbclpm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ptitshop.ptithcm.dbclpm.entity.Product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends MongoRepository<Product, String> {

    Optional<ptitshop.ptithcm.dbclpm.entity.Product> findBySlug(String slug);

    Boolean existsBySlug(String slug);

    Page<Product> findByActiveTrue(Pageable pageable);

    Page<Product> findByCategoryIdAndActiveTrue(String categoryId, Pageable pageable);

    Page<Product> findByNameContainingIgnoreCaseAndActiveTrue(String keyword, Pageable pageable);

    List<Product> findTop10ByActiveTrueOrderByCreatedAtDesc();

    List<Product> findTop10ByActiveTrueOrderBySoldDesc();

    List<Product> findTop10ByActiveTrueOrderByDiscountPercentDesc();

    List<Product> findTop10ByActiveTrueOrderByViewCountDesc();

    List<Product> findTop8ByCategoryIdAndIdNotAndActiveTrue(String categoryId, String id);
}
