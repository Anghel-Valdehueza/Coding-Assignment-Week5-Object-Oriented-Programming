
/**
 *
 * @author angeluz
 */
/* 
 * ********************
 * Step 3
 * ********************
 */



public class SpacedLogger implements Logger{


		// TODO Auto-generated constructor stub
		
		/* 
	     * ********************
	     * Step 7
	     * ********************
	     */
	    @Override
	    public void log(String str) {
		StringBuilder log = new StringBuilder();	
		for (int i = 0; i < str.length(); i++) {
	            log.append(str.charAt(i) + " ");
		}
			
	        System.out.println(log);
			
	    }

	    /* 
	     * ******S**************
	     * Step 8
	     * ********************
	     */
	    @Override
	    public void error(String str) {
	        System.out.print("Error: ");
		log(str);
		}

		
		
}


