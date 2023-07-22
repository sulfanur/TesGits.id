# TesGits.id
Penjelasan Soal3.py

## Penjelasan Fungsi:

Fungsi isBalanced(input: String) akan memeriksa apakah string input mengandung tanda kurung yang seimbang atau tidak.
Fungsi menggunakan stack untuk menyimpan karakter buka tanda kurung yang ditemui.
Ketika ditemukan karakter buka tanda kurung, karakter tersebut dimasukkan ke dalam stack.
Ketika ditemukan karakter tutup tanda kurung, fungsi akan memeriksa apakah karakter tersebut berpasangan dengan karakter buka tanda kurung yang ada di puncak stack. Jika berpasangan, karakter buka tanda kurung di puncak stack akan dihapus. Jika tidak berpasangan atau stack kosong, fungsi akan mengembalikan "NO".
Setelah semua karakter diperiksa, fungsi akan mengembalikan "YES" jika stack kosong (semua tanda kurung seimbang), atau "NO" jika stack tidak kosong (ada tanda kurung yang tidak berpasangan).

## Kompleksitas Kodingan:

Waktu Kompleksitas: O(n), di mana n adalah jumlah karakter dalam input string. Fungsi hanya melakukan satu kali iterasi melalui seluruh karakter string.
Ruang Kompleksitas: O(n), di mana n adalah jumlah karakter dalam input string. Stack akan menyimpan karakter buka tanda kurung yang ada di dalam input string.

## Detail Kompleksitas Kodingan Balanced Bracket:

Fungsi isBalanced() memiliki waktu kompleksitas O(n) karena hanya melakukan satu iterasi melalui seluruh karakter dalam input string.
Fungsi isBalanced() juga memiliki ruang kompleksitas O(n) karena menggunakan stack untuk menyimpan karakter buka tanda kurung yang ada di dalam input string. Jumlah maksimum elemen dalam stack sebanding dengan jumlah karakter buka tanda kurung dalam input string.
