/**
 * Count
 */
public class Count {

    private String nama;
    private double uts;
    private double uas;
    private double tMandiri;


    public String getNama() {
	    return this.nama;
    }
    public void setNama(String nama) {
	    this.nama = nama;
    }
    public double getUts() {
    	return this.uts;
    }
    public void setUts(double uts) {
    	this.uts = uts;
    }
    public double getUas() {
    	return this.uas;
    }
    public void setUas(double uas) {
    	this.uas = uas;
    }


    public double getTMandiri() {
    	return this.tMandiri;
    }
    public void setTMandiri(double tMandiri) {
    	this.tMandiri = tMandiri;
    }


    public double murniUts(){
        return (getUts()* 35) /100;
    }
    public double murniUas(){
        return (getUas()*45)/100;
    }
    public double murniTugas(){
        return (getTMandiri() * 20)/ 100;
    }
    public double nilaiAkhir(){
        return murniTugas() + murniUts() + murniUas();
    }
    
}