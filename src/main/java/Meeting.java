import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Meeting {

    public static String meeting(String s) {
        List<Guest> guests = new ArrayList<Guest>();
        for(String g: s.toUpperCase().split(";")) {
            String[] nameSername = g.split(":");
            guests.add(new Guest(nameSername[0], nameSername[1]));
        }
        return guests.stream().sorted().map(Guest::toString).collect(Collectors.joining());
    }
}

class Guest implements Comparable<Guest> {
    private String name;
    private String sername;

    public Guest(String name, String sername) {
        this.name = name;
        this.sername = sername;
    }

    public int compareTo(Guest o) {
        int result = this.sername.compareTo(o.sername);
        if(result == 0)
            result = this.name.compareTo(o.name);
        return result;
    }

    @Override
    public String toString() {
        return "(" + sername + ", " + name  + ")";
    }
}