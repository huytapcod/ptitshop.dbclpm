package ptitshop.ptithcm.dbclpm.entity;

import com.ptitshop.entity.enums.PaymentMethod;
import com.ptitshop.entity.enums.PaymentStatus;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "payment_transactions")
public class PaymentTransaction extends BaseDocument {

    @Id
    private String id;

    @Indexed
    private String orderId;

    @Builder.Default
    private PaymentMethod method = PaymentMethod.VNPAY;

    @Builder.Default
    private PaymentStatus status = PaymentStatus.PENDING;

    @Indexed(unique = true, sparse = true)
    private String transactionRef;

    private String gatewayTransactionNo;
    private BigDecimal amount;
    private String message;
    private LocalDateTime paidAt;
}
