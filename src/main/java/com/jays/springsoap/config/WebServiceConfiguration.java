package com.jays.springsoap.config;

import java.util.Collections;
import java.util.List;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.security.xwss.XwsSecurityInterceptor;
import org.springframework.ws.soap.security.xwss.callback.SimplePasswordValidationCallbackHandler;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfiguration extends WsConfigurerAdapter {

  @Bean
  ServletRegistrationBean messageDispatcherServlet(ApplicationContext ctx) {
    MessageDispatcherServlet messageDispatcherServlet = 
          new MessageDispatcherServlet();

    messageDispatcherServlet.setApplicationContext(ctx);
    messageDispatcherServlet.setTransformWsdlLocations(true);
    return new ServletRegistrationBean<>(messageDispatcherServlet, "/external/services/ws/*");
  }

  // define wsdl
  @Bean(name = "sample-service")
  public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema sampleSchema) {
    DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
    
    definition.setPortTypeName("SampleServicePort");
    definition.setTargetNamespace("http://localhost:5555/external/services/ws/sample-service");
    definition.setLocationUri("/external/services/ws");
    definition.setSchema(sampleSchema);

    return definition;
  }

  @Bean(name = "sampleSchema")
  XsdSchema sampleSchema() {
    return new SimpleXsdSchema(new ClassPathResource("SampleService.xsd"));
  }

  //XwsSecurityInterceptor
  @Bean
  public XwsSecurityInterceptor securityInterceptor() {
      XwsSecurityInterceptor securityInterceptor = new XwsSecurityInterceptor();
      //Callback Handler -> SimplePasswordValidationCallbackHandler
      securityInterceptor.setCallbackHandler(callbackHandler());
      //Security Policy -> securityPolicy.xml
      securityInterceptor.setPolicyConfiguration(new ClassPathResource("securityPolicy.xml"));
      return securityInterceptor;
  }

  @Bean
  public SimplePasswordValidationCallbackHandler callbackHandler() {
      SimplePasswordValidationCallbackHandler handler = new SimplePasswordValidationCallbackHandler();
      handler.setUsersMap(Collections.singletonMap("user", "password"));
      return handler;
  }


  @Override
  public void addInterceptors(List<EndpointInterceptor> interceptors) {
      interceptors.add(securityInterceptor());
  }
}

