package io.github.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityLangfuseDestination/properties/config.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityLangfuseDestination/properties/config
 */
@Serializable(with = InlineObservabilityLangfuseDestinationConfigX61477ff1.Serializer::class)
public class InlineObservabilityLangfuseDestinationConfigX61477ff1(
  public val publicKey: String,
  public val secretKey: String,
  public val baseUrl: String? = null,
  headers: Map<String, String>? = null,
) {
  /**
   * Custom HTTP headers to include in requests to this destination.
   */
  public val headers: Map<String, String>? = headers?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var publicKeyValue: String? = null

    public var publicKey: String
      get() = requireNotNull(publicKeyValue) { "publicKey is required" }
      set(`value`) {
        publicKeyValue = value
      }

    private var secretKeyValue: String? = null

    public var secretKey: String
      get() = requireNotNull(secretKeyValue) { "secretKey is required" }
      set(`value`) {
        secretKeyValue = value
      }

    public var baseUrl: String? = null

    private var headersValue: Map<String, String>? = null

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>?
      get() = headersValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        headersValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): InlineObservabilityLangfuseDestinationConfigX61477ff1 {
      check(publicKeyValue != null) { "publicKey is required" }
      check(secretKeyValue != null) { "secretKey is required" }
      return InlineObservabilityLangfuseDestinationConfigX61477ff1(
        publicKey = publicKey,
        secretKey = secretKey,
        baseUrl = baseUrl,
        headers = headers,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineObservabilityLangfuseDestinationConfigX61477ff1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineObservabilityLangfuseDestinationConfigX61477ff1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineObservabilityLangfuseDestinationConfigX61477ff1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineObservabilityLangfuseDestinationConfigX61477ff1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineObservabilityLangfuseDestinationConfigX61477ff1 must be a JSON object")
      val publicKey = json.decodeRequired<String>(rawObject, "publicKey")
      val secretKey = json.decodeRequired<String>(rawObject, "secretKey")
      return InlineObservabilityLangfuseDestinationConfigX61477ff1(
        publicKey = publicKey,
        secretKey = secretKey,
        baseUrl = rawObject["baseUrl"]?.let { json.decodeFromJsonElement<String>(it) },
        headers = rawObject["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityLangfuseDestinationConfigX61477ff1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineObservabilityLangfuseDestinationConfigX61477ff1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("publicKey", value.publicKey)
        put("secretKey", value.secretKey)
        value.baseUrl?.let { put("baseUrl", it) }
        value.headers?.let { put("headers", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineObservabilityLangfuseDestinationConfigX61477ff1(block: InlineObservabilityLangfuseDestinationConfigX61477ff1.Builder.() -> Unit): InlineObservabilityLangfuseDestinationConfigX61477ff1 = InlineObservabilityLangfuseDestinationConfigX61477ff1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineObservabilityLangfuseDestinationConfigX61477ff1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
