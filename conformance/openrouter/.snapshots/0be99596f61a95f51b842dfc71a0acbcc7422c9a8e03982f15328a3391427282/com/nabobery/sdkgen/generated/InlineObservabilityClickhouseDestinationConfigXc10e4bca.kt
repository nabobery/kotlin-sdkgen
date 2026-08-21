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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityClickhouseDestination/properties/config
 */
@Serializable(with = InlineObservabilityClickhouseDestinationConfigXc10e4bca.Serializer::class)
public class InlineObservabilityClickhouseDestinationConfigXc10e4bca(
  public val database: String,
  public val host: String,
  public val password: String,
  /**
   * If you have not set a specific username in ClickHouse, simply type in 'default' below.
   */
  public val username: String,
  headers: Map<String, String>? = null,
  public val table: String? = null,
) {
  /**
   * Custom HTTP headers to include in requests to this destination.
   */
  public val headers: Map<String, String>? = headers?.let { collection0 -> collection0.toMap() }

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

    private var headersValue: Map<String, String>? = null

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>?
      get() = headersValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        headersValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var table: String? = null

    public fun build(): InlineObservabilityClickhouseDestinationConfigXc10e4bca {
      check(databaseValue != null) { "database is required" }
      check(hostValue != null) { "host is required" }
      check(passwordValue != null) { "password is required" }
      check(usernameValue != null) { "username is required" }
      return InlineObservabilityClickhouseDestinationConfigXc10e4bca(
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
    public fun build(block: Builder.() -> Unit): InlineObservabilityClickhouseDestinationConfigXc10e4bca = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineObservabilityClickhouseDestinationConfigXc10e4bca> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineObservabilityClickhouseDestinationConfigXc10e4bca {
      val jsonDecoder = decoder.requireJsonDecoder("InlineObservabilityClickhouseDestinationConfigXc10e4bca")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineObservabilityClickhouseDestinationConfigXc10e4bca must be a JSON object")
      val database = json.decodeRequired<String>(rawObject, "database")
      val host = json.decodeRequired<String>(rawObject, "host")
      val password = json.decodeRequired<String>(rawObject, "password")
      val username = json.decodeRequired<String>(rawObject, "username")
      return InlineObservabilityClickhouseDestinationConfigXc10e4bca(
        database = database,
        host = host,
        password = password,
        username = username,
        headers = rawObject["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        table = rawObject["table"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityClickhouseDestinationConfigXc10e4bca) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineObservabilityClickhouseDestinationConfigXc10e4bca")
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

public fun inlineObservabilityClickhouseDestinationConfigXc10e4bca(block: InlineObservabilityClickhouseDestinationConfigXc10e4bca.Builder.() -> Unit): InlineObservabilityClickhouseDestinationConfigXc10e4bca = InlineObservabilityClickhouseDestinationConfigXc10e4bca.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineObservabilityClickhouseDestinationConfigXc10e4bca is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
