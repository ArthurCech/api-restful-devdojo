package academy.devdojo.springboot2.requests;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
public class AnimePutRequestBody {

    @NotNull(message = "The anime id cannot be null")
    private Long id;

    @NotEmpty(message = "The anime name cannot be empty or null")
    private String name;

}
