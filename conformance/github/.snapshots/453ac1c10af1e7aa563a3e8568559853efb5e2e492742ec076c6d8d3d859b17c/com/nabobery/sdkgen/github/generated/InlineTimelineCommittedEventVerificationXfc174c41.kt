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
 * sdkgen://source/openapi.yaml#/components/schemas/timeline-committed-event/properties/verification.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/timeline-committed-event/properties/verification
 */
@Serializable(with = InlineTimelineCommittedEventVerificationXfc174c41.Serializer::class)
public class InlineTimelineCommittedEventVerificationXfc174c41(
  public val payload: String?,
  public val reason: String,
  public val signature: String?,
  public val verified: Boolean,
  public val verifiedAt: String?,
) {
  public class Builder {
    private var reasonValue: String? = null

    public var reason: String
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

    public fun build(): InlineTimelineCommittedEventVerificationXfc174c41 {
      check(reasonValue != null) { "reason is required" }
      check(verifiedValue != null) { "verified is required" }
      check(payloadState !== FieldState.Absent) { "payload is required, even when null" }
      check(signatureState !== FieldState.Absent) { "signature is required, even when null" }
      check(verifiedAtState !== FieldState.Absent) { "verifiedAt is required, even when null" }
      return InlineTimelineCommittedEventVerificationXfc174c41(
        payload = payloadState.valueOrNull(),
        reason = reason,
        signature = signatureState.valueOrNull(),
        verified = verified,
        verifiedAt = verifiedAtState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTimelineCommittedEventVerificationXfc174c41 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineTimelineCommittedEventVerificationXfc174c41> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTimelineCommittedEventVerificationXfc174c41 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTimelineCommittedEventVerificationXfc174c41")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTimelineCommittedEventVerificationXfc174c41 must be a JSON object")
      val reason = json.decodeRequired<String>(rawObject, "reason")
      val verified = json.decodeRequired<Boolean>(rawObject, "verified")
      if (!rawObject.containsKey("payload")) {
        throw SerializationException("InlineTimelineCommittedEventVerificationXfc174c41 is missing required property 'payload'")
      }
      val payload = rawObject["payload"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("signature")) {
        throw SerializationException("InlineTimelineCommittedEventVerificationXfc174c41 is missing required property 'signature'")
      }
      val signature = rawObject["signature"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("verified_at")) {
        throw SerializationException("InlineTimelineCommittedEventVerificationXfc174c41 is missing required property 'verified_at'")
      }
      val verifiedAt = rawObject["verified_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineTimelineCommittedEventVerificationXfc174c41(
        payload = payload,
        reason = reason,
        signature = signature,
        verified = verified,
        verifiedAt = verifiedAt,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTimelineCommittedEventVerificationXfc174c41) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTimelineCommittedEventVerificationXfc174c41")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payload", value.payload?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("reason", value.reason)
        put("signature", value.signature?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("verified", json.encodeToJsonElement(value.verified))
        put("verified_at", value.verifiedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineTimelineCommittedEventVerificationXfc174c41(block: InlineTimelineCommittedEventVerificationXfc174c41.Builder.() -> Unit): InlineTimelineCommittedEventVerificationXfc174c41 = InlineTimelineCommittedEventVerificationXfc174c41.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineTimelineCommittedEventVerificationXfc174c41 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineTimelineCommittedEventVerificationXfc174c41 property '" + name + "' is not nullable")
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
