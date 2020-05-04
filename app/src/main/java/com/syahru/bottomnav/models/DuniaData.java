package com.syahru.bottomnav.models;

import java.util.ArrayList;

public class DuniaData {

    public static String[][] data = new String[][]{

            {"1.Chichen Itza",
                    "Meksiko",
                    "https://www.isdaryanto.com/wp-content/uploads/2009/09/chichen-itza.jpg",
                    "Merupakan peninggalan arkeologi suku Maya di Meksiko yang paling lengkap serta masih terawat dengan baik, kompleks candi ini dibangun antara tahun 502-522 Masehi. Suku Maya hanya menempatinya selama 200 tahun"

            },
            {"2. Christ The Redeemer",
                    "Rio de Janeiro, Brasil",
                    "https://www.isdaryanto.com/wp-content/uploads/2009/09/christ-the-redeemer.jpg",
                    "Patung memiliki tinggi 38 meter dan terletak di puncak dari Gunung Corcovado yang tingginya 710 m di Taman Nasional Hutan Tijuca, yang menghadap ke kota."

            },
            {"3. Colosseum",
                    "Roma, Italia",
                    "https://www.isdaryanto.com/wp-content/uploads/2009/09/colosseum.jpg",
                    "“Flavian Amphitheatre”, didirikan oleh Raja Vespasian dan terselesaikan oleh anaknya Titus. Ada yang berpendapat bahwa Colosseum dibuat pada tahun 79 SM. Asal nama Colosseum berasal dari sebuah patung setinggi 130 kaki atau 40 m yang bernama Colossus. Tempat ini di set untuk menampung 50.000 orang penonton."

            },
            {"4. Great Wall of China",
                    "China",
                    "https://www.isdaryanto.com/wp-content/uploads/2009/09/great-wall-of-china.jpg",
                    "Tembok Raksasa Cina atau Tembok Besar merupakan bangunan terpanjang yang pernah dibuat oleh manusia, terletak di Republik Rakyat Cina. Panjangnya adalah 6.400 kilometer (dari kawasan Sanhai Pass di timur hingga Lop Nur di sebelah barat) dan tingginya 8 meter dengan tujuan untuk mencegah serbuan bangsa Mongol dari Utara pada masa itu."

            },
            {"5. Machu Picchu",
                    "lembah Urubamba di Peru",
                    "https://www.isdaryanto.com/wp-content/uploads/2009/09/machu-picchu.jpg",
                    "Machu Picchu (“Gunung Tua” dalam bahasa Quechua; sering juga disebut “Kota Inca yang hilang”) adalah sebuah lokasi reruntuhan Inca pra-Columbus yang terletak di wilayah pegunungan pada ketinggian sekitar 2.350 m. diatas permukaan laut."

            },
            {"6. Petra",
                    "Yordania",
                    "https://www.isdaryanto.com/wp-content/uploads/2009/09/petra.jpg",
                    "Adalah sebuah situs arkeologika,  Petra merupakan ibukota kerajaan Nabatean. Didirikan pada 9SM-40M oleh Raja Aretas IV sebagai kita yang sulit untuk ditembus musuh dan aman dari bencana alam seperti badai pasir."

            },
            {"7. Taj Mahal",
                    " Agra, India",
                    "https://www.isdaryanto.com/wp-content/uploads/2009/09/taj-mahal.jpg",
                    "Adalah sebuah monumen yang terletak di Agra, India. Dibangun atas keinginan Kaisar Mughal Shah Jahan, anak Jahangir, sebagai sebuah musoleum untuk istri Persianya, Arjumand Banu Begum, juga dikenal sebagai Mumtaz-ul-Zamani atau Mumtaz Mahal"

            },
            {"8. Giza Pyramid",
                    "Khufu, Mesir",
                    "https://www.isdaryanto.com/wp-content/uploads/2009/09/giza-pyramid.jpg",
                    "Adalah piramida tertua dan terbesar dari tiga piramida yang ada di Nekropolis Giza. Dibangun sebagai makam untuk firaun."
            },

            {"9. Acropolis of Athens",
                    "Yunani",
                    "https://www.isdaryanto.com/wp-content/uploads/2009/09/acropolis-of-athens.jpg",
                    "Acropolis adalah dataran tinggi berbatu setinggi 156 m, dan ada beberapa reruntuhan bangunan kuno yang dulunya adalah kuil yg menjadi pusat sejarah Athena. Mulai dibangun 1.300 tahun SM."

            },

            {"10. Alhambra",
                    "Granada, Spayol",
                    "https://www.isdaryanto.com/wp-content/uploads/2009/09/alhambra.jpg",
                    "Adalah nama sebuah kompleks istana sekaligus benteng yang megah dari kekhalifahan bani ummayyah, dibangun sebagai tempat tinggal khalifah beserta para pembesarnya."

            }
    };

    public static ArrayList<Dunia> getListData() {
        Dunia dunia;
        ArrayList<Dunia> list = new ArrayList<>();

        for (String[] dData : data)  {
            dunia = new Dunia();
            dunia.setName(dData[0]);
            dunia.setTempat(dData[1]);
            dunia.setPhoto(dData[2]);
            dunia.setDescription(dData[3]);

            list.add(dunia);
        }

        return list;
    }



}
