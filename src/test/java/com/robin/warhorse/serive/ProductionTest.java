package com.robin.warhorse.serive;

import java.math.BigDecimal;

import javax.annotation.Resource;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.robin.warhorse.business.domain.Production;
import com.robin.warhorse.business.service.IProductionService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={  
		"classpath:applicationContext-*.xml"
	  }  )
@TransactionConfiguration(defaultRollback = false)  
public class ProductionTest extends AbstractTransactionalJUnit4SpringContextTests{ 
	@Resource(name="productionService")
	private IProductionService productionService;
	@Before  
	 public void setUp() throws Exception {  
		System.out.println("===============SetUp==================");
	 }  
	   
	   
	 @After  
	 public void tearDown() throws Exception {  
		 System.out.println("===============TearDown==================");
	 }  
	@Test
	@Rollback(true)
    public void testSave() {
    	Production p = new Production(14,"Mac",new BigDecimal(2222),"Good");
    	Assert.assertEquals(true, productionService.saveProduction(p));
    }

}
