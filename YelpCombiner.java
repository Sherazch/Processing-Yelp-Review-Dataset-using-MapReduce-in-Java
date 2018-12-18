package YelpLab;
import java.io.IOException;
import java.util.PriorityQueue;

import org.apache.hadoop.mapreduce.*;
import org.apache.hadoop.io.*;

public class YelpCombiner extends
    Reducer<Text, IntWritable, Text, IntWritable> {
  public void reduce(Text key, Iterable<IntWritable> values, Context context)
      throws IOException, InterruptedException {
   
	  int partialsum=0;
   for(IntWritable i:values) {
	   partialsum+=i.get();
   }
   context.write(key, new IntWritable(partialsum));
   
    
  }
}