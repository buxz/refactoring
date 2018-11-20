package init.result;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** 
* Customer Tester. 
* 
* @author <Authors name> 
* @since <pre>11/20/2018</pre> 
* @version 1.0 
*/ 

public class CustomerTest {
	Customer customer ;
	Rental rental;


	@Before
public void before() throws Exception {
	customer = new Customer("bxz");
	rental = new Rental(new Movie("猛龙过江",2),3);
}

@After
public void after() throws Exception {

}

/** 
* 
* Method: addRental(Rental arg) 
* 
*/ 
@Test
public void testAddRental() throws Exception {
	customer.addRental(rental);
}

/** 
* 
* Method: getName() 
* 
*/ 
@Test
public void testGetName() throws Exception { 
	System.out.println(	customer.getName());
}

/** 
* 
* Method: statement() 
* 
*/ 
@Test
public void testStatement() throws Exception {
	System.out.println(customer.statement());

} 

/** 
* 
* Method: htmlStatement() 
* 
*/ 
@Test
public void testHtmlStatement() throws Exception { 
	System.out.println(customer.htmlStatement());
} 


/** 
* 
* Method: getTotalCharge() 
* 
*/ 
@Test
public void testGetTotalCharge() throws Exception {
	System.out.println(customer.getTotalCharge());
}

/** 
* 
* Method: getTotalFrequentRenterPoints() 
* 
*/ 
@Test
public void testGetTotalFrequentRenterPoints() throws Exception {
	System.out.println(customer.getTotalFrequentRenterPoints());
}


} 
