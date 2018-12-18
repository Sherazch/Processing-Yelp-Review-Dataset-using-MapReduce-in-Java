# Processing-Yelp-Review-Dataset-using-MapReduce-in-Javs
A MapReduce program which takes review.json as input and for each business_id it outputs the number of reviews that are given to that business id with 5,4,3,2,1 stars 


We will take a sample of the yelp review dataset, explained below and for each business id find how many users gave that business 5,3,2, and 1 stars rating. 
 
The data is made available to public by Yelp and is in JSON format. Please go to https://www.yelp.com/dataset and click on “Download Dataset” then enter your name, email address, and your initials, check agree to dataset license and click on Download. You will be redirected to another page.  Click on “Download JSON” to download the dataset.   You can  read the documentation of the JSON dataset here: https://www.yelp.com/dataset/documentation/json .  The file that you will be using for this assignment is called review.json and it is about 4.2 GB. This file contains a sample of reviews given by users to each business and includes the business and user ids. 
 
 We You need to write a MapReduce program which takes review.json as input and for each business_id it outputs the number of reviews that are given to that business id with 5,4,3,2,1 stars . Your output should be in the following format: 
 
<business_id> <stars>  <review_count> 
