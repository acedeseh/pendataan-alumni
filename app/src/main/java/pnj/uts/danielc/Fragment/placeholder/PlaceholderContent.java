package pnj.uts.danielc.Fragment.placeholder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlaceholderContent {

    public static final List<PlaceholderItem> ITEMS = new ArrayList<PlaceholderItem>();

    public static final Map<String, PlaceholderItem> ITEM_MAP = new HashMap<String, PlaceholderItem>();

        private static final int COUNT = 25;
        private static final String DESKRIPSI= "Cerita Keluarga soal Perjuangan Fahmi Idris Lawan Kanker Darah.";

        static {
            // Add some sample items.
            for (int i = 1; i <= COUNT; i++) {
                addItem(createPlaceholderItem(i));
            }
        }

        private static void addItem(PlaceholderItem item) {
            ITEMS.add(item);
            ITEM_MAP.put(item.id, item);
        }

        private static PlaceholderItem createPlaceholderItem(int position) {
            return new PlaceholderItem(String.valueOf(position), "Awan duka menyelimuti keluarga besar Partai Golkar menyusul kepergian politisi senior mereka, Fahmi Idris, Minggu (22/5) pagi. Fahmi meninggal dunia dalam perjuangannya melawan penyakit kanker darah yang ia derita selama beberapa tahun terakhir..\n Menantu Fahmi yang juga suami dari Fahira Idris, Aldwin Rahadian, mengungkapkan kondisi kesehatan mertuanya itu terus menurun karena penyakit tersebut. Sakit Fahmi diperparah dengan komplikasi penyakit lain yang juga dideritanya. \n \"Memang tiba-tiba karena faktor meloma tadi, kanker darah tadi, ngedrop kondisinya. ditambah ada triger, pemicunya adalah infeksi sehingga karena kanker darah, komplikasi,\" ujar Aldwin kepada wartawan di TPU Tanah Kusir, Jakarta Selatan, Minggu (22/5).", makeDetails());
        }

        private static String makeDetails() {
            StringBuilder builder = new StringBuilder();
            builder.append(DESKRIPSI).append("\n\nsource: \nhttps://kumparan.com/kumparannews/cerita-keluarga-soal-perjuangan-fahmi-idris-lawan-kanker-darah-1y7kYcZaW1c");
            return builder.toString();
        }
    public static class PlaceholderItem {
        public final String id;
        public final String content;
        public final String details;

        public PlaceholderItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }


        @Override
        public String toString() {
            return content;
        }
    }
}
