package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityClickhouseDestination/properties/config.
 */
@Serializable(with = InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesConfig.Serializer::class)
public class InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesConfig(
  public val database: String,
  public val host: String,
  public val password: String,
  /**
   * If you have not set a specific username in ClickHouse, simply type in 'default' below.
   */
  public val username: String,
  /**
   * Custom HTTP headers to include in requests to this destination.
   */
  public val headers: Map<String, String>? = null,
  public val table: String? = null,
) {
  public class Builder {
    private var databaseValue: String? = null

    public var database: String
      get() = requireNotNull(databaseValue) { "database is required" }
      set(`value`) {
        databaseValue = value
      }

    private var hostValue: String? = null

    public var host: String
      get() = requireNotNull(hostValue) { "host is required" }
      set(`value`) {
        hostValue = value
      }

    private var passwordValue: String? = null

    public var password: String
      get() = requireNotNull(passwordValue) { "password is required" }
      set(`value`) {
        passwordValue = value
      }

    private var usernameValue: String? = null

    public var username: String
      get() = requireNotNull(usernameValue) { "username is required" }
      set(`value`) {
        usernameValue = value
      }

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>? = null

    public var table: String? = null

    public fun build(): InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesConfig {
      check(databaseValue != null) { "database is required" }
      check(hostValue != null) { "host is required" }
      check(passwordValue != null) { "password is required" }
      check(usernameValue != null) { "username is required" }
      return InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesConfig(
        database = database,
        host = host,
        password = password,
        username = username,
        headers = headers,
        table = table,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesConfig = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesConfig {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesConfig")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesConfig must " +
          "be a JSON object")
      val database = json.decodeRequired<String>(raw, "database")
      val host = json.decodeRequired<String>(raw, "host")
      val password = json.decodeRequired<String>(raw, "password")
      val username = json.decodeRequired<String>(raw, "username")
      return InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesConfig(
        database = database,
        host = host,
        password = password,
        username = username,
        headers = raw["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        table = raw["table"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesConfig) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("database", value.database)
        put("host", value.host)
        put("password", value.password)
        put("username", value.username)
        value.headers?.let { put("headers", json.encodeToJsonElement(it)) }
        value.table?.let { put("table", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasObservabilityClickhouseDestinationPropertiesConfig(block: InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesConfig.Builder.() -> Unit): InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesConfig = InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesConfig is " +
      "missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
