**Centennial College**

**COMP 228: Java Programming**

**Lab Assignment 6: Developing Multithreaded Applications using Java
Multithreading API and Collections API.**

**Student:**
\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

Due Date: End of Week 13.

Purpose: The purpose of this Lab assignment is to:

- Practice Multithreaded application development.

- Develop a Multithreaded GUI Java application using Collection API.

References: Read the textbook, ppt slides, and consult references (if
any).

This material provides the necessary information you need to complete
the exercises.

Be sure to read the following general instructions carefully:

This lab should be completed individually by all the students.

YOU NEED TO SUBMIT THE FOLLOWING 2 DOCUMENTS IN THE DROPBOX TITLED LAB6:

1\. THE FIRST ONE IS A WORD DOCUMENT. USE THIS DOCUMENT AND ADD SCREEN
SHOTS OF THE RUNNING STATE OF EACH EXERCISE (If there are more than 1
exercise). DO NOT DELETE THE QUESTIONS. THE SCREEN SHOTS SHOULD FOLLOW
EACH QUESTION AND COVER ALL THE ASPECTS/FUNCTIONALITIES OF EACH
EXERCISE. AFTER THE SCREEN SHOTS PLEASE COPY THE CODE FROM THE CODE
WINDOW AND PASTE THE COMPLETE CODE. DO NOT GIVE ME SCREEN SHOTS OF THE
CODE. DO NOT ZIP THIS FILE AND KEEP IT SEPARATE FROM YOUR ZIPPED PROGAM
FILE.

2\. SUBMIT ALSO ONE ZIPPED PROJECT FILE THAT CONTAINS ALL THE EXERISES
SEPARATELY INTO THE SAME DROP BOX.

This material provides the necessary information you need to complete
the exercises.

> You must name your Eclipse project according to the following rule:
>
> **YourFullName_COMP228Labnumber**
>
> Example: **JohSmith_COMP228Lab6**
>
> Each exercise should be placed in a separate package named
> *exercise1*, *exercise2*, etc.
>
> Submit your assignment in a **zip file** that is named according to
> the following rule:
>
> **YourLastName_COMP228Labnumber.zip**
>
> Example: **JohSmith_COMP228Lab6.zip**
>
> Apply the naming conventions for variables, methods, classes, and
> packages:
>
> \- *variable names* start with a *lowercase* character
>
> \- *classes* start with an *uppercase* character
>
> \- **packages** use only *lowercase* characters
>
> \- *methods* start with a *lowercase* character

### **<u>Exercise 1:</u>**

This exercise is similar to PrintTask example from Week 12.

Write a Java application that handles multiple ATM transactions
(withdraw, deposit) at the same time. Create an **Account** class and
implement both **deposit** and **withdraw** operations. Synchronize the
operations to allow thread synchronization. Use Java Runnable interface
to implement a **Transaction** class. Perform **withdraw** and deposit
**operations** in **run** method.

Create an **AccountTest** class to test multiple transactions (threads).
Use an ArrayList to create a list of three or more Transaction objects.
Use method **execute** of ExecutorService to execute the threads.
Display the results.

> (10 marks)

**Evaluation:**

<table>
<colgroup>
<col style="width: 50%" />
<col style="width: 49%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Functionality</strong></th>
<th></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><blockquote>
<p>Correct implementation of Multithreading</p>
</blockquote></td>
<td>50%</td>
</tr>
<tr class="even">
<td><blockquote>
<p>Correct implementation of Collections API</p>
</blockquote></td>
<td>30%</td>
</tr>
<tr class="odd">
<td><blockquote>
<p>Comments, correct naming of variables, methods, classes, etc.</p>
</blockquote></td>
<td>5%</td>
</tr>
<tr class="even">
<td><strong>Friendly input/output</strong></td>
<td>15%</td>
</tr>
<tr class="odd">
<td><strong>Total</strong></td>
<td>100%</td>
</tr>
</tbody>
</table>
