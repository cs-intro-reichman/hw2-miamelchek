public class TimeCalc {
    public static void main(String[] args) {
        // קלט של השעה ומספר הדקות להוספה
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addMinutes = Integer.parseInt(args[1]);
        // חישוב הזמן הכולל בדקות
        int totalMinutes = hours * 60 + minutes + addMinutes;
        // חישוב הזמן החדש - שעות ודקות
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int nweMinutes = totalMinutes % 60;
        // הוספת אפס במישה והמספק קטן מעשר
        String addIntegerMinutes = "";
        String addIntegerHours = "";
        if (nweMinutes<10) {
			addIntegerMinutes = "0";
		}
         if (newHours<10) {
			addIntegerHours = "0";
		}
        // הדפסת השעה החדשה לאחר החישוב
        System.out.println(addIntegerHours + newHours + ":" + addIntegerMinutes + nweMinutes);

    }
}
