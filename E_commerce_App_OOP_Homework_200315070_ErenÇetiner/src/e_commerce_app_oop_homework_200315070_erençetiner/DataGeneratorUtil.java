package e_commerce_app_oop_homework_200315070_erençetiner;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;

/**
 *
 * @author EREN ÇETİNER   200315070
 */

//Test Data
public class DataGeneratorUtil {

	String cId = "C001";
	String cPassword = "cbuoop";
	String cEmail = "eren.cbu@mail.com";
	String cName = "Eren Çetiner";
	String cNumber = "5055555555";
	String cAddr = "CBU, Manisa, TR";
            Customer c = new Customer(cId, cPassword, cEmail, cName, cAddr, cNumber);
	
            long pThreeId = 3;
            String pTestName3 = "GeForce RTX 3090";
            String pTestCode3 = "GPU01";
            BigDecimal pTestPrice3 = new BigDecimal("39999.99");
            int quantityTest3 = 1;
            BigDecimal item3Total = pTestPrice3;

                Item p3 = new Item(pThreeId, pTestName3, pTestCode3, pTestPrice3, quantityTest3, item3Total);


                    public void generateCustomers(Map<String, Customer> customers) {
		
                        customers.put(cEmail, c);
                    }

            
                        public void generateItems(Map<Long, Item> items) {

		
                            long pId = 1;
                            String pName = "MSI GS66 Stealth";
                            String pCode = "MSI01";
                            BigDecimal pPrice = new BigDecimal("29999.99");
                            int quantity = 1;
                            BigDecimal itemTotal = pPrice;
                            Item p = new Item(pId, pName, pCode, pPrice, quantity, itemTotal);
                            items.put(pId, p);

                                long pTwoId = 2;
                                String pTestName = "Adidas Futbol Topu";
                                String pTestCode = "D01";
                                BigDecimal pTestPrice = new BigDecimal("299.99");
                                int quantityTest = 1;
                                BigDecimal item2Total = pPrice;
                                Item p2 = new Item(pTwoId, pTestName, pTestCode, pTestPrice, quantityTest, item2Total);
                                items.put(pTwoId, p2);
                                items.put(pThreeId, p3);

                                    long pId4 = 4;
                                                //String pName4 = "How to be a Hero By Daniel Birmingham unabridged edition";
                                        String pName4 = "Ds Damat Slim Fit Mavi Gömlek";
                                        String pCode4 = "MG01";
                                        BigDecimal pPrice4 = new BigDecimal("199.99");
                                        int quantityTest4 = 1;
                                        BigDecimal item4Total = pPrice4; // item price * quantity.
                                        Item p4 = new Item(pId4, pName4, pCode4, pPrice4, quantityTest4, item4Total);
                                        items.put(pId4, p4);
                        }

                                     public void generateInvoices(Map<Long, Invoice> invoices, Map<String, Item>itemCodes) {

		
                                            long invoiceId = 1111;		
                                            LocalDate today = LocalDate.now();		
                                            LocalDate after15days = today.plusDays(16);
		
                                                    Invoice invoice = new Invoice(invoiceId, c, p3, after15days, p3.getItemPrice());
                                                        invoices.put(invoiceId, invoice);
                                                            itemCodes.put(p3.getItemCode(), p3);

                            }

}