package com.infy.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.infy.dto.GamingConsoleDTO;
@Service(value ="gamingConsoleService")
public class GamingCOnsoleServiceImpl implements GamingConsoleService{
List<GamingConsoleDTO> gamingList = Arrays.asList( new GamingConsoleDTO(1234, "Sony", "PS5", 1.5, "White", 540.0),
new GamingConsoleDTO(1235, "Sony", "PS4", 2.5, "Blue", 340.0),
 new GamingConsoleDTO(1236, "Xbox", "Xbox", 3.5, "Green", 240.0));
	@Override
	public GamingConsoleDTO getGamingConsole(String brand, String mode) {
		// TODO Auto-generated method stub
		for(GamingConsoleDTO gamingCOnsoleDTO : gamingList)
		{
			if(gamingCOnsoleDTO.getBrand().equals(brand)&&gamingCOnsoleDTO.getMode().equals(mode))
			{
				return gamingCOnsoleDTO;
			}
		}
		return null;
	}

	@Override
	public List<GamingConsoleDTO> getGamingConsole() {
		// TODO Auto-generated method stub

		return gamingList;
	}

	@Override
	public String addConsole(GamingConsoleDTO gamingConsoleDTO) {
		// TODO Auto-generated method stub
		//gamingList.add(gamingConsoleDTO);
		System.out.println("Adding gaming console" + gamingConsoleDTO + "to DB");
		return "Gaming Console addsuccesfully with id:" + gamingConsoleDTO.getConsoleId();
	}

	@Override
	public void updatePrice(Integer consoleId,GamingConsoleDTO consoleDTO) {
		// TODO Auto-generated method stub
		System.out.println(consoleId + "update price to " + consoleDTO.getPrice());
	}

	@Override
	public void deleteConsole(Integer consoleId) {
		// TODO Auto-generated method stub
		System.out.println("Successfully delete console with id: " +consoleId);
		
	}

	@Override
	public GamingConsoleDTO getById(Integer id) {
		// TODO Auto-generated method stub
		for(GamingConsoleDTO gamingConsoleDTO : gamingList)
		{
			if(gamingConsoleDTO.getConsoleId().equals(id))
			{
				return gamingConsoleDTO;
			}
		}
		return null;
	}

}
