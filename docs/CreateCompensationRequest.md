

# CreateCompensationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeId** | **String** |  |  |
|**userId** | **String** |  |  |
|**companyId** | **String** |  |  [optional] |
|**amount** | **Double** |  |  |
|**effectiveDate** | **String** |  |  |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) |  |  |
|**payoutDay** | **Double** |  |  |
|**payoutPeriod** | [**PayoutPeriodEnum**](#PayoutPeriodEnum) |  |  |
|**payoutFrequency** | [**PayoutFrequencyEnum**](#PayoutFrequencyEnum) |  |  |
|**salarySchedule** | [**SalaryScheduleEnum**](#SalaryScheduleEnum) |  |  [optional] |
|**paidOvertime** | **Boolean** |  |  |
|**note** | **String** |  |  [optional] |



## Enum: CurrencyEnum

| Name | Value |
|---- | -----|
| SEK | &quot;SEK&quot; |
| NOK | &quot;NOK&quot; |
| DKK | &quot;DKK&quot; |
| EUR | &quot;EUR&quot; |
| USD | &quot;USD&quot; |
| AED | &quot;AED&quot; |
| AFN | &quot;AFN&quot; |
| ALL | &quot;ALL&quot; |
| AMD | &quot;AMD&quot; |
| ANG | &quot;ANG&quot; |
| AOA | &quot;AOA&quot; |
| ARS | &quot;ARS&quot; |
| AUD | &quot;AUD&quot; |
| AWG | &quot;AWG&quot; |
| AZN | &quot;AZN&quot; |
| BAM | &quot;BAM&quot; |
| BBD | &quot;BBD&quot; |
| BDT | &quot;BDT&quot; |
| BGN | &quot;BGN&quot; |
| BHD | &quot;BHD&quot; |
| BIF | &quot;BIF&quot; |
| BMD | &quot;BMD&quot; |
| BND | &quot;BND&quot; |
| BOB | &quot;BOB&quot; |
| BRL | &quot;BRL&quot; |
| BSD | &quot;BSD&quot; |
| BTC | &quot;BTC&quot; |
| BTN | &quot;BTN&quot; |
| BWP | &quot;BWP&quot; |
| BYN | &quot;BYN&quot; |
| BZD | &quot;BZD&quot; |
| CAD | &quot;CAD&quot; |
| CDF | &quot;CDF&quot; |
| CHF | &quot;CHF&quot; |
| CLF | &quot;CLF&quot; |
| CLP | &quot;CLP&quot; |
| CNH | &quot;CNH&quot; |
| CNY | &quot;CNY&quot; |
| COP | &quot;COP&quot; |
| CRC | &quot;CRC&quot; |
| CUC | &quot;CUC&quot; |
| CUP | &quot;CUP&quot; |
| CVE | &quot;CVE&quot; |
| CZK | &quot;CZK&quot; |
| DJF | &quot;DJF&quot; |
| DOP | &quot;DOP&quot; |
| DZD | &quot;DZD&quot; |
| EGP | &quot;EGP&quot; |
| ERN | &quot;ERN&quot; |
| ETB | &quot;ETB&quot; |
| FJD | &quot;FJD&quot; |
| FKP | &quot;FKP&quot; |
| GBP | &quot;GBP&quot; |
| GEL | &quot;GEL&quot; |
| GGP | &quot;GGP&quot; |
| GHS | &quot;GHS&quot; |
| GIP | &quot;GIP&quot; |
| GMD | &quot;GMD&quot; |
| GNF | &quot;GNF&quot; |
| GTQ | &quot;GTQ&quot; |
| GYD | &quot;GYD&quot; |
| HKD | &quot;HKD&quot; |
| HNL | &quot;HNL&quot; |
| HRK | &quot;HRK&quot; |
| HTG | &quot;HTG&quot; |
| HUF | &quot;HUF&quot; |
| IDR | &quot;IDR&quot; |
| ILS | &quot;ILS&quot; |
| IMP | &quot;IMP&quot; |
| INR | &quot;INR&quot; |
| IQD | &quot;IQD&quot; |
| IRR | &quot;IRR&quot; |
| ISK | &quot;ISK&quot; |
| JEP | &quot;JEP&quot; |
| JMD | &quot;JMD&quot; |
| JOD | &quot;JOD&quot; |
| JPY | &quot;JPY&quot; |
| KES | &quot;KES&quot; |
| KGS | &quot;KGS&quot; |
| KHR | &quot;KHR&quot; |
| KMF | &quot;KMF&quot; |
| KPW | &quot;KPW&quot; |
| KRW | &quot;KRW&quot; |
| KWD | &quot;KWD&quot; |
| KYD | &quot;KYD&quot; |
| KZT | &quot;KZT&quot; |
| LAK | &quot;LAK&quot; |
| LBP | &quot;LBP&quot; |
| LKR | &quot;LKR&quot; |
| LRD | &quot;LRD&quot; |
| LSL | &quot;LSL&quot; |
| LYD | &quot;LYD&quot; |
| MAD | &quot;MAD&quot; |
| MDL | &quot;MDL&quot; |
| MGA | &quot;MGA&quot; |
| MKD | &quot;MKD&quot; |
| MMK | &quot;MMK&quot; |
| MNT | &quot;MNT&quot; |
| MOP | &quot;MOP&quot; |
| MRO | &quot;MRO&quot; |
| MRU | &quot;MRU&quot; |
| MUR | &quot;MUR&quot; |
| MVR | &quot;MVR&quot; |
| MWK | &quot;MWK&quot; |
| MXN | &quot;MXN&quot; |
| MYR | &quot;MYR&quot; |
| MZN | &quot;MZN&quot; |
| NAD | &quot;NAD&quot; |
| NGN | &quot;NGN&quot; |
| NIO | &quot;NIO&quot; |
| NPR | &quot;NPR&quot; |
| NZD | &quot;NZD&quot; |
| OMR | &quot;OMR&quot; |
| PAB | &quot;PAB&quot; |
| PEN | &quot;PEN&quot; |
| PGK | &quot;PGK&quot; |
| PHP | &quot;PHP&quot; |
| PKR | &quot;PKR&quot; |
| PLN | &quot;PLN&quot; |
| PYG | &quot;PYG&quot; |
| QAR | &quot;QAR&quot; |
| RON | &quot;RON&quot; |
| RSD | &quot;RSD&quot; |
| RUB | &quot;RUB&quot; |
| RWF | &quot;RWF&quot; |
| SAR | &quot;SAR&quot; |
| SBD | &quot;SBD&quot; |
| SCR | &quot;SCR&quot; |
| SDG | &quot;SDG&quot; |
| SGD | &quot;SGD&quot; |
| SHP | &quot;SHP&quot; |
| SLL | &quot;SLL&quot; |
| SOS | &quot;SOS&quot; |
| SRD | &quot;SRD&quot; |
| SSP | &quot;SSP&quot; |
| STD | &quot;STD&quot; |
| STN | &quot;STN&quot; |
| SVC | &quot;SVC&quot; |
| SYP | &quot;SYP&quot; |
| SZL | &quot;SZL&quot; |
| THB | &quot;THB&quot; |
| TJS | &quot;TJS&quot; |
| TMT | &quot;TMT&quot; |
| TND | &quot;TND&quot; |
| TOP | &quot;TOP&quot; |
| TRY | &quot;TRY&quot; |
| TTD | &quot;TTD&quot; |
| TWD | &quot;TWD&quot; |
| TZS | &quot;TZS&quot; |
| UAH | &quot;UAH&quot; |
| UGX | &quot;UGX&quot; |
| UYU | &quot;UYU&quot; |
| UZS | &quot;UZS&quot; |
| VEF | &quot;VEF&quot; |
| VND | &quot;VND&quot; |
| VUV | &quot;VUV&quot; |
| WST | &quot;WST&quot; |
| XAF | &quot;XAF&quot; |
| XAG | &quot;XAG&quot; |
| XAU | &quot;XAU&quot; |
| XCD | &quot;XCD&quot; |
| XDR | &quot;XDR&quot; |
| XOF | &quot;XOF&quot; |
| XPD | &quot;XPD&quot; |
| XPF | &quot;XPF&quot; |
| XPT | &quot;XPT&quot; |
| YER | &quot;YER&quot; |
| ZAR | &quot;ZAR&quot; |
| ZMW | &quot;ZMW&quot; |
| ZWL | &quot;ZWL&quot; |



## Enum: PayoutPeriodEnum

| Name | Value |
|---- | -----|
| HOURLY | &quot;HOURLY&quot; |
| DAILY | &quot;DAILY&quot; |
| WEEKLY | &quot;WEEKLY&quot; |
| BI_WEEKLY | &quot;BI_WEEKLY&quot; |
| MONTHLY | &quot;MONTHLY&quot; |
| QUARTERLY | &quot;QUARTERLY&quot; |
| ANNUAL | &quot;ANNUAL&quot; |



## Enum: PayoutFrequencyEnum

| Name | Value |
|---- | -----|
| WEEK | &quot;WEEK&quot; |
| BI_WEEKLY | &quot;BI_WEEKLY&quot; |
| MONTH | &quot;MONTH&quot; |



## Enum: SalaryScheduleEnum

| Name | Value |
|---- | -----|
| ADVANCE | &quot;ADVANCE&quot; |
| DELAYED | &quot;DELAYED&quot; |



