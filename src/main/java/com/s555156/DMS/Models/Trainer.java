package com.s555156.DMS.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainer {
   private String trainerName;
   @Id
   private int trainerId;
   private String trainerAddress;
public String getTrainerName() {
	return trainerName;
}
public void setTrainerName(String trainerName) {
	this.trainerName = trainerName;
}
public int getTrainerId() {
	return trainerId;
}
public void setTrainerId(int trainerId) {
	this.trainerId = trainerId;
}
public String getTrainerAddress() {
	return trainerAddress;
}
public void setTrainerAddress(String trainerAddress) {
	this.trainerAddress = trainerAddress;
}
@Override
public String toString() {
	return "Trainer [trainerName=" + trainerName + ", trainerId=" + trainerId + ", trainerAddress=" + trainerAddress
			+ "]";
}
   
}
