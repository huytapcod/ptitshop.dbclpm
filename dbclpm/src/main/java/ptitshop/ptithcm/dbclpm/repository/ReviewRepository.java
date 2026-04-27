package ptitshop.ptithcm.dbclpm.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import ptitshop.ptithcm.dbclpm.entity.Review;
import java.util.Optional;

public interface ReviewRepository extends MongoRepository<Review, String> {

    Page<Review> findByProductIdOrderByCreatedAtDesc(String productId, Pageable pageable);

    Optional<Review> findByUserIdAndProductIdAndOrderId(String userId, String productId, String orderId);

    Boolean existsByUserIdAndProductIdAndOrderId(String userId, String productId, String orderId);
}
