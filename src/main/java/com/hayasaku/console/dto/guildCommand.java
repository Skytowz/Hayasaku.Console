package com.hayasaku.console.dto;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "commandId")
public class guildCommand extends Command {
	
	private List<String> response;
}