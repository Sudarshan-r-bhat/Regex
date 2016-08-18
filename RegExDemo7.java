/*
 * Write regular expression to represent all 10-digit mobile numbers
 *  Rules:
 *  every number should contain exactly 10digits
 *  the fist digit should be exactly 7 or 8 or 9
 *  Answer: [7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]
 *  					OR
 * 					[7-9][0-9]{9}
 * 						OR
 * 					[789][0-9]{9}
 * 10 digit or 11 digit:
 * if the number contains 11 digit the the first digit should be 0
 *    				0?[7-9][0-9]{9}
 * 10 digit or 11 digit or 12 digit:
 * if the number contains 12 digits then the first two dogots should be 91
 * 					(0|91)?[7-9][0-9]{9}
 * 
 * 
 * Write a regular expression to represent all valid mail id's-----------1st character should be alphanumeric
 * 	[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+ 
 * Only Gmail ID's
 * 	[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail[.]com
 * 
 * 
 * Write a regular expression to represent all valid java language identifiers
 * Rules:
 * the allowed characters are a-z,A-Z,0-9,# and $
 * the length of identifier should be at least 2
 * the 1st character should be the lower case alphabetical symbol from a to k
 * the 2nd character should be disit divisible by 3(0,3,6,9)
 * 			[a-k][0369][a-zA-Z0-9#$]*
 * regular expression to represent all names starts with a|A
 * 			[aA][a-zA-Z]*
 * regular expression to represent all names ends with l or L
 * 			[a-zA-Z]*[lL]
 * regular expression to represent all names starts with a or A and ends with l or L
 * 			[aA][a-zA-Z]*[lL]
 */
public class RegExDemo7 {

	public static void main(String[] args) {
		
	}

}
