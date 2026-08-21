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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/5
 */
@Serializable(with = InlineMessagesContentBlockDeltaEventDeltaOneOf6X5015dbdf.Serializer::class)
public class InlineMessagesContentBlockDeltaEventDeltaOneOf6X5015dbdf(
  public val content: String?,
  public val type: InlineMessagesContentBlockDeltaEventDeltaOneOf6TypeXd333b7c6,
) {
  public class Builder {
    private var typeValue: InlineMessagesContentBlockDeltaEventDeltaOneOf6TypeXd333b7c6? = null

    public var type: InlineMessagesContentBlockDeltaEventDeltaOneOf6TypeXd333b7c6
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

    public fun build(): InlineMessagesContentBlockDeltaEventDeltaOneOf6X5015dbdf {
      check(typeValue != null) { "type is required" }
      check(contentState !== FieldState.Absent) { "content is required, even when null" }
      return InlineMessagesContentBlockDeltaEventDeltaOneOf6X5015dbdf(
        content = contentState.valueOrNull(),
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesContentBlockDeltaEventDeltaOneOf6X5015dbdf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesContentBlockDeltaEventDeltaOneOf6X5015dbdf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesContentBlockDeltaEventDeltaOneOf6X5015dbdf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesContentBlockDeltaEventDeltaOneOf6X5015dbdf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesContentBlockDeltaEventDeltaOneOf6X5015dbdf must be a JSON object")
      val type = json.decodeRequired<InlineMessagesContentBlockDeltaEventDeltaOneOf6TypeXd333b7c6>(rawObject, "type")
      if (!rawObject.containsKey("content")) {
        throw SerializationException("InlineMessagesContentBlockDeltaEventDeltaOneOf6X5015dbdf is missing required property 'content'")
      }
      val content = rawObject["content"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineMessagesContentBlockDeltaEventDeltaOneOf6X5015dbdf(
        content = content,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesContentBlockDeltaEventDeltaOneOf6X5015dbdf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesContentBlockDeltaEventDeltaOneOf6X5015dbdf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", value.content?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesContentBlockDeltaEventDeltaOneOf6X5015dbdf(block: InlineMessagesContentBlockDeltaEventDeltaOneOf6X5015dbdf.Builder.() -> Unit): InlineMessagesContentBlockDeltaEventDeltaOneOf6X5015dbdf = InlineMessagesContentBlockDeltaEventDeltaOneOf6X5015dbdf.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesContentBlockDeltaEventDeltaOneOf6X5015dbdf is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineMessagesContentBlockDeltaEventDeltaOneOf6X5015dbdf property '" + name + "' is not nullable")
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
