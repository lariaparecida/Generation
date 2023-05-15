/* as formas de adc uma variavel no script
var - variavel de escopo global (pode ser acessada por todo o codigo)
let - variavel de escopo local (usamos ele por boas praticas)
const - variavel de escopo global, mas constante (não pode ser alterada) */

/* acessando o dom:
- por tag: getElementByTagName()
- por id: getElementById() **usaremos mais
- por nome: getElementsByName()
- por classe: getElementsByClassName()
- por seletor: querySelector() ** usaremos mais (melhor pratica)
*/

/* validação do campo nome */
let nome = window.document.getElementById('nome')

/* validação do campo email */
let email = document.querySelector('#email')

/* validação do campo assunto */
let assunto = document.querySelector('#assunto')

/*aumentando o tamanho do campo input de nome através do DOM JS*/
nome.style.width = '100%'

/*aumentando o tamanho do campo input de email através do DOM JS*/
email.style.width = "100%";

/*aumentando o tamanho do campo input de assunto através do DOM JS*/
assunto.style.width = "100%";

/* variáveis para a validação do botão enviar */
let nomeOk = false
let emailOk = false
let assuntoOk = false

/* variável do mapa */
let mapa = document.querySelector('#mapa')

/*usamos o function para inserir os blocos de códigos */

/* function para validar o tamanho do nome*/
function validaNome() {

   let txtNome = document.querySelector('#txtNome')
   if (nome.value.length < 5) {
      txtNome.innerHTML = 'Nome Inválido'
      txtNome.style.color = 'red' 
   } else {
      txtNome.innerHTML = 'Nome Válido'
      txtNome.style.color = 'green'
      nomeOk = true
   }

}

/* function para validar o tamanho do email*/
function validaEmail() {
   let txtEmail = document.querySelector('#txtEmail') 

   if (email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1 ) {
      txtEmail.innerHTML = 'E-mail inválido'
      txtEmail.style.color = 'red'
   } else {
      txtEmail.innerHTML = 'E-mail válido'
      txtEmail.style.color = 'green'
      emailOk = true
   }
}

/* function para validar o tamanho do assunto*/

function validaAssunto() {
   let txtAssunto = document.querySelector('#txtAssunto')
   let assunto = document.querySelector('#assunto')//
   let assuntoOk = false;//

   if (assunto.value.length >= 100) {
      txtAssunto.innerHTML = 'Texto é muito grande, digite no máximo 100 caracteres'
      txtAssunto.style.color = 'red'
      txtAssunto.style.display = 'block'
      assunto.value = assunto.value.substring(0, 100);//
      assuntoOk = false;//
   } else {
      txtAssunto.style.display = 'none'
      assuntoOk = true
   }
}

/*function para validar o botão enviar */
function enviar() {
   if (nomeOk == true && emailOk == true && assuntoOk == true) {
      alert("Formulário enviado com sucesso!!");
   } else {
      alert("Preencha o formulário corretamente antes de enviar...");
   }
}

 /* function para dar um zoom no mapa */
function mapaZoom() {
   mapa.style.width = "800px";
   mapa.style.height = "600px";
}

 /* function para o mapa voltar ao normal */
function mapaNormal() {
   mapa.style.width = "400px";
   mapa.style.height = "250px";
}