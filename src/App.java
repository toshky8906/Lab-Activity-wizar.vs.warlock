public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Let the battle Begin!");
        System.out.println("Wizards and Warlocks");
        System.out.println("Both Fighter Have 200 HP and 200 Mana");
        System.out.println("~~~~~~~~~~~~~~~~~~");

        Wizard Vocodah = new Wizard("Vocodah");
        Warlock Inertia = new Warlock("Inertia");
        Vocodah.Minazuki(Inertia);
        Vocodah.KatenKyokotsu(Inertia);
        Inertia.Kamishini(Vocodah);
        Vocodah.Kannonbiraki(Inertia);
        Inertia.Ashisogi(Vocodah);
        Inertia.Tranquility(Inertia);
        Vocodah.Rennervate(Vocodah);
        Vocodah.Senbonzakura(Inertia);
        Inertia.Hyōrinmaru(Vocodah);
        Vocodah.Shigekuni(Inertia);

    }
}
