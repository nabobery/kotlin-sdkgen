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
 * Feature options for code scanning default setup
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-default-setup-options
 */
@Serializable(with = CodeScanningDefaultSetupOptions.Serializer::class)
public class CodeScanningDefaultSetupOptions internal constructor(
  private val runnerLabelState: FieldState<String?>,
  private val runnerTypeState: FieldState<InlineCodeScanningDefaultSetupOptionsRunnerTypeX43fcadd0>,
) {
  /**
   * The label of the runner to use for code scanning default setup when runner_type is 'labeled'.
   */
  public val runnerLabel: String?
    get() = runnerLabelState.valueOrNull()

  /**
   * Whether to use labeled runners or standard GitHub runners.
   */
  public val runnerType: InlineCodeScanningDefaultSetupOptionsRunnerTypeX43fcadd0?
    get() = runnerTypeState.valueOrNull()

  public constructor() : this(runnerLabelState = FieldState.Absent,
  runnerTypeState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `runner_label`.
   */
  public fun runnerLabelPresence(): FieldPresence = runnerLabelState.presence

  /**
   * Returns the wire presence of `runner_type`.
   */
  public fun runnerTypePresence(): FieldPresence = runnerTypeState.presence

  public class Builder {
    private var runnerLabelState: FieldState<String?> = FieldState.Absent

    /**
     * The label of the runner to use for code scanning default setup when runner_type is 'labeled'.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var runnerLabel: String?
      get() = runnerLabelState.valueOrNull()
      set(`value`) {
        runnerLabelState = value.toNullableFieldState()
      }

    private var runnerTypeState:
        FieldState<InlineCodeScanningDefaultSetupOptionsRunnerTypeX43fcadd0> = FieldState.Absent

    /**
     * Whether to use labeled runners or standard GitHub runners.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var runnerType: InlineCodeScanningDefaultSetupOptionsRunnerTypeX43fcadd0?
      get() = runnerTypeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "runnerType is not nullable; call unsetRunnerType() to omit it" }
        runnerTypeState = FieldState.Value(present)
      }

    /**
     * Omits `runner_label` from serialized output.
     */
    public fun unsetRunnerLabel() {
      runnerLabelState = FieldState.Absent
    }

    /**
     * Omits `runner_type` from serialized output.
     */
    public fun unsetRunnerType() {
      runnerTypeState = FieldState.Absent
    }

    public fun build(): CodeScanningDefaultSetupOptions = CodeScanningDefaultSetupOptions(
      runnerLabelState = runnerLabelState,
      runnerTypeState = runnerTypeState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeScanningDefaultSetupOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CodeScanningDefaultSetupOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeScanningDefaultSetupOptions {
      val jsonDecoder = decoder.requireJsonDecoder("CodeScanningDefaultSetupOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeScanningDefaultSetupOptions must be a JSON object")
      return CodeScanningDefaultSetupOptions(
        runnerLabelState = json.decodeOptional(rawObject, "runner_label", nullable = true),
        runnerTypeState = json.decodeOptional(rawObject, "runner_type", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeScanningDefaultSetupOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeScanningDefaultSetupOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("runner_label", value.runnerLabelState, json::encodeToJsonElement)
        putState("runner_type", value.runnerTypeState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeScanningDefaultSetupOptions(block: CodeScanningDefaultSetupOptions.Builder.() -> Unit): CodeScanningDefaultSetupOptions = CodeScanningDefaultSetupOptions.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("CodeScanningDefaultSetupOptions property '" + name + "' is not nullable")
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
