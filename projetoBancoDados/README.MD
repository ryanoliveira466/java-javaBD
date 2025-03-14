#  Projeto - Padrão MVC, CRUD, Java Desktop e Consumo da API ViaCEP

##  Descrição
Este projeto foi desenvolvido seguindo o padrão de arquitetura **MVC (Model-View-Controller)**, utilizando **Java Desktop** para a interface gráfica e consumindo a API do **ViaCEP** para a busca de endereços via **JSON**.

O projeto seria um aplicativo de assistência técnica para funcionários/clientes onde há registro de clientes,funcionários e equipamentos para serem consertados.

---

##  Arquitetura MVC

O projeto é estruturado em três camadas principais:

- **Model (M)**: Responsável pela lógica de negócio e manipulação dos dados.  
- **View (V)**: Interface gráfica desenvolvida para interação com o usuário.  
- **Controller (C)**: Faz a comunicação entre a View e o Model, garantindo a separação de responsabilidades.  

---

#  CRUD - Operações no Projeto  

##  O que é CRUD?  
CRUD é um acrônimo para as quatro operações básicas utilizadas em bancos de dados e sistemas de gerenciamento de informações:  

- **C**reate (Criar) - Adicionar novos registros  
- **R**ead (Ler) - Consultar registros existentes  
- **U**pdate (Atualizar) - Modificar registros existentes  
- **D**elete (Excluir) - Remover registros  

---


##  Tecnologias Utilizadas

- **Java SE** (Swing/ para interface gráfica)  
- **Padrão MVC** para organização do código  
- **Consumo de API REST** utilizando a API **ViaCEP**  
- **Bibliotecas HTTP** para requisições de API  

---

##  Consumo da API ViaCEP

A aplicação utiliza a API do ViaCEP para obter dados de endereço a partir do CEP informado pelo usuário. A comunicação ocorre via **requisição HTTP GET**, e os dados retornam no formato **JSON**.

###  Exemplo de requisição:
```
https://viacep.com.br/ws/01001000/json/
```

###  Exemplo de resposta:
```json
{
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
  "complemento": "lado ímpar",
  "bairro": "Sé",
  "localidade": "São Paulo",
  "uf": "SP",
  "ibge": "3550308",
  "gia": "1004",
  "ddd": "11",
  "siafi": "7107"
}
```


##  Conclusão

Este projeto demonstra a aplicação do padrão **MVC**, o uso de **Java Desktop (Swing)** e a integração com **APIs externas** para consumo de dados em formato **JSON**. 🚀  
 
 
