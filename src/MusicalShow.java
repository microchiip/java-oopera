
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MusicalShow extends Show {
    private Person musicAutor;
    private List<String> libretto; //список всего текста
    private HashMap<String, String> songs;  // наз-е песни + текст

    public MusicalShow(String name, int duration, Director director, Person musicAutor) {
        super(name, duration, director);
        this.musicAutor = musicAutor;
        this.libretto = new ArrayList<>();
        this.songs = new HashMap<>();
    }


    //реплики
    public void addText(String text) {
        if (text != null) {
            libretto.add(text);
        }
    }

    //наз-е, текст песни
    public void addSong(String songName, String text) {
        if(songName != null && text != null){
            libretto.add("");
            libretto.add("Название песни: " + songName);
            libretto.add(text);

            songs.put(songName, text);
        }
    }

    public void printFullLibretto() {
        if(libretto.isEmpty()){
            System.out.println("Список либретто пуст");
        }else {
            System.out.println("Название: " + name);
            System.out.println("Автор музыки: " + musicAutor.getSurname() + " " + musicAutor.getName());
            System.out.println("Текст либретто:");
            for (String line : libretto) {
                System.out.println(line);
            }
        }
    }



}

