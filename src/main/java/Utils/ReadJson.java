package Utils;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson  {

	
	public String ReadJsonFile(String ConfigType, String ConfigValue, String BackofficeType) throws IOException, ParseException	{
		
	JSONParser jsonparser = new JSONParser();
	FileReader reader;
	if (BackofficeType.equals("Path"))
		{
			 reader = new FileReader(".\\src\\test\\resources\\PathJsonFile\\Config.json");
		} else
		{
			 reader = new FileReader(".\\src\\test\\resources\\CompassJsonFile\\Config.json");
		}

	Object obj=  jsonparser.parse(reader);
	JSONObject ConfigObj =  (JSONObject)obj;
	JSONArray configArraySize = (JSONArray) ConfigObj.get("fields");
	
	Object Config_Value = "";
		for(int i=0;i<configArraySize.size();i++)
		{
			JSONObject Config =  (JSONObject) configArraySize.get(i);
			String ConfigFileType = (String) Config.get("id");
			if (ConfigFileType.equals(ConfigType))
				{
					Config_Value = (Object) Config.get(ConfigValue);
				}
		}

	return Config_Value.toString();
}
	
}
