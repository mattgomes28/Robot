# Robot git Repo

Hey Tom, this is the git repository of the third assignment. As you've read in the assignment sheet, we'll be dealing with sensors in order to make a Lego robot move in strigt lines and avoid obstacles. I believe we have to use the iCommand class (provided by UoS) to control parts of the robot including the wheels and its sensors.

In addition, as you've seen in the marking scheme, we'll be getting more marks for using classes and method effectively - this means that we'll probably be creating classes for different objects, i.e theobstacle class, the line class etc...




### GUIDE FOR A WELL WRITTEN PROGRAM ~~~

This is a short guide demonstrating how I write my programs. I personally use all of these rules when writing any sort of program.

1 - Short lines. Most people say that each line of code shouldn't contain more than 80 characters. In my opinion that is still a bit long, so I take the more strict approach and I use at most 72 characters per line. Trust me, the code becomes much more readable as the code looks more blocky.

2 - Blank lines. Blocky code is the key of a well written program, for this reason, I usually skip either 1 or 2 lines when a block of code performs a different task - if a block of code is similar to another block of code (let's say a block A of code defines variables for output data, and a block B declares variables for input data) then I skip 1 line since they are both performing a similar task (in that case, both declaring variables). However, if two blocks of code perform completely different tasks then I skip 2 lines to separate both blocks of code (let's say block A defines a function to calculate an area and block B defines a function to say some words). Code would look something like this:

	#Output
	String time = null;
	String retult = null;

	#Input
	String useRName = null;
	int age;


	private void sayHello() {
		System.out.println("Hello");
	}


	private int getArea(x, y){
		return x*y;
	}

3 - Effective use of constants. To be honest with you tom, whenever I see a random number in my code I ask myself if it is a constant. If the same number is being used more than once in the code, or if you could potentially change this number in the program to acquire different yet relevant results, then this number is probably a constant.

4 - Comments everywhere. There's a simple rule I use: I always put a comments in lines of code I've just written. Although at the end you will end up with loads of comments in your code, you can oftem sherten them down or get rid of irrelevant comments. Trust me, if you write meaningful comments as you code, you won't have to remember what parts of your code does in the end since you've already documented it.