package academic.model;

/**
 * @author 12S20031 Daniel Andres Simangunsong
 * @author 12S20043 Sevia Rajagukguk
 */
public class Course {

    // mendeclare atribut yang private karena agar yang bisa yang edit itu hanya class course
    private String code;
    private String name;
    private int credit;
    private String passinggrade;
    
    //Constructor tanpa paramater :instantiation (membuat jadi objek) dan nilainya dibuat kosong atau nol
    // note : Constructor harus sama dengan nama class
    public Course() {
    this.code = "";
    this.name = "";
    this.credit = 0;
    this.passinggrade = "";
}

    //Constructor dengan paramater 
    // pengunaan this sebaiknya digunkan saat nama parameter sama dengan nama class 
    public Course(String code, String name, int credit, String passinggrade) {
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.passinggrade = passinggrade;
    }

        /**
         * note : this hanya digunakan saat jika nama parameter sama dengan nama atribut atau jika ingin variabel ingin menunjuk atribut class
         */

    
    // accessor : mengakses atau get
    // mengembalikan nilai dari sebuah private field
    public String getCode() {
        return code;
    }

    // Mutator : mengmutasi/ merubah / setting atau set
    // menetapkan nilai dari sebuah private field/ argunment pada driver
    
    public String getName() {
        return name;
    }
    
    public int getCredit() {
        return credit;
    }
    

    public String getPassinggrade() {
        return passinggrade;
    }

    


    //SET ATAU MUTATOR
// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//     public void setCode(String code) {
//         this.code = code;
//     }
    
//     public void setName(String name) {
//         this.name = name;
//     }
    
//     public void setCredit(int credit) {
//         this.credit = credit;
//     }

//     public void setPassinggrade(String passinggrade) {
//         this.passinggrade = passinggrade;
//     }
// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




    // mengubah method to sting dengan type data sting
    public String toString(){
        return this.code + "|" + 
                this.name + "|" + 
                this.credit + "|" + 
                this.passinggrade;
    }

}
