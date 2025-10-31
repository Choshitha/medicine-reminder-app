package com.falcon.medicinetime.alarm;

import com.falcon.medicinetime.BasePresenter;
import com.falcon.medicinetime.BaseView;
import com.falcon.medicinetime.data.source.History;
import com.falcon.medicinetime.data.source.MedicineAlarm;

/**
 * Created by falcon on 13/07/17.
 */

public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
