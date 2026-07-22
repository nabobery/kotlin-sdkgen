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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-suites~1preferences/patch/requestBody/content/app
 * lication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-suites~1preferences/patch/requestBody/content/app
 * lication~1json/schema
 */
@Serializable(with = InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd.Serializer::class)
public class InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd internal constructor(
  private val autoTriggerChecksState:
      FieldState<List<InlineReposCheckSuitesPreferencesPatchRequestJsonAutoTriggerChecksItemX5186cf7d>>,
) {
  /**
   * Enables or disables automatic creation of CheckSuite events upon pushes to the repository. Enabled by default.
   */
  public val autoTriggerChecks:
      List<InlineReposCheckSuitesPreferencesPatchRequestJsonAutoTriggerChecksItemX5186cf7d>?
    get() = autoTriggerChecksState.valueOrNull()

  public constructor() : this(autoTriggerChecksState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `auto_trigger_checks`.
   */
  public fun autoTriggerChecksPresence(): FieldPresence = autoTriggerChecksState.presence

  public class Builder {
    private var autoTriggerChecksState:
        FieldState<List<InlineReposCheckSuitesPreferencesPatchRequestJsonAutoTriggerChecksItemX5186cf7d>>
        = FieldState.Absent

    /**
     * Enables or disables automatic creation of CheckSuite events upon pushes to the repository. Enabled by default.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var autoTriggerChecks:
        List<InlineReposCheckSuitesPreferencesPatchRequestJsonAutoTriggerChecksItemX5186cf7d>?
      get() = autoTriggerChecksState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "autoTriggerChecks is not nullable; call unsetAutoTriggerChecks() to omit it" }
        autoTriggerChecksState = FieldState.Value(present)
      }

    /**
     * Omits `auto_trigger_checks` from serialized output.
     */
    public fun unsetAutoTriggerChecks() {
      autoTriggerChecksState = FieldState.Absent
    }

    public fun build(): InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd = InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd(
      autoTriggerChecksState = autoTriggerChecksState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd must be a JSON object")
      return InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd(
        autoTriggerChecksState = json.decodeOptional(rawObject, "auto_trigger_checks", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("auto_trigger_checks", value.autoTriggerChecksState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd(block: InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd.Builder.() -> Unit): InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd = InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd property '" + name + "' is not nullable")
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
