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
 * Use the `status` property to enable or disable secret scanning push protection for this repository. For more
 * information, see "[Protecting pushes with secret
 * scanning](/code-security/secret-scanning/protecting-pushes-with-secret-scanning)."
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}/patch/requestBody/content/application~1json/schema/prope
 * rties/security_and_analysis/properties/secret_scanning_push_protection
 */
@Serializable(with = InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningPushPr52c7X4e6776eb.Serializer::class)
public class InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningPushPr52c7X4e6776eb internal constructor(
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

    public fun build(): InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningPushPr52c7X4e6776eb = InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningPushPr52c7X4e6776eb(
      statusState = statusState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningPushPr52c7X4e6776eb = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningPushPr52c7X4e6776eb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningPushPr52c7X4e6776eb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningPushPr52c7X4e6776eb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningPushPr52c7X4e6776eb must be a JSON object")
      return InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningPushPr52c7X4e6776eb(
        statusState = json.decodeOptional(rawObject, "status", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningPushPr52c7X4e6776eb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningPushPr52c7X4e6776eb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("status", value.statusState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningPushPr52c7X4e6776eb(block: InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningPushPr52c7X4e6776eb.Builder.() -> Unit): InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningPushPr52c7X4e6776eb = InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningPushPr52c7X4e6776eb.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningPushPr52c7X4e6776eb property '" + name + "' is not nullable")
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
