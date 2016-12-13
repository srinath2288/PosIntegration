package com.s2k.posintegration.service;

import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import com.s2k.posintegration.dto.Product;

public interface ShopifyService {

	Product createProduct(Product product);

	Product updateProduct(Product product);

	Product getProduct(String productId);

	void deleteProduct(String productId);

}
