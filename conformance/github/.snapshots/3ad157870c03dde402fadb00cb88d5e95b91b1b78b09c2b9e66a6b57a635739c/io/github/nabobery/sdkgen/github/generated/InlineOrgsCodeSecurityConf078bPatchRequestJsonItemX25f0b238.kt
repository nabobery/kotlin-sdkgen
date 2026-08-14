package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations~1{configuration_id}/patch/requestBod
 * y/content/application~1json/schema/properties/secret_scanning_delegated_bypass_options/properties/reviewers/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations~1{configuration_id}/patch/requestBod
 * y/content/application~1json/schema/properties/secret_scanning_delegated_bypass_options/properties/reviewers/items
 */
@Serializable(with = InlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238.Serializer::class)
public class InlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238 internal constructor(
  /**
   * The ID of the team or role selected as a bypass reviewer
   */
  public val reviewerId: Int,
  /**
   * The type of the bypass reviewer
   */
  public val reviewerType: InlineOrgsCodeSecurityConf078bPatchRequestJsonReviewerTypeX2ed4ab83,
  private val modeState: FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonModeX1b8be95a>,
) {
  /**
   * The bypass mode for the reviewer
   */
  public val mode: InlineOrgsCodeSecurityConf078bPatchRequestJsonModeX1b8be95a?
    get() = modeState.valueOrNull()

  public constructor(reviewerId: Int, reviewerType: InlineOrgsCodeSecurityConf078bPatchRequestJsonReviewerTypeX2ed4ab83) : this(reviewerId = reviewerId,
  reviewerType = reviewerType,
  modeState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `mode`.
   */
  public fun modePresence(): FieldPresence = modeState.presence

  public class Builder {
    private var reviewerIdValue: Int? = null

    public var reviewerId: Int
      get() = requireNotNull(reviewerIdValue) { "reviewerId is required" }
      set(`value`) {
        reviewerIdValue = value
      }

    private var reviewerTypeValue:
        InlineOrgsCodeSecurityConf078bPatchRequestJsonReviewerTypeX2ed4ab83? = null

    public var reviewerType: InlineOrgsCodeSecurityConf078bPatchRequestJsonReviewerTypeX2ed4ab83
      get() = requireNotNull(reviewerTypeValue) { "reviewerType is required" }
      set(`value`) {
        reviewerTypeValue = value
      }

    private var modeState: FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonModeX1b8be95a> =
        FieldState.Absent

    /**
     * The bypass mode for the reviewer
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var mode: InlineOrgsCodeSecurityConf078bPatchRequestJsonModeX1b8be95a?
      get() = modeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "mode is not nullable; call unsetMode() to omit it" }
        modeState = FieldState.Value(present)
      }

    /**
     * Omits `mode` from serialized output.
     */
    public fun unsetMode() {
      modeState = FieldState.Absent
    }

    public fun build(): InlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238 {
      check(reviewerIdValue != null) { "reviewerId is required" }
      check(reviewerTypeValue != null) { "reviewerType is required" }
      return InlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238(
        reviewerId = reviewerId,
        reviewerType = reviewerType,
        modeState = modeState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238 must be a JSON object")
      val reviewerId = json.decodeRequired<Int>(rawObject, "reviewer_id")
      val reviewerType = json.decodeRequired<InlineOrgsCodeSecurityConf078bPatchRequestJsonReviewerTypeX2ed4ab83>(rawObject, "reviewer_type")
      return InlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238(
        reviewerId = reviewerId,
        reviewerType = reviewerType,
        modeState = json.decodeOptional(rawObject, "mode", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("reviewer_id", json.encodeToJsonElement(value.reviewerId))
        put("reviewer_type", json.encodeToJsonElement(value.reviewerType))
        putState("mode", value.modeState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238(block: InlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238.Builder.() -> Unit): InlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238 = InlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238 property '" + name + "' is not nullable")
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
