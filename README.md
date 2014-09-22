httpfs-get-example
==================

Simple example of calling an HttpFs REST Url to get a file from HDFS from Java 


####Building the project
To build the project, execute the command:

	$ mvn clean package

from the root of the project directory. 

####Running the project
To run the project, execute a command of the form:

	$ java -cp target/httpfs-get-example.jar com.onefoursix.demo.HttpFsGetExample  <user> <HttpFs REST URL>
		
For example, to get the file `/user/hive/warehouse/sample_07/sample_07`as the user 'mark': 

        $ java -cp target/httpfs-get-example.jar com.onefoursix.demo.HttpFsGetExample mark http://10.10.10.7:14000/webhdfs/v1/user/hive/warehouse/sample_07/sample_07
			
from the root of the project directory. 
