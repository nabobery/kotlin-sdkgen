package com.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1hooks~1{hook_id}~1config/patch/requestBody/content/application~1js
 * on/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1hooks~1{hook_id}~1config/patch/requestBody/content/application~1js
 * on/schema
 */
@Serializable(with = InlineOrgsHooksConfigPatchRequestJsonXf3693f2f.Serializer::class)
public class InlineOrgsHooksConfigPatchRequestJsonXf3693f2f internal constructor(
  private val contentTypeState: FieldState<String>,
  private val insecureSslState: FieldState<WebhookConfigInsecureSsl>,
  private val secretState: FieldState<String>,
  private val urlState: FieldState<String>,
) {
  public val contentType: String?
    get() = contentTypeState.valueOrNull()

  public val insecureSsl: WebhookConfigInsecureSsl?
    get() = insecureSslState.valueOrNull()

  public val secret: String?
    get() = secretState.valueOrNull()

  public val url: String?
    get() = urlState.valueOrNull()

  public constructor() : this(contentTypeState = FieldState.Absent,
  insecureSslState = FieldState.Absent,
  secretState = FieldState.Absent,
  urlState = FieldState.Absent,
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

  /**
   * Returns the wire presence of `url`.
   */
  public fun urlPresence(): FieldPresence = urlState.presence

  public class Builder {
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

    private var urlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var url: String?
      get() = urlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "url is not nullable; call unsetUrl() to omit it" }
        urlState = FieldState.Value(present)
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

    /**
     * Omits `url` from serialized output.
     */
    public fun unsetUrl() {
      urlState = FieldState.Absent
    }

    public fun build(): InlineOrgsHooksConfigPatchRequestJsonXf3693f2f = InlineOrgsHooksConfigPatchRequestJsonXf3693f2f(
      contentTypeState = contentTypeState,
      insecureSslState = insecureSslState,
      secretState = secretState,
      urlState = urlState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsHooksConfigPatchRequestJsonXf3693f2f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsHooksConfigPatchRequestJsonXf3693f2f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsHooksConfigPatchRequestJsonXf3693f2f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsHooksConfigPatchRequestJsonXf3693f2f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsHooksConfigPatchRequestJsonXf3693f2f must be a JSON object")
      return InlineOrgsHooksConfigPatchRequestJsonXf3693f2f(
        contentTypeState = json.decodeOptional(rawObject, "content_type", nullable = false),
        insecureSslState = json.decodeOptional(rawObject, "insecure_ssl", nullable = false),
        secretState = json.decodeOptional(rawObject, "secret", nullable = false),
        urlState = json.decodeOptional(rawObject, "url", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsHooksConfigPatchRequestJsonXf3693f2f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsHooksConfigPatchRequestJsonXf3693f2f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("content_type", value.contentTypeState, json::encodeToJsonElement)
        putState("insecure_ssl", value.insecureSslState, json::encodeToJsonElement)
        putState("secret", value.secretState, json::encodeToJsonElement)
        putState("url", value.urlState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsHooksConfigPatchRequestJsonXf3693f2f(block: InlineOrgsHooksConfigPatchRequestJsonXf3693f2f.Builder.() -> Unit): InlineOrgsHooksConfigPatchRequestJsonXf3693f2f = InlineOrgsHooksConfigPatchRequestJsonXf3693f2f.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineOrgsHooksConfigPatchRequestJsonXf3693f2f property '" + name + "' is not nullable")
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
