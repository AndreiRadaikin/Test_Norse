# Test_Norse
tasks
1. строка содержит скобки открывающиеся и закрывающиеся, она является нормализованной если 
   скобки открываются и закрываются в правильном порядке
   String contains opening and closing brackets, shoud return true if brackets in correct order.
   
   Пример/Example: 
   g{fsdfg}s - true
   g{f(sd)fg}s - true
   {g{fsdfg}s - false
   {{[cc(c)ggg]}ssss} - true
   {{[cc(c)ggg]}ssss}{ - false

2. Есть два отсортированных массива, необходимо объеденить в один отсортированный массив.
   There are two sorted arrays, combine into one sorted array.
   Пример/Example:
    a1 [1,3,6,8,9]
	a2 [1,2,4,5]
	
	r  [1,1,2,3,4,5,6,8,9]

3. С помощью двух стэков сделать реализацию очереди.
   Make a queue realisation with two stacks.
