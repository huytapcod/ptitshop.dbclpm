package ptitshop.ptithcm.dbclpm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ptitshop.ptithcm.dbclpm.entity.Voucher;

import java.util.Optional;

public interface VoucherRepository extends MongoRepository<Voucher, String> {

    Optional<Voucher> findByCode(String code);

    Boolean existsByCode(String code);
}