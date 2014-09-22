package com.onefoursix.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class HttpFsGetExample {

	public final static void main(String args[]) {
		
		if(args.length != 2){
			System.out.println("Usage java -cp target/httpfs-get-example.jar com.onefoursix.demo.HttpFsGetExample  <user> <HttpFs REST URL>");
			System.out.println("For example: java -cp target/httpfs-get-example.jar com.onefoursix.demo.HttpFsGetExample mark http://10.10.10.7:14000/webhdfs/v1/user/hive/warehouse/sample_07/sample_07");
			System.exit(1);
		}

		String user = args[0];
		
		String url = args[1];
		
		System.out.println("Getting resource: " + url + " for user: " + user);
		
		String fullUrl = url + "?op=OPEN&user.name=" + user;

		HttpClient client = HttpClientBuilder.create().build();
		
		org.apache.http.client.methods.HttpGet request = new org.apache.http.client.methods.HttpGet(fullUrl);

		try {
			HttpResponse response = client.execute(request);

			System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

			System.out.println("Result");
			System.out.println("******************************");
			
			String line = "";
			while ((line = rd.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println("******************************");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
