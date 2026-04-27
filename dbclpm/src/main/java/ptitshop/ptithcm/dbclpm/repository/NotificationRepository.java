package ptitshop.ptithcm.dbclpm.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import ptitshop.ptithcm.dbclpm.entity.Notification;

public interface NotificationRepository extends MongoRepository<Notification, String> {

    Page<Notification> findByUserIdOrderByCreatedAtDesc(String userId, Pageable pageable);

    Long countByUserIdAndReadFalse(String userId);
}