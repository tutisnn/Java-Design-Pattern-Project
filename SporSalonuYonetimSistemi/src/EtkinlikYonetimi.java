import java.util.ArrayList;

import java.util.List;

public class EtkinlikYonetimi {

    private List<IEtkinlikGozlemci> gozlemciler = new ArrayList<>();

    public void gozlemciEkle(IEtkinlikGozlemci gozlemci) {

        gozlemciler.add(gozlemci);

    }


    public void etkinlikYayinla(String mesaj) {

        for (IEtkinlikGozlemci gozlemci : gozlemciler) {

            gozlemci.bilgilendir(mesaj);

        }

    }
}

