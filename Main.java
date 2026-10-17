class Wonders {
    void display() {
        System.out.println("The Seven Wonders of the Ancient World:");
    }
}

class GreatPyramid extends Wonders {
    void display() {
        System.out.println("Great Pyramid of Giza - Egypt");
    }
}

class HangingGardens extends Wonders {
    void display() {
        System.out.println("Hanging Gardens of Babylon - Iraq");
    }
}

class StatueOfZeus extends Wonders {
    void display() {
        System.out.println("Statue of Zeus - Olympia, Greece");
    }
}

class TempleOfArtemis extends Wonders {
    void display() {
        System.out.println("Temple of Artemis - Ephesus, Turkey");
    }
}

class Mausoleum extends Wonders {
    void display() {
        System.out.println("Mausoleum at Halicarnassus - Turkey");
    }
}

class Colossus extends Wonders {
    void display() {
        System.out.println("Colossus of Rhodes - Greece");
    }
}

class Lighthouse extends Wonders {
    void display() {
        System.out.println("Lighthouse of Alexandria - Egypt");
    }
}

public class Main {
    public static void main(String[] args) {

        Wonders[] wonders = {
            new GreatPyramid(),
            new HangingGardens(),
            new StatueOfZeus(),
            new TempleOfArtemis(),
            new Mausoleum(),
            new Colossus(),
            new Lighthouse()
        };

        for (Wonders wonder : wonders) {
            wonder.display();
        }
    }
}