package example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TokenFormData {
    // Don't rename these, they are named to match VAIS' body requirements, and micronaut will not
    // map UrlEncoded form body using @JsonProperty
    private String grant_type;
    private String client_id;
    private String client_secret;
}
