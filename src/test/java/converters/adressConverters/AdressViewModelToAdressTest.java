package converters.adressConverters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.example.demo.bindingmodel.AdressBindingModel;
import com.example.demo.converters.adressConverters.AdressToAdressBindingModel;
import com.example.demo.converters.adressConverters.AdressToAdressViewModel;
import com.example.demo.converters.adressConverters.AdressViewModelToAdress;
import com.example.demo.entities.Adress;
import com.example.demo.viewmodel.AdressViewModel;

public class AdressViewModelToAdressTest {
	
	 AdressViewModelToAdress converter;
	private final Long ID=1L;
	@Before
    public void setUp() throws Exception {
        converter = new  AdressViewModelToAdress();

    }
	@Test
    public void testNullParamter() throws Exception {
        assertNull(converter.convert(null));
    }
	
	@Test
    public void testEmptyObject() throws Exception {
        assertNotNull(converter.convert(new AdressViewModel()));
    }
	
	 @Test
	    public void convert() throws Exception {
	        //given
		 AdressViewModel command = new AdressViewModel();
	        command.setId(ID);
	        command.setCountry("Bulgaria");

	        //when
	        Adress adress = converter.convert(command);

	        //then
	        assertNotNull(adress);
	        assertEquals(ID, adress.getId());
	        assertEquals("Bulgaria", adress.getCountry());

	    }
}
