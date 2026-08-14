package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
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
 * Key/value pairs to provide settings for this webhook.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1hooks~1{hook_id}/patch/requestBody/content/application~1json/schem
 * a/properties/config
 */
@Serializable(with = InlineOrgsHooksPatchRequestJsonConfigX1b10eb0a.Serializer::class)
public class InlineOrgsHooksPatchRequestJsonConfigX1b10eb0a internal constructor(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val contentTypeState: FieldState<String>,
  private val insecureSslState: FieldState<WebhookConfigInsecureSsl>,
  private val secretState: FieldState<String>,
) {
  public val contentType: String?
    get() = contentTypeState.valueOrNull()

  public val insecureSsl: WebhookConfigInsecureSsl?
    get() = insecureSslState.valueOrNull()

  public val secret: String?
    get() = secretState.valueOrNull()

  public constructor(url: String) : this(url = url,
  contentTypeState = FieldState.Absent,
  insecureSslState = FieldState.Absent,
  secretState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `content_type`.
   */
  public fun contentTypePresence(): FieldPresence = contentTypeState.presence

  /**
   * Returns the wire presence of `insecure_ssl`.
   */
  public fun insecureSslPresence(): FieldPresence = insecureSslState.presence

  /**
   * Returns the wire presence of `secret`.
   */
  public fun secretPresence(): FieldPresence = secretState.presence

  public class Builder {
    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var contentTypeState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var contentType: String?
      get() = contentTypeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "contentType is not nullable; call unsetContentType() to omit it" }
        contentTypeState = FieldState.Value(present)
      }

    private var insecureSslState: FieldState<WebhookConfigInsecureSsl> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var insecureSsl: WebhookConfigInsecureSsl?
      get() = insecureSslState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "insecureSsl is not nullable; call unsetInsecureSsl() to omit it" }
        insecureSslState = FieldState.Value(present)
      }

    private var secretState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secret: String?
      get() = secretState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secret is not nullable; call unsetSecret() to omit it" }
        secretState = FieldState.Value(present)
      }

    /**
     * Omits `content_type` from serialized output.
     */
    public fun unsetContentType() {
      contentTypeState = FieldState.Absent
    }

    /**
     * Omits `insecure_ssl` from serialized output.
     */
    public fun unsetInsecureSsl() {
      insecureSslState = FieldState.Absent
    }

    /**
     * Omits `secret` from serialized output.
     */
    public fun unsetSecret() {
      secretState = FieldState.Absent
    }

    public fun build(): InlineOrgsHooksPatchRequestJsonConfigX1b10eb0a {
      check(urlValue != null) { "url is required" }
      return InlineOrgsHooksPatchRequestJsonConfigX1b10eb0a(
        url = url,
        contentTypeState = contentTypeState,
        insecureSslState = insecureSslState,
        secretState = secretState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsHooksPatchRequestJsonConfigX1b10eb0a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsHooksPatchRequestJsonConfigX1b10eb0a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsHooksPatchRequestJsonConfigX1b10eb0a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsHooksPatchRequestJsonConfigX1b10eb0a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsHooksPatchRequestJsonConfigX1b10eb0a must be a JSON object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineOrgsHooksPatchRequestJsonConfigX1b10eb0a(
        url = url,
        contentTypeState = json.decodeOptional(rawObject, "content_type", nullable = false),
        insecureSslState = json.decodeOptional(rawObject, "insecure_ssl", nullable = false),
        secretState = json.decodeOptional(rawObject, "secret", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsHooksPatchRequestJsonConfigX1b10eb0a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsHooksPatchRequestJsonConfigX1b10eb0a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("url", value.url)
        putState("content_type", value.contentTypeState, json::encodeToJsonElement)
        putState("insecure_ssl", value.insecureSslState, json::encodeToJsonElement)
        putState("secret", value.secretState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsHooksPatchRequestJsonConfigX1b10eb0a(block: InlineOrgsHooksPatchRequestJsonConfigX1b10eb0a.Builder.() -> Unit): InlineOrgsHooksPatchRequestJsonConfigX1b10eb0a = InlineOrgsHooksPatchRequestJsonConfigX1b10eb0a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsHooksPatchRequestJsonConfigX1b10eb0a is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineOrgsHooksPatchRequestJsonConfigX1b10eb0a property '" + name + "' is not nullable")
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
