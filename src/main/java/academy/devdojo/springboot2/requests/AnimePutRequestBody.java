package academy.devdojo.springboot2.requests;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class AnimePutRequestBody {

    @NotEmpty(message = "The anime id cannot be empty or null")
    private Long id;

    @NotEmpty(message = "The anime name cannot be empty or null")
    private String name;

}
