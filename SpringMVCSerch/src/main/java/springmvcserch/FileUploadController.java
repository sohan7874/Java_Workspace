package springmvcserch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/file")
	public String Home() {
		return "fileform";
	}

	@PostMapping("/fileupload")
	public String fileupload(CommonsMultipartFile files) { 
		System.out.println(files.getName());
		System.out.println(files.getStorageDescription());
		System.out.println(files.getOriginalFilename());

		return "fileform";
	}
}
