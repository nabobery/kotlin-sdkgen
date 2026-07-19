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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilitySnowflakeDestination/properties/config.
 */
@Serializable(with = InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesConfig.Serializer::class)
public class InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesConfig(
  public val account: String,
  public val token: String,
  public val database: String? = null,
  /**
   * Custom HTTP headers to include in requests to this destination.
   */
  public val headers: Map<String, String>? = null,
  public val schema: String? = null,
  public val table: String? = null,
  public val warehouse: String? = null,
) {
  public class Builder {
    private var accountValue: String? = null

    public var account: String
      get() = requireNotNull(accountValue) { "account is required" }
      set(`value`) {
        accountValue = value
      }

    private var tokenValue: String? = null

    public var token: String
      get() = requireNotNull(tokenValue) { "token is required" }
      set(`value`) {
        tokenValue = value
      }

    public var database: String? = null

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>? = null

    public var schema: String? = null

    public var table: String? = null

    public var warehouse: String? = null

    public fun build(): InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesConfig {
      check(accountValue != null) { "account is required" }
      check(tokenValue != null) { "token is required" }
      return InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesConfig(
        account = account,
        token = token,
        database = database,
        headers = headers,
        schema = schema,
        table = table,
        warehouse = warehouse,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesConfig = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesConfig {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesConfig")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesConfig must " +
          "be a JSON object")
      val account = json.decodeRequired<String>(raw, "account")
      val token = json.decodeRequired<String>(raw, "token")
      return InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesConfig(
        account = account,
        token = token,
        database = raw["database"]?.let { json.decodeFromJsonElement<String>(it) },
        headers = raw["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        schema = raw["schema"]?.let { json.decodeFromJsonElement<String>(it) },
        table = raw["table"]?.let { json.decodeFromJsonElement<String>(it) },
        warehouse = raw["warehouse"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesConfig) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account", value.account)
        put("token", value.token)
        value.database?.let { put("database", it) }
        value.headers?.let { put("headers", json.encodeToJsonElement(it)) }
        value.schema?.let { put("schema", it) }
        value.table?.let { put("table", it) }
        value.warehouse?.let { put("warehouse", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesConfig(block: InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesConfig.Builder.() -> Unit): InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesConfig = InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesConfig is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
