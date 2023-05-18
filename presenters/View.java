package presenters;
import java.util.Collection;
import models.Table;

public interface View {
    /**Отобразить список всех столиков
     * @param tables список столиков
     */
    void showTables(Collection<Table> tables);

    void showReservationStatus(int reservationNo);
    /**
     * Установить нового наблюдателя
     * @param observer наблюдатель (презентер)
     */
    void setObserver(ViewObserver observer);
    void showEditReservationStatus(int oldReservationNo, int reservationNo);
}
