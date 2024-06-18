package explore.Hagar.swaggerboot.entity.dto;

import io.swagger.v3.oas.annotations.media.Schema;
public class UserDummy {

    @Schema(example = "Adam Johnson")
    private String name;

    @Schema(example = "30")
    private int age;

    // getters and setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
