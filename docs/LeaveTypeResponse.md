

# LeaveTypeResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**name** | **String** |  |  |
|**kind** | [**KindEnum**](#KindEnum) |  |  |
|**minimumDuration** | [**MinimumDurationEnum**](#MinimumDurationEnum) |  |  |
|**deductible** | **Boolean** |  |  |
|**paid** | **Boolean** |  |  |
|**disabled** | **Boolean** |  |  |
|**archived** | **Boolean** |  |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| SICK_LEAVE | &quot;SICK_LEAVE&quot; |
| PARENTAL_LEAVE | &quot;PARENTAL_LEAVE&quot; |
| VACATION | &quot;VACATION&quot; |
| OFF_DUTY | &quot;OFF_DUTY&quot; |
| CHILDCARE | &quot;CHILDCARE&quot; |



## Enum: MinimumDurationEnum

| Name | Value |
|---- | -----|
| DAY | &quot;DAY&quot; |
| HALF_DAY | &quot;HALF_DAY&quot; |
| HOUR | &quot;HOUR&quot; |
| MINUTE | &quot;MINUTE&quot; |



