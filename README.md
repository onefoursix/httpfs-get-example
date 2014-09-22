httpfs-get-example
==================

Simple example of calling an HttpFs REST Url to get a file from HDFS from Java 

See [here](http://hadoop.apache.org/docs/r2.4.0/hadoop-project-dist/hadoop-hdfs/WebHDFS.html) for docs on the WebHdfs API


####Building the project
To build the project, execute the command:

	$ mvn clean package

from the root of the project directory. 

####Running the project
To run the project, execute a command of the form:

	$ java -cp target/httpfs-get-example.jar com.onefoursix.demo.HttpFsGetExample  <user> <HttpFs REST URL>
		
For example, to get the file `/user/hive/warehouse/sample_07/sample_07` from an HttpFs Server listening on `http://10.10.10.7:14000` as the user `mark` you would execute a command like this: 

        $ java -cp target/httpfs-get-example.jar com.onefoursix.demo.HttpFsGetExample mark http://10.10.10.7:14000/webhdfs/v1/user/hive/warehouse/sample_07/sample_07
			
from the root of the project directory. 

Here is some sample output:

`$ java -cp target/httpfs-get-example.jar com.onefoursix.demo.HttpFsGetExample mark http://10.10.10.7:14000/webhdfs/v1/user/hive/warehouse/sample_07/sample_07
Getting resource: http://10.10.10.7:14000/webhdfs/v1/user/hive/warehouse/sample_07/sample_07 for user: mark
Response Code : 200
Result
******************************
00-0000	All Occupations	134354250	40690
11-0000	Management occupations	6003930	96150
11-1011	Chief executives	299160	151370
11-1021	General and operations managers	1655410	103780
11-1031	Legislators	61110	33880
11-2011	Advertising and promotions managers	36300	91100
11-2021	Marketing managers	165240	113400
11-2022	Sales managers	322170	106790
11-2031	Public relations managers	47210	97170
11-3011	Administrative services managers	239360	76370
11-3021	Computer and information systems managers	264990	113880
...
`
