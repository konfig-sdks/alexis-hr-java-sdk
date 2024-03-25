

# LeaveResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**id** | **String** |  |  |
|**employeeId** | **String** |  |  |
|**typeId** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**duration** | [**DurationEnum**](#DurationEnum) |  |  |
|**startDate** | **OffsetDateTime** |  |  |
|**endDate** | **OffsetDateTime** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| DENIED | &quot;DENIED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| APPROVED | &quot;APPROVED&quot; |
| CONFIRMED | &quot;CONFIRMED&quot; |



## Enum: DurationEnum

| Name | Value |
|---- | -----|
| MINUTES | &quot;minutes&quot; |
| HALF_DAY | &quot;half_day&quot; |
| ONE_DAY | &quot;one_day&quot; |
| LONGER | &quot;longer&quot; |



