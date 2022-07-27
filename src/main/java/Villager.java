public class Villager {
    private int ageOfDeath;
    private int yearOfDeath;

    private int PeopleKilledOfYear;
    public Villager(int ageDeath, int yearDeath){
        this.ageOfDeath=ageDeath;
        this.yearOfDeath=yearDeath;
        this.PeopleKilledOfYear=killedVillagerOfYear(this.getBirthYear());
    }
    public static int fibonacci_number(int a){
        if (a<=1){return a;}
        return fibonacci_number(a-1)+fibonacci_number(a-2);
    }
    // sum of killed people at year N equals to N+2th fibonacci number minus 1
    public static int killedVillagerOfYear(int n){
        return fibonacci_number(n+2)-1;
    }

    public void setAgeOfDeath(int ageOfDeath) {
        this.ageOfDeath = ageOfDeath;
    }

    public void setYearOfDeath(int yearOfDeath) {
        this.yearOfDeath = yearOfDeath;
    }
    public int getBirthYear(){
        return this.yearOfDeath-this.ageOfDeath;
    }
    public int getPeopleKilledOfYear(){
        return this.PeopleKilledOfYear;
    }

}
