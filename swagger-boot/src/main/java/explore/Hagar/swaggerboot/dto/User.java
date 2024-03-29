package explore.Hagar.swaggerboot.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
@Data
public class User {

    @Schema(example = "Adam Johnson")
    private String name;

    @Schema(example = "30")
    private int age;

    // getters and setters
}
