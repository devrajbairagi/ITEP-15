class Question19 {
    private static class Reservation { String type; String id; Reservation(String t,String id){this.type=t;this.id=id;} public String toString(){return type+":"+id;} }
    private Reservation[] reservations;
    private int count;
    public Question19(int cap){ reservations = new Reservation[cap]; }
    public void searchFlights(String q){ System.out.println("Searching flights for " + q); }
    public void searchHotels(String q){ System.out.println("Searching hotels for " + q); }
    public void book(String type,String id){ if(count<reservations.length) reservations[count++] = new Reservation(type,id); }
    public void cancel(String id){ for(int i=0;i<count;i++) if(reservations[i].id.equals(id)){ for(int j=i;j<count-1;j++) reservations[j]=reservations[j+1]; reservations[--count]=null; break; } }
    public static void main(String[] args){ Question19 s=new Question19(10); s.searchFlights("NYC"); s.searchHotels("NYC"); s.book("Flight","F001"); s.book("Hotel","H001"); s.cancel("F001"); for(int i=0;i<s.count;i++) System.out.println(s.reservations[i]); }
}
