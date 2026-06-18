function solve(){
    let ch=document.getElementById("alphabet").value;
    if (ch=="a"||ch=="e"||ch=="i"||ch=="o"||ch=="u")
    {
        document.getElementById("result").innerHTML="vowels";
    }
    else{
        document.getElementById("result").innerHTML="consonant";
    }
};