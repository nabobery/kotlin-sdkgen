package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}/patch/requestBody/content/application~1json/schema/prope
 * rties/security_and_analysis/properties/secret_scanning_delegated_bypass_options/properties/reviewers/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}/patch/requestBody/content/application~1json/schema/prope
 * rties/security_and_analysis/properties/secret_scanning_delegated_bypass_options/properties/reviewers/items
 */
@Serializable(with = InlineReposPatchRequestJsonSecurityAndAnalysisItemX22e9b4be.Serializer::class)
public class InlineReposPatchRequestJsonSecurityAndAnalysisItemX22e9b4be internal constructor(
  /**
   * The ID of the team or role selected as a bypass reviewer
   */
  public val reviewerId: Int,
  /**
   * The type of the bypass reviewer
   */
  public val reviewerType: InlineReposPatchRequestJsonSecurityAndAnalysisReviewerTypeX962c9554,
  private val modeState: FieldState<InlineReposPatchRequestJsonSecurityAndAnalysisModeX6861066f>,
) {
  /**
   * The bypass mode for the reviewer
   */
  public val mode: InlineReposPatchRequestJsonSecurityAndAnalysisModeX6861066f?
    get() = modeState.valueOrNull()

  public constructor(reviewerId: Int, reviewerType: InlineReposPatchRequestJsonSecurityAndAnalysisReviewerTypeX962c9554) : this(reviewerId = reviewerId,
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
        InlineReposPatchRequestJsonSecurityAndAnalysisReviewerTypeX962c9554? = null

    public var reviewerType: InlineReposPatchRequestJsonSecurityAndAnalysisReviewerTypeX962c9554
      get() = requireNotNull(reviewerTypeValue) { "reviewerType is required" }
      set(`value`) {
        reviewerTypeValue = value
      }

    private var modeState: FieldState<InlineReposPatchRequestJsonSecurityAndAnalysisModeX6861066f> =
        FieldState.Absent

    /**
     * The bypass mode for the reviewer
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var mode: InlineReposPatchRequestJsonSecurityAndAnalysisModeX6861066f?
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

    public fun build(): InlineReposPatchRequestJsonSecurityAndAnalysisItemX22e9b4be {
      check(reviewerIdValue != null) { "reviewerId is required" }
      check(reviewerTypeValue != null) { "reviewerType is required" }
      return InlineReposPatchRequestJsonSecurityAndAnalysisItemX22e9b4be(
        reviewerId = reviewerId,
        reviewerType = reviewerType,
        modeState = modeState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPatchRequestJsonSecurityAndAnalysisItemX22e9b4be = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposPatchRequestJsonSecurityAndAnalysisItemX22e9b4be> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPatchRequestJsonSecurityAndAnalysisItemX22e9b4be {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPatchRequestJsonSecurityAndAnalysisItemX22e9b4be")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPatchRequestJsonSecurityAndAnalysisItemX22e9b4be must be a JSON object")
      val reviewerId = json.decodeRequired<Int>(rawObject, "reviewer_id")
      val reviewerType = json.decodeRequired<InlineReposPatchRequestJsonSecurityAndAnalysisReviewerTypeX962c9554>(rawObject, "reviewer_type")
      return InlineReposPatchRequestJsonSecurityAndAnalysisItemX22e9b4be(
        reviewerId = reviewerId,
        reviewerType = reviewerType,
        modeState = json.decodeOptional(rawObject, "mode", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPatchRequestJsonSecurityAndAnalysisItemX22e9b4be) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPatchRequestJsonSecurityAndAnalysisItemX22e9b4be")
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

public fun inlineReposPatchRequestJsonSecurityAndAnalysisItemX22e9b4be(block: InlineReposPatchRequestJsonSecurityAndAnalysisItemX22e9b4be.Builder.() -> Unit): InlineReposPatchRequestJsonSecurityAndAnalysisItemX22e9b4be = InlineReposPatchRequestJsonSecurityAndAnalysisItemX22e9b4be.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposPatchRequestJsonSecurityAndAnalysisItemX22e9b4be is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineReposPatchRequestJsonSecurityAndAnalysisItemX22e9b4be property '" + name + "' is not nullable")
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
