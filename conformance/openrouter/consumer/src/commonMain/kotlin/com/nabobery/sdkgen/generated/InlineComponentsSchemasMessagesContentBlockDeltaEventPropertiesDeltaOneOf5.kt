package com.nabobery.sdkgen.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/5.
 */
@Serializable(with = InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5.Serializer::class)
public class InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5(
  public val content: String?,
  public val type:
      InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5PropertiesType,
) {
  public class Builder {
    private var typeValue:
        InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5PropertiesType? =
        null

    public var type:
        InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var contentState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var content: String?
      get() = contentState.valueOrNull()
      set(`value`) {
        contentState = value.toNullableFieldState()
      }

    public fun build(): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5 {
      check(typeValue != null) { "type is required" }
      check(contentState !== FieldState.Absent) { "content is required, even when null" }
      return InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5(
        content = contentState.valueOrNull(),
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5 must " +
          "be a JSON object")
      val type = json
        .decodeRequired<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5PropertiesType>(raw,
          "type")
      if (!raw.containsKey("content")) {
        throw SerializationException("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5 is " +
          "missing required property 'content'")
      }
      val content = raw["content"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5(
        content = content,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", value.content?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5(block: InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5.Builder.() -> Unit): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5 = InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5 is " +
      "missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5 " +
      "property '" + name + "' is not nullable")
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
