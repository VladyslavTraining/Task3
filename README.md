# Task3
1.	Create a WeekDay enum, where day of week corresponds to int value. 
a.	Create a console application, that gets one command-line argument:
•	If the argument is String - just prints whether given day is “working day” or a “weekend”;
•	If the argument is int - the same as above + prints name of corresponding day of week;
b.	2. Write a .cmd file, that runs your application several times with following arguments:
•	Valid input: (String: work day, weekend. Int: work day, weekend) (4 cases)
•	Invalid input: 
	String: non-existing day, empty string (2 cases)
	Int: smaller than smallest index, bigger, than largest index (2 cases)
	Value of type: Double. (1 case)
	Wrong number of arguments (zero, more than one).(2 cases)
2.	Write three methods, that work with upper-bounded, lower-bounded and unbounded wildcards in non-generic class. Write code, that proves their behavior in several cases (comment lines, that don’t compile; add short description for the reason of it in the comment).
3.	Try to create overloaded function, that differs only by generic parameter (e.g., List<String> and List<Integer>). Does it compile? Why?
