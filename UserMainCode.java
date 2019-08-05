import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class UserMainCode {
	
	//1. UniqueExistingCharacters
	public static String replacePlus(String stringOne,String stringTwo){
		String newStringOne = ""; //output string
		int length = stringOne.length();
		for(int i=0;i<length;i++){ //iterating through the first string
			char c = stringOne.charAt(i);
			char upperCase = Character.toUpperCase(c);
			char lowerCase = Character.toLowerCase(c);
			//Replacing those characters in the first string that were found in the second string with '+'
			if(stringTwo.indexOf(upperCase)== -1 && stringTwo.indexOf(lowerCase)== -1)
				newStringOne += '+';
			else
				newStringOne += c;
		}
		return newStringOne;
	}
	
	//2. UniqueEvenSum
	public static int addUniqueEven(int array[],int n){
		int evenSum = 0;
		Map evenNumbers = new HashMap();
		
		for(int i=0;i<n;i++){
			if(array[i]%2 == 0){ //check for even number
				if(!evenNumbers.containsKey(array[i])){ //check for duplicate elements
					evenSum += array[i];
					evenNumbers.put(array[i], 1);
				}
			}
		}
		if(evenSum > 0)
			return evenSum;
		return -1;
	}
	
	//3. StringOccurences
	public static int countNoOfWords(String stringOne, String stringTwo){
		int count = 0;
		String key = "";
		
		//Splitting the string into words 
		String words[] = stringOne.split(" ");
		
		//Extracting the second word of the second string
		String k[] = stringTwo.split(" ");
		key = k[1];
		
		//Search for String key in first sentence
		for(int i=0;i<words.length;i++){
			if(words[i].equals(key))
				count++;
		}
		return count;
	}
	
	//4. ArrayListManipulation
	public static ArrayList<Integer> generateOddEvenList(ArrayList<Integer> arrayListOne, ArrayList<Integer> arrayListTwo,int n){
		ArrayList<Integer> outputList = new ArrayList<Integer>(n);
		for(int i=0;i<n;i++){
			if(i%2 == 0) //Select even position elements of array 2
				outputList.add(arrayListTwo.get(i));
			else  //Select odd position elements of array 1
				outputList.add(arrayListOne.get(i));
		}
		return outputList;
	}
	
	//5. MasteringHashMap
	public static int getAverageOfOdd(HashMap<Integer,Integer> map){
		int sum=0;
		int n=0;
		
		Iterator iter = map.entrySet().iterator();
	    while (iter.hasNext()) {
	        Map.Entry pair = (Map.Entry)iter.next();
	        int key = (int)pair.getKey();
	        int value = (int)pair.getValue();
	        if(key%2 != 0){ //extracting only odd elements
	        	sum += value;
	        	n++;
	        }
	    }
		int average = sum/n;
		return average;
	}
	
	//6. Anagrams
	public static int getAnagram(String stringOne,String stringTwo){
		String modStringOne = "", modStringTwo = "";
		
		//Removing spaces from the two strings
		for(int i=0;i<stringOne.length();i++){
			char c = stringOne.charAt(i);
			if(c != ' ')
				modStringOne += c;
		}
		for(int i=0;i<stringTwo.length();i++){
			char c = stringTwo.charAt(i);
			if(c != ' ')
				modStringTwo += c;
		}
		
		modStringOne = sort(modStringOne);
		modStringTwo = sort(modStringTwo);
		if(modStringOne.equals(modStringTwo))
			return 1;
		else return -1;
		
	}
	public static String sort(String string){
		
		char charArray[] = string.toCharArray();
		for(int i=0;i<string.length()-1;i++){
			int smallest = i;
			for(int j=i+1;j<string.length();j++){
				if(charArray[j] < charArray[smallest])
					smallest = j;
			}
			char temp = charArray[i];
			charArray[i] = charArray[smallest];
			charArray[smallest] = temp;
		}
		String sortedString = new String(charArray);
		return sortedString;
	}
	
	//7. Retirement
	public static ArrayList<String> retirementEmployeeList(HashMap<String,String> employeeList){
		ArrayList<String> retirementList = new ArrayList<String>();
				
		Iterator iter = employeeList.entrySet().iterator();
	    while (iter.hasNext()) {
	        Map.Entry record = (Map.Entry)iter.next();
	        String id = (String)record.getKey();
	        String dob = (String)record.getValue();
	        int age = 2013 - Integer.parseInt(dob.substring(6));
	        if(age >= 60)
	        	retirementList.add(id);
	    }
		return retirementList;
	}
	
	//8. KaprekarNumber
public static int getKaprekarNumber(int number){
		
		int temp = number;
		
		//calculating the number of digits in the input number
		int d=0;
		while(temp != 0){
			d++;
			temp/=10;
		}
		
		//calculating the square of the input number
		int square = number * number;
		
		//extracting right half of the number
		int right = 0;
		int exp = 1;
		for(int i=0;i<d;i++){
			int curDigit = square%10;
			square/=10;
			right += (exp*curDigit);
			exp *= 10;
		}
		int left = square;
		if(number == (left+right))
			return 1;
		else
			return -1;
	}

	//9. Vowels
	public static String storeMaxVowelWord(String inputSentence){
	
		String words[] = inputSentence.split(" ");
		String maxVowelString = words[0];
		int maxVowels = numberOfVowels(words[0]);
		for(int i=1;i<words.length;i++){
			int n = numberOfVowels(words[i]);
			if(n>maxVowels){
				maxVowels = n;
				maxVowelString = words[i];
			}
		}
		return maxVowelString;
	}
	public static int numberOfVowels(String word){
	
		word = word.toLowerCase();
		int numberOfVowels=0;
		for(int i=0;i<word.length();i++){
			char c = word.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				numberOfVowels++;
		}
		return numberOfVowels;
	}
	
	//10.ArrayListAndOperations
	public static ArrayList<Integer> PerformSetOperations(ArrayList<Integer> arrayOne,ArrayList<Integer> arrayTwo,char operator){
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		switch(operator){
		case '+': //Set union
			for(Integer i : arrayOne)
				outputList.add(i);
			for(Integer i : arrayTwo)
				if(!outputList.contains(i))
					outputList.add(i);
			break;
		case '*': //Set intersection
			for(Integer i: arrayOne)
				if(arrayTwo.contains(i))
					outputList.add(i);
			break;
		case '-': //Set difference
			for(Integer i : arrayOne)
				if(!arrayTwo.contains(i))
					outputList.add(i);
			break;
		}
		return outputList;
	}
	
	//11. MaxScorer
	public static String getHighestScorer(ArrayList<String> records){
		
		int highestScore = 0;
		String highestScorer = null;
		
		for(String record : records) {
			String array[] = record.split("-");
			int score = Integer.parseInt(array[1]) + Integer.parseInt(array[2]) + Integer.parseInt(array[3]);
			if(score>highestScore){
				score = highestScore;
				highestScorer = array[0];
			}
		}
		return highestScorer;
	}
	
	//12. MaxVowels
	public static String getWordWithMaximumVowels(String inputSentence){
		
		String words[] = inputSentence.split(" ");
		String maxVowelString = words[0];
		int maxVowels = numberOfVowels(words[0]);
		for(int i=1;i<words.length;i++){
			int n = numberOfVowels(words[i]);
			if(n>maxVowels){
				maxVowels = n;
				maxVowelString = words[i];
			}
		}
		
		return maxVowelString;
	}
	
	//13. AdjacentSwaps
	public static String swapPairs(String string) {
		
		char charArray[] = string.toCharArray();
		for(int i=0;i<charArray.length-1;i+=2){
			char temp = charArray[i];
			charArray[i] = charArray[i+1];
			charArray[i+1]= temp;
		}
		return new String(charArray);
	}
	
	//14. Password
	public static boolean validatePassword(String pswd){
		int length = pswd.length();
		if(length < 8) //password length is at least 8
			return false;
		else {
			int numbers = 0;
			int specialCharacters = 0;
			int alphabets = 0;
			for(int i=0;i<length;i++){
				char c = pswd.charAt(i);
				if(c>=48 && c<=57) //Checking for numbers. ASCII '0'=48 and '9'=57
					numbers++;
				else if((c>=65 && c<=90) || (c>=97 && c<=122)) //Checking for alphabets
					alphabets++;
				else 
					specialCharacters++;
			}
			if(numbers>0 && alphabets>0 && specialCharacters>0)
				return true;
		}
		return false;
	}
	
	//15. EmployeeBonus
	public static TreeMap<Integer,Integer> calculateRevisedSalary(HashMap<Integer,String> dobMap,HashMap<Integer,Integer> salaryMap){
		TreeMap<Integer,Integer> bonusMap = new TreeMap<>();
		
		Iterator iter = dobMap.entrySet().iterator();
	    while (iter.hasNext()) {
	        Map.Entry pair = (Map.Entry)iter.next();
	        int id = (int)pair.getKey();
	        String dob = (String)pair.getValue();
	        int salary = salaryMap.get(id);
	        int age = findAge(dob);
	        int revisedSalary = salary;
	        if(age>=25 && age<=30)
	        	revisedSalary += (salary*0.2);
	        else if(age>=31 && age<=60)
	        	revisedSalary += (salary*0.3);
	        bonusMap.put(id, revisedSalary);	
	        
	    }
		
		return bonusMap;
	}
	
	public static int findAge(String dob){
		int currentYear = 2013;
		int birthYear = Integer.parseInt(dob.substring(6));
		return (currentYear - birthYear);
	}
	
	//16. DateFormat
public static String findOldDate(String dateOne, String dateTwo){
		
		String dateOneArray[] = dateOne.split("-");
		String dateTwoArray[] = dateTwo.split("-");
		
		int old=0;
		
		int year1 = Integer.parseInt(dateOneArray[2]);
		int year2 = Integer.parseInt(dateTwoArray[2]);
		int month1 = Integer.parseInt(dateOneArray[1]);
		int month2 = Integer.parseInt(dateTwoArray[1]);
		int day1 = Integer.parseInt(dateOneArray[0]);
		int day2 = Integer.parseInt(dateTwoArray[0]);
		
		if(year1 < year2)
			old = 1;
		else if(year1 > year2)
			old = 2;
		else if(month1 < month2)
			old = 1;
		else if(month1 > month2)
			old = 2;
		else if(day1 < day2)
			old = 1;
		else if(day1 > day2)
			old = 2;
		
		String oldDate;
		if(old == 1)
			oldDate = dateOneArray[1] + "/" + dateOneArray[2] + "/" + dateOneArray[2];
		else
			oldDate = dateTwoArray[1] + "/" + dateTwoArray[2] + "/" + dateTwoArray[2];
		
		return oldDate;
	}

	//17. MaximumDifference
	public static int findMaxDifference(int array[]){
		int maxDifference = 0;
		int index = 0;
		for(int i=0;i<array.length-1;i++){
			int difference = Math.abs(array[i]-array[i+1]);
			if(difference > maxDifference){
				maxDifference = difference;
				index = i+1;
			}
		}
		return index;
	}
	
	//18. PANCard
	public static boolean validatePAN(String pan){
		String pattern = "^([A-Z]{4})([0-9]{3})[A-Z]$";
		return Pattern.matches(pattern, pan);
		
	}
	
	//19. LastLetters
	public static String getLastLetter(String string){
		String finalString = "";
		
		String words[] = string.split(" "); //Splitting the sentence into words
		for(int i=0;i<words.length;i++){
			char c = words[i].charAt(words[i].length()-1);
			finalString += Character.toUpperCase(c); 
			if(i!=words.length-1)
				finalString += "$";
		}
		return finalString;
	}
	
	//20. LargetsKeyInHashmap
	public static String getMaxKeyValue(HashMap<Integer,String> map){
		
		int highestKey = 0;
		String highestKeyValue = "";
		Iterator iter = map.entrySet().iterator();
	    while (iter.hasNext()) {
	        Map.Entry pair = (Map.Entry)iter.next();
	        int key = (int)pair.getKey();
	        if(key>highestKey){
	        	highestKey = key;
	        	highestKeyValue = (String)pair.getValue();
	        }
	    }
		return highestKeyValue;
	}
	
	//21. DayOfTheWeek
	public static String getDay(String d){
		String day = "";
		String dateArray[] = d.split("-");
		int date = Integer.parseInt(dateArray[1]);
		int month = Integer.parseInt(dateArray[0]);
		int year = Integer.parseInt(dateArray[2]);
	    
		//Sakamoto Algorithm for finding day og week
		int t[] = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
	    year -= (month < 3)?1:0;
	    int n = (year + year/4 - year/100 + year/400 + t[month-1] + date) % 7;
	    
	    switch(n){
	    case 0:
	    	day = "Sunday";
	    	break;
	    case 1:
	    	day = "Monday";
	    	break;
	    case 2:
	    	day = "Tuesday";
	    	break;
	    case 3:
	    	day = "Wednesday";
	    	break;
	    case 4:
	    	day = "Thursday";
	    	break;
	    case 5:
	    	day = "Friday";
	    	break;
	    case 6:
	    	day = "Saturday";
	    	break;
	    }
		return day;
	}
	
	//22. HashMapToArrayList
	public static ArrayList<String> getName(HashMap<Integer,String> map){
		
		String pattern = "^[a-z]((([a-zA-Z]*)([0-9]+)([a-zA-Z]*))+)[A-Z]$";
				
		ArrayList<String> nameList = new ArrayList<>();
		
		Iterator iter = map.entrySet().iterator();
	    while (iter.hasNext()) {
	        Map.Entry pair = (Map.Entry)iter.next();
	        String value = (String)pair.getValue();
	        if(Pattern.matches(pattern, value)){
	        	nameList.add(value);
	        }
	    }
	    return nameList;
	}
	
	//23. DateFormatConversion
	public static String convertDateFormat(String dateFormatOne){
		String array[] = dateFormatOne.split("/");
		
		String dateFormatTwo = array[0] + "-" + array[1] + "-" + array[2];
		
		return dateFormatTwo;
	}
	
	//24. StringProcessing
	public static int getLastDayOfMonth(String date){
		String array[] = date.split("-");
		
		int month = Integer.parseInt(array[1]);
		int year = Integer.parseInt(array[2]);
		int numberOfDays = 0;
		switch(month){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			numberOfDays = 31;
			break;
		case 4: case 6: case 9: case 11:
			numberOfDays = 30;
			break;
		case 2:
			if(year%4 == 0)
				numberOfDays = 29;
			else 
				numberOfDays = 28;
			break;
		}
		return numberOfDays;
	}
	
	//25. AgeForVoting
	public static String getAge(String dob){
		int currentYear = 2014;
		String array[] = dob.split("/");
		int birthYear = Integer.parseInt(array[2]);
		
		if((currentYear-birthYear)>=18)
			return "Eligible";
		else 
			return "Not Eligible";
	}
}
