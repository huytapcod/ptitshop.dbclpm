package ptitshop.ptithcm.dbclpm.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import lombok.*;
import ptitshop.ptithcm.dbclpm.entity.embed.CartItem;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "carts")
public class Cart {
    @Id
    private String id;

    @Indexed(unique = true)
    private String userId;

    @Builder.Default
    private List<CartItem> items = new ArrayList<>();

    @Builder.Default
    private BigDecimal subTotal = BigDecimal.ZERO;

    @Builder.Default
    private BigDecimal discountAmount = BigDecimal.ZERO;

    @Builder.Default
    private BigDecimal totalAmount = BigDecimal.ZERO;

    private String appliedVoucherCode;

}
