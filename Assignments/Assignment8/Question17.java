class Question17 {
    private String title;
    private String director;
    private String[] actors;
    private String[] reviews;
    private int actorCount;
    private int reviewCount;
    public Question17(String title,String director,int maxActors,int maxReviews){ this.title=title; this.director=director; actors=new String[maxActors]; reviews=new String[maxReviews]; }
    public void addActor(String a){ if(actorCount<actors.length) actors[actorCount++]=a; }
    public void addReview(String r){ if(reviewCount<reviews.length) reviews[reviewCount++]=r; }
    public String[] getReviews(){ String[] out=new String[reviewCount]; for(int i=0;i<reviewCount;i++) out[i]=reviews[i]; return out; }
    public static void main(String[] args){ Question17 m=new Question17("Film","Dir",10,10); m.addActor("A1"); m.addReview("Good"); String[] revs=m.getReviews(); for(int i=0;i<revs.length;i++) System.out.println(revs[i]); }
}
