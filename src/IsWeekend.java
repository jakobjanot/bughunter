/* Try to simplify the isWeekend method */

void main() {
    String dayOfWeek = "Mandag";

    boolean weekend = isWeekend(dayOfWeek);
    IO.println("Is " + dayOfWeek + " in Weekend: " + weekend);
}
boolean isWeekend(String day) {
    switch (day) {
        case "Lørdag":
        case "Søndag":
            return true;
        default:
            return false;
    }
}
/*boolean isWeekend(String day) {
    boolean weekend = false;

    switch (day) {
        case "Mandag":
            weekend = false;
            break;
        case "Tirsdag":
            weekend = false;
            break;
        case "Onsdag":
            weekend = false;
            break;
        case "Torsdag":
            weekend = false;
            break;
        case "Fredag":
            weekend = false;
            break;
        case "Lørdag":
            weekend = true;
            break;
        case "Søndag":
            weekend = true;
            break;
        default:
            weekend = false;
            break;
    }
    return weekend;
}
*/
