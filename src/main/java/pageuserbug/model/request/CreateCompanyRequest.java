package pageuserbug.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class CreateCompanyRequest {
    @JsonProperty("company_name")
    public String companyName;

    @JsonProperty("company_type")
    public String companyType;

    @JsonProperty("company_users")
    public List<String> companyUsers;

    @JsonProperty("email_owner")
    public String emailOwner;

    public CreateCompanyRequest(String companyName,
                                String companyType,
                                List<String> companyUsers,
                                String emailOwner) {
        this.companyName = companyName;
        this.companyType = companyType;
        this.companyUsers = companyUsers;
        this.emailOwner = emailOwner;
    }
}
