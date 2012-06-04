package com.robin.warhorse.business.domain;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

public class Production {
	
	public Production(){
		
	}
	
	public Production(int id,String name,BigDecimal price,String detail){
		this.productionid = id;
		this.productionname = name;
		this.price = price;
		this.detail = detail;
	}
	
	private @Setter @Getter int productionid;
	private @Setter @Getter String productionname;
	private @Setter @Getter BigDecimal price;
	private @Setter @Getter String detail;
	
	public String toString(){
		return "ID:"+ productionid +" ProductionName:" + productionname + " Price:" + price + " detail:" + detail;
	}
	
}

