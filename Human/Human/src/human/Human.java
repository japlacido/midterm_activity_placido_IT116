package human;

public class Human {
    private String skin_color = "white";
    private String eye_color = "Green";
    private String gender = "boy";
    private int height = 169; 
    private int weight = 69;
    private int age = 17;
    private String race = "Asian";
    private String name = "Xzyckyl";
    
    public static void main(String[] args) {
        
        Human a = new Human ();
        Children b = new Children();
        
        System.out.println(a.skin_color);
        System.out.println(a.eye_color);
        System.out.println(a.gender);
        System.out.println(a.height);
        System.out.println(a.weight);
        System.out.println(a.age);
        System.out.println(a.race);
        System.out.println(a.name);
        System.out.println(b.intellegience_rating);
        System.out.println(b.mood_rating);
        System.out.println(b.genetic_disease[0]);
        System.out.println(b.wealth_rating);
    }
    
}
