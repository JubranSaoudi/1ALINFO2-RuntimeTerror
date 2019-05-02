package edu.fundup.services.implementation;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import edu.fundup.entites.Animaux;
import edu.fundup.entites.Etat;

public class tsst {
	   public static String sendRequest(String url) {
	        String result = "";
	        try {
	            HttpClient client = new DefaultHttpClient();
	            HttpParams httpParameters = client.getParams();
	            HttpConnectionParams.setConnectionTimeout(httpParameters, 5000);
	            HttpConnectionParams.setSoTimeout(httpParameters, 5000);
	            HttpConnectionParams.setTcpNoDelay(httpParameters, true);
	            HttpGet request = new HttpGet();
	            request.setURI(new URI(url));
	            HttpResponse response = client.execute(request);
	            InputStream ips = response.getEntity().getContent();
	            BufferedReader buf = new BufferedReader(new InputStreamReader(ips,"UTF-8"));
	            StringBuilder sb = new StringBuilder();
	            String s;
	            while (true) {
	                s = buf.readLine();
	                if (s == null || s.length() == 0)
	                    break;
	                sb.append(s);
	            }
	            buf.close();
	            ips.close();
	            result = sb.toString();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return result;
	    }
	    public static void parseFromJSONResponse(String respo) 
	    {
	        JSONObject myjson;
	        JSONArray myArray;
	        Animaux animaux;
	        try 
	        {
	        	System.out.println(respo);
	            myjson = new JSONObject(respo);
	           // System.out.println(myjson.getBoolean("parsedPartially"));
	          //System.out.println( myjson.get("key"));
               System.out.println(myjson.get("message"));
	           // animaux = new Animaux(myjson.getString("key"), Etat.Example, 12.5, 5, "String", "String", 5);
                //System.out.println(myjson.getJSONArray("results"));
	            //JSONObject jsonObj1 = myjson.getJSONObject("SCIENTIFIC");
	            //JSONArray jsonObj2 = jsonObj1.getJSONArray("entry");
	            //JSONObject jsonObj3 = jsonObj2.getJSONObject(0);
	            //System.out.println(jsonObj3.getJSONObject("content"));
	            //System.out.println("here ===>>>"+jsonObj3.getJSONObject("content").get("$t").toString());
	        } 
	        catch (JSONException e) {
	            e.printStackTrace();
	        }
	    }   
	}

