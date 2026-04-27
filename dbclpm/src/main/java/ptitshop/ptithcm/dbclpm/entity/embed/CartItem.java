package ptitshop.ptithcm.dbclpm.entity.embed;

import java.math.BigDecimal;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartItem {
     private String productId;
    private String productName;
    private String productSlug;
    private String thumbnailUrl;
    private BigDecimal price;
    private Integer discountPercent;
    private Integer quantity;
    private Integer stock;

}

