package regrex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regrexUtil {

	public boolean Validation(String string)
	{
		boolean result=false;
		if(string.matches("[A-Z][a-z]"))
		{
			result=true;
			return result;
		}
		return false;
	}
	public boolean validate(String string)
	{
		Pattern pattern=Pattern.compile("[9-5][0-9]");
		Matcher matcher=pattern.matcher(string);
		return(matcher.find()&&matcher.group().equals(string));
	}
}
