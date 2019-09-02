public enum Season {
    SPRING("wiosna", new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("lato", new String[]{"czerwiec", "lipiec", "wrzesień"}),
    AUTUMN("jesień", new String[]{"październik", "listopad", "grudzień"}),
    WINTER("zima", new String[]{"styczeń", "luty", "marzec"});

    private final String name;
    private final String[] months;

    Season(String name, String[] months) {
        this.name = name;
        this.months = months;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String monthsArray = "";
        for (String m : months) {
            monthsArray += m + " ";
        }
        return "Nazwa pory roku: " + name + " - miesiące: " + monthsArray;
    }
}

