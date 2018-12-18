package YelpLab;
import java.io.IOException;
import java.util.PriorityQueue;

import org.apache.hadoop.mapreduce.*;
import org.apache.hadoop.io.*;

public class YelpReducer extends
    Reducer<Text, IntWritable, Text, IntWritable> {
  public void reduce(Text key, Iterable<IntWritable> values, Context context)
      throws IOException, InterruptedException {
  
	  int sum=0;
   for(IntWritable part_sum:values) {
	   sum+=part_sum.get();
   }
   context.write(key, new IntWritable(sum));
   
    
  }
}