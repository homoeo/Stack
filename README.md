# Stack
 


infix to post fix program using java

psedu code for infix to post fix expression 


1) create a stack class add push, pop, methods

2)  Rules for conversion of infix to post fix 

   a) No two operators of same priority can stay in stack.
       so pop the element from the stack and place the new element.

b) the element with lowest priority cant be placed on the top of the stack with a highest priority 
     so pop out 

the highest priroty element fromm the stack and place low prior element.

3) take the element from user input as infix expression 

4) use charAt method to extract character from string.

5) push the element to stack by checking the conditions using 
5 1) check whether stack is empty if then push the first element.
a) check top of the stack's prority no 
  - if top element priority no is same as element or greater
 than next element then pop out the top element stack and place the new element.

6) If element is a operhand (EX - a) 
print the letter or popped out element from the stack print on the screen.


