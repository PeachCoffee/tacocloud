package tacos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE, force = true)
@Document(collection="ingredients")
public class Ingredient {
    @Id
    private String id;
    private String name;
    private Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

    public Type getType() {
        return type;
    }

    public Ingredient setType(String id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
        return this;
    }

}
