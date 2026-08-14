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
 * Security Configuration feature options for code scanning
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-options
 */
@Serializable(with = CodeScanningOptions.Serializer::class)
public class CodeScanningOptions internal constructor(
  private val allowAdvancedState: FieldState<Boolean?>,
) {
  /**
   * Whether to allow repos which use advanced setup
   */
  public val allowAdvanced: Boolean?
    get() = allowAdvancedState.valueOrNull()

  public constructor() : this(allowAdvancedState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `allow_advanced`.
   */
  public fun allowAdvancedPresence(): FieldPresence = allowAdvancedState.presence

  public class Builder {
    private var allowAdvancedState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Whether to allow repos which use advanced setup
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var allowAdvanced: Boolean?
      get() = allowAdvancedState.valueOrNull()
      set(`value`) {
        allowAdvancedState = value.toNullableFieldState()
      }

    /**
     * Omits `allow_advanced` from serialized output.
     */
    public fun unsetAllowAdvanced() {
      allowAdvancedState = FieldState.Absent
    }

    public fun build(): CodeScanningOptions = CodeScanningOptions(
      allowAdvancedState = allowAdvancedState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeScanningOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CodeScanningOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeScanningOptions {
      val jsonDecoder = decoder.requireJsonDecoder("CodeScanningOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeScanningOptions must be a JSON object")
      return CodeScanningOptions(
        allowAdvancedState = json.decodeOptional(rawObject, "allow_advanced", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeScanningOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeScanningOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("allow_advanced", value.allowAdvancedState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeScanningOptions(block: CodeScanningOptions.Builder.() -> Unit): CodeScanningOptions = CodeScanningOptions.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("CodeScanningOptions property '" + name + "' is not nullable")
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
