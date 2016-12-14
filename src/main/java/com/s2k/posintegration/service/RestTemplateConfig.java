package com.s2k.posintegration.service;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateConfig {
	private RestTemplate restTemplate = new RestTemplate();
	private String shopifyProductsUrl = "https://de9175e285f4a1f653f46ef0becefd5f:1f370546bbed066f128cec004550e6c7@grocynet.myshopify.com/admin/products.json";
	
	public RestTemplate getRestTemplate() {
		return restTemplate;
	}
	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	public String getShopifyProductsUrl() {
		return shopifyProductsUrl;
	}
	public void setShopifyProductsUrl(String shopifyProductsUrl) {
		this.shopifyProductsUrl = shopifyProductsUrl;
	}
	
	public HttpHeaders createHeaders( final String username, final String password ){
		   return new HttpHeaders(){
		      {
		         String auth = username + ":" + password;
		         byte[] encodedAuth = Base64.encodeBase64( 
		            auth.getBytes(Charset.forName("US-ASCII")) );
		         String authHeader = "Basic " + new String( encodedAuth );
		         set( "Authorization", authHeader );
		      }
		   };
		}

	public HttpEntity<String> restBasicHeaders(RestTemplate restTemplate) {
		restTemplate.setMessageConverters(getMessageConverters());
	    String plainCreds = "de9175e285f4a1f653f46ef0becefd5f:1f370546bbed066f128cec004550e6c7";
	    byte[] plainCredsBytes = plainCreds.getBytes();
	    byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
	    String base64Creds = new String(base64CredsBytes);
	    
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    headers.add("Authorization", "Basic " + base64Creds);

	    //headers.set();
	    HttpEntity<String> entity = new HttpEntity<String>(headers);
		return entity;
	}
	
	public List<HttpMessageConverter<?>> getMessageConverters() {
	    List<HttpMessageConverter<?>> converters = 
	      new ArrayList<HttpMessageConverter<?>>();
	    converters.add(new MappingJackson2HttpMessageConverter());
	    return converters;
	}
	

	
}