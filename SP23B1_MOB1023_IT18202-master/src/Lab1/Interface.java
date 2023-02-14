package Lab1;

import java.util.ArrayList;

public interface Interface {

    public void Insert(product p);

    public void Update(int i, product p);

    public void Delete(int i);

    public ArrayList<product> getList();

    public void setList(ArrayList<product> list);
}
