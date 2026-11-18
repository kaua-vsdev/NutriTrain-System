# ⚡ NutriTrain System

Sistema em desenvolvimento voltado para o meio fitness, projetado para integrar cálculos metabólicos essenciais (TMB, TDEE, IMC, Déficit e Superávit Calórico), além de funcionalidades para acompanhamento de treinos e evolução do usuário.

---

## 📂 Arquitetura e Partes do Código

O projeto está dividido em pacotes e classes organizadas para garantir a separação de responsabilidades:

* **`Calculos TMB` (Taxa Metabólica Basal):** 
  Calcula a quantidade mínima de energia (em calorias) que o organismo precisa em repouso absoluto para manter as funções vitais funcionando.
* **`Calculos TDEE` (Gasto Energético Diário Total):** 
  Mede a quantidade total de calorias que o corpo queima ao longo de um dia (24 horas), considerando o fator de atividade física do usuário.
* **`Login`:** 
  Módulo responsável por receber, validar e processar o cadastro inicial com os dados biométricos do usuário.
* **`Dados`:** 
  Armazena e formata os dados informados pelo usuário, permitindo consultas rápidas quando necessário.
* **`MainUsuario`:** 
  Interface de controle principal (CLI). Após o login, exibe um menu interativo onde o usuário pode navegar entre as opções de visualização de métricas, dados cadastrais e simulações de metas nutricionais.

---

## 🚀 Tecnologias Utilizadas
* **Linguagem:** Java (JDK padrão / POO)
* **Controle de Versão:** Git e GitHub

---
Desenvolvido por **Kauã da Silva Santos**.