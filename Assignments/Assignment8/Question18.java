class Question18 {
    private static class Item { String name; double price; int ratingCount; double ratingSum; Item(String n,double p){name=n;price=p;ratingCount=0;ratingSum=0;} void addRating(int r){ratingSum+=r;ratingCount++;} double avg(){ return ratingCount==0?0:ratingSum/ratingCount; } }
    private Item[] menu;
    private int count;
    public Question18(int cap){ menu = new Item[cap]; }
    public void addItem(String name,double price){ if(count<menu.length) menu[count++] = new Item(name,price); }
    public void removeItem(String name){ for(int i=0;i<count;i++) if(menu[i].name.equals(name)){ for(int j=i;j<count-1;j++) menu[j]=menu[j+1]; menu[--count]=null; break; } }
    public double averageRating(){ double sum=0; int c=0; for(int i=0;i<count;i++){ sum+=menu[i].avg(); c++; } return c==0?0:sum/c; }
    public static void main(String[] args){ Question18 r=new Question18(10); r.addItem("Pizza",250); r.addItem("Pasta",200); r.menu[0].addRating(5); r.menu[0].addRating(4); System.out.println(r.averageRating()); }
}
