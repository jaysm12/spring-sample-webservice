package com.jays.springsoap.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.jays.springsoap.service.api.ExternalApi;

import localhost._5555.external.services.ws.sample_service.SampleServiceRequest;
import localhost._5555.external.services.ws.sample_service.SampleServiceResponse;

@Endpoint
public class SampleEndpoint {

  @Autowired
  private ExternalApi externalApi;
  
  @PayloadRoot(namespace = "http://localhost:5555/external/services/ws/sample-service", localPart = "SampleServiceResponse")
  @ResponsePayload
  public SampleServiceResponse invokeExternalApi(@RequestPayload SampleServiceRequest request) throws Exception {

    SampleServiceResponse res = externalApi.hitExternalService(request);

    return res;
  }
}
