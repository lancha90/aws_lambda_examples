# aws_lambda_examples

AWS lambda examples for Java 8


## Functions

### Plain Text Echo

- **Handler:** ´co.com.dmha.aws.lab.LambdaEchoHandler::myHandler´
- **Test input:** ´"Hello World"´ 
- **Execution result:** ´Echo: Hello World´

### JSON Echo

- **Handler:** ´co.com.dmha.aws.lab.LambdaEchoJSONHandler::myHandler´
- **Test input:** ´
{
  "id": 100,
  "name": "king of ring"
}
´ 
- **Execution result:** ´
{
  "id": 100,
  "name": "king of ring",
  "date": 1496245732381
}
´