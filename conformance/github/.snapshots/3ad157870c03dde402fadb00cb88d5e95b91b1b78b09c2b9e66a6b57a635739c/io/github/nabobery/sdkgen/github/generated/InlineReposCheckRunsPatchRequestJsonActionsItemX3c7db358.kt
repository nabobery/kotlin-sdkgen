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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs~1{check_run_id}/patch/requestBody/content/ap
 * plication~1json/schema/properties/actions/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs~1{check_run_id}/patch/requestBody/content/ap
 * plication~1json/schema/properties/actions/items
 */
@Serializable(with = InlineReposCheckRunsPatchRequestJsonActionsItemX3c7db358.Serializer::class)
public class InlineReposCheckRunsPatchRequestJsonActionsItemX3c7db358(
  /**
   * A short explanation of what this action would do. The maximum size is 40 characters.
   */
  public val description: String,
  /**
   * A reference for the action on the integrator's system. The maximum size is 20 characters.
   */
  public val identifier: String,
  /**
   * The text to be displayed on a button in the web UI. The maximum size is 20 characters.
   */
  public val label: String,
) {
  public class Builder {
    private var descriptionValue: String? = null

    public var description: String
      get() = requireNotNull(descriptionValue) { "description is required" }
      set(`value`) {
        descriptionValue = value
      }

    private var identifierValue: String? = null

    public var identifier: String
      get() = requireNotNull(identifierValue) { "identifier is required" }
      set(`value`) {
        identifierValue = value
      }

    private var labelValue: String? = null

    public var label: String
      get() = requireNotNull(labelValue) { "label is required" }
      set(`value`) {
        labelValue = value
      }

    public fun build(): InlineReposCheckRunsPatchRequestJsonActionsItemX3c7db358 {
      check(descriptionValue != null) { "description is required" }
      check(identifierValue != null) { "identifier is required" }
      check(labelValue != null) { "label is required" }
      return InlineReposCheckRunsPatchRequestJsonActionsItemX3c7db358(
        description = description,
        identifier = identifier,
        label = label,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCheckRunsPatchRequestJsonActionsItemX3c7db358 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposCheckRunsPatchRequestJsonActionsItemX3c7db358> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCheckRunsPatchRequestJsonActionsItemX3c7db358 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCheckRunsPatchRequestJsonActionsItemX3c7db358")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCheckRunsPatchRequestJsonActionsItemX3c7db358 must be a JSON object")
      val description = json.decodeRequired<String>(rawObject, "description")
      val identifier = json.decodeRequired<String>(rawObject, "identifier")
      val label = json.decodeRequired<String>(rawObject, "label")
      return InlineReposCheckRunsPatchRequestJsonActionsItemX3c7db358(
        description = description,
        identifier = identifier,
        label = label,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckRunsPatchRequestJsonActionsItemX3c7db358) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCheckRunsPatchRequestJsonActionsItemX3c7db358")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("description", value.description)
        put("identifier", value.identifier)
        put("label", value.label)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCheckRunsPatchRequestJsonActionsItemX3c7db358(block: InlineReposCheckRunsPatchRequestJsonActionsItemX3c7db358.Builder.() -> Unit): InlineReposCheckRunsPatchRequestJsonActionsItemX3c7db358 = InlineReposCheckRunsPatchRequestJsonActionsItemX3c7db358.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCheckRunsPatchRequestJsonActionsItemX3c7db358 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposCheckRunsPatchRequestJsonActionsItemX3c7db358 property '" + name + "' is not nullable")
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
