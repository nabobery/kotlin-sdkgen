package io.github.nabobery.sdkgen.generated

import kotlin.ConsistentCopyVisibility
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

@ConsistentCopyVisibility
@Serializable
public data class OpenAiResponseInputMessageItemView internal constructor(
  public val content: List<InlineOpenAiResponseInputMessageItemContentItemXfa4915ce>,
  public val id: String,
  public val role: InlineOpenAiResponseInputMessageItemRoleX66e0c84c,
  public val type: InlineOpenAiResponseInputMessageItemTypeX5c4fbad8? = null,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseInputMessageItem.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseInputMessageItem
 */
@Serializable(with = OpenAiResponseInputMessageItem.Serializer::class)
public class OpenAiResponseInputMessageItem(
  content: List<InlineOpenAiResponseInputMessageItemContentItemXfa4915ce>,
  public val id: String,
  public val role: InlineOpenAiResponseInputMessageItemRoleX66e0c84c,
  public val type: InlineOpenAiResponseInputMessageItemTypeX5c4fbad8? = null,
) {
  public val content: List<InlineOpenAiResponseInputMessageItemContentItemXfa4915ce> =
      content.toList()

  public class Builder {
    private var contentValue: List<InlineOpenAiResponseInputMessageItemContentItemXfa4915ce>? = null

    public var content: List<InlineOpenAiResponseInputMessageItemContentItemXfa4915ce>
      get() = requireNotNull(contentValue) { "content is required" }.toList()
      set(`value`) {
        contentValue = value.toList()
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var roleValue: InlineOpenAiResponseInputMessageItemRoleX66e0c84c? = null

    public var role: InlineOpenAiResponseInputMessageItemRoleX66e0c84c
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    public var type: InlineOpenAiResponseInputMessageItemTypeX5c4fbad8? = null

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

  internal object Serializer : KSerializer<OpenAiResponseInputMessageItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OpenAiResponseInputMessageItem {
      val jsonDecoder = decoder.requireJsonDecoder("OpenAiResponseInputMessageItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OpenAiResponseInputMessageItem must be a JSON object")
      val content = json.decodeRequired<List<InlineOpenAiResponseInputMessageItemContentItemXfa4915ce>>(rawObject, "content")
      val id = json.decodeRequired<String>(rawObject, "id")
      val role = json.decodeRequired<InlineOpenAiResponseInputMessageItemRoleX66e0c84c>(rawObject, "role")
      return OpenAiResponseInputMessageItem(
        content = content,
        id = id,
        role = role,
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineOpenAiResponseInputMessageItemTypeX5c4fbad8>(it) },
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

public fun openAiResponseInputMessageItem(block: OpenAiResponseInputMessageItem.Builder.() -> Unit): OpenAiResponseInputMessageItem = OpenAiResponseInputMessageItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OpenAiResponseInputMessageItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
