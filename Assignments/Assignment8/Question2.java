class Question2 {
    private String name;
    private String breed;
    public Question2(String name, String breed) { this.name = name; this.breed = breed; }
    public void setName(String name) { this.name = name; }
    public void setBreed(String breed) { this.breed = breed; }
    public String getName() { return name; }
    public String getBreed() { return breed; }
    public static void main(String[] args) {
        Question2 d1 = new Question2("Rex", "Labrador");
        Question2 d2 = new Question2("Milo", "Beagle");
        d1.setName("Rexie");
        d1.setBreed("Labrador Retriever");
        d2.setName("Milo Jr");
        d2.setBreed("Beagle Mix");
        System.out.println(d1.getName() + " " + d1.getBreed());
        System.out.println(d2.getName() + " " + d2.getBreed());
    }
}
