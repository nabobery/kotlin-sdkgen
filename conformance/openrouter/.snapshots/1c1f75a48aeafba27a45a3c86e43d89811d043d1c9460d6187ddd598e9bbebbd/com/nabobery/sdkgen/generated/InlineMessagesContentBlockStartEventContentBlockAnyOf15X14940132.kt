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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockStartEvent/properties/content_block/anyOf/14.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockStartEvent/properties/content_block/anyOf/14
 */
@Serializable(with = InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132.Serializer::class)
public class InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132(
  public val content: String?,
  public val type: InlineMessagesContentBlockStartEventContentBlockAnyOf15TypeX2e876138,
) {
  public class Builder {
    private var typeValue: InlineMessagesContentBlockStartEventContentBlockAnyOf15TypeX2e876138? =
        null

    public var type: InlineMessagesContentBlockStartEventContentBlockAnyOf15TypeX2e876138
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

    public fun build(): InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132 {
      check(typeValue != null) { "type is required" }
      check(contentState !== FieldState.Absent) { "content is required, even when null" }
      return InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132(
        content = contentState.valueOrNull(),
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132 must be a JSON object")
      val type = json.decodeRequired<InlineMessagesContentBlockStartEventContentBlockAnyOf15TypeX2e876138>(rawObject, "type")
      if (!rawObject.containsKey("content")) {
        throw SerializationException("InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132 is missing required property 'content'")
      }
      val content = rawObject["content"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132(
        content = content,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", value.content?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132(block: InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132.Builder.() -> Unit): InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132 = InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineMessagesContentBlockStartEventContentBlockAnyOf15X14940132 property '" + name + "' is not nullable")
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
