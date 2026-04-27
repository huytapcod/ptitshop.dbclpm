package ptitshop.ptithcm.dbclpm.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import ptitshop.ptithcm.dbclpm.entity.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {
    Optional<Category> findBySlug(String slug);

    Boolean existsByName(String name);

    Boolean existsBySlug(String slug);

}
