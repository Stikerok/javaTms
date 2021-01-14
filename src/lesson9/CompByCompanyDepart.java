package lesson9;

import java.util.Comparator;

public class CompByCompanyDepart implements Comparator<Bus> {

    @Override
    public int compare(Bus o1, Bus o2) {
        int flag = o1.getNameCompany().compareTo(o2.getNameCompany());
        if (flag == 0) {
            flag = o1.getDeparture().compareTo(o2.getDeparture());
        }
        return flag;
    }
}
