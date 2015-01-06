package lee;

import javax.xml.ws.Endpoint;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;

import com.tung.ws.HelloWord;
import com.tung.ws.impl.HelloWordWs;

public class ServerMain {

	public static void main(String[] args) {
		
		HelloWord hw = new HelloWordWs();
		//调用Endpoint的publish方法发布Web Service
		EndpointImpl ep = (EndpointImpl) Endpoint.publish("http://192.168.0.118:9999/test", hw);
		ep.getInInterceptors().add(new LoggingInInterceptor());
		ep.getOutInterceptors().add(new LoggingOutInterceptor());
		
		System.out.println("Web Service 暴露成功");
	}
}
