public enum DayOfWeek {
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;

    public int getWorkingHours(DayOfWeek o){
        switch (o){
            case Monday:
            case Tuesday:
            case Wednesday:
            case Thursday:
            case Friday:
                return (4-o.ordinal())*8+5;
            case Saturday:
            case Sunday:
                return 0;
            default:
                return 1;
        }
    }
}
