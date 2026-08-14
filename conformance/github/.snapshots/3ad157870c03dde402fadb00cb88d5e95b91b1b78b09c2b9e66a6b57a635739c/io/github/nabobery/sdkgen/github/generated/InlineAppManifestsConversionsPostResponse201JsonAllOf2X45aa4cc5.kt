package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1app-manifests~1{code}~1conversions/post/responses/201/content/application~1json
 * /schema/allOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1app-manifests~1{code}~1conversions/post/responses/201/content/application~1json
 * /schema/allOf/1
 */
@Serializable(with = InlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5.Serializer::class)
public class InlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5(
  public val clientId: String,
  public val clientSecret: String,
  public val pem: String,
  public val webhookSecret: String?,
  additionalProperties: Map<String, JsonElement> = emptyMap(),
) {
  /**
   * Additional JSON object members not declared as fixed properties.
   */
  public val additionalProperties: Map<String, JsonElement> =
      copyAndValidateInlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5AdditionalProperties(additionalProperties)

  public class Builder {
    private var clientIdValue: String? = null

    public var clientId: String
      get() = requireNotNull(clientIdValue) { "clientId is required" }
      set(`value`) {
        clientIdValue = value
      }

    private var clientSecretValue: String? = null

    public var clientSecret: String
      get() = requireNotNull(clientSecretValue) { "clientSecret is required" }
      set(`value`) {
        clientSecretValue = value
      }

    private var pemValue: String? = null

    public var pem: String
      get() = requireNotNull(pemValue) { "pem is required" }
      set(`value`) {
        pemValue = value
      }

    private var webhookSecretState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var webhookSecret: String?
      get() = webhookSecretState.valueOrNull()
      set(`value`) {
        webhookSecretState = value.toNullableFieldState()
      }

    private var additionalPropertiesValue: Map<String, JsonElement> = emptyMap()

    /**
     * Additional JSON object members not declared as fixed properties.
     */
    public var additionalProperties: Map<String, JsonElement>
      get() = additionalPropertiesValue.toMap()
      set(`value`) {
        additionalPropertiesValue = value.toMap()
      }

    public fun build(): InlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5 {
      check(clientIdValue != null) { "clientId is required" }
      check(clientSecretValue != null) { "clientSecret is required" }
      check(pemValue != null) { "pem is required" }
      check(webhookSecretState !== FieldState.Absent) { "webhookSecret is required, even when null" }
      return InlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5(
        clientId = clientId,
        clientSecret = clientSecret,
        pem = pem,
        webhookSecret = webhookSecretState.valueOrNull(),
        additionalProperties = additionalProperties,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5 must be a JSON object")
      val clientId = json.decodeRequired<String>(rawObject, "client_id")
      val clientSecret = json.decodeRequired<String>(rawObject, "client_secret")
      val pem = json.decodeRequired<String>(rawObject, "pem")
      if (!rawObject.containsKey("webhook_secret")) {
        throw SerializationException("InlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5 is missing required property 'webhook_secret'")
      }
      val webhookSecret = rawObject["webhook_secret"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5(
        clientId = clientId,
        clientSecret = clientSecret,
        pem = pem,
        webhookSecret = webhookSecret,
        additionalProperties = rawObject.filterKeys { key -> key !in setOf("client_id", "client_secret", "pem", "webhook_secret") }.mapValues { (_, element) -> element }.toMap(),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("client_id", value.clientId)
        put("client_secret", value.clientSecret)
        put("pem", value.pem)
        put("webhook_secret", value.webhookSecret?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        value.additionalProperties.keys.sorted().forEach { key ->
          val additionalValue = value.additionalProperties.getValue(key)
          check(key !in setOf("client_id", "client_secret", "pem", "webhook_secret")) { "InlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5 additionalProperties key '" + key + "' collides with a fixed property" }
          put(key, additionalValue)
        }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

private fun copyAndValidateInlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5AdditionalProperties(additionalProperties: Map<String, JsonElement>): Map<String, JsonElement> {
  val copied = additionalProperties.toMap()
  val collision = copied.keys.sorted().firstOrNull { key -> key in setOf("client_id", "client_secret", "pem", "webhook_secret") }
  require(collision == null) { "InlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5 additionalProperties key '" + collision + "' collides with a fixed property" }
  return copied
}

public fun inlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5(block: InlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5.Builder.() -> Unit): InlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5 = InlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineAppManifestsConversionsPostResponse201JsonAllOf2X45aa4cc5 property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
