package ptitshop.ptithcm.dbclpm.entity;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.*;
import ptitshop.ptithcm.dbclpm.entity.embed.ProductImage;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "products")
public class Product {
    @Id
    private String id;

    @Indexed
    private String name;

    @Indexed(unique = true)
    private String slug;

    private String description;
    private BigDecimal price;

    @Builder.Default
    private Integer discountPercent = 0;

    @Builder.Default
    private Integer stock = 0;

    @Builder.Default
    private Integer sold = 0;

    @Builder.Default
    private Integer viewCount = 0;

    @Builder.Default
    private Boolean active = true;

    private String thumbnailUrl;

    @Indexed
    private String categoryId;

    private String categoryName;

    @Builder.Default
    private List<ProductImage> images = new ArrayList<>();
}
