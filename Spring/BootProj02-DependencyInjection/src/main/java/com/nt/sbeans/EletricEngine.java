package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngine")
public class EletricEngine implements IEngine
{
   public EletricEngine()
   {
	   System.out.println("EletricEngine::0 paramconstructor");
   }
   @Override
   public void start()
   {
	   System.out.println("EletricEngine.start()");
   }
   @Override
   public void stop()
   {
	   System.out.println("EletricEngine.stop()");
   }
}
