package com.infy.service;

import java.util.List;

import com.infy.dto.GamingConsoleDTO;

public interface GamingConsoleService {
	public GamingConsoleDTO getGamingConsole(String brand , String mode);
	public List<GamingConsoleDTO> getGamingConsole();
	public String addConsole(GamingConsoleDTO gamingConsoleDTO);
	public void updatePrice(Integer consoleId,GamingConsoleDTO consoleDTO);
	public void deleteConsole(Integer consoleId);
	public GamingConsoleDTO getById(Integer id);
	
}
