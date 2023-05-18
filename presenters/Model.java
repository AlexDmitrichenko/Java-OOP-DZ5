package presenters;
import java.util.Collection;
import java.util.Date;

import models.Table;

public interface Model {
    /**
     * Получение доступных столиков
     * @return столики
     */
    Collection<Table> loadTables();
    /**
     * Бронирование столика
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     * @return 
     */
    int reservationTable(Date reservationDate, int tableNo, String name);
     /**
     * Изменение бронирования столика
     * 
     * @param oldReservation  старый ID бронирования для удаления
     * @param reservationDate новая дата бронирования
     * @param tableNo         новый номер столика
     * @param name            имя клиента
     * @return новый номер брони
     */
    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
