package org.anjana.inventorymanagement.masters;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import java.util.ArrayList;

import java.util.List;




@RunWith(SpringRunner.class)
@WebMvcTest(value = ProductsController.class)
public class ProductsControllerTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private ProductsRepository productRepo;
	
	private Products products;
 
	@Before
	public void prepare() {
		products = new Products();
		products.setProductSku("060268");
		products.setProductNetPrice(456);
		products.setProductEntDate(java.sql.Date.valueOf("2017-11-15"));
		products.setProductUpdDate(java.sql.Date.valueOf("2017-11-15"));
		products.setProductPurchaseSlno(101);
	    products.setProductSlno(50);
		products.setProductDesc("Circular Sawblade");
	}
	
	
	@Test
	public void getAllProductsTest() throws Exception {
		List<Products> products = new ArrayList<Products>();
		products.addAll(products);
		
		given(productRepo.findAll()).willReturn(products);
		mvc.perform(get("/Products").accept(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isOk())
				.andExpect(jsonPath("$[0].ProductSlno", is(1)))
				.andExpect(jsonPath("$[0].ProductSku", is("060268")))
				.andExpect(jsonPath("$[0].ProductPurchaseSlno", is(101)))
				.andExpect(jsonPath("$[0].ProductDesc", is("CircularSawblade"))) 
				.andExpect(jsonPath("$[0].ProductNetPrice", is(467)));
		}

}

