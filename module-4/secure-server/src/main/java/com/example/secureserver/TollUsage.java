package com.example.secureserver;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TollUsage {

	public String Id;
	public String stationId;
	public String licensePlate;
	public String timestamp;

	public TollUsage(String id, String stationid, String licenseplate, String timestamp){
		this.Id = id;
		this.stationId = stationid;
		this.licensePlate = licenseplate;
		this.timestamp = timestamp;
	}


}
