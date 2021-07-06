package com.vaishnavi.examples;

public class Auther implements Comparable<Auther>{
		
		public String authorName;
		public int totalBooks;
		
		
		public Auther()
		{
			this.authorName = "#UnknownAuthorName";
			this.totalBooks = 0;
		}
		
		public Auther(String authorName, int totalBooks) {
			super();
			this.authorName = authorName;
			this.totalBooks = totalBooks;
		}

		@Override
		public String toString() {
			return String.format("%20s %10d", this.authorName, this.totalBooks);
		}

		@Override
		public int compareTo(Auther another) {
			if(this.authorName.compareTo(another.authorName) > 0)
				return 1;
			else if(this.authorName.compareTo(another.authorName) < 0)
				return -1;
			else
				return 0;
		}
		

		
	}


