package basicsPrgms;

public class getCentury {
	//Get Century from the year
		public  int getCenturyFromYear(int year) {
			if(year%100 == 0) {
				year = (year/100);
			}else {
				year = (year/100)+1;
			}
			 return year;
		}

}
