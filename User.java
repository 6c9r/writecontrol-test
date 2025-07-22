public class User {
    private String nom;
    private String email;
    private int age;

    public User(String nom, String email, int age) {
        this.nom = nom;
        this.email = email;
        this.age = age;
    }

    public String getNom() { return nom; }
    public String getEmail() { return email; }
    public int getAge() { return age; }

    public String toString() {
        return "User: " + nom + " (" + email + "), " + age + " ans";
    }
}
