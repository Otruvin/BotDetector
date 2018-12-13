package com.training.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.training.demo.dao.DatabaseManager;
import com.training.demo.entity.Click;
import com.training.demo.entity.MousePositionData;
import com.training.demo.entity.User;

@SpringBootApplication
public class ShopWithSomeApplication {

	private TimerTask timerTask = new TimerTask() {
		@Override
		public void run() {
			ArrayList<Click> clicks = DatabaseManager.getClicksInfo();
			ArrayList<MousePositionData> mousePositionData = DatabaseManager.getMoveMouseInfo();
			ArrayList<User> userInfo = DatabaseManager.getUserInfo();
			System.out.println();
		}
	};

	public void startTimer() {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(timerTask, 15000, 15000);
	}

	public static void main(String[] args) {
		ShopWithSomeApplication main = new ShopWithSomeApplication();
		main.startTimer();
		SpringApplication.run(ShopWithSomeApplication.class, args);
	}
}
