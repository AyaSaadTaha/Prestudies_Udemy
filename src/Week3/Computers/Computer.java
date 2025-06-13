package Week3.Computers;

public class Computer {
    private String manufacturerName;
    private double processorSpeedMHz;
    private int ramSizeGB;
    private int hardDriveSizeGB;
    private int usbPorts;
    private double screenSizeInches;
    private String computerType;
    private boolean preinstalledOS;
    private double purchasePrice;
    private double sellingPrice;

    // Default constructor
    public Computer() {
        this.manufacturerName = "Unknown";
        this.processorSpeedMHz = 0;
        this.ramSizeGB = 0;
        this.hardDriveSizeGB = 0;
        this.usbPorts = 0;
        this.screenSizeInches = 0.0;
        this.computerType = "Unknown";
        this.preinstalledOS = false;
    }
    // Constructor with minimum required fields
    public Computer(String manufacturerName, double screenSizeInches, boolean preinstalledOS) {
        this.manufacturerName = manufacturerName;
        this.screenSizeInches = screenSizeInches;
        this.preinstalledOS = preinstalledOS;
    }

    // Constructor with all fields
    public Computer(String manufacturerName, double processorSpeedMHz, int ramSizeGB, int hardDriveSizeGB,
                    int usbPorts, double screenSizeInches, String computerType, boolean preinstalledOS) {
        this.manufacturerName = manufacturerName;
        this.processorSpeedMHz = processorSpeedMHz;
        this.ramSizeGB = ramSizeGB;
        this.hardDriveSizeGB = hardDriveSizeGB;
        this.usbPorts = usbPorts;
        this.screenSizeInches = screenSizeInches;
        this.computerType = computerType;
        this.preinstalledOS = preinstalledOS;
    }

    // Getters and setters
    public String getManufacturerName() { return manufacturerName; }
    public void setManufacturerName(String manufacturerName) { this.manufacturerName = manufacturerName; }

    public double getProcessorSpeedMHz() { return processorSpeedMHz; }
    public void setProcessorSpeedMHz(double processorSpeedMHz) { this.processorSpeedMHz = processorSpeedMHz; }

    public int getRamSizeGB() { return ramSizeGB; }
    public void setRamSizeGB(int ramSizeGB) { this.ramSizeGB = ramSizeGB; }

    public int getHardDriveSizeGB() { return hardDriveSizeGB; }
    public void setHardDriveSizeGB(int hardDriveSizeGB) { this.hardDriveSizeGB = hardDriveSizeGB; }

    public int getUsbPorts() { return usbPorts; }
    public void setUsbPorts(int usbPorts) { this.usbPorts = usbPorts; }

    public double getScreenSizeInches() { return screenSizeInches; }
    public void setScreenSizeInches(double screenSizeInches) { this.screenSizeInches = screenSizeInches; }

    public String getComputerType() { return computerType; }
    public void setComputerType(String computerType) { this.computerType = computerType; }

    public boolean hasPreinstalledOS() { return preinstalledOS; }
    public void setPreinstalledOS(boolean preinstalledOS) { this.preinstalledOS = preinstalledOS; }

    public double getPurchasePrice() { return purchasePrice; }
    public void setPurchasePrice(double purchasePrice) { this.purchasePrice = purchasePrice; }

    public double getSellingPrice() { return sellingPrice; }
    public void setSellingPrice(double sellingPrice) { this.sellingPrice = sellingPrice; }

    // toString method
    @Override
    public String toString() {
        return "Computer{" +
                "Manufacturer='" + manufacturerName + '\'' +
                ", Processor Speed=" + processorSpeedMHz + " MHz" +
                ", RAM=" + ramSizeGB + " GB" +
                ", Hard Drive=" + hardDriveSizeGB + " GB" +
                ", USB Ports=" + usbPorts +
                ", Screen Size=" + screenSizeInches + " inches" +
                ", Type='" + computerType + '\'' +
                ", Preinstalled OS=" + (preinstalledOS ? "Yes" : "No") +
                ", Purchase Price=$" + purchasePrice +
                ", Selling Price=$" + sellingPrice +
                ", Profit=$" + calculateProfit() +
                '}';
    }

    // Upgrade RAM by doubling it
    public void upgradeRam() {
        this.ramSizeGB *= 2;
    }

    // Profit calculation
    public double calculateProfit() {
        return sellingPrice - purchasePrice;
    }


}
