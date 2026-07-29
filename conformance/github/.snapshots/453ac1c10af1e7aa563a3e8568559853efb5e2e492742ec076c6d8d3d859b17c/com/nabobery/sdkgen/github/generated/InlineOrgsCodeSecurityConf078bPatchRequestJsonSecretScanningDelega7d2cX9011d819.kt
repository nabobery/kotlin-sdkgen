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
 * Feature options for secret scanning delegated bypass
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations~1{configuration_id}/patch/requestBod
 * y/content/application~1json/schema/properties/secret_scanning_delegated_bypass_options
 */
@Serializable(with = InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega7d2cX9011d819.Serializer::class)
public class InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega7d2cX9011d819 internal constructor(
  reviewersState: FieldState<List<InlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238>>,
) {
  private val reviewersState:
      FieldState<List<InlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238>> =
      reviewersState.copyValue { fieldValue -> fieldValue.toList() }

  /**
   * The bypass reviewers for secret scanning delegated bypass
   */
  public val reviewers: List<InlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238>?
    get() = reviewersState.valueOrNull()

  public constructor() : this(reviewersState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `reviewers`.
   */
  public fun reviewersPresence(): FieldPresence = reviewersState.presence

  public class Builder {
    private var reviewersState:
        FieldState<List<InlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238>> =
        FieldState.Absent

    /**
     * The bypass reviewers for secret scanning delegated bypass
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var reviewers: List<InlineOrgsCodeSecurityConf078bPatchRequestJsonItemX25f0b238>?
      get() = reviewersState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "reviewers is not nullable; call unsetReviewers() to omit it" }
        reviewersState = FieldState.Value(present.toList())
      }

    /**
     * Omits `reviewers` from serialized output.
     */
    public fun unsetReviewers() {
      reviewersState = FieldState.Absent
    }

    public fun build(): InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega7d2cX9011d819 = InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega7d2cX9011d819(
      reviewersState = reviewersState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega7d2cX9011d819 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega7d2cX9011d819> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega7d2cX9011d819 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega7d2cX9011d819")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega7d2cX9011d819 must be a JSON object")
      return InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega7d2cX9011d819(
        reviewersState = json.decodeOptional(rawObject, "reviewers", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega7d2cX9011d819) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega7d2cX9011d819")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("reviewers", value.reviewersState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega7d2cX9011d819(block: InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega7d2cX9011d819.Builder.() -> Unit): InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega7d2cX9011d819 = InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega7d2cX9011d819.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega7d2cX9011d819 property '" + name + "' is not nullable")
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
