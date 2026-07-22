package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Feature options for secret scanning delegated bypass.
 * This object is only honored when `security_and_analysis.secret_scanning_delegated_bypass.status` is set to `enabled`.
 * You can send this object in the same request as `secret_scanning_delegated_bypass`, or update just the options in a
 * separate request.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}/patch/requestBody/content/application~1json/schema/prope
 * rties/security_and_analysis/properties/secret_scanning_delegated_bypass_options
 */
@Serializable(with = InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega7d2cXdc4f602f.Serializer::class)
public class InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega7d2cXdc4f602f internal constructor(
  private val reviewersState:
      FieldState<List<InlineReposPatchRequestJsonSecurityAndAnalysisItemX22e9b4be>>,
) {
  /**
   * The bypass reviewers for secret scanning delegated bypass.
   * If you omit this field, the existing set of reviewers is unchanged.
   */
  public val reviewers: List<InlineReposPatchRequestJsonSecurityAndAnalysisItemX22e9b4be>?
    get() = reviewersState.valueOrNull()

  public constructor() : this(reviewersState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `reviewers`.
   */
  public fun reviewersPresence(): FieldPresence = reviewersState.presence

  public class Builder {
    private var reviewersState:
        FieldState<List<InlineReposPatchRequestJsonSecurityAndAnalysisItemX22e9b4be>> =
        FieldState.Absent

    /**
     * The bypass reviewers for secret scanning delegated bypass.
     * If you omit this field, the existing set of reviewers is unchanged.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var reviewers: List<InlineReposPatchRequestJsonSecurityAndAnalysisItemX22e9b4be>?
      get() = reviewersState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "reviewers is not nullable; call unsetReviewers() to omit it" }
        reviewersState = FieldState.Value(present)
      }

    /**
     * Omits `reviewers` from serialized output.
     */
    public fun unsetReviewers() {
      reviewersState = FieldState.Absent
    }

    public fun build(): InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega7d2cXdc4f602f = InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega7d2cXdc4f602f(
      reviewersState = reviewersState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega7d2cXdc4f602f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega7d2cXdc4f602f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega7d2cXdc4f602f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega7d2cXdc4f602f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega7d2cXdc4f602f must be a JSON object")
      return InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega7d2cXdc4f602f(
        reviewersState = json.decodeOptional(rawObject, "reviewers", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega7d2cXdc4f602f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega7d2cXdc4f602f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("reviewers", value.reviewersState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega7d2cXdc4f602f(block: InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega7d2cXdc4f602f.Builder.() -> Unit): InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega7d2cXdc4f602f = InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega7d2cXdc4f602f.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega7d2cXdc4f602f property '" + name + "' is not nullable")
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
