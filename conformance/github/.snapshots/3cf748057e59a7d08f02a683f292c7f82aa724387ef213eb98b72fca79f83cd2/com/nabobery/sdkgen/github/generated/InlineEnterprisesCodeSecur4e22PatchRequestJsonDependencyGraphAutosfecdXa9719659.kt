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
 * Feature options for Automatic dependency submission
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1code-security~1configurations~1{configuration_id}/pa
 * tch/requestBody/content/application~1json/schema/properties/dependency_graph_autosubmit_action_options
 */
@Serializable(with = InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutosfecdXa9719659.Serializer::class)
public class InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutosfecdXa9719659 internal constructor(
  private val labeledRunnersState: FieldState<Boolean>,
) {
  /**
   * Whether to use runners labeled with 'dependency-submission' or standard GitHub runners.
   */
  public val labeledRunners: Boolean?
    get() = labeledRunnersState.valueOrNull()

  public constructor() : this(labeledRunnersState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `labeled_runners`.
   */
  public fun labeledRunnersPresence(): FieldPresence = labeledRunnersState.presence

  public class Builder {
    private var labeledRunnersState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether to use runners labeled with 'dependency-submission' or standard GitHub runners.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var labeledRunners: Boolean?
      get() = labeledRunnersState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "labeledRunners is not nullable; call unsetLabeledRunners() to omit it" }
        labeledRunnersState = FieldState.Value(present)
      }

    /**
     * Omits `labeled_runners` from serialized output.
     */
    public fun unsetLabeledRunners() {
      labeledRunnersState = FieldState.Absent
    }

    public fun build(): InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutosfecdXa9719659 = InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutosfecdXa9719659(
      labeledRunnersState = labeledRunnersState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutosfecdXa9719659 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutosfecdXa9719659> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutosfecdXa9719659 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutosfecdXa9719659")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutosfecdXa9719659 must be a JSON object")
      return InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutosfecdXa9719659(
        labeledRunnersState = json.decodeOptional(rawObject, "labeled_runners", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutosfecdXa9719659) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutosfecdXa9719659")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("labeled_runners", value.labeledRunnersState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutosfecdXa9719659(block: InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutosfecdXa9719659.Builder.() -> Unit): InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutosfecdXa9719659 = InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutosfecdXa9719659.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutosfecdXa9719659 property '" + name + "' is not nullable")
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
