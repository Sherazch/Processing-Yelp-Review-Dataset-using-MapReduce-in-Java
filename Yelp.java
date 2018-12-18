package YelpLab;

import org.apache.hadoop.mapreduce.*;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.*;
import org.apache.hadoop.fs.*;


public class Yelp {
	
	public static void main(String[]args) throws Exception{
		
		Configuration config=new Configuration();
		
		Job job=Job.getInstance(config, "Yelp Star Count");
		job.setJarByClass(Yelp.class);
		job.setMapperClass(YelpMapper.class);
		job.setReducerClass(YelpReducer.class);
		
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(IntWritable.class);
		
		System.exit(job.waitForCompletion(true) ? 0 : 1);
		
		
	}
	

}
