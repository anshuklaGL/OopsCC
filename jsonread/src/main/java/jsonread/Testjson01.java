package jsonread;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class Testjson01 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub

		Map<String, Map<String, String>> InputGroup = new LinkedHashMap<String, Map<String, String>>();

		Map<String, String> fieldMap = new LinkedHashMap<String, String>();

		// parsing file "JSONExample.json"
		Object obj = new JSONParser()
				.parse(new FileReader("D:\\self\\GL\\OopsCC\\jsonread\\src\\main\\resources\\samplejson01.json"));
		JSONObject jobj = (JSONObject) obj;
		// JSONArray array = (JSONArray)obj;
		String jsonobj = jobj.toJSONString();
		System.out.println(jsonobj);
		JSONArray srcDetails = (JSONArray) ((JSONObject) jobj).get("MappletDetails");
		JSONObject jobj1 = (JSONObject) (srcDetails.get(0));
		JSONArray FieldInputGroup  = (JSONArray) ((JSONObject) jobj1).get("FieldInputGroup");
		System.out.println(FieldInputGroup);
		JSONArray FieldOuputGroup  = (JSONArray) ((JSONObject) jobj1).get("FieldOutputGroup");
		System.out.println(FieldOuputGroup);
		// Test01

		Iterator itr2 = FieldInputGroup.iterator();

		FieldInputGroup.size();

		while (itr2.hasNext()) {

//			JSONObject jobj2 = (JSONObject) itr2.next();
//			JSONObject jobj3 = (JSONObject) jobj2.get("Fields");
//			fieldMap.putAll((Map) jobj3);
//			System.out.println(fieldMap.size());
//			for(Map.Entry<String, String> entry : fieldMap.entrySet()) {
//			System.out.println(entry.getKey()+"::"+entry.getValue());
//			}
			// Prase nested database object inside tableNames array.
            JSONObject dbObj = (JSONObject) itr2.next();
            //System.out.println(dbObj);
            
            InputGroup.put(dbObj.get("Name").toString(), (Map)dbObj.get("Fields"));
			

		}
		System.out.println(InputGroup.size());
		for(Entry<String, Map<String, String>> entry : InputGroup.entrySet()) {
			System.out.println(entry.getKey()+"::"+entry.getValue());
			}

	}
}
