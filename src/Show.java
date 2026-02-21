import java.util.ArrayList;

public class Show {
    String name;
    int duration;
    Director director;
    ArrayList<Actor> actors;

    public Show(String name, int duration, Director director){
        this.name = name;
        this.duration = duration;
        this.director = director;
        this.actors = new ArrayList<>();
    }



    public boolean addActor(Actor actor){
        if (actor == null) {
            System.out.println("Пустое значение");
            return false;
        }
        // Проверка, что актер еще не добавлен
        for(Actor act: actors){
            if(act.equals(actor)){
                System.out.println("Актер уже есть");
                return false;
            }
        }
        actors.add(actor);
        return true;
    }

    public void listActors (){
        //как отдельное задание
        System.out.println("Список актеров:");
        for(Actor ar: actors){
            System.out.println(ar.toString());
        }
    }

    public void replacementActor(Actor actor, String surname){

        for(Actor act: actors){
            if(surname.equals(act.getSurname())){
                System.out.println("Актер для замены найден");
                //act.equals(); - из-за одной фамилии не ясно, как сделать проверку с однофамильцами
                //новый актер есть и он не пустой
                if(addActor(actor)){
                    System.out.println("новый актер добавлен");
                    actors.remove(act);
                    System.out.println("старый актер удален");
                    break; //если есть однофамильцы
                }
            }else System.out.println("Старый актер не найден");
        }
    }

    @Override
    public String toString() {
        String res = "Название: " + name + "\nДлительность: " + duration + "\nРежиссер: " + director.toString() + "\n";
        res += "Список актеров:\n";
        for(Actor ar: actors){
            res += ar.toString() + "\n";
        }
        return res;
    }
}
