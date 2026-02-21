public class Opera extends MusicalShow{
    int choirSize;

    public Opera(String name, int duration, Director director, Person musicAutor, int choirSize) {
        super(name, duration, director, musicAutor);
        setChoirSize(choirSize);
    }

    public void setChoirSize(int choirSize) {
        if (choirSize < 0) {
            System.out.println("Некорректный размер хора");
        }
        else this.choirSize = choirSize;
    }

    public int getChoirSize(){
        return choirSize;
    }

}
