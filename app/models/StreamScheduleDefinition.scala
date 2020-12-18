package models

import play.api.libs.json._

case class  ServerConfiguration( id: Int,
                                 description: String = "",
                                 server: String = "",
                                 user: String = "",
                                 passphrase: String = "",
                                 certFile: String = "",
                                 roleToAssume: String = "",
                                 vaultPathCredentials: String = "",
                                 useKeyFile: Boolean = false,
                                 name: String = "",
                                 protocol: String
                               )

case class TransferConfiguration( id: Int,
                                  description: String = "",
                                  useTmpDir: Boolean = false,
                                  uploadAsTmp: Boolean = false,
                                  remoteDirectory: String = "",
                                  triggerFileName: String = "",
                                  triggerFileFields: String = "",
                                  serverConfiguration: ServerConfiguration,
                                  apiPropertiesFile: String = "",
                                  apiLogFolder: String = "",
                                  apiProcessNumber: Int,
                                  testFlagFileDelivery: Boolean = false,
                                  name: String = "",
                                )

case class SchemaField( id: Int,
                        description: String = "",
                        alias: String = "",
                        name: String = "",
                      )

case class UniverseConfiguration( id: Int,
                                  description: String = "",
                                  lastXGuids: Int = 0,
                                  matchedCookiesCutoffDays: Int = 0,
                                  providerId: Int = 0,
                                  guidsMapCutoffDays: Int = 0,
                                  useInfilePath: Boolean = false,
                                  useSchema: Boolean = false,
                                  schemaFileName: String = "",
                                  delimiter: String = "",
                                  fieldList: String = "",
                                  filterFields: String = "",
                                  filterExpression: String = "",
                                  useMatchDate: Boolean = false,
                                  schemaFields: List[SchemaField] = List(),
                                  transferType: String = "",
                                  transferIdFieldName: String = "",
                                  transferIdFieldAlias: String = "",
                                  name: String = "",
                                  fileName: String = "",
                                )

case class StreamScheduleDefinition( id: Int,
                                     name: String = String,
                                     description: String = String,
                                     schedule: String = String,
                                     universeConfigurationId: UniverseConfiguration = UniverseConfiguration(0),
                                     streamType: String = String,
                                     outputTopic: String = String,
                                     enabled: String = String,
                                   )
