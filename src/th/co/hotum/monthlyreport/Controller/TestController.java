package th.co.hotum.monthlyreport.Controller;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.rmi.runtime.Log;
import th.co.hotum.monthlyreport.dao.*;
import th.co.hotum.monthlyreport.db.CustConst;
import th.co.hotum.monthlyreport.db.DBUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Controller
public class TestController {

    private String startdata, enddate;

    private String response;


/*    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public List test() throws IOException {
        Reader reader = Resources.getResourceAsReader("resource/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession();

        //select contact all contacts
    *//*	List<Province> cus = session.selectList("Student.getAll");*//*

        List<SeparateIncome> cus = session.selectList("addr.getIncome");
        for (SeparateIncome st : cus) {
		*//*	System.out.println(st.getCust_id());
			System.out.println(st.getCust_frst_name());
			System.out.println(st.getCust_last_name());
			System.out.println(st.getCust_img_url());
			System.out.println(st.getCust_auth_id());
			System.out.println(st.getUpdt_dttm());*//*

            return cus;
        }

        System.out.println("Records Read Successfully ");
        session.commit();
        session.close();

        return null;

    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/testtest", method = RequestMethod.GET)
    @ResponseBody
    public ListProvinceResp queryCustAddr(HttpServletRequest httpReq, HttpServletResponse httpResp,
                                        @RequestParam("province_code") String province_code) {
        Logger log = Logger.getLogger(this.getClass());
        ListProvinceResp resp = new ListProvinceResp();

        try {

            HashMap<String, Object> inputParam = new HashMap<String, Object>();
            inputParam.put("province_code", province_code);

            List<Province> provinceList = DBUtil.selectList("addr.getAllPrvnc", inputParam);
            resp.setProvince(provinceList);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resp;
    }*/

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/SeperateIncome", method = RequestMethod.GET)
    @ResponseBody
    public SeperateCollectionDao listProvince(HttpServletRequest httpReq, HttpServletResponse httpResp, @RequestParam("startdate") String startdate,@RequestParam("enddate") String enddate) {
        Logger log = Logger.getLogger(this.getClass());
        SeperateCollectionDao resp = new SeperateCollectionDao();
        try {

            HashMap<String, Object> inputParam = new HashMap<String, Object>();
            inputParam.put("startdate", startdate);
            inputParam.put("enddate", enddate);
            List<SeparateIncome> mydata = DBUtil.selectList("addr.getSomething", inputParam);
            resp.setSeparateIncomes(mydata);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return resp;
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/SumIncome", method = RequestMethod.GET)
    @ResponseBody
    public MerSumCollectionDao getMerSumIncome(HttpServletRequest httpReq, HttpServletResponse httpResp, @RequestParam("startdate") String startdate,@RequestParam("enddate") String enddate) {
        MerSumCollectionDao resp = new MerSumCollectionDao();
        try {

            HashMap<String, Object> inputParam = new HashMap<String, Object>();
            inputParam.put("startdate", startdate);
            inputParam.put("enddate", enddate);
            List<MerSumIncome> mydata = DBUtil.selectList("addr.getSumIncome", inputParam);
            resp.setSumIncome(mydata);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return resp;
    }


}