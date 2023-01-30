package LuyenTap;

import java.util.ArrayList;

public interface IService {

    public void insert(People pl);

    public void update(int i, People pl);

    public void delete(int i);

    public ArrayList<People> getlist();
}
