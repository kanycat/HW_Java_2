public class Action {
    public static void main(String[] args) {

        action();

    }
    static void action () {
        Contest_member cat1 = new Cat("Котзилла", 15, 10);
        Contest_member cat2 = new Cat("Барсик", 10, 5);

        Contest_member human1 = new Human("Евген", 15, 3);
        Contest_member human2 = new Human("Жора", 12, 1);

        Contest_member robot1 = new Robot("Мегатрон", 1000, 1000);
        Contest_member robot2 = new Robot("Оптимус", 1000, 1000);

        Contest_member[] contest_members = {cat1, cat2, human1, human2, robot1, robot2};

        Barrier wall1 = new Wall(10);
        Barrier wall2 = new Wall(20);
        Barrier track1 = new Track(10);
        Barrier track2 = new Track(20);

        Barrier[] barriers = {wall1, wall2, track1, track2};

        for (int i = 0; i < barriers.length; i++) {
            for (Contest_member contestMember : contest_members) {
                if (contestMember.getSuccess()) {
                    barriers[i].check(contestMember);
                }
            }

        }
    }
}
