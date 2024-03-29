/*
Author: Jumanazar Saidov
Date: 2021.11.15
Link: https://www.hackerrank.com/challenges/tag-content-extractor/problem
Definition:
In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end tag
like <tag>contents</tag>. Note that the corresponding end tag starts with a /.

Given a string of text in a tag-based language, parse this text and retrieve the contents
enclosed within sequences of well-organized tags meeting the following criterion:

1. The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> is not valid,
because the text starts with an h1 tag and ends with a non-matching h2 tag.

2. Tags can be nested, but content between nested tags is considered not valid.
For example, in <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.

3. Tags can consist of any printable characters.

Input Format

The first line of input contains a single integer, N (the number of lines).
The N subsequent lines each contain a line of text.

Constraints
- 1 <= N <= 100
- Each line contains a maximum of 10000 printable characters.
- The total number of characters in all test cases will not exceed 1000000.

Output Format

For each line, print the content enclosed within valid tags.
If a line contains multiple instances of valid content,
print out each instance of valid content on a new line;
if no valid content is found, print None.

Sample Input

4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>

Sample Output

Nayeem loves counseling
Sanjay has no watch
So wait for a while
None
Imtiaz has a secret crush

 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContentExtractor{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            //Write your code here
            String start = "", end = "", content="", temp = "", nestedStart = "", nestedEnd="";
            while(line.length() > 0){
                int startTag = line.indexOf("<");
                int endTag = line.indexOf(">");
                if(line.contains("<") && line.charAt(startTag+1) != '/' && endTag-1 != startTag){
                    start = line.substring(startTag+1, endTag);
                    line = line.substring(endTag+1);
                }
                else if(startTag+1 == endTag){
                    line = line.substring(endTag+1);
                    //System.out.println("None: " + line);
                    if(line.contains("<")){
                        continue;
                    }

                }

            startTag = line.indexOf("<");
            endTag = line.indexOf(">");

            if(line.contains("<") && line.charAt(startTag+1) == '/'){
                end = line.substring(startTag+2, endTag);
                if(start.equals(end)){
                    content = line.substring(0, startTag);
                    temp = temp.concat(content);
                    System.out.print(content + " ");
                }

                line = line.substring(endTag+1);
            }

            else if(line.contains("<") && line.charAt(startTag+1) != '/'){
                nestedStart = line.substring(startTag+1, endTag);
                if(!start.equals(nestedStart)){
                    // nestedTag
                    line = line.substring(endTag+1);


                    startTag = line.indexOf("<");
                    endTag = line.indexOf(">");

                    if(line.contains("<") && line.charAt(startTag+1) == '/'){
                        nestedEnd = line.substring(startTag+2, endTag);
                        if(nestedStart.equals(nestedEnd)){
                            content = line.substring(0, startTag);
                            temp = temp.concat(content);
                            System.out.print(content + " ");
                        }
                        line = line.substring(endTag+1);
                    }
                    else{
//                        System.out.print("None");
                        // break;
                    }

                }

            }

        }
        if(temp.length() > 0){
            System.out.println();
            temp = "";
        }
        else{
            System.out.println("None");
        }

        int tagLen = 0;
        testCases--;
        }
    }
}



