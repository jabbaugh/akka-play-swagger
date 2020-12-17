package models

case class StreamScheduleDefinition( id: Int,
                                     name: String = "",
                                     description: String = "",
                                     schedule: String = "",
                                     universeConfigurationId: Long = 0L,
                                     streamType: String = "",
                                     outputTopic: String = "",
                                     enabled: String = "",
                                   ) {}
