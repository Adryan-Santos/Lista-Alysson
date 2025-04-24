/*
GitHub da disciplina: https://github.com/anaves/SIS-ED2-2025-1
Prazo de Entrega: 24/04/2025
Enviar em: https://forms.gle/QJ38u7A6me5xSZQE8

Criar um sistema simples de cadastro de nomes.
Os nomes devem ser armazenados utilizando uma estrutura de dados à sua escolha: 
Array, ArrayList, LinkedList, Set ou Vector.

O programa deve exibir um menu com as seguintes opções:

1 - Adicionar nome
2 - Listar nomes
3 - Remover nome
4 - Buscar nome
5 - Salvar nomes em arquivo JSON
6 - Carregar nomes de arquivo JSON
0 - Sair

Regras:
- O nome será adicionado à lista apenas se:
  * Não estiver vazio.
  * Não for repetido.

- A listagem deve exibir:
  * Todos os nomes com sua posição.
  * Os nomes devem estar ordenados alfabeticamente antes da listagem utilizando Collections.sort() ou Arrays.sort().

- A remoção deve ser feita pelo nome digitado.

- A busca deve dizer se o nome existe na lista.

- Deve ser possível salvar os nomes em um arquivo JSON e carregar os dados novamente ao iniciar o programa.

- O sistema deve utilizar a biblioteca Gson para salvar e carregar os dados em arquivo JSON.

- O arquivo padrão será chamado nomes.json
*/

package src.lista02;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        Gson gson = new Gson();
        final String ARQUIVO_JSON = "nomes.json";

        int opcao = 1;
        do {
            System.out.println("---------------------------------------");
            System.out.println("--- Lista de Nomes! ---");
            System.out.println("1 - Adicionar Nome");
            System.out.println("2 - Listar Nomes");
            System.out.println("3 - Remover Nome");
            System.out.println("4 - Buscar Nome");
            System.out.println("5 - Salvar nomes em arquivo JSON");
            System.out.println("6 - Carregar nomes de arquivo JSON");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(in.nextLine());

            if (opcao == 1) {
                System.out.print("Digite o nome que deseja adicionar: ");
                String nome = in.nextLine();
                if (nome.isEmpty()) {
                    System.out.println("Nome inválido! Não pode ser vazio.");
                } else if (nomes.contains(nome)) {
                    System.out.println("Esse nome já está na lista.");
                } else {
                    nomes.add(nome);
                    System.out.println("Nome adicionado com sucesso.");
                }

            } else if (opcao == 2) {
                System.out.println("---------------------------------------");
                System.out.println("Esses são os nomes presentes na lista:");
                Collections.sort(nomes);
                for (int i = 0; i < nomes.size(); i++) {
                    System.out.println(i + " - " + nomes.get(i));
                }

            } else if (opcao == 3) {
                System.out.println("---------------------------------------");
                System.out.print("Digite o nome que deseja remover: ");
                String nome = in.nextLine();
                if (nomes.remove(nome)) {
                    System.out.println("Nome removido com sucesso.");
                } else {
                    System.out.println("Nome não encontrado.");
                }

            } else if (opcao == 4) {
                System.out.println("---------------------------------------");
                System.out.print("Digite o nome que deseja buscar: ");
                String nome = in.nextLine();
                if (nomes.contains(nome)) {
                    System.out.println("O nome digitado está presente na lista!");
                } else {
                    System.out.println("Nome não encontrado.");
                }

            } else if (opcao == 5) {
                try (FileWriter writer = new FileWriter(ARQUIVO_JSON)) {
                    gson.toJson(nomes, writer);
                    System.out.println("Nomes salvos em " + ARQUIVO_JSON);
                } catch (IOException e) {
                    System.out.println("Erro ao salvar: " + e.getMessage());
                }

            } else if (opcao == 6) {
                try (FileReader reader = new FileReader(ARQUIVO_JSON)) {
                    Type listType = new TypeToken<ArrayList<String>>(){}.getType();
                    nomes = gson.fromJson(reader, listType);
                    System.out.println("Nomes carregados com sucesso.");
                } catch (IOException e) {
                    System.out.println("Erro ao carregar: " + e.getMessage());
                }

            } else if (opcao == 0) {
                System.out.println("Saindo...");

            } else {
                System.out.println("Opção inválida. Tente novamente!");
            }

        } while (opcao != 0);
        System.out.println("Lista finalizada. Os nomes registrados foram: ");
        Collections.sort(nomes);
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(i + " - " + nomes.get(i));
        }

        in.close();
    }
}
