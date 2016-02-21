class Computer {

    private String manufacturer = new String();
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    public String getManufacturer(){return manufacturer;}
    public int getSerialNumber(){return serialNumber;}
    public float getPrice(){return price;}
    public int getQuantityCPU(){return quantityCPU;}
    public int getFrequencyCPU(){return frequencyCPU;}

    public void view( ){
        System.out.print(" manufacturer: " +manufacturer );
        System.out.print(" serialNumber: " +serialNumber);
        System.out.print(" price: " +price);
        System.out.print(" quantityCPU: " + quantityCPU);
        System.out.print(" frequencyCPU: "+frequencyCPU); }

    public void setManufacturer(String newManufacturer){manufacturer = newManufacturer;}
    public void setSerialNumber(int newSerialNumber){serialNumber = newSerialNumber;}
    public void setPrice(float newPrice){price = newPrice;}
    public void setQuantityCPU(int newQuantityCPU){quantityCPU = newQuantityCPU;}
    public void setFrequencyCPU(int newFrequencyCPU){frequencyCPU = newFrequencyCPU;}
}