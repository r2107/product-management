package com.gunjan.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gunjan.product.model.Product;
import com.gunjan.product.service.ProductHardcodedService;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductController {

	@Autowired
	private ProductHardcodedService productService;

	@PostMapping("/users/productList/createProduct")
	public Product createProduct(@RequestBody Product product) {
		Product createdProduct = productService.save(product);
		return createdProduct;
	}
	@GetMapping("/users/productList/fetch")
	public List<Product> getAllProducts() {
		return productService.getAll();
	}

	@GetMapping("/users/productList/costlyProducts/{price}")
	public List<Product> getAllProductsCostlierThanGivenPrice(@PathVariable double price) {

		return productService.priceGreaterThanMentioned(price);
	}

	@GetMapping("/users/productList/notAvailable")
	public List<Product> getAllProductsNotAvailabile() {

		return productService.filterBasedOnAvailability();
	}

//	@GetMapping("/users/productList/searchByCategory/{listOfCategory}")
//	public List<Product> getAllProductsBasedOnCategory(@PathVariable String listOfCategory) {
//        String[] categories = listOfCategory.split(",");
//        System.out.println("hi");
//		return productService.productsIntersection(categories);
//	}
	@GetMapping("/users/productList/searchByCategory/{category}")
	public List<Product> getAllProductsBasedOnCategory(@PathVariable String category) {
		return productService.searchCategory(category);
	}
	@GetMapping("/users/productList/searchByTitle/{title}")
	public List<Product> getAllProductsBasedOnWord(@PathVariable String title) {
		return productService.searchWord(title);
	}
	
	@GetMapping("/users/productList/sortByPrice")
	public List<Product> getAllProductsSorted(){
		
		return productService.sortByPrice();
		
	}
	

//	// Edit/Update a product
//	@PutMapping("/users/productList/updateProduct/{productId}")
//	public ResponseEntity<Product> updateProduct( @PathVariable String productId,
//			@RequestBody Product product) {
//
//		Product productUpdated = productService.save(product);
//
//		return new ResponseEntity<Product>(product, HttpStatus.OK);
//	}
	
	// Edit/Update a product
	@PutMapping("/users/productList/updateProduct")
	public Product updateProduct(@RequestBody Product product) {

		Product productUpdated = productService.update(product);

		return productUpdated;
	}

	
	
//	// DELETE /users/productList/deleteProduct/{productId}
//	@DeleteMapping("/users/productList/deleteProduct/{productId}")
//	public ResponseEntity<Void> deleteProduct( @PathVariable String productId) {
//
//		Product product = productService.deleteById(productId);
//
//		if (product != null) {
//			return ResponseEntity.noContent().build();
//		}
//
//		return ResponseEntity.notFound().build();
//	}
	@DeleteMapping("/users/productList/deleteProduct/{productId}")
	public void deleteProduct(@PathVariable String productId) {
		productService.deleteById(productId);
	}

}
