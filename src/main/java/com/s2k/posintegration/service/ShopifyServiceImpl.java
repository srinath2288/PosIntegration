package com.s2k.posintegration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.s2k.posintegration.dto.Product;

@Component
public class ShopifyServiceImpl implements ShopifyService {
	
	
	RestTemplate restTemplate = new RestTemplate();
	
	String shopifyProductsUrl = "https://ss9175e285f4a1f653f46ef0becefd5f:1f370546bbed066f128cec004550e6c7@grocynet.myshopify.com/admin/products.json";

	@Override
	public Product createProduct(Product product) {
		//restTemplate.exchange(shopifyProductsUrl, HttpMethod.POST, product, Product.class, null);
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
		shopifyProductsUrl = "https://ss9175e285f4a1f653f46ef0becefd5f:1f370546bbed066f128cec004550e6c7@grocynet.myshopify.com/admin/products/6451197889.json";
		return restTemplate.getForObject(shopifyProductsUrl, Product.class);
	}

	@Override
	public void deleteProduct(String productId) {
		// TODO Auto-generated method stub
		
	}

}
