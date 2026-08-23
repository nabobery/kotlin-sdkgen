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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilitySnowflakeDestination/properties/config
 */
@Serializable(with = InlineObservabilitySnowflakeDestinationConfigXd7bd4928.Serializer::class)
public class InlineObservabilitySnowflakeDestinationConfigXd7bd4928(
  public val account: String,
  public val token: String,
  public val database: String? = null,
  headers: Map<String, String>? = null,
  public val schema: String? = null,
  public val table: String? = null,
  public val warehouse: String? = null,
) {
  /**
   * Custom HTTP headers to include in requests to this destination.
   */
  public val headers: Map<String, String>? = headers?.let { collection0 -> collection0.toMap() }

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

    private var headersValue: Map<String, String>? = null

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>?
      get() = headersValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        headersValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var schema: String? = null

    public var table: String? = null

    public var warehouse: String? = null

    public fun build(): InlineObservabilitySnowflakeDestinationConfigXd7bd4928 {
      check(accountValue != null) { "account is required" }
      check(tokenValue != null) { "token is required" }
      return InlineObservabilitySnowflakeDestinationConfigXd7bd4928(
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
    public fun build(block: Builder.() -> Unit): InlineObservabilitySnowflakeDestinationConfigXd7bd4928 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineObservabilitySnowflakeDestinationConfigXd7bd4928> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineObservabilitySnowflakeDestinationConfigXd7bd4928 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineObservabilitySnowflakeDestinationConfigXd7bd4928")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineObservabilitySnowflakeDestinationConfigXd7bd4928 must be a JSON object")
      val account = json.decodeRequired<String>(rawObject, "account")
      val token = json.decodeRequired<String>(rawObject, "token")
      return InlineObservabilitySnowflakeDestinationConfigXd7bd4928(
        account = account,
        token = token,
        database = rawObject["database"]?.let { json.decodeFromJsonElement<String>(it) },
        headers = rawObject["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        schema = rawObject["schema"]?.let { json.decodeFromJsonElement<String>(it) },
        table = rawObject["table"]?.let { json.decodeFromJsonElement<String>(it) },
        warehouse = rawObject["warehouse"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineObservabilitySnowflakeDestinationConfigXd7bd4928) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineObservabilitySnowflakeDestinationConfigXd7bd4928")
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

public fun inlineObservabilitySnowflakeDestinationConfigXd7bd4928(block: InlineObservabilitySnowflakeDestinationConfigXd7bd4928.Builder.() -> Unit): InlineObservabilitySnowflakeDestinationConfigXd7bd4928 = InlineObservabilitySnowflakeDestinationConfigXd7bd4928.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineObservabilitySnowflakeDestinationConfigXd7bd4928 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
