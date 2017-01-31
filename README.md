# Stopwatch tasks by Pimwalun Witchawanitchanun (5910546686)
I ran the tasks on a ASUS, and got these results:

Task                                  | Time
--------------------------------------|--------------:
Append 50,000 chars to String         | 1.185997 sec
Append 100,000 chars to String        | 5.732071 sec
Append 100,000 chars to StringBuilder | 0.006582 sec
Add 1 billion double using array  	  | 2.717643 sec 
Add 1 billion Double using array      | 12.137404 sec
Add 1 billion BigDecimal using array  | 18.902966 sec

## Explanation of Results

Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?

- Because when I append 100,000 chars to a String, String will be create new by also keeping the old value inside. It repeats again and again
  until the end of the inserted. Then String will build up as those numbers or more.The more numbers you input, the more time you spend. 


Why is appending to StringBuilder so much different than appending to String? What is happening to the String?

- Because when I input the value in StringBuilder, it is a class used better than class String. It can fix inside and change the value of the  
  String such as bringing String to connect to the end of the old one by using append() method. So, it is no need to make a new object of String  
  which it will help to reduce using the memory. It then can spend the time faster than using the normal String.
  
  
Explain difference in time to sum double, Double, and BigDecimal. Which is faster and why?

- The double is primitive therefore there is not any attributes or methods. For this reason, it spends the time for the fastest running.
  The second fast running is Class Double. It is slower than primitive double because it is an object consist of attributes or methods.
  Class BigDecimal is the slowest one because it is a class that stores a large data size. It has a lot of memory, so it runs more 
  slowly than double and Double.
