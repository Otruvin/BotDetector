package com.training.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.training.demo.entity.Click;
import com.training.demo.entity.MousePositionData;
import com.training.demo.entity.User;

public class DatabaseManager {
	
	private static final String urlDb = "jdbc:clickhouse://localhost:8123/clicksDB";
	private static Connection connection;

	public static ArrayList<MousePositionData> getMoveMouseInfo() {

		ArrayList<MousePositionData> mouseInfo = new ArrayList<>();

		try {
			connection = DriverManager.getConnection(urlDb);
			String query = "SELECT * FROM moveMouse";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				String pageName = resultSet.getString("page_name");
				Double coord_x = resultSet.getDouble("mouse_coord_x");
				Double coord_y = resultSet.getDouble("mouse_coord_y");
				String userIp = resultSet.getString("ip_client");
				MousePositionData mpd = new MousePositionData(pageName, coord_x, coord_y, userIp);
				mouseInfo.add(mpd);
			}

			if (resultSet != null)
				resultSet.close();
			if (statement != null)
				statement.close();
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mouseInfo;
	}

	public static ArrayList<Click> getClicksInfo() {
		
		ArrayList<Click> clicks = new ArrayList<>();

		try {
			connection = DriverManager.getConnection(urlDb);
			String query = "SELECT * FROM clicksDB.clicks";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				String pageName = resultSet.getString("page_name");
				String bannerId = resultSet.getString("banner_id");
				String bannerHeight = resultSet.getString("banner_height");
				String bannerWidth = resultSet.getString("banner_width");
				String clickCoordX = resultSet.getString("click_coord_X");
				String clickCoordY = resultSet.getString("click_coord_Y");
				String clientIp = resultSet.getString("ip_client");
				Click click = new Click(pageName, bannerId, bannerHeight, bannerWidth, clickCoordX, clickCoordY,
						clientIp);
				clicks.add(click);
			}

			if (resultSet != null)
				resultSet.close();
			if (statement != null)
				statement.close();
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clicks;
	}

	public static ArrayList<User> getUserInfo() {
		
		ArrayList<User> userInfo = new ArrayList<>();

		try {
			connection = DriverManager.getConnection(urlDb);
			String query = "SELECT * FROM clicksDB.usrData";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				String userIp = resultSet.getString("ip_user");
				String browserCodeName = resultSet.getString("browser_code_name");
				String browserName = resultSet.getString("browser_name");
				String brouserVersion = resultSet.getString("browser_version");
				boolean cookiesEnabled = resultSet.getBoolean("cookies_enabled");
				String browserLanguage = resultSet.getString("browser_language");
				boolean browserOnline = resultSet.getBoolean("browser_online");
				String platform = resultSet.getString("platform");
				String userAgentHeader = resultSet.getString("user_agent_header");
				User user = new User(userIp, browserCodeName, browserName, brouserVersion, cookiesEnabled, browserLanguage, browserOnline, platform, userAgentHeader);
				userInfo.add(user);
			}

			if (resultSet != null)
				resultSet.close();
			if (statement != null)
				statement.close();
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userInfo;
	}
}
