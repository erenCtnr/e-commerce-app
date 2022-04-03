package e_commerce_app_oop_homework_200315070_erençetiner;


/**
 *
 * @author EREN ÇETİNER   200315070
 */
public class EcommerceApplication 
{
	public EcommerceController ecommerce;
    
            public static void main( String[] args ){
    	
                try{
    		
                    EcommerceController ecommerceController = new EcommerceController();
                        ecommerceController.startBrowsing();
                }
    	
                    catch(Exception e){
    		
                        System.out.println("The ecommerce platform is having issues loading");
                            System.out.println("Try again later!");

                    }
            }
}

