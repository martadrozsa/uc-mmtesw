# uc-mmtesw
Repositório para a disciplina de Modelos, Métodos e Técnicas de Engenharia de Software 

Atividade prática de Visão e análise de projeto


[![Github Actions Status for martadrozsa/uc-mmtesw](https://github.com/martadrozsa/uc-mmtesw/workflows/Integra%C3%A7%C3%A3o%20continua%20de%20Java%20com%20Maven/badge.svg)](https://github.com/martadrozsa/uc-mmtesw/actions)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=martadrozsa_uc-mmtesw&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=martadrozsa_uc-mmtesw)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=martadrozsa_uc-mmtesw&metric=coverage)](https://sonarcloud.io/component_measures?id=martadrozsa_uc-mmtesw&metric=coverage)


# Calculadora com CI.
Utiliza 3 ambientes:
- dev - Desenvolvimento
- hmg - Homologação
- prd - Produção
Pipeline
- dev - Compilação
- hmg - Compilação, Testes, Análise Código, Cobertura Código
- prd - Empacotamento
<br>
- Utiliza o Apache Maven para a automatização da construção.<br>
- A pasta test contêm os testes unitários do projeto utilizando JUnit 4.<br>
- A cobertura do código é realizada através do JaCoCo.<br>
