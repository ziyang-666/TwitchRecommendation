package model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonDeserialize(builder = Game.Builder.class)
public class Game {
    
    @JsonProperty("name")
    private final String name;
    
    @JsonProperty("id")
    private final String id;
    
    @JsonProperty("box_art_ur")
    private final String boxArtUrl;
    
    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }
    
    public String getBoxArtUrl() {
        return boxArtUrl;
    }
    
    public Game(Builder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.boxArtUrl = builder.boxArtUrl;
    }
 
    public static class Builder {
        private String name;
        private String id;
        private String boxArtUrl;
        
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        
        public Builder setId(String developer) {
            this.id = id;
            return this;
        }
        
        public Builder setBoxArtUrl(String boxArtUrl) {
            this.boxArtUrl = boxArtUrl;
            return this;
        }
        
        public Game build() {
            return new Game(this);
        }
    }
}
