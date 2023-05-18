import java.util.Date;
import java.util.Scanner;
import models.TableModel;
import presenters.BookingPresenter;
import views.BookingView;

public class Program {
    public static void main(String[] args) {
        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.loadTables(); 
        
        Scanner sc = new Scanner(System.in);
        boolean filter = true;
        while (filter) {
            System.out.println(""" 
                ***Список доступных действий***
                1 - Вывести список столиков
                2 - Забронировать столик
                3 - Изменить бронь
                0 - Выход""");
            System.out.print("Выберите пункт меню: ");
            String op = sc.nextLine();
            switch (op) {
                case "1":
                    System.out.println("***Свободные столики***");
                    bookingPresenter.updateView();
                    System.out.println();
                    break;
                case "2":
                    System.out.print("Введите номер столика: ");
                    int tableID = Integer.parseInt(sc.nextLine());
                    System.out.print("На чье имя резервировать?: ");
                    String name = sc.nextLine();
                    System.out.printf("%s, ", name);
                    bookingView.reservationTable(new Date(), tableID, name);
                    System.out.println();
                    break;
                case "3":
                    System.out.print("Введите номер резерва: ");
                    int idReservation = Integer.parseInt(sc.nextLine());
                    System.out.print("Введите номер столика: ");
                    int tempTableID = Integer.parseInt(sc.nextLine());
                    System.out.print("На чье имя резервировать?: ");
                    String tempName = sc.nextLine();
                    System.out.printf("%s, ", tempName);
                    bookingView.changeReservationTable(idReservation, new Date(), tempTableID, tempName);
                    System.out.println();
                    break;
                case "0":
                    filter = false;
                    break;
                default:
                    System.out.println("Введено неправильное действие!");
                    System.out.println();
                    break;
            }
        }
        sc.close();
    }   
}