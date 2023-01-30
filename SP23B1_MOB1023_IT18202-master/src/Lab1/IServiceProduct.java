
package Lab1;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class IServiceProduct implements Interface {

    private ArrayList<product> listproduct = new ArrayList<>();

    @Override
    public void Insert(product p) {
        listproduct.add(p);
    }

    @Override
    public void Update(int i, product p) {
        listproduct.set(i, p);
    }

    @Override
    public void Delete(int i) {
        listproduct.remove(i);
    }

    @Override
    public ArrayList<product> getList() {
        return this.listproduct;
    }

}
