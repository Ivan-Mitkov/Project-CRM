package converters.adressConverters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.example.demo.bindingmodel.AdressBindingModel;
import com.example.demo.converters.adressConverters.AdressToAdressBindingModel;
import com.example.demo.entities.Adress;

public class AdressToAdressBindingModelTest {
	
	AdressToAdressBindingModel converter;
	private final Long ID=1L;
	@Before
    public void setUp() throws Exception {
        converter = new AdressToAdressBindingModel();

    }
	@Test
    public void testNullParamter() throws Exception {
        assertNull(converter.convert(null));
    }
	
	@Test
    public void testEmptyObject() throws Exception {
        assertNotNull(converter.convert(new Adress()));
    }
	
	 @Test
	    public void convert() throws Exception {
	        //given
		 Adress command = new Adress();
	        command.setId(ID);
	        command.setCountry("Bulgaria");

	        //when
	        AdressBindingModel adress = converter.convert(command);

	        //then
	        assertNotNull(adress);
	        assertEquals(ID, adress.getId());
	        assertEquals("Bulgaria", adress.getCountry());

	    }
}
