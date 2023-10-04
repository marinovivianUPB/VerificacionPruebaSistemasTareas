package ejercicios.practicaPrimerParcial;

public class NextDay {

    public String nextDay(int day, int month, int year){
        if(((month==12|month==1|month==3|month==5|month==7|month==8|month==10) && day==31)||((month==4|month==6|month==9|month==11) && day==30)||(month==2 && day==28 && !isLeapYear(year))||(month==2 && day==29 && isLeapYear(year))){
            if(!(month==2 && isLeapYear(year))){
                day=0;
            }
            if(month==12){
                month=0;
                year++;
            }

            month++;
        }
        day++;

        return (day<10 ? "0"+day : day)+"/"+(month<10 ? "0"+month : month)+"/"+year;
    }

    public String nextDay(int day, String month, int year){
        if(((month.equals("Diciembre")||month.equals("Enero")
                ||month.equals("Marzo")||month.equals("Mayo")||month.equals("Julio")
                ||month.equals("Agosto")||month.equals("Octubre"))
                && day==31)||((month.equals("Abril")||month.equals("Junio")||
        month.equals("Septiembre")||month.equals("Noviembre")) && day==30) || (month.equals("Febrero") && day==28 && !isLeapYear(year))
        ||(month.equals("Febrero") && day==29 && isLeapYear(year))){
            if(!(month=="Febrero" && isLeapYear(year))){
                day=0;
            }
            switch(month){
                case "Diciembre":
                    month="Enero";
                    year++;
                    break;
                case "Enero":
                    month="Febrero";
                    break;
                case "Febrero":
                    month="Marzo";
                    break;
                case "Marzo":
                    month="Abril";
                    break;
                case "Abril":
                    month="Mayo";
                    break;
                case "Mayo":
                    month="Junio";
                    break;
                case "Junio":
                    month="Julio";
                    break;
                case "Julio":
                    month="Agosto";
                    break;
                case "Agosto":
                    month="Septiembre";
                    break;
                case "Septiembre":
                    month="Octubre";
                    break;
                case "Octubre":
                    month="Noviembre";
                    break;
                case "Noviembre":
                    month="Diciembre";
                    break;
            }
        }
        day++;
        return (day<10 ? "0"+day : day)+"/"+month+"/"+year;
    }

    public boolean isLeapYear(int num){
        return (num%4==0 && (num%100!=0||num%400==0));
    }
}
