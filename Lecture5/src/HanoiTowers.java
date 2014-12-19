/*
 * 2.3 c) Hanoi towers
A legend says that, somewhere in the East, near Hanoi, there is a temple. In the temple, there are 
three posts. In the posts, there are 64 discs of 64 different sizes. When the world was created, 
all the discs were in the first post; when all the discs are moved to the last post, the world will end.
The monks in the temple move the discs between posts, but they must obey two simple rules. First, 
only one disc can be moved at a time, from one post to another post (it cannot be left anywhere else). 
Last, but not least, a disc can only be placed on top of a bigger disc, never on top of a smaller disc. 
The smallest disc can be placed on any post (all other discs are bigger); the biggest disc can only be 
placed on an empty post.
Create a method that calculates the number of moves necessary to move a set of n Hanoi disks from the 
initial post to the last post. Hint: if you want to play monk yourself in order to better understand 
the problem, ask the lecturer for a “Hanoi envelope”.
 */
import java.util.Scanner;
public class HanoiTowers {

	public static void main(String[] args) {
		// Initializations & Declarations
		// ------------------------------
		HanoiTowers h = new HanoiTowers();
		Scanner importConsole = new Scanner(System.in);
		int x;
		int turns =0;
		
		// input
		// -----
		
		System.out.println("Input Number: ");
		x = importConsole.nextInt();
		
		// Calc
		// ----
		
		turns = h.countHanoiTurns(x+1, x, 0, 0);
		importConsole.close();
		
	} // end main
	
	public int countHanoiTurns(int x, int p1, int p2, int p3){
		
		int count = 0;
		if(x==3){
			p1--; // p1->p2
			p2++; 
			p1--; // p1->p3
			p3++;
			p2--; // p2->p3
			p3++;
			count+=6;
			System.out.println("p1:" + p1 +" p2:"+ p2 + " p3:" + p3);
			return count;
		}
		else{
			int p = p3;
			p1--; // p1->p2 
			p2++;
			System.out.println("p1:" + p1 +" p2:"+ p2 + " p3:" + p3);
			p3 = p1; // Re-orientate the Disc Movement Method 
			p1 = p2;
			p2 = p;
			count = countHanoiTurns(x-1, p1, p2, p3);	
		}		
		
		return count;
	} // end countHanoiTurns
} // end Class
		
		
		
		
		
/*		p1--; // p1->p2
		p2++;
		p3--; // p3->p1
		p1++;
		p3--; // p3->p2
		p2++;
		p1--; // p1->p2
		p2++;
*/		
		
		

