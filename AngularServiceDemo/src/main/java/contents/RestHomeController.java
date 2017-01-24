package contents;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RestHomeController {
	
	@GetMapping("/pullmessage/{text}")
	public MessageModel pullMessage(@PathVariable("text")String text)
	{	
	System.out.println("Hello "+text);
	return new MessageModel(text);
	}

}
