\# 💾 Sistema de Cadastro de Nomes

\*\*Disciplina:\*\* Estrutura de Dados II

\*\*Curso:\*\* Sistemas de Informação

\*\*Instituição:\*\* Libertas Faculdades Integradas

\*\*Professor:\*\* Alysson Naves

\*\*Prazo de Entrega:\*\* 24/04/2025

\*\*Repositório da disciplina:\*\* https://github.com/anaves/SIS-ED2-2025-1

\*\*Formulário de envio:\*\* https://forms.gle/QJ38u7A6me5xSZQE8

\---

\## 👨‍💻 Desenvolvedores

- \*\*Adryan Santos\*\* — R.A: 007194
- \*\*Julia Sudário\*\* — R.A: 007217

\---

\## 📋 Descrição do Projeto

Este projeto implementa um \*\*sistema de cadastro de nomes\*\* em \*\*Java\*\*, como exercício da disciplina \*\*Estrutura de Dados II\*\*.

Os nomes são armazenados em um `ArrayList<String>` e o usuário interage via menu no terminal.

Os dados podem ser salvos e carregados de um arquivo \*\*JSON\*\* utilizando a biblioteca \*\*Gson\*\*.

\---

\## 📚 Funcionalidades

1. \*\*Adicionar nome\*\*
- Não aceita string vazia.
- Não aceita nomes já cadastrados.

2\. \*\*Listar nomes\*\*

- Ordena alfabeticamente via `Collections.sort()`.
- Exibe cada nome com sua posição (índice).

3\. \*\*Remover nome\*\*

- Remove pelo valor exato informado.
- Informa sucesso ou falha da operação.

4\. \*\*Buscar nome\*\*

- Verifica presença na lista.
- Exibe mensagem de encontrado ou não.

5\. \*\*Salvar nomes em arquivo JSON\*\*

- Usa `Gson.toJson(...)` para gravar `ArrayList<String>` em `nomes.json`.

6\. \*\*Carregar nomes de arquivo JSON\*\*

- Usa `Gson.fromJson(...)` para ler `nomes.json` e repopular a lista.

0\. \*\*Sair\*\*

- Encerra o programa.

\---

\## ✅ Regras de Funcionamento

- \*\*Adicionar nome\*\*
- Não aceita string vazia.
- Não aceita nomes já cadastrados.

- \*\*Listar nomes\*\*
- Exibe todos os nomes com sua posição.
- Ordena alfabeticamente antes de exibir.

- \*\*Remover nome\*\*
- É feita pelo nome exato.
- Confirma remoção ou informa falha.

- \*\*Buscar nome\*\*
- Confirma existência ou informa ausência.

- \*\*Salvar em JSON\*\*
- `nomes.json` é o arquivo padrão.
- Leitura e escrita via Gson.

\---

\## 🛠️ Tecnologias Utilizadas

- Java 8 ou superior
- ArrayList
- Collections.sort()
- Biblioteca Gson v2.13.0
- FileReader / FileWriter
- Scanner

\---

\## 📂 Estrutura de Arquivos

\```

projeto/

├── lista02/

│   └── Lista.java

├── gson-2.13.0.jar

├── nomes.json           # gerado em tempo de execução

└── README.md

\```

\---

\## ▶️ Como Compilar e Executar

\### No Linux/macOS

\```bash

\# Compile

javac -cp .:gson-2.13.0.jar lista02/Lista.java

\# Execute

java -cp .:gson-2.13.0.jar lista02.Lista

\```

\### No Windows (CMD)

\```bat

:: Compile

javac -cp .;gson-2.13.0.jar lista02\Lista.java

:: Execute

java -cp .;gson-2.13.0.jar lista02.Lista

\```

\---

\## 📎 Formato do arquivo JSON

\```json

[

"Ana",

"Carlos",

"Julia"

]

\```

\---

\## 📝 Licença

Este projeto foi desenvolvido para fins \*\*acadêmicos\*\* na disciplina Estrutura de Dados II.

Uso não comercial.
