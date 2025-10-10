// ! OTP GENERATION

function generationOtp(){
    let text = 'qwertyuiopasdfghjklzxcvbnm'
    let otp = ''
    for(let i=1;i<=4;i++){
        otp += text[Math.floor(Math.random()*text.length)]  //6874
    }
    alert(`OTP si ${otp}`);   //0.7808*text.length--4.6778--4
}
generationOtp()