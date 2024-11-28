package es.daw.web.model;

public class Pokemon {
    private Integer height;
    private Integer id;
    private String name;
    private Sprite sprites;
    
    public Integer getHeight() {
        return height;
    }
    public void setHeight(Integer height) {
        this.height = height;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Sprite getSprites() {
        return sprites;
    }
    public void setSprites(Sprite sprites) {
        this.sprites = sprites;
    }
    @Override
    public String toString() {
        return "Pokemon [height=" + height + ", id=" + id + ", name=" + name + ", sprites=" + sprites + "]";
    }
    
    
}
