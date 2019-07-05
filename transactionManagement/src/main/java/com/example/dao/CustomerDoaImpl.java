package com.example.dao;

import javax.sql.DataSource;
import javax.swing.text.DefaultEditorKit.CutAction;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.model.Address;
import com.example.model.Customer;

public class CustomerDoaImpl implements CustomerDao {

	
	private DataSource dataSource;
	
	
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}



	@Override
	public void create(Customer customer) {
	
		
		
		
		String queryCustomer="insert into customer values(?,?)";
		
		String queryAddress="insert into address values(?,?,?)";
		
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(queryCustomer, new Object[]
				{
					customer.getId(),
					customer.getName()
					
						
				});
		System.out.println(" Inserted into customer table successfully..");
		
		jdbcTemplate.update(queryAddress,new Object[]
				
				{
						customer.getId(),
						customer.getAddress().getAddress(),
						customer.getAddress().getCountry()
						
				});
		System.out.println("Inserted into address table successfully..");
	}

}
