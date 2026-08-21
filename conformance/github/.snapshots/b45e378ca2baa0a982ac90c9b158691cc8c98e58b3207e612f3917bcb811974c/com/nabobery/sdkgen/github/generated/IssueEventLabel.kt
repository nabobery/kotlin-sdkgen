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
 * Issue Event Label
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue-event-label
 */
@Serializable(with = IssueEventLabel.Serializer::class)
public class IssueEventLabel(
  public val color: String?,
  public val name: String?,
) {
  public class Builder {
    private var colorState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var color: String?
      get() = colorState.valueOrNull()
      set(`value`) {
        colorState = value.toNullableFieldState()
      }

    private var nameState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        nameState = value.toNullableFieldState()
      }

    public fun build(): IssueEventLabel {
      check(colorState !== FieldState.Absent) { "color is required, even when null" }
      check(nameState !== FieldState.Absent) { "name is required, even when null" }
      return IssueEventLabel(
        color = colorState.valueOrNull(),
        name = nameState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssueEventLabel = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssueEventLabel> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssueEventLabel {
      val jsonDecoder = decoder.requireJsonDecoder("IssueEventLabel")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssueEventLabel must be a JSON object")
      if (!rawObject.containsKey("color")) {
        throw SerializationException("IssueEventLabel is missing required property 'color'")
      }
      val color = rawObject["color"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("name")) {
        throw SerializationException("IssueEventLabel is missing required property 'name'")
      }
      val name = rawObject["name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return IssueEventLabel(
        color = color,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssueEventLabel) {
      val jsonEncoder = encoder.requireJsonEncoder("IssueEventLabel")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("color", value.color?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("name", value.name?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issueEventLabel(block: IssueEventLabel.Builder.() -> Unit): IssueEventLabel = IssueEventLabel.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("IssueEventLabel property '" + name + "' is not nullable")
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
