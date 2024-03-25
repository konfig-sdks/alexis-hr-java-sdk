

# CreateLeaveRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**employeeId** | **String** |  |  |
|**typeId** | **String** |  |  |
|**childId** | **String** |  |  [optional] |
|**duration** | [**DurationEnum**](#DurationEnum) |  |  |
|**startDate** | **OffsetDateTime** |  |  |
|**endDate** | **OffsetDateTime** |  |  |
|**extent** | **Double** |  |  [optional] |
|**morning** | **Object** |  |  [optional] |
|**afternoon** | **Object** |  |  [optional] |



## Enum: DurationEnum

| Name | Value |
|---- | -----|
| MINUTES | &quot;minutes&quot; |
| HALF_DAY | &quot;half_day&quot; |
| ONE_DAY | &quot;one_day&quot; |
| LONGER | &quot;longer&quot; |



