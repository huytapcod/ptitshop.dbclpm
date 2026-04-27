package ptitshop.ptithcm.dbclpm.entity.embed;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    private String receiverName;
    private String receiverPhone;
    private String province;
    private String district;
    private String ward;
    private String detail;
    private Boolean isDefault;

}
