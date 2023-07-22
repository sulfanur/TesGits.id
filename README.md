# TesGits.id
Penjelasan Soal3.py
## Penjelasan Fungsi:

Fungsi is_balanced_brackets menerima string s yang berisi tanda kurung.
Kita menggunakan stack untuk menyimpan tanda buka yang telah ditemukan.
Selama iterasi, jika karakter adalah tanda buka, kita tambahkan ke stack.
Jika karakter adalah tanda tutup, kita periksa apakah stack kosong (artinya tidak ada tanda buka yang cocok sebelumnya), jika iya, maka string tidak seimbang dan kita kembalikan "NO".
Jika stack tidak kosong, kita keluarkan tanda buka terakhir dari stack dan periksa apakah tanda buka tersebut cocok dengan tanda tutup saat ini, jika tidak cocok, maka string tidak seimbang dan kita kembalikan "NO".
Jika kita berhasil mengawasi seluruh karakter dalam string dan stack kosong, maka string seimbang dan kita kembalikan "YES", jika stack tidak kosong, maka string tidak seimbang dan kita kembalikan "NO".
Kompleksitas Kodingan:

Kompleksitas waktu dari kodingan ini adalah O(n), di mana n adalah jumlah karakter dalam string input. Karena kita melintasi seluruh karakter sekali dan setiap operasi pada stack berjalan dalam waktu konstan, kompleksitasnya adalah linear terhadap panjang input.
Kompleksitas ruang adalah O(n) karena kita menggunakan stack yang akan memiliki puncaknya dengan jumlah karakter yang sama dengan jumlah tanda buka yang belum memiliki pasangan tanda tutup pada string input.

buatlah menjadi berkas redme.md
