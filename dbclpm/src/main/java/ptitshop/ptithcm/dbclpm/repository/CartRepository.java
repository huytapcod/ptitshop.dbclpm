package ptitshop.ptithcm.dbclpm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ptitshop.ptithcm.dbclpm.entity.Cart;

import java.util.Optional;

public interface CartRepository extends MongoRepository<Cart, String> {

    Optional<Cart> findByUserId(String userId);

    Boolean existsByUserId(String userId);

    void deleteByUserId(String userId);
}