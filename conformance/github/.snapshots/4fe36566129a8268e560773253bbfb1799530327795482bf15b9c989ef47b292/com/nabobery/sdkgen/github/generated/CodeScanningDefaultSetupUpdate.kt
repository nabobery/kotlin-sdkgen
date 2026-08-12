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
 * Configuration for code scanning default setup.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-default-setup-update
 */
@Serializable(with = CodeScanningDefaultSetupUpdate.Serializer::class)
public class CodeScanningDefaultSetupUpdate internal constructor(
  languagesState: FieldState<List<InlineCodeScanningDefaultSetupUpdateLanguagesItemX8b5d917f>>,
  private val querySuiteState: FieldState<InlineCodeScanningDefaultSetupUpdateQuerySuiteXde8d0fa4>,
  private val runnerLabelState: FieldState<String?>,
  private val runnerTypeState: FieldState<InlineCodeScanningDefaultSetupUpdateRunnerTypeXc627b4a8>,
  private val stateState: FieldState<InlineCodeScanningDefaultSetupUpdateStateX39c3f464>,
  private val threatModelState:
      FieldState<InlineCodeScanningDefaultSetupUpdateThreatModelX53e1c95e>,
) {
  private val languagesState:
      FieldState<List<InlineCodeScanningDefaultSetupUpdateLanguagesItemX8b5d917f>> =
      languagesState.copyValue { fieldValue -> fieldValue.toList() }

  /**
   * CodeQL languages to be analyzed.
   */
  public val languages: List<InlineCodeScanningDefaultSetupUpdateLanguagesItemX8b5d917f>?
    get() = languagesState.valueOrNull()

  /**
   * CodeQL query suite to be used.
   */
  public val querySuite: InlineCodeScanningDefaultSetupUpdateQuerySuiteXde8d0fa4?
    get() = querySuiteState.valueOrNull()

  /**
   * Runner label to be used if the runner type is labeled.
   */
  public val runnerLabel: String?
    get() = runnerLabelState.valueOrNull()

  /**
   * Runner type to be used.
   */
  public val runnerType: InlineCodeScanningDefaultSetupUpdateRunnerTypeXc627b4a8?
    get() = runnerTypeState.valueOrNull()

  /**
   * The desired state of code scanning default setup.
   */
  public val state: InlineCodeScanningDefaultSetupUpdateStateX39c3f464?
    get() = stateState.valueOrNull()

  /**
   * Threat model to be used for code scanning analysis. Use `remote` to analyze only network sources and
   * `remote_and_local` to include local sources like filesystem access, command-line arguments, database reads,
   * environment variable and standard input.
   */
  public val threatModel: InlineCodeScanningDefaultSetupUpdateThreatModelX53e1c95e?
    get() = threatModelState.valueOrNull()

  public constructor() : this(languagesState = FieldState.Absent,
  querySuiteState = FieldState.Absent,
  runnerLabelState = FieldState.Absent,
  runnerTypeState = FieldState.Absent,
  stateState = FieldState.Absent,
  threatModelState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `languages`.
   */
  public fun languagesPresence(): FieldPresence = languagesState.presence

  /**
   * Returns the wire presence of `query_suite`.
   */
  public fun querySuitePresence(): FieldPresence = querySuiteState.presence

  /**
   * Returns the wire presence of `runner_label`.
   */
  public fun runnerLabelPresence(): FieldPresence = runnerLabelState.presence

  /**
   * Returns the wire presence of `runner_type`.
   */
  public fun runnerTypePresence(): FieldPresence = runnerTypeState.presence

  /**
   * Returns the wire presence of `state`.
   */
  public fun statePresence(): FieldPresence = stateState.presence

  /**
   * Returns the wire presence of `threat_model`.
   */
  public fun threatModelPresence(): FieldPresence = threatModelState.presence

  public class Builder {
    private var languagesState:
        FieldState<List<InlineCodeScanningDefaultSetupUpdateLanguagesItemX8b5d917f>> =
        FieldState.Absent

    /**
     * CodeQL languages to be analyzed.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var languages: List<InlineCodeScanningDefaultSetupUpdateLanguagesItemX8b5d917f>?
      get() = languagesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "languages is not nullable; call unsetLanguages() to omit it" }
        languagesState = FieldState.Value(present.toList())
      }

    private var querySuiteState: FieldState<InlineCodeScanningDefaultSetupUpdateQuerySuiteXde8d0fa4>
        = FieldState.Absent

    /**
     * CodeQL query suite to be used.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var querySuite: InlineCodeScanningDefaultSetupUpdateQuerySuiteXde8d0fa4?
      get() = querySuiteState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "querySuite is not nullable; call unsetQuerySuite() to omit it" }
        querySuiteState = FieldState.Value(present)
      }

    private var runnerLabelState: FieldState<String?> = FieldState.Absent

    /**
     * Runner label to be used if the runner type is labeled.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var runnerLabel: String?
      get() = runnerLabelState.valueOrNull()
      set(`value`) {
        runnerLabelState = value.toNullableFieldState()
      }

    private var runnerTypeState: FieldState<InlineCodeScanningDefaultSetupUpdateRunnerTypeXc627b4a8>
        = FieldState.Absent

    /**
     * Runner type to be used.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var runnerType: InlineCodeScanningDefaultSetupUpdateRunnerTypeXc627b4a8?
      get() = runnerTypeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "runnerType is not nullable; call unsetRunnerType() to omit it" }
        runnerTypeState = FieldState.Value(present)
      }

    private var stateState: FieldState<InlineCodeScanningDefaultSetupUpdateStateX39c3f464> =
        FieldState.Absent

    /**
     * The desired state of code scanning default setup.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var state: InlineCodeScanningDefaultSetupUpdateStateX39c3f464?
      get() = stateState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "state is not nullable; call unsetState() to omit it" }
        stateState = FieldState.Value(present)
      }

    private var threatModelState:
        FieldState<InlineCodeScanningDefaultSetupUpdateThreatModelX53e1c95e> = FieldState.Absent

    /**
     * Threat model to be used for code scanning analysis. Use `remote` to analyze only network sources and
     * `remote_and_local` to include local sources like filesystem access, command-line arguments, database reads,
     * environment variable and standard input.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var threatModel: InlineCodeScanningDefaultSetupUpdateThreatModelX53e1c95e?
      get() = threatModelState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "threatModel is not nullable; call unsetThreatModel() to omit it" }
        threatModelState = FieldState.Value(present)
      }

    /**
     * Omits `languages` from serialized output.
     */
    public fun unsetLanguages() {
      languagesState = FieldState.Absent
    }

    /**
     * Omits `query_suite` from serialized output.
     */
    public fun unsetQuerySuite() {
      querySuiteState = FieldState.Absent
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

    /**
     * Omits `state` from serialized output.
     */
    public fun unsetState() {
      stateState = FieldState.Absent
    }

    /**
     * Omits `threat_model` from serialized output.
     */
    public fun unsetThreatModel() {
      threatModelState = FieldState.Absent
    }

    public fun build(): CodeScanningDefaultSetupUpdate = CodeScanningDefaultSetupUpdate(
      languagesState = languagesState,
      querySuiteState = querySuiteState,
      runnerLabelState = runnerLabelState,
      runnerTypeState = runnerTypeState,
      stateState = stateState,
      threatModelState = threatModelState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeScanningDefaultSetupUpdate = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CodeScanningDefaultSetupUpdate> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeScanningDefaultSetupUpdate {
      val jsonDecoder = decoder.requireJsonDecoder("CodeScanningDefaultSetupUpdate")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeScanningDefaultSetupUpdate must be a JSON object")
      return CodeScanningDefaultSetupUpdate(
        languagesState = json.decodeOptional(rawObject, "languages", nullable = false),
        querySuiteState = json.decodeOptional(rawObject, "query_suite", nullable = false),
        runnerLabelState = json.decodeOptional(rawObject, "runner_label", nullable = true),
        runnerTypeState = json.decodeOptional(rawObject, "runner_type", nullable = false),
        stateState = json.decodeOptional(rawObject, "state", nullable = false),
        threatModelState = json.decodeOptional(rawObject, "threat_model", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeScanningDefaultSetupUpdate) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeScanningDefaultSetupUpdate")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("languages", value.languagesState, json::encodeToJsonElement)
        putState("query_suite", value.querySuiteState, json::encodeToJsonElement)
        putState("runner_label", value.runnerLabelState, json::encodeToJsonElement)
        putState("runner_type", value.runnerTypeState, json::encodeToJsonElement)
        putState("state", value.stateState, json::encodeToJsonElement)
        putState("threat_model", value.threatModelState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeScanningDefaultSetupUpdate(block: CodeScanningDefaultSetupUpdate.Builder.() -> Unit): CodeScanningDefaultSetupUpdate = CodeScanningDefaultSetupUpdate.build(block)

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
    if (!nullable) throw SerializationException("CodeScanningDefaultSetupUpdate property '" + name + "' is not nullable")
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
