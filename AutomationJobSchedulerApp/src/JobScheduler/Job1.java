package JobScheduler;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class Job1 implements Job {
	
	public void execute(JobExecutionContext context) throws JobExecutionException{
		
		System.out.println("Job1------------> Time is : " +new Date());
		
		System.out.println("Job Ended...................");
		
		
	}

}
