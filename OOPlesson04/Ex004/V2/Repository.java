package Ex004;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    List<Content> ds; //элементы, имеющие отношение к иерархии Content

    private String name;

    public Repository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n >> % created\n", this.name);
    }
    public void add(Content content) {
        ds.add(content);
    }

    public int count() {
        return ds.size();
    }
    public Content get(Integer index) {
        return ds.get(index);
    }
    // можно реализовать возможность работы с foreach
}
