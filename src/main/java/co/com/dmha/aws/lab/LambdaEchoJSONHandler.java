package co.com.dmha.aws.lab;

import java.util.Date;

import co.com.dmha.aws.lab.dto.BookDTO;

import com.amazonaws.services.lambda.runtime.Context;

public class LambdaEchoJSONHandler {

	public BookDTO myHandler(BookDTO input, Context context) {

		input.setDate(new Date());
		return input;
	}
}