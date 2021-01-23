package Easy;

public class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        address = address.replace(".", "[.]");
        return address;
    }

    public static void main(String[] args) {
        var ob = new DefangingAnIPAddress();
        String address = "1.1.1.1";
        System.out.println(ob.defangIPaddr(address));
    }
}
