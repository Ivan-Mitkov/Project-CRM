package com.example.demo.converters.saleConverters;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.bindingmodel.AccountBindingModel;
import com.example.demo.bindingmodel.ContactBindingModel;
import com.example.demo.bindingmodel.OpportunityBindingModel;
import com.example.demo.bindingmodel.SaleBindingModel;
import com.example.demo.converters.accountConverters.AccountBindingModelToAccount;
import com.example.demo.converters.contactConverters.ContactBindingModelToContact;
import com.example.demo.converters.employeeConverters.EmployeeBindingModelToEmployee;
import com.example.demo.converters.productConverters.ProductBindingModelToProduct;
import com.example.demo.entities.Account;
import com.example.demo.entities.Contact;
import com.example.demo.entities.Opportunity;
import com.example.demo.entities.Sale;
import com.example.demo.enums.Status;

public class SaleBindingModelToSaleTest {

	SaleBindingModelToSale converter;
	
	@Test
    public void testNullObject() throws Exception {
        assertNull(converter.convert(null));
    }
	@Test
    public void testEmptyObject() throws Exception {
        assertNotNull(converter.convert(new SaleBindingModel()));
    }
	@Test
    public void convert() throws Exception {
		 //given
		SaleBindingModel model=new SaleBindingModel();
		model.setId(1l);
		model.setClosedAt(LocalDate.now());
		
		
		
		 //when
		Sale opp=converter.convert(model);
		
		//then
		assertNotNull(opp);
	}
	
	
}
