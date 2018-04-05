package th.co.hotum.monthlyreport.dao;

import com.fasterxml.jackson.annotation.JsonInclude;
import th.co.hotum.monthlyreport.dto.HeaderResp;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeneralResp implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    HeaderResp headerResp = new HeaderResp();

    public HeaderResp getHeaderResp() {
        return headerResp;
    }

    public void setHeaderResp(HeaderResp headerResp) {
        this.headerResp = headerResp;
    }

}