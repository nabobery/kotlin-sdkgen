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
 * Use the `status` property to enable or disable GitHub Advanced Security for this repository.
 * For more information, see "[About GitHub Advanced
 * Security](/github/getting-started-with-github/learning-about-github/about-github-advanced-security)."
 *
 * For standalone Code Scanning or Secret Protection products, this parameter cannot be used.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}/patch/requestBody/content/application~1json/schema/prope
 * rties/security_and_analysis/properties/advanced_security
 */
@Serializable(with = InlineReposPatchRequestJsonSecurityAndAnalysisAdvancedSecurityX79744b07.Serializer::class)
public class InlineReposPatchRequestJsonSecurityAndAnalysisAdvancedSecurityX79744b07 internal constructor(
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

    public fun build(): InlineReposPatchRequestJsonSecurityAndAnalysisAdvancedSecurityX79744b07 = InlineReposPatchRequestJsonSecurityAndAnalysisAdvancedSecurityX79744b07(
      statusState = statusState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPatchRequestJsonSecurityAndAnalysisAdvancedSecurityX79744b07 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposPatchRequestJsonSecurityAndAnalysisAdvancedSecurityX79744b07> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPatchRequestJsonSecurityAndAnalysisAdvancedSecurityX79744b07 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPatchRequestJsonSecurityAndAnalysisAdvancedSecurityX79744b07")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPatchRequestJsonSecurityAndAnalysisAdvancedSecurityX79744b07 must be a JSON object")
      return InlineReposPatchRequestJsonSecurityAndAnalysisAdvancedSecurityX79744b07(
        statusState = json.decodeOptional(rawObject, "status", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPatchRequestJsonSecurityAndAnalysisAdvancedSecurityX79744b07) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPatchRequestJsonSecurityAndAnalysisAdvancedSecurityX79744b07")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("status", value.statusState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPatchRequestJsonSecurityAndAnalysisAdvancedSecurityX79744b07(block: InlineReposPatchRequestJsonSecurityAndAnalysisAdvancedSecurityX79744b07.Builder.() -> Unit): InlineReposPatchRequestJsonSecurityAndAnalysisAdvancedSecurityX79744b07 = InlineReposPatchRequestJsonSecurityAndAnalysisAdvancedSecurityX79744b07.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposPatchRequestJsonSecurityAndAnalysisAdvancedSecurityX79744b07 property '" + name + "' is not nullable")
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
