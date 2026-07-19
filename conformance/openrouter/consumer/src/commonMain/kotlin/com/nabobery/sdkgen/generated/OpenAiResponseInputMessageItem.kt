package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class OpenAiResponseInputMessageItemView(
  public val content:
      List<InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItems>,
  public val id: String,
  public val role: InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRole,
  public val type: InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesType? = null,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseInputMessageItem.
 */
@Serializable(with = OpenAiResponseInputMessageItem.Serializer::class)
public class OpenAiResponseInputMessageItem(
  content: List<InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItems>,
  public val id: String,
  public val role: InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRole,
  public val type: InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesType? = null,
) {
  public val content:
      List<InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItems> =
      content.toList()

  public class Builder {
    private var contentValue:
        List<InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItems>? = null

    public var content:
        List<InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItems>
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var roleValue: InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRole? =
        null

    public var role: InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRole
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    public var type: InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesType? = null

    public fun build(): OpenAiResponseInputMessageItem {
      check(contentValue != null) { "content is required" }
      check(idValue != null) { "id is required" }
      check(roleValue != null) { "role is required" }
      return OpenAiResponseInputMessageItem(
        content = content,
        id = id,
        role = role,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OpenAiResponseInputMessageItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OpenAiResponseInputMessageItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OpenAiResponseInputMessageItem {
      val jsonDecoder = decoder.requireJsonDecoder("OpenAiResponseInputMessageItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("OpenAiResponseInputMessageItem must be a JSON object")
      val content = json
        .decodeRequired<List<InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItems>>(raw,
          "content")
      val id = json.decodeRequired<String>(raw, "id")
      val role = json.decodeRequired<InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRole>(raw, "role")
      return OpenAiResponseInputMessageItem(
        content = content,
        id = id,
        role = role,
        type = raw["type"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesType>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OpenAiResponseInputMessageItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OpenAiResponseInputMessageItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", json.encodeToJsonElement(value.content))
        put("id", value.id)
        put("role", json.encodeToJsonElement(value.role))
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun openAiResponseInputMessageItem(block: OpenAiResponseInputMessageItem.Builder.() ->
  Unit): OpenAiResponseInputMessageItem = OpenAiResponseInputMessageItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("OpenAiResponseInputMessageItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
