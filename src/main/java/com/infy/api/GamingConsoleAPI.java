package com.infy.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.GamingConsoleDTO;
import com.infy.service.GamingConsoleService;

@RestController
@RequestMapping(value="gamingAPI")
public class GamingConsoleAPI {
	
//	@RequestMapping(value="console",method = RequestMethod.GET)
//public GamingConsoleDTO getGameingConsole() {
//	return  new GamingConsoleDTO(1234, "Sony", "PS3", 3.0, "Black", 150.0);
//}
	@Autowired
	GamingConsoleService gamingConsoleService;
//	@RequestMapping(value="console",method = RequestMethod.GET)
	@GetMapping(value="consoles/{consoleId}")
public ResponseEntity<GamingConsoleDTO> getGameingConsole(@PathVariable(name="consoleId") Integer Id) {
		GamingConsoleDTO gaming = gamingConsoleService.getById(Id);
	return   new ResponseEntity<GamingConsoleDTO>(gaming, HttpStatus.OK);
}
	@GetMapping(value="consoles")
	public ResponseEntity<List<GamingConsoleDTO>> getGamingCOnsoles(){
		List<GamingConsoleDTO> gamingCOnsoleDTOs = gamingConsoleService.getGamingConsole();
		return new ResponseEntity<List<GamingConsoleDTO>>(gamingCOnsoleDTOs,HttpStatus.OK);
		
		
	}
	@PostMapping(value="consoles")
	public ResponseEntity<String> addConsole(@RequestBody GamingConsoleDTO gamingConsoleDTO)
	{
		String message = gamingConsoleService.addConsole(gamingConsoleDTO);
		return new ResponseEntity<String>(message,HttpStatus.CREATED);
	}
	@PutMapping(value = "consoles")
	public ResponseEntity<String> updatePrice(@RequestParam(name = "consoleId") Integer consoleId ,@RequestBody GamingConsoleDTO gamingConsoleDTO)
	{
		gamingConsoleService.updatePrice(consoleId, gamingConsoleDTO);
		String message = "Price updated successfully";
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
	 @DeleteMapping(value = "consoles/{consoleId}")
	public ResponseEntity<String> deleteCOnsole(@PathVariable Integer consoleId)
	{
		gamingConsoleService.deleteConsole(consoleId);
		return new ResponseEntity<String> ("Successfully deleted console", HttpStatus.OK);
	}
}
