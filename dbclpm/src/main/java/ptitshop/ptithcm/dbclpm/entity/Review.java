package ptitshop.ptithcm.dbclpm.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "reviews")
@CompoundIndex(name = "user_product_order_idx", def = "{'userId': 1, 'productId': 1, 'orderId': 1}", unique = true)
public class Review extends BaseDocument {

    @Id
    private String id;

    private String userId;
    private String userFullName;

    private String productId;
    private String productName;

    private String orderId;

    private Integer rating;
    private String comment;
}