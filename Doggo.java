public class Doggo extends Pet
{
    private String breed;
    private boolean isVaccinated;
    private String color;
    
    public Doggo()
    {
        super("Default Doggo");
        breed = "Default Breed";
        isVaccinated = true;
        color = "Default Color";
    }
    
    public Doggo(String name, String breed, boolean isVaccinated, String color)
    {
        super(name);
        this.breed = breed;
        this.isVaccinated = isVaccinated;
        this.color = color;
    }
    
    public String speak()
    {
        return "woof!";
    }
    
    public String petTrick()
    {
        return "Returns newspaper and asks for a treat";
    }
}