package LuyenTap;

import java.util.ArrayList;

public class Service implements IService {

    ArrayList<People> list = new ArrayList<>();

    @Override
    public void insert(People pl) {
        list.add(pl);
    }

    @Override
    public void update(int i, People pl) {
        list.set(i, pl);
    }

    @Override
    public ArrayList<People> getlist() {
        return this.list;
    }

    @Override
    public void delete(int i) {
        list.remove(i);
    }

}
