public class Theatre {

    public static void main(String[] args) {
        Actor name1 = Actor.parse("Жеребцов Иван", Person.Gender.MALE, 1.7);
        Actor name2 = Actor.parse("Петрович Петр", Person.Gender.MALE, 1.6);
        Actor name3 = Actor.parse("Пупкина Василиса", Person.Gender.FEMALE, 1.8);

        Director dir = Director.parse("Иванова Наталья", Person.Gender.FEMALE, 16);
        Director dir2 = Director.parse("Сидоров Аркадий", Person.Gender.MALE, 20);

        Person avtor = Person.parse("Димитриева Елена", Person.Gender.FEMALE);
        Person phareografe = Person.parse("Хареографич Иван", Person.Gender.MALE);

        Show sh = new Show("Обычное", 120, dir);
        Opera opera = new Opera("Опера", 120, dir2, avtor, 12);
        Ballet ball = new Ballet("Балет", 130, dir, avtor, phareografe);

        //актеры по спектаклям
        sh.addActor(name1);
        sh.addActor(name2);

        opera.addActor(name2);
        opera.addActor(name3);

        ball.addActor(name1);
        ball.addActor(name3);

        //список актеров sh.listActors();
        System.out.println(sh.toString());
        System.out.println(opera.toString());
        System.out.println(ball.toString());


        //заменить актера в 1 спектакле + список
        sh.replacementActor(name3,"Петрович");
        System.out.println(sh.toString());

        //заменить несуществующего актера
        opera.replacementActor(name2, "Собакин");
        System.out.println(opera.toString());

        //текст либретто
        ball.printFullLibretto();

        opera.addText("Первая картина\n");
        opera.addText("ИНСТИТУТ СТРАВИНСКОГО - КЛИНИКА\n" +
                      "ДЛЯ ДУШЕВНОБОЛЬНЫХ");
        opera.addText("Мастер у окна... Издалека, кажется с Патриарших прудов, доносится вальс духового оркестра... Мастер садится к столу, берет лист бумаги и карандаш...");
        opera.addText("Мастер");
        opera.addSong("Песня Мастера", "Когда душа и разум\n" +
                "устанут от разлук,\n" +
                "одной случайной фразы\n" +
                "достаточно, мой друг...\n" +
                "Одной небрежной темы\n" +
                "и двух удачных нот...\n" +
                "И вот уже не те мы...\n" +
                "И мир уже не тот.\n" +
                "И мир уже не тот...\n" +
                "Приди о, луч, к монете,\n" +
                "упавшей в полынью.\n" +
                "Тебя ничем на свете\n" +
                "я не обременю.\n" +
                "Я лишь сверкну и этим\n" +
                "утешусь хоть на час...\n" +
                "Подобно малым детям,\n" +
                "всегда живущим в нас...\n" +
                "Всегда живущим в нас...");
        opera.addText("Бегемот (с Патриарших).");
        opera.addText("Патриаршие пруды\n" +
                "от любой спасут беды.\n" +
                "Посидишь часок-другой -\n" +
                "и горе снимет как рукой...\n" +
                "Посидишь часок-другой -\n" +
                "и горе снимет как рукой!");

        opera.printFullLibretto();

    }

}

