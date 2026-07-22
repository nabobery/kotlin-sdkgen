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
 * Use the `status` property to enable or disable secret scanning delegated alert dismissal for this repository.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}/patch/requestBody/content/application~1json/schema/prope
 * rties/security_and_analysis/properties/secret_scanning_delegated_alert_dismissal
 */
@Serializable(with = InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega870cX0c83a432.Serializer::class)
public class InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega870cX0c83a432 internal constructor(
  private val statusState: FieldState<String>,
) {
  /**
   * Can be `enabled` or `disabled`.
   */
  public val status: String?
    get() = statusState.valueOrNull()

  public constructor() : this(statusState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `status`.
   */
  public fun statusPresence(): FieldPresence = statusState.presence

  public class Builder {
    private var statusState: FieldState<String> = FieldState.Absent

    /**
     * Can be `enabled` or `disabled`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var status: String?
      get() = statusState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "status is not nullable; call unsetStatus() to omit it" }
        statusState = FieldState.Value(present)
      }

    /**
     * Omits `status` from serialized output.
     */
    public fun unsetStatus() {
      statusState = FieldState.Absent
    }

    public fun build(): InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega870cX0c83a432 = InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega870cX0c83a432(
      statusState = statusState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega870cX0c83a432 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega870cX0c83a432> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega870cX0c83a432 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega870cX0c83a432")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega870cX0c83a432 must be a JSON object")
      return InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega870cX0c83a432(
        statusState = json.decodeOptional(rawObject, "status", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega870cX0c83a432) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega870cX0c83a432")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("status", value.statusState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega870cX0c83a432(block: InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega870cX0c83a432.Builder.() -> Unit): InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega870cX0c83a432 = InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega870cX0c83a432.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega870cX0c83a432 property '" + name + "' is not nullable")
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
