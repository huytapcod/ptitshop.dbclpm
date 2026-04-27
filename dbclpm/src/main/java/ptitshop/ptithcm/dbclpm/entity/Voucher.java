package ptitshop.ptithcm.dbclpm.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.index.Indexed;
import lombok.*;
import jakarta.persistence.Id;
import ptitshop.ptithcm.dbclpm.enums.VoucherType;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Voucher {
    @Id
    private String id;

    @Indexed(unique = true)
    private String code;

    private VoucherType type;
    private BigDecimal value;
    private BigDecimal maxDiscountAmount;
    private BigDecimal minOrderAmount;
    private Integer quantityLimit;

    @Builder.Default
    private Integer usedCount = 0;

    private LocalDateTime startAt;
    private LocalDateTime endAt;

    @Builder.Default
    private Boolean active = true;

}
