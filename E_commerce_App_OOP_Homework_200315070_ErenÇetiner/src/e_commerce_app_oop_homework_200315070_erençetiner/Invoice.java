package e_commerce_app_oop_homework_200315070_erençetiner;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author EREN ÇETİNER   200315070
 */


public class Invoice {
	
    private long invoiceNo;
    private Customer customer;
    private Item item;
    private List<Item> items;
    private LocalDate purchaseDate;
    private int quantity = 1; //change to totalitemsQTY bought
    private BigDecimal invoiceTotal;
	
        public Invoice(long invoiceNo, Customer customer, Item item, LocalDate purchaseDate, BigDecimal invoiceTotal) {
	
            this.invoiceNo = invoiceNo;
            this.customer = customer;
            this.item = item;
            this.purchaseDate = purchaseDate;
            this.invoiceTotal = invoiceTotal;
	}
	
            public Invoice(long invoiceNo, Customer customer, Item item, BigDecimal invoiceTotal) {
		
                this.invoiceNo = invoiceNo;
		this.customer = customer;
		this.item = item;
		this.purchaseDate = LocalDate.now();
		this.invoiceTotal = invoiceTotal;
            }
		
                @Override
            
                    public String toString() {

                        String testString= 
		"Invoice No\tEMAIL\t\tItemName\tItemCode\tPrice\tQuantity\tItemTotal\tPurchaseDate | \n"
		+" "+ invoiceNo + "\t\t" + customer.getEmail() + "\t" + item.getName() + "\t" + item.getItemCode() +"\t" 
                               + item.getItemPrice() +"\t" + item.getQuantity() +"\t\t" + item.getItemPrice() + "\t\t"+ getPurchaseDate() + "| \n";

                                    return testString;
                    }
	
                        public String showInvoiceDetails(){
		
                            String formatString = "+=======Invoice Generated!===========+\n"
                            + "|Customer Email: " + customer.getEmail() + "\t"+ " Date: " + purchaseDate + "|\n"
                            + "|Invoice No: " + invoiceNo + "|\n"
                            + "|P.No\t\tName\t\t\tItemCode\t\tPrice\t\tQuantity\t\tTotal  | \n"
                            + "|" +item.getpId() + "\t" + item.getName() + "\t\t" + item.getItemCode() +"\t\t\t" + item.getItemPrice() +"\t\t" + item.getQuantity() +"\t\t\t" + "$"+ item.getItemPrice() + "| \n" 
                            + "|----------------------------------------------|\n"
                            + "|Total = $"+ invoiceTotal +"|\n"
                            + "|Thank you for your purchase!|\n"
                            + "============================================|";

                                return formatString;

                        }
	
                            public long getInvoiceNo() {
                                return invoiceNo;
                            }
	
                                public void setInvoiceNo(long invoiceNo) {
                                    this.invoiceNo = invoiceNo;
                                }
	
                                    public LocalDate getPurchaseDate() {
                                        return purchaseDate;
                                    }
	
                                        public void setPurchaseDate(LocalDate purchaseDate) {
                                            this.purchaseDate = purchaseDate;
                                        }
	
                                            public BigDecimal getInvoiceTotal() {
                                                return invoiceTotal;
                                            }
	
                                                public void setInvoiceTotal(BigDecimal invoiceTotal) {		
                                                    this.invoiceTotal = invoiceTotal;
                                                }

                                                    public Customer getCustomer() {
                                                        return customer;
                                                    }

                                                        public void setCustomer(Customer customer) {
                                                            this.customer = customer;
                                                        }

                                                            public Item getItem() {
                                                                return item;
                                                            }

                                                                public void setItem(Item item) {
                                                                    this.item = item;
                                                                }

                                                                    public List<Item> getItems() {
                                                                        return items;
                                                                    }
                                                                                        
                                                                        public void setItems(List<Item> items) {
                                                                            this.items = items;
                                                                        }
}