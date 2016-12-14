package com.s2k.posintegration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.s2k.posintegration.dto.Product;

@Component
public class ShopifyServiceImpl implements ShopifyService {

	@Autowired
	public RestTemplateConfig restTemplateConfig;
	
	@Override
	public Product createProduct(Product product) {
		// restTemplate.exchange(shopifyProductsUrl, HttpMethod.POST, product,
		// Product.class, null);
		return null;
	}

	/**
	 * Update
	 */
	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProduct(String productId) {

		HttpEntity<String> entity = restTemplateConfig.restBasicHeaders(restTemplateConfig.getRestTemplate());

		ResponseEntity<Product> response = restTemplateConfig.getRestTemplate()
				.exchange(restTemplateConfig.getShopifyProductsUrl(), HttpMethod.GET, entity, Product.class, "1");
		Product product = response.getBody();

		return product;
	}

	@Override
	public void deleteProduct(String productId) {
		// TODO Auto-generated method stub

	}

}
