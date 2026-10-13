import java.util.ArrayList;
import java.util.List;

public class DeleteFromList {
    public static void main(String[] args) {

        List<Song> playlist = new ArrayList<>();

        Song song1 = new Song("My Reverie", "Luarindo Almedio", "D Minor");
        playlist.add(song1);
        Song song2 = new Song("Lamp Down Low", "Luarindo Almedio", "G Major");
        playlist.add(song2);
        Song song3 = new Song("Sultans of Swing", "Dire Straits", "D Minor");
        playlist.add(song3);


        // If you dont know the index by the help of index you can find it

        int index = playlist.indexOf(song3);
        System.out.println("Index of song 3 : " + index);



        System.out.println("------Original List------");
        printPlaylist(playlist);

        // How to remove the songs from the list
        playlist.remove(2);
        System.out.println("------Modified List------");
        printPlaylist(playlist);

        
    }


    public static void printPlaylist(List<Song> playList){
        for(int i =0; i<playList.size(); i++){
            System.out.println("Song Name : "+playList.get(i).name+"\nCreator Name : "+playList.get(i).creatorName+"\nKey : "+playList.get(i).key);
            System.out.println("\n----------");
        }
        System.out.println();
    }
}
