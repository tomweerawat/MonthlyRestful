package th.co.hotum.monthlyreport.conf;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"th.co.hotum.monthlyreport.Controller"})
public class MvcConfig extends WebMvcConfigurerAdapter {
	
	@Bean
	public ObjectMapper objectMapper(){
		ObjectMapper objMapper = new ObjectMapper();
		objMapper.setSerializationInclusion(Include.NON_NULL);
		objMapper.setTimeZone(TimeZone.getTimeZone("Asia/Bangkok"));
		objMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
		return objMapper;
	}
}
