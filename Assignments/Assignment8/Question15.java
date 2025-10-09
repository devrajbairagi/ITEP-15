class Question15 {
    private static class Song { String title; Song(String t){title=t;} }
    private Song[] songs;
    private int count;
    public Question15(int capacity){ songs = new Song[capacity]; }
    public void addSong(String title){ if(count<songs.length) songs[count++] = new Song(title); }
    public void removeSong(String title){ for(int i=0;i<count;i++) if(songs[i].title.equals(title)){ for(int j=i;j<count-1;j++) songs[j]=songs[j+1]; songs[--count]=null; break; } }
    public void playRandom(){ if(count==0) return; int idx = (int)(Math.random()*count); System.out.println("Playing: " + songs[idx].title); }
    public static void main(String[] args){ Question15 m = new Question15(10); m.addSong("Song1"); m.addSong("Song2"); m.playRandom(); m.removeSong("Song1"); m.playRandom(); }
}
