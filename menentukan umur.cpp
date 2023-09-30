#include <iostream>
using namespace std;

int main() {
    int jumlahOrang;
    
    cout << "Masukkan jumlah orang: ";
    cin >> jumlahOrang;
    
    cout<<endl;	
    
    int umur[jumlahOrang][2]; // Array multidimensi untuk menyimpan umur dan status
    
    int i = 0;
    while (i < jumlahOrang) {
        cout << "Masukkan umur orang ke-" << (i + 1) << ": ";
        cin >> umur[i][0]; // Simpan umur
        
        if (umur[i][0] >= 18) {
            umur[i][1] = 1; // Status dewasa
        } else {
            umur[i][1] = 0; // Status anak-anak
        }
        
        i++;
    }
    
    cout << "Umur setiap orang:" << endl;
    i = 0;
    do {
        cout << "Orang ke-" << (i + 1) << ": " << umur[i][0] << " tahun" << endl;
        i++;
    } while (i < jumlahOrang);
    
    // Menampilkan status orang
    cout << "Status setiap orang:" << endl;
    for (i = 0; i < jumlahOrang; i++) {
        if (umur[i][1] == 1) {
            cout << "Orang ke-" << (i + 1) << " adalah dewasa" << endl;
        } else {
            cout << "Orang ke-" << (i + 1) << " adalah anak-anak" << endl;
        }
    }
    
    return 0;
}

