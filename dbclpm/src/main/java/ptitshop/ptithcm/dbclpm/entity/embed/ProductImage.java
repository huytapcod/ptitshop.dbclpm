package ptitshop.ptithcm.dbclpm.entity.embed;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators.In;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductImage {
    private String imageUrl;
    private Integer sortOder;

}
