package com.example.demo.converters.productConverters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.example.demo.bindingmodel.AdressBindingModel;
import com.example.demo.bindingmodel.ProductBindingModel;
import com.example.demo.converters.adressConverters.AdressToAdressBindingModel;
import com.example.demo.entities.Adress;
import com.example.demo.entities.Product;

public class ProductToProductBindingModelTest {
	
	ProductToProductBindingModel converter;
	private final Long ID=1L;
	@Before
    public void setUp() throws Exception {
        converter = new ProductToProductBindingModel();

    }
	@Test
    public void testNullParamter() throws Exception {
        assertNull(converter.convert(null));
    }
	
	@Test
    public void testEmptyObject() throws Exception {
        assertNotNull(converter.convert(new Product()));
    }
	
	 @Test
	    public void convert() throws Exception {
	        //given
		 Product command = new Product();
	        command.setId(ID);
	        command.setCode("xad34");
	        command.setAvailable(true);
	        //when
	        ProductBindingModel product = converter.convert(command);

	        //then
	        assertNotNull(product);
	        assertEquals(ID, product.getId());
	        assertEquals("xad34", product.getCode());
	        assertEquals(true,product.isAvailable());

	    }
}
