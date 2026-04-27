package ptitshop.ptithcm.dbclpm.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.*;
import ptitshop.ptithcm.dbclpm.entity.embed.Address;
import ptitshop.ptithcm.dbclpm.enums.Gender;
import ptitshop.ptithcm.dbclpm.enums.RoleName;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "users")
public class User {
    @Id
    private String id;

    @Indexed(unique = true)
    private String username;

    @Indexed(unique = true)
    private String email;

    private String passwordHash;
    private String fullName;
    private String phone;
    private Gender gender;
    private String avatarUrl;

    @Builder.Default
    private Boolean active = false;

    @Builder.Default
    private Boolean deleted = false;

    private String otpCode;
    private LocalDateTime otpExpiredAt;
    private String refreshToken;

    @Builder.Default
    private Long walletBalance = 0L;

    @Builder.Default
    private Set<RoleName> roles = new HashSet<>();

    @Builder.Default
    private List<String> favoriteProductIds = new ArrayList<>();

    @Builder.Default
    private List<String> viewedProductIds = new ArrayList<>();

    @Builder.Default
    private List<Address> addresses = new ArrayList<>();
}
