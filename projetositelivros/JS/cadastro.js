const campos = document.querySelectorAll(".campo")
const botao = document.querySelector(".botao-cadastrar")
const senhaNaoIguais = document.querySelector(".senhas-nao-iguais")

const inputEmail = campos[0]
const inputSenha = campos[1]
const inputConfSenha = campos[2]

botao.addEventListener("click", async function(){

    const email = inputEmail.value
    const senha = inputSenha.value
    const confSenha = inputConfSenha.value

    if (email === "" || senha === "" || confSenha === ""){
        senhaNaoIguais.textContent = "Preencha todos os campos!"
        return
    }

    // VERIFICA SE O EMAIL E VALIDO
    const emailValido = /^[^\s@]+@[^\s@]+\.[^\s@]+$/

    if (!emailValido.test(email)){
        senhaNaoIguais.textContent = "Digite um email válido!"
        return
    }

    // VERIFICA TAMANHO DA SENHA
    if (senha.length < 6 || senha.length > 12){
        senhaNaoIguais.textContent = "A senha deve ter entre 6 e 12 caracteres!"
        return
    }

    if (senha !== confSenha){
        senhaNaoIguais.textContent = "Confirme a senha novamente!"
        return
    }

    const usuario = {
        email: email,
        senha: senha
    }

    try {

        const resposta = await fetch("http://localhost:8080/usuarios/cadastrar", {

            method: "POST",

            headers: {
                "Content-Type": "application/json"
            },

            body: JSON.stringify(usuario)
        })

        if (resposta.ok){
            alert("Cadastro realizado com sucesso!")
            window.location.href = "login.html"
        } else {
            alert("Erro ao cadastrar!")
        }

    } catch (erro){
        console.log(erro)
        alert("Erro no servidor")
    }

})