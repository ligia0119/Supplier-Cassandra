package edu.nus.cs4224.d8;

import java.math.BigDecimal;
import java.util.Date;

import com.datastax.driver.mapping.annotations.ClusteringColumn;
import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;

@Table(keyspace = "Supplier", name = "order_line")
public class OrderLine {
	@PartitionKey(0)
	private int ol_w_id;
	@PartitionKey(1)
	private int ol_d_id;
	@ClusteringColumn(0)
	private int ol_o_id;
	@ClusteringColumn(1)
	private int ol_number;
	private int ol_i_id;
	private Date ol_delivery_d;
	private BigDecimal ol_amount;
	private int ol_supply_w_id;
	
	private BigDecimal ol_quantity;
	private String ol_dist_info;
	
	public OrderLine(){
	}
	
	public OrderLine(int ol_w_id, int ol_d_id, int ol_o_id, int ol_number) {
		this.ol_w_id = ol_w_id;
		this.ol_d_id = ol_d_id;
		this.ol_o_id = ol_o_id;
		this.ol_number = ol_number;
	}
	
	public OrderLine(int ol_w_id, int ol_d_id, int ol_o_id, int ol_number, 
			int ol_i_id, BigDecimal ol_amount, int ol_supply_w_id, BigDecimal ol_quantity) {
		this.ol_w_id = ol_w_id;
		this.ol_d_id = ol_d_id;
		this.ol_o_id = ol_o_id;
		this.ol_number = ol_number;
		this.ol_i_id = ol_i_id;
		this.ol_amount = ol_amount;
		this.ol_supply_w_id = ol_supply_w_id;
		this.ol_quantity = ol_quantity;
	}
	
	public int getOl_w_id() {
		return ol_w_id;
	}
	public void setOl_w_id(int ol_w_id) {
		this.ol_w_id = ol_w_id;
	}
	public int getOl_d_id() {
		return ol_d_id;
	}
	public void setOl_d_id(int ol_d_id) {
		this.ol_d_id = ol_d_id;
	}
	public int getOl_o_id() {
		return ol_o_id;
	}
	public void setOl_o_id(int ol_o_id) {
		this.ol_o_id = ol_o_id;
	}
	public int getOl_number() {
		return ol_number;
	}
	public void setOl_number(int ol_number) {
		this.ol_number = ol_number;
	}
	public int getOl_i_id() {
		return ol_i_id;
	}
	public void setOl_i_id(int ol_i_id) {
		this.ol_i_id = ol_i_id;
	}
	public Date getOl_delivery_d() {
		return ol_delivery_d;
	}
	public void setOl_delivery_d(Date ol_delivery_d) {
		this.ol_delivery_d = ol_delivery_d;
	}
	public BigDecimal getOl_amount() {
		return ol_amount;
	}
	public void setOl_amount(BigDecimal ol_amount) {
		this.ol_amount = ol_amount;
	}
	public int getOl_supply_w_id() {
		return ol_supply_w_id;
	}
	public void setOl_supply_w_id(int ol_supply_w_id) {
		this.ol_supply_w_id = ol_supply_w_id;
	}
	public BigDecimal getOl_quantity() {
		return ol_quantity;
	}
	public void setOl_quantity(BigDecimal ol_quantity) {
		this.ol_quantity = ol_quantity;
	}
	public String getOl_dist_info() {
		return ol_dist_info;
	}

	public void setOl_dist_info(String ol_dist_info) {
		this.ol_dist_info = ol_dist_info;
	}
}
