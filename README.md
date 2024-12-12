**EFD Transform**

----

Layout: https://www.vriconsulting.com.br/buscador/busca.php?palavraBusca=Bloco+0&tipoBusca=3&areaBusca=4&secaoBusca=10&button=Filtrar
____

| Block Name | Layout Link |
| Bloco 0 | https://www.vriconsulting.com.br/guias/guiasIndex.php?idGuia=372 |
| Bloco A | https://www.vriconsulting.com.br/guias/guiasIndex.php?idGuia=371 |
| Bloco C | https://www.vriconsulting.com.br/guias/guiasIndex.php?idGuia=381 |
| Bloco D | https://www.vriconsulting.com.br/guias/guiasIndex.php?idGuia=558 |
| Bloco F | https://www.vriconsulting.com.br/guias/guiasIndex.php?idGuia=559 |
| Bloco I | https://www.vriconsulting.com.br/guias/guiasIndex.php?idGuia=560 |
| Bloco M | https://www.vriconsulting.com.br/guias/guiasIndex.php?idGuia=561 |
| Bloco P | https://www.vriconsulting.com.br/guias/guiasIndex.php?idGuia=562 |
| Bloco 1 | https://www.vriconsulting.com.br/guias/guiasIndex.php?idGuia=563 |
| Bloco 9 | https://www.vriconsulting.com.br/guias/guiasIndex.php?idGuia=564 |

Esse projeto é para facilitar a manipulação de arquivos da EFD Fiscal convertendo do formato txt para xlsx e vice-versa.

```json
{
  "versao": "1.22", // Substitua pela versão correta
  "identificacao": {
    "cnpj": "12345678901234",
    "periodo": "202301"
  },
  "registros": [
    // Registro 0000 - Abertura do arquivo
    {
      "registro": "0000",
      "dados": {
        // Campos do registro 0000
      }
    },
    // Registro C100 - Documento fiscal
    {
      "registro": "C100",
      "dados": {
        // Campos do registro C100
      }
    },
    // Registro C170 - Pagamento
    {
      "registro": "C170",
      "dados": {
        // Campos do registro C170
      }
    },
    // Registro C190 - Retenção
    {
      "registro": "C190",
      "dados": {
        // Campos do registro C190
      }
    },
    // ... outros registros ...
  ]
}
```

---

EFD-CONTRIBUIÇÕES - Escrituração de crédito presumido - Serviço de transporte regular de passageiros intermunicipal, exceto metropolitano, e de transporte rodoviário regular de passageiros interestadual.
Publicado em 13/09/2024

A lei nº 14.789, de 29 de dezembro de 2023, alterou a Lei nº 14.592, de 30 de maio de 2023, para determinar, no seu art. 2º-A,  que no período de 1º de janeiro de 2024 a 31 de dezembro de 2026, a pessoa jurídica poderá descontar da Contribuição devida para o PIS/Pasep e a Cofins, em cada período de apuração, crédito presumido calculado sobre a receita decorrente da prestação de serviços de transporte rodoviário regular de passageiros intermunicipal, exceto metropolitano, e de transporte rodoviário regular de passageiros interestadual.

Ocorre que receitas decorrentes de prestação de serviços de transporte coletivo rodoviário, metroviário, ferroviário e aquaviário de passageiros estão sob o regime cumulativo, nos termos do art. 10, inciso XII, da Lei nº 10.833/2023. No Programa Gerador de Escrituração – PGE da EFD Contribuições, o registro para se escriturar crédito presumido desse regime cumulativo é o F700 – Deduções Diversas, o qual ainda não se encontra totalmente em conformidade à essa alteração legislativa, de modo permitir a recepção dessa nova modalidade.

Considerando o exposto e as demandas recebidas pelo canal Fale Conosco, orientamos:

Escriturar no Registro F700 os créditos presumidos calculados sobre a receita decorrente da prestação de serviços de transporte rodoviário regular de passageiros intermunicipal, exceto metropolitano, e de transporte rodoviário regular de passageiros interestadual (art. 2º-A da Lei nº 14.592, de 2023), conforme exemplo abaixo.
Exemplo:

Considerando que a empresa tenha direito a crédito presumido relativo à receita de transporte rodoviário regular de passageiros interestadual, no valor de R$ 1.000.000,00, a escrituração do crédito será efetuada, no registro “F700”, conforme abaixo:

- Campo 02 - IND_ORI_DED: 99 (Outras Deduções) (*)

- Campo 03 – IND_NAT_DED: 1 (Dedução de Natureza Cumulativa)

- Campo 04 – VL_DED_PIS:

- Campo 05 – VL_DED_COFINS:

- Campo 06 - VL_BC_OPER: 1.000.000,00

- Campo 07 – CNPJ: xx.xxx.xxx/xxxx-xx (**)

- Campo 08 – INF_COMP: Crédito Presumido art. 2º-A da Lei 14.592/2023.

(*) Enquanto não for disponibilizado código específico para o crédito presumido previsto no art. 2º-A da Lei 14.592/2023, o código 99 deverá ser utilizado. A descrição do crédito deverá ser informada no campo 08 – INF_COMP.

(**) Informar o estabelecimento que auferiu as receitas. Caso a receita seja auferida por mais de um estabelecimento, escriturar um registro F700 para cada estabelecimento.

Caso ocorram anulações de prestação de serviços, cujas receitas estejam sujeitas ao cálculo do crédito presumido, os correspondentes valores devem ser excluídos na base de cálculo da operação e nos respectivos campos de dedução (VL_DED_PIS e VL_DED_COFINS).
Escriturar no registro F100 os créditos presumidos aplicáveis unicamente ao regime não cumulativo, incidentes sobre as receitas de venda de produtos específicos. Portanto, reforçando, não devem ser informados neste registro os créditos presumidos que também se aplicam ao regime cumulativo, a relativo à prestação de serviço de transporte de passageiros (art. 2º-A da Lei nº 14.592/2023).
Como regra geral, os valores escriturados nos registros F700 – Deduções Diversas - não são recuperados na geração automática de apuração, devendo sempre ser informados pela própria pessoa jurídica no arquivo importado pelo PGE ou complementado pela edição (digitação no próprio PGE) dos registros M200 (PIS) e M600 (Cofins). No caso específico deste crédito presumido do setor de transportes, os valores serão totalizados e escriturados no campo 11 - VL_OUT_DED_CUM - Outras Deduções no Período, dos registros M200 e M600, de forma a reduzir o valor da contribuição do período. Os valores de receitas e respectivas contribuições, apuradas nos registros M210 e M610, não são alterados por este procedimento.

---

O EFD Fiscal é composto por diversos blocos, cada um com uma função específica e agrupando informações relacionadas a diferentes aspectos da escrituração fiscal. A estrutura exata dos blocos pode variar ligeiramente dependendo da versão do EFD e do tipo de contribuinte (ICMS/IPI, Contribuições, etc.).

No entanto, de forma geral, os principais blocos encontrados no EFD Fiscal são:

Bloco 0: Abertura do arquivo digital e identificação da entidade. Contém informações gerais sobre a empresa, como CNPJ, período de apuração, etc.
Bloco A: Documentos Fiscais – Serviços (ISS). Agrupa informações sobre notas fiscais de serviços.
Bloco C: Documentos Fiscais I – Mercadorias (ICMS/IPI). Contém informações sobre notas fiscais de mercadorias, como produtos e serviços sujeitos a ICMS e IPI.
Bloco D: Documentos Fiscais II – Serviços de Transporte e Comunicações (ICMS). Agrupa informações sobre notas fiscais de serviços de transporte e comunicações.
Bloco E: Apuração do ICMS e do IPI. Apresenta os cálculos e resultados da apuração dos impostos ICMS e IPI.
Bloco F: Demais Documentos e Operações. Inclui informações sobre outros documentos e operações não contemplados nos blocos anteriores.
Bloco G: Controle do Crédito do ICMS do Ativo Permanente – CIAP. Contém informações sobre o crédito do ICMS do ativo permanente.
Bloco H: Inventário Físico. Apresenta informações sobre o inventário físico dos estoques.
Bloco K: Controle da Produção e do Estoque. Contém informações sobre a produção e o estoque da empresa.
Bloco M: Apuração da Contribuição e Crédito de PIS/PASEP e da COFINS. Apresenta os cálculos e resultados da apuração dos tributos PIS/PASEP e COFINS.
Bloco P: Apuração da Contribuição Previdenciária sobre a Receita Bruta. Apresenta os cálculos e resultados da apuração da contribuição previdenciária sobre a receita bruta.
Bloco 1: Complemento da Escrituração – Controle de Saldos de Créditos e de Retenções, Operações Extemporâneas e Outras1 Informações. Contém informações complementares à escrituração, como controle de saldos, operações extemporâneas, etc.   
1.
arquivei.com.br
arquivei.com.br
Bloco 9: Controle e encerramento do arquivo digital. Contém informações sobre o encerramento do arquivo digital.
Observações:

Outros Blocos: Dependendo da versão do EFD e das especificidades da empresa, podem existir outros blocos.
Detalhes dos Registros: Cada bloco é composto por diversos registros, que detalham as informações contidas no bloco.
Obrigatoriedade: A obrigatoriedade de cada bloco e registro varia de acordo com o tipo de contribuinte e as operações realizadas pela empresa.
Para obter informações mais precisas e atualizadas sobre os blocos do EFD Fiscal, consulte:

Manual de Orientação do EFD Fiscal: Disponibilizado pela Receita Federal.
Sistemas de Gestão: A maioria dos sistemas de gestão empresarial (ERP) possuem módulos específicos para a geração do EFD Fiscal e podem fornecer informações detalhadas sobre os blocos e registros.
Lembre-se: As regras do EFD Fiscal são constantemente atualizadas, por isso é fundamental consultar as fontes oficiais para garantir que você esteja utilizando a versão mais recente do manual de orientação.
