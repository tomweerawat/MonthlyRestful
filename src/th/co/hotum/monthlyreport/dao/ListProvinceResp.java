package th.co.hotum.monthlyreport.dao;

import java.util.ArrayList;
import java.util.List;

public class ListProvinceResp extends GeneralResp {
    private static final long serialVersionUID = 1L;
    private List<Province> province;

    public ListProvinceResp(){
        province = null;
    }

    public List<Province> getProvince() {
        return province==null?new ArrayList<Province>():province;
    }

    public void setProvince(List<Province> province) {
        this.province = province;
    }
}
