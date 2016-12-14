package com.s2k.posintegration.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.s2k.posintegration.dto.Product;
import com.s2k.posintegration.service.ShopifyService;

/**
 * Interface for shopify
 * 
 * @author srinathsridharan
 *
 */
@RestController
public class ShopifyController {

	private static final Logger logger = LoggerFactory.getLogger(ShopifyController.class);
	@Autowired
	ShopifyService shopifyService;

	/**
	 * Create Product.
	 */
	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		return new ResponseEntity(shopifyService.createProduct(product), HttpStatus.OK);
	}

	/**
	 * Modify Product by productId.
	 */
	@RequestMapping(value = "/product/{productId}", method = RequestMethod.PUT)
	public ResponseEntity<Product> updateProduct(@RequestBody Product product, @PathVariable String productId) {
		product.setId(Integer.parseInt(productId));
		Product productResponse = shopifyService.updateProduct(product);
		return new ResponseEntity(productResponse, HttpStatus.OK);
	}

	/**
	 * Get Product by productId.
	 */
	@RequestMapping(value = "/product/{productId}",method = RequestMethod.GET, consumes={"application/json", "application/xml"})
	public ResponseEntity<Product> getProduct(@PathVariable String productId) {
		return new ResponseEntity(shopifyService.getProduct(productId), HttpStatus.OK);
	}

	/**
	 * Delete Product by productId.
	 */
	@RequestMapping(value = "/product/{productId}", method = RequestMethod.DELETE)
	public ResponseEntity deleteProduct(@PathVariable String productId) {
		return new ResponseEntity(HttpStatus.OK);
	}
}
