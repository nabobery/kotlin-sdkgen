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
 * Parameters for AI agent assignment. Only used when an agent bot login is
 * included in `assignees`. Ignored when no agent is being assigned.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1dependabot~1alerts~1{alert_number}/patch/requestBody/co
 * ntent/application~1json/schema/properties/agent_assignment
 */
@Serializable(with = InlineReposDependabotAlertsPatchRequestJsonAgentAssignmentX3d227010.Serializer::class)
public class InlineReposDependabotAlertsPatchRequestJsonAgentAssignmentX3d227010 internal constructor(
  private val customAgentState: FieldState<String>,
  private val customInstructionsState: FieldState<String>,
  private val modelState: FieldState<String>,
) {
  /**
   * A custom agent identifier.
   */
  public val customAgent: String?
    get() = customAgentState.valueOrNull()

  /**
   * Custom instructions for the agent.
   */
  public val customInstructions: String?
    get() = customInstructionsState.valueOrNull()

  /**
   * The model to use for the agent.
   */
  public val model: String?
    get() = modelState.valueOrNull()

  public constructor() : this(customAgentState = FieldState.Absent,
  customInstructionsState = FieldState.Absent,
  modelState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `custom_agent`.
   */
  public fun customAgentPresence(): FieldPresence = customAgentState.presence

  /**
   * Returns the wire presence of `custom_instructions`.
   */
  public fun customInstructionsPresence(): FieldPresence = customInstructionsState.presence

  /**
   * Returns the wire presence of `model`.
   */
  public fun modelPresence(): FieldPresence = modelState.presence

  public class Builder {
    private var customAgentState: FieldState<String> = FieldState.Absent

    /**
     * A custom agent identifier.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var customAgent: String?
      get() = customAgentState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "customAgent is not nullable; call unsetCustomAgent() to omit it" }
        customAgentState = FieldState.Value(present)
      }

    private var customInstructionsState: FieldState<String> = FieldState.Absent

    /**
     * Custom instructions for the agent.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var customInstructions: String?
      get() = customInstructionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "customInstructions is not nullable; call unsetCustomInstructions() to omit it" }
        customInstructionsState = FieldState.Value(present)
      }

    private var modelState: FieldState<String> = FieldState.Absent

    /**
     * The model to use for the agent.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var model: String?
      get() = modelState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "model is not nullable; call unsetModel() to omit it" }
        modelState = FieldState.Value(present)
      }

    /**
     * Omits `custom_agent` from serialized output.
     */
    public fun unsetCustomAgent() {
      customAgentState = FieldState.Absent
    }

    /**
     * Omits `custom_instructions` from serialized output.
     */
    public fun unsetCustomInstructions() {
      customInstructionsState = FieldState.Absent
    }

    /**
     * Omits `model` from serialized output.
     */
    public fun unsetModel() {
      modelState = FieldState.Absent
    }

    public fun build(): InlineReposDependabotAlertsPatchRequestJsonAgentAssignmentX3d227010 = InlineReposDependabotAlertsPatchRequestJsonAgentAssignmentX3d227010(
      customAgentState = customAgentState,
      customInstructionsState = customInstructionsState,
      modelState = modelState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposDependabotAlertsPatchRequestJsonAgentAssignmentX3d227010 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposDependabotAlertsPatchRequestJsonAgentAssignmentX3d227010> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposDependabotAlertsPatchRequestJsonAgentAssignmentX3d227010 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposDependabotAlertsPatchRequestJsonAgentAssignmentX3d227010")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposDependabotAlertsPatchRequestJsonAgentAssignmentX3d227010 must be a JSON object")
      return InlineReposDependabotAlertsPatchRequestJsonAgentAssignmentX3d227010(
        customAgentState = json.decodeOptional(rawObject, "custom_agent", nullable = false),
        customInstructionsState = json.decodeOptional(rawObject, "custom_instructions", nullable = false),
        modelState = json.decodeOptional(rawObject, "model", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposDependabotAlertsPatchRequestJsonAgentAssignmentX3d227010) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposDependabotAlertsPatchRequestJsonAgentAssignmentX3d227010")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("custom_agent", value.customAgentState, json::encodeToJsonElement)
        putState("custom_instructions", value.customInstructionsState, json::encodeToJsonElement)
        putState("model", value.modelState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposDependabotAlertsPatchRequestJsonAgentAssignmentX3d227010(block: InlineReposDependabotAlertsPatchRequestJsonAgentAssignmentX3d227010.Builder.() -> Unit): InlineReposDependabotAlertsPatchRequestJsonAgentAssignmentX3d227010 = InlineReposDependabotAlertsPatchRequestJsonAgentAssignmentX3d227010.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposDependabotAlertsPatchRequestJsonAgentAssignmentX3d227010 property '" + name + "' is not nullable")
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
