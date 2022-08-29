package JobScheduler;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class JobVerificationCaller implements Job {
	
public void execute(JobExecutionContext context) throws JobExecutionException{
		
		System.out.println("Verification Job Called After Every 15 mins : " +new Date());
		
		System.out.println("Verification Done..................");
		
		
	}


}
