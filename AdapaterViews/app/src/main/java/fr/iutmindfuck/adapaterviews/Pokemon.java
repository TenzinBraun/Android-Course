package fr.iutmindfuck.adapaterviews;


public class Pokemon{

    private String name;
    private String type;
    private Integer pokemonID;

    public Pokemon(String name, String type, Integer pokemonID) {
        this.name = name;
        this.type = type;
        this.pokemonID = pokemonID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPokemonID() {
        return pokemonID;
    }

    public void setPokemonID(Integer pokemonID) {
        this.pokemonID = pokemonID;
    }
}
