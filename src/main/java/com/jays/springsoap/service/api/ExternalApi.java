package com.jays.springsoap.service.api;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import localhost._5555.external.services.ws.sample_service.SampleServiceRequest;
import localhost._5555.external.services.ws.sample_service.SampleServiceResponse;

@Service
public class ExternalApi {

  @Value("${external.api.url}")
  private String BASE_URL;

  public SampleServiceResponse hitExternalService(SampleServiceRequest request) throws Exception {
    RestTemplate restTemplate = new RestTemplate();

    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);

    HttpEntity<SampleServiceRequest> requestEntity = new HttpEntity<>(request, headers);


    ResponseEntity<SampleServiceResponse> responseEntity = restTemplate.exchange(
            BASE_URL,
            HttpMethod.POST,
            requestEntity,
            SampleServiceResponse.class
    );

    return responseEntity.getBody();                
  }
}


