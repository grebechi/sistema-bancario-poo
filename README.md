# 🏦 Sistema Bancário da Unisinos - UniBanco - Projeto Colaborativo

Bem-vindos ao projeto prático de Programação Orientada a Objetos (POO)! 
O objetivo deste repositório é construirmos juntos um sistema bancário utilizando os 3 pilares da POO: **Encapsulamento, Herança e Polimorfismo**.

Cada um de vocês tem uma missão específica e o código de um vai depender do código do outro. Trabalhem em equipe e conversem entre si!

---

## 👨‍💻 Divisão de Tarefas

### 1️⃣ Pedro: O Arquiteto do Núcleo
**Sua Missão:** Criar a base segura do nosso banco.
* **Arquivo:** Crie a classe `ContaBancaria.java`.
* **O que fazer:**
  * Crie os atributos protegidos (`private double saldo` e `private String titular`).
  * Crie os métodos `depositar(double valor)` e `sacar(double valor)`. O saque não pode deixar o saldo ficar negativo!
  * Crie os métodos *Getters e Setters*.
* **Seu foco:** Garantir o **Encapsulamento**.

### 2️⃣ Juliano: O Especialista de Regras de Negócio
**Sua Missão:** Criar os tipos específicos de contas usando o código do Pedro.
* **Arquivos:** Crie as classes `ContaCorrente.java` e `ContaPoupanca.java`.
* **O que fazer:**
  * Faça as duas classes herdarem de ContaBancaria (use `extends`).
  * Na `ContaCorrente`, altere o método sacar (`@Override`) para cobrar uma taxa de R$ 1,00 a cada saque.
  * Na `ContaPoupanca`, crie o método `renderJuros()` que aumenta o saldo em 1%.
* **Seu foco:** Garantir a **Herança** e o **Polimorfismo**. Dica: Leia o código do Pedro para saber o nome exato dos métodos!

### 3️⃣ Ricardo: O Desenvolvedor de Interface (Telas)
**Sua Missão:** Fazer o sistema rodar e aparecer para o usuário.
* **Arquivo:** Crie a classe principal `Main.java`.
* **O que fazer:**
  * Crie objetos do tipo `ContaCorrente` e `ContaPoupanca`.
  * Use a biblioteca `JOptionPane` para perguntar os valores e exibir alertas na tela ("Qual o valor do depósito?", "Saldo Atual: R$ X").
* **Seu foco:** Fazer a integração final. Dica: Você precisará perguntar ao Juliano e ao Pedro como eles chamaram os métodos para você conseguir usá-los no seu código!

---

## 🔄 Fluxo de Commits (A Ordem do Trabalho)

Para não dar erro de conflito no GitHub, vamos seguir esta ordem exata:

### Passo 1: A Vez do Pedro
1. O Pedro clona este repositório no computador dele.
2. Cria a classe `ContaBancaria.java`.
3. Salva e envia para cá com os comandos no terminal:
   ```bash
   git add .
   git commit -m "Pedro: Criada a classe ContaBancaria com encapsulamento"
   git push origin main

### Passo 2: A Vez do Juliano
1. O Juliano baixa o código que o Pedro acabou de fazer:
   ```bash
   git pull origin main

2. Cria as classes `ContaCorrente.java` e `ContaPoupanca.java`.
3. Salva e envia para cá com os comandos no terminal:
   ```bash
   git add .
   git commit -m "Juliano: Criadas as classes filhas com heranca e polimorfismo"
   git push origin main

### Passo 3: A Vez do Ricardo
1. O Ricardo baixa o código completo (do Pedro e do Juliano):
   ```bash
   git pull origin main

2. Cria a classe `Main.java`, constrói as telas com com a Lib `JOptionPane` e testa o programa.
3. Salva e envia para cá a versão final com os comandos no terminal:
   ```bash
   git add .
   git commit -m "Ricardo: Criado o Main e adicionadas telas usando JOptionPane"
   git push origin main

**Lembrete:** Programação é tentar, errar, corrigir e aprender. Se der erro na hora de juntar os códigos, chamem o professor e resolvam juntos olhando a mesma tela!

