package patterns.observer;

public class PeopleB implements People{
    @Override
    public void update(News news) {
        System.out.println("old news");
    }
}
