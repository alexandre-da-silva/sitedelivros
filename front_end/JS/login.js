const campos = document.querySelectorAll(".campo")
const botao = document.querySelector(".botao-login")
const mensagemErro = document.querySelector(".mensagem-erro")

const inputEmail = campos[0]
const inputSenha = campos[1]

botao.addEventListener("click", function(){
    const email = inputEmail.value
    const senha = inputSenha.value


    if (email === "" || senha === ""){
        mensagemErro.textContent = "Preencha todos os campos!"
        return
    }

    const usuarioSalvo = JSON.parse(localStorage.getItem("usuario"))

    if (!usuarioSalvo) {
        console.log("Clique")
        mensagemErro.textContent = "Nenhum usuário foi encontrado!"
        return
    }

    if (email === usuarioSalvo.email && senha === usuarioSalvo.senha) {
        mensagemErro.textContent = ""
        alert("Login realizadom com sucesso! Bem-vindo!")

    }else{

        mensagemErro.textContent = "Email ou senha incorretos!"
    }
    
})  