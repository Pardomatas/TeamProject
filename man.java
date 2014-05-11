
public class man {
	public man(String com){
		System.out.println(f(com));
	}
	public String f(String s){
		String output = s;
		switch (s){
			case " ls":
				output = "This is the command to list files and folders\nTo use it just type ls";
				break;
			case " dir":
				output = "This is the command to list files and folders\nTo use it just type dir";
				break;
			case " man":
				output = "This is the command to show the manual page for a command"
						+ "\nTo use it type man first then the command you want to know for example:man ls";
				break;
			case " mkdir":
				output = "This is the command to create a directory"
						+ "\nTo use it type mkdir first then the name you want the directory to be for example:mkdir example";
				break;
			case " mv":
				output = "This is the command to rename a file or move file to a directory\nTo use it you first type mv "
						+ "\nthen the file you want to rename or move "
						+ "\nthen the name you want to change the file to or put the directory you want to move it to"
						+ "\nif you put the name second then the third part you put the directory you want to move it to with the changed name"
						+ "\nfor example:"
						+ "\n\tmv test.txt bin/test.txt(or test2.txt)"
						+ "\n\tmv test.txt test2.txt bin/test2.txt";
				break;
			case " pwd":
				output = "This is the command to display the name of current/working directory from root C\nTo use it just type pwd";
				break;
			case " rm":
				output = "This command will delete a file. To use just type rm and the file that you would like to delete.\nExample: rm test.txt";
				break;
			case " rmdir":
				output = "This command will delete an empty directory. It will not delete the dictionary if it has any files within it. "
						+ "\nTo use just type rmdir and the name of the directory you would like to delete. "
						+ "\nExample: rmdir test";
			case " tail":
				output = "This command will display only the last 10 lines of the selected file."
						+ "\nTo use just type tail and the file you would like to read from."
						+ "\nExample: tail read.txt";
			case " u":
				output = "This command displays the last line that was typed into the prompt."
						+ "\nTo use just type u.";
			case " wc":
				output = "This command counts the number of lines, words, or characters within a selected file."
						+ "\nHow to count lines: wc -l test.txt"
						+ "\nHow to count words: wc -w test.txt"
						+ "\nHow to count characters: wc -m test.txt";
		}
		return output;
	}

}