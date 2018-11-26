package com.training.demo.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.demo.entity.Click;
import com.training.demo.entity.Response;

@RestController
@RequestMapping("/clickManage")
public class ControllerSendClicksInfo {
	
	private static final String urlDb = "jdbc:clickhouse://localhost:8123/clicksDB";
	private Connection connect;
	
	@GetMapping(value = "/getSendedData")
	public String getSendedData()
	{	 
		return "Done";
	}
	
	@PostMapping(value = "/sendData")
	public Response sendInfo(@RequestBody Click click) throws SQLException
	{
		Response response = new Response("Done", click);

		connect = DriverManager.getConnection(urlDb);
		String query = "insert into clicks values (toDate(now())," +
				" toDateTime(now()), '" + click.getNamePage() + "'," +
				" '" + click.getNameBanner() + "', " + click.getHeightBanner() + 
				", " + click.getWidthBanner() + ", " + click.getClickedCoordX() + 
				", " + click.getClickedCoordY() + "," +
				" '" + click.getIpClient() + "');";
		Statement statement = connect.createStatement();
		statement.executeQuery(query);
		System.out.println("Info about click sended to db");
		return response;
	}
	
	
}
