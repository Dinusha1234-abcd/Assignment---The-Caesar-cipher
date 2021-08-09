object Caesar_cipher extends App{

    //Create String for Alphabet
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    //Create lamda function for Encryption
    val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
    //Create lamda function for Decryption
    val D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)
    //Create the cipher function
    val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))
    //Test value
    val ct=cipher(E,"E",5,alphabet)
    //print the value
    println(ct);
    

}