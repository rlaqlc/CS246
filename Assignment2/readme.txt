Collections and Interfaces Assignment

Overview

Create a Java program that can identify Gospel topics in a text file.

A list of Gospel topics, along with associated keywords is provided. Your program should load this list of topics and then parse through a directory of text files. For each file, the program should display the name of the text file, along with a list of topics referenced by that file (a topic is "referenced" if the text file contains any of its keywords). Keywords are not case sensitive, and should be found even if they are adjacent to punctuation.

Instructions

Basic Instructions (to get 85%)

    Create at least two classes (e.g., Topic and Finder)

    Begin by passing the name of the topics file, and the name of the directory as command line parameters.

    The Finder class should have a static main method, which should instantiate a Finder object, and call a non-static method (e.g., "run" or something similar). You should not have any static methods besides main.

    Parse a list of topics from a file, each one containing a list of keywords. Store these as separate "Topic" objects, put into some type of collection.

    Parse a directory of files. For each file, list the file name, and then all topics referenced in that file.

    See attached for a zip file containing a topics file, and a directory of text files.

    Use good style and design throughout.

    Collaborate and identify collaborators in a comment at the top of your Finder class.

Additional Instructions (for the last 15%)

    (5%) Include proper JavaDoc comments for each method.
    (5%) Create an executable JAR file, that can be run via something like:
        java -jar myProject.jar topics.txt /tmp/myDirectory
    (5%) Rather than passing the topics file and the directory on the commandline:
        Store these two items in a properties file (e.g., "finder.properties")
        Pass the location of the properties file on the commandline.
    (5% extra credit) Rather than pass the name of the properties file on the command line, assume that it has the name "finder.properties". For the location of this properties file, the user should set a system property on the command line. In other words, the user will supply the directory name (via a system property), and the program will then look in that directory for a file named "finder.properties".

Reminders

    Topic class should store 
