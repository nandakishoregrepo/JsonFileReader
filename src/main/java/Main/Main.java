package Main;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import Utils.ReadJson;

public class Main {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		ReadJson obj = new ReadJson();
	//	obj.ReadJsonFile("brightnessLevel", "defaultValue");	
		System.out.println(obj.ReadJsonFile("routingServer", "defaultValue","Compass" ));
	}

}
