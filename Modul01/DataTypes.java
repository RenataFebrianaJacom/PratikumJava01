import javax.swing.JOptionPane;

public class DataTypes {
 public static void main(String[]args){
 
 String namaDepan = "Renata";
 String namaTengah = "Febriana";
 String namaBelakang = "Jacom";
 int usia = 20;
 int targetTahunKuliah = 4;
 double ipk = 3.89;
 char nilaiAbjad ='A';
 boolean cantik = true;

 System.out.println("Nama Depan : " +namaDepan);
 System.out.println("Nama Tengah : " +namaTengah);
 System.out.println("Nama Belakang : " +namaBelakang);
 System.out.println("Usia : " +usia);
 System.out.println("Target Kuliah : "+targetTahunKuliah);
 System.out.println("IPK : "+ipk);
 System.out.println("Nilai PBO : " +nilaiAbjad);
 System.err.println("Cantik : "+cantik);

 JOptionPane.showMessageDialog(null,"Hai," +namaDepan +" "+namaTengah  +" "+namaBelakang);
 }
}