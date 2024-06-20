
class Computer {
    void playmusic(){
        System.out.println("Music Playing");
    }
    public String givemepen(int rupee){
        if(rupee >=10) {
            int balace = rupee - 10;
            System.out.println("Balance = " + balace);
            return "pen";
        }
        return  "something went wrong pen is 10 or more than ";
    }
}
