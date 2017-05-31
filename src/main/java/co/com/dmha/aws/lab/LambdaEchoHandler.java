package co.com.dmha.aws.lab;

import com.amazonaws.services.lambda.runtime.Context;

public class LambdaEchoHandler  {
	
	 public String myHandler(String input, Context context) {
	        return "El valor del input es: "+input;
	    }
}