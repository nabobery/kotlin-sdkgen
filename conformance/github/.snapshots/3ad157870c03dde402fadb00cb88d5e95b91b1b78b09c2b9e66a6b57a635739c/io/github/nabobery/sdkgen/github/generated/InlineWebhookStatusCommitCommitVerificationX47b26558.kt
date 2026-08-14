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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-status/properties/commit/properties/commit/properties/verifi
 * cation.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-status/properties/commit/properties/commit/properties/verifi
 * cation
 */
@Serializable(with = InlineWebhookStatusCommitCommitVerificationX47b26558.Serializer::class)
public class InlineWebhookStatusCommitCommitVerificationX47b26558(
  public val payload: String?,
  public val reason: InlineWebhookStatusCommitCommitVerificationReasonX05704592,
  public val signature: String?,
  public val verified: Boolean,
  public val verifiedAt: String?,
) {
  public class Builder {
    private var reasonValue: InlineWebhookStatusCommitCommitVerificationReasonX05704592? = null

    public var reason: InlineWebhookStatusCommitCommitVerificationReasonX05704592
      get() = requireNotNull(reasonValue) { "reason is required" }
      set(`value`) {
        reasonValue = value
      }

    private var verifiedValue: Boolean? = null

    public var verified: Boolean
      get() = requireNotNull(verifiedValue) { "verified is required" }
      set(`value`) {
        verifiedValue = value
      }

    private var payloadState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var payload: String?
      get() = payloadState.valueOrNull()
      set(`value`) {
        payloadState = value.toNullableFieldState()
      }

    private var signatureState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var signature: String?
      get() = signatureState.valueOrNull()
      set(`value`) {
        signatureState = value.toNullableFieldState()
      }

    private var verifiedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var verifiedAt: String?
      get() = verifiedAtState.valueOrNull()
      set(`value`) {
        verifiedAtState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookStatusCommitCommitVerificationX47b26558 {
      check(reasonValue != null) { "reason is required" }
      check(verifiedValue != null) { "verified is required" }
      check(payloadState !== FieldState.Absent) { "payload is required, even when null" }
      check(signatureState !== FieldState.Absent) { "signature is required, even when null" }
      check(verifiedAtState !== FieldState.Absent) { "verifiedAt is required, even when null" }
      return InlineWebhookStatusCommitCommitVerificationX47b26558(
        payload = payloadState.valueOrNull(),
        reason = reason,
        signature = signatureState.valueOrNull(),
        verified = verified,
        verifiedAt = verifiedAtState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookStatusCommitCommitVerificationX47b26558 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookStatusCommitCommitVerificationX47b26558> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookStatusCommitCommitVerificationX47b26558 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookStatusCommitCommitVerificationX47b26558")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookStatusCommitCommitVerificationX47b26558 must be a JSON object")
      val reason = json.decodeRequired<InlineWebhookStatusCommitCommitVerificationReasonX05704592>(rawObject, "reason")
      val verified = json.decodeRequired<Boolean>(rawObject, "verified")
      if (!rawObject.containsKey("payload")) {
        throw SerializationException("InlineWebhookStatusCommitCommitVerificationX47b26558 is missing required property 'payload'")
      }
      val payload = rawObject["payload"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("signature")) {
        throw SerializationException("InlineWebhookStatusCommitCommitVerificationX47b26558 is missing required property 'signature'")
      }
      val signature = rawObject["signature"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("verified_at")) {
        throw SerializationException("InlineWebhookStatusCommitCommitVerificationX47b26558 is missing required property 'verified_at'")
      }
      val verifiedAt = rawObject["verified_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookStatusCommitCommitVerificationX47b26558(
        payload = payload,
        reason = reason,
        signature = signature,
        verified = verified,
        verifiedAt = verifiedAt,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookStatusCommitCommitVerificationX47b26558) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookStatusCommitCommitVerificationX47b26558")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payload", value.payload?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("reason", json.encodeToJsonElement(value.reason))
        put("signature", value.signature?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("verified", json.encodeToJsonElement(value.verified))
        put("verified_at", value.verifiedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookStatusCommitCommitVerificationX47b26558(block: InlineWebhookStatusCommitCommitVerificationX47b26558.Builder.() -> Unit): InlineWebhookStatusCommitCommitVerificationX47b26558 = InlineWebhookStatusCommitCommitVerificationX47b26558.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookStatusCommitCommitVerificationX47b26558 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookStatusCommitCommitVerificationX47b26558 property '" + name + "' is not nullable")
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
