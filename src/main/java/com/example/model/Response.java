/**
 * 
 */
package com.example.model;

import java.util.List;

import lombok.Data;

/**
 * @author ravishankar9
 *
 */
@Data
public class Response {

	private String orderId;
	private List<String> productList;
	private Double amount;
	private String customerName;
	
}
