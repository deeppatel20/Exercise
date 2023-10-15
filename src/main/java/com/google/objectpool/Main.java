package com.google.objectpool;

import com.google.objectpool.service.Oliphaunt;
import com.google.objectpool.service.OliphauntPool;

public class Main {
    public static void main(String[] args) {
        OliphauntPool oliphauntPool = new OliphauntPool();
        Oliphaunt oliphaunt1 = oliphauntPool.checkout();
        Oliphaunt oliphaunt2 = oliphauntPool.checkout();
        Oliphaunt oliphaunt3 = oliphauntPool.checkout();
        oliphauntPool.checkIn(oliphaunt1);
        oliphauntPool.checkIn(oliphaunt2);
        Oliphaunt oliphaunt4 = oliphauntPool.checkout();
        Oliphaunt oliphaunt5 = oliphauntPool.checkout();

    }
}
