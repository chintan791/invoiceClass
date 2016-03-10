public class BookInvoice {

	private double taxItem;
	private double untaxItem;
	private double taxPercent;
	private double grandTotal;

    private double [] tr = new double [100];
    private double [] rt = new double [100];
    private double h=0;
    private double tot1;
    private double tot2;
    
	BookInvoice(){}
	
	BookInvoice(double itemTaxed, double itemNotTaxed, double taxValue, double totalBill, double [] grand)
	{
		taxItem = itemTaxed;
		untaxItem= itemNotTaxed;
		taxPercent= taxValue;
		grandTotal= totalBill;
		tr = grand;
		
	}
	public double getTaxItem() {
		return taxItem;
	}
	public void setTaxItem(double taxItem) {
		this.taxItem = taxItem;
	}
	public double getUntaxItem() {
		return untaxItem;
	}
	public void setUntaxItem(double untaxItem) {
		this.untaxItem = untaxItem;
	}
	public double getTaxPercent() {
		return taxPercent;
	}
	public void setTaxPercent(double taxPercent) {
		this.taxPercent = taxPercent;
	}
	public double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}
	

	public double [] getTr() {
		return tr;
	}

	public void setTr(double [] tr) {
		this.tr = tr;
	}
		
	
	
/*	public double doIt(double k){
		
	
		
		taxItem += k ;

		
		return (taxItem);
		
		
		}
		*/
		
	public double Add(double h, int i, double r){
		
		
		h=h + (h*r);
			
			tr[i]=h; 

		
			
			return (tr[i]);
			
			
			}
	
public double Add2(double h, int i){
	
	
		
		rt[i]=h; 

	
		
		return (rt[i]);
		
		
		}


public double grandTotal(){
	
for (int i=0; i<100; i++)
{
	
	
	if (tr[i] != 0)
	{
		tot1 +=tr[i];
		
	}

}
// return tot1;


for (int j=0; j<100; j++)
{
	if (rt[j] != 0)
	{
		tot2 +=rt[j];
	}
	else break;
}

grandTotal = tot1+tot2;

return grandTotal;

	
	}
}
	
	




















