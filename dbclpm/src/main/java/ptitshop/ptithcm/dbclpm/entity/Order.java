package ptitshop.ptithcm.dbclpm.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.InjectableValues.Base;

import jakarta.persistence.Id;
import lombok.*;
import ptitshop.ptithcm.dbclpm.entity.embed.Address;
import ptitshop.ptithcm.dbclpm.entity.embed.OrderItem;
import ptitshop.ptithcm.dbclpm.enums.OrderStatus;
import ptitshop.ptithcm.dbclpm.enums.PaymentStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "orders")
public class Order extends BaseDocument {
    @Id
    private String id;

    @Indexed(unique = true)
    private String orderCode;

    @Indexed
    private String userId;

    private String userEmail;
    private String userFullName;

    @Builder.Default
    private OrderStatus status = OrderStatus.PENDING;

    @Builder.Default
    private PaymentMethod paymentMethod = PaymentMethod.COD;

    @Builder.Default
    private PaymentStatus paymentStatus = PaymentStatus.PENDING;

    @Builder.Default
    private BigDecimal subTotal = BigDecimal.ZERO;

    @Builder.Default
    private BigDecimal discountAmount = BigDecimal.ZERO;

    @Builder.Default
    private BigDecimal shippingFee = BigDecimal.ZERO;

    @Builder.Default
    private BigDecimal totalAmount = BigDecimal.ZERO;

    private String voucherId;
    private String voucherCode;

    private Address shippingAddress;
    private String note;

    @Builder.Default
    private Boolean delivered = false;

    private LocalDateTime deliveredAt;

    @Builder.Default
    private List<OrderItem> items = new ArrayList<>();

}
