package hr.atos.praksa.ivanhusnjak.zadatak15;

import java.util.ArrayList;

public class Zadaci {
	public static enum TipZadatka {
		BUG,
		TASK
	}
	
	public static enum StatusZadatka {
		OPEN,
		CLOSED,
		IN_PROGRESS
	}
	
	String name;
    String description;
    ArrayList<Zaposlenik> pplOnTask;
    TipZadatka type;
    StatusZadatka status;
    int complexity;
    long timeSpentOnTask;
    long startDateTime;
    long endDateTime;
    
    
    
    
	public Zadaci(String name, String description, ArrayList<Zaposlenik> pplOnTask, TipZadatka type,
			StatusZadatka status, int complexity, long timeSpentOnTask, long startDateTime, long endDateTime) {
		super();
		this.name = name;
		this.description = description;
		if(pplOnTask != null)
			this.pplOnTask = pplOnTask;
		else
			this.pplOnTask = new ArrayList<Zaposlenik>();
		this.type = type;
		this.status = StatusZadatka.OPEN;
		this.complexity = complexity;
		this.timeSpentOnTask = timeSpentOnTask;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<Zaposlenik> getPplOnTask() {
		return pplOnTask;
	}
	public void setPplOnTask(ArrayList<Zaposlenik> pplOnTask) {
		this.pplOnTask = pplOnTask;
	}
	public TipZadatka getType() {
		return type;
	}
	public void setType(TipZadatka type) {
		this.type = type;
	}
	public StatusZadatka getStatus() {
		return status;
	}
	public void setStatus(StatusZadatka status) {
		this.status = status;
	}
	public int getComplexity() {
		return complexity;
	}
	public void setComplexity(int complexity) {
		this.complexity = complexity;
	}
	public long getTimeSpentOnTask() {
		return timeSpentOnTask;
	}
	public void setTimeSpentOnTask(long timeSpentOnTask) {
		this.timeSpentOnTask = timeSpentOnTask;
	}
	public long getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(long startDateTime) {
		this.startDateTime = startDateTime;
	}
	public long getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(long endDateTime) {
		this.endDateTime = endDateTime;
	}
	@Override
	public String toString() {
		return name + ";" + description + ";" + type + ";" + status + ";" + complexity;
	}
    
    
}
