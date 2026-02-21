public class Ballet extends MusicalShow{
    Person choreographer;

    public Ballet(String name, int duration, Director director, Person musicAutor, Person choreographer) {
        super(name, duration, director, musicAutor);
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }
}
