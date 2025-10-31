package com.falcon.medicinetime;

import android.content.Context;
import androidx.annotation.NonNull;


import com.falcon.medicinetime.data.source.MedicineRepository;
import com.falcon.medicinetime.data.source.local.MedicinesLocalDataSource;


/**
 * Created by falcon on 13/05/17.
 */

public class Injection {

    public static MedicineRepository provideMedicineRepository(@NonNull Context context) {
        return MedicineRepository.getInstance(MedicinesLocalDataSource.getInstance(context));
    }
}