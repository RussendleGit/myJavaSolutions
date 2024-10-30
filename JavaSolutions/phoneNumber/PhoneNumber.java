class PhoneNumber {
    public static void main(String args[]) {
        System.out.println("10 RANDOM PHONE NUMBERS\n");
        for(int i = 0; i < 10; i++) {
            System.out.println(makePhoneNumber() + "\n");
        }
    }

    public static String makePhoneNumber() {
        String phoneNumber = "";
        for(int i = 0; i < 3; i++) {
            phoneNumber += (int)(Math.random() * 6 + 1);
        } phoneNumber += "-";
        phoneNumber += (int)(Math.random() * 555 + 100) + "-";
        for(int i = 0; i < 4; i++) {
            phoneNumber += (int)(Math.random() * 9 + 0);
        }
        return phoneNumber;
        
    }
} 