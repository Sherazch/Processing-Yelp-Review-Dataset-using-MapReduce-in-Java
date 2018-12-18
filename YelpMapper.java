package YelpLab;
import java.io.IOException;
import org.apache.hadoop.mapreduce.*;
import org.json.JSONException;
import org.json.JSONObject;
import org.apache.hadoop.io.*;

public class YelpMapper extends
    Mapper<LongWritable, Text, Text, IntWritable> {
  public void map(LongWritable key, Text value, Context context)
      throws IOException, InterruptedException{
  try{
	  JSONObject jsn=new JSONObject(value.toString());
	  //String user_id=(String)jsn.get("user_id");
	  String business_id=(String)jsn.get("business_id");
	  int star=(Integer)jsn.get("stars");
	  context.write(new Text(business_id+",\t"+star), new IntWritable(1));
  }catch(JSONException e) {e.printStackTrace();}
	  }
    }
  
