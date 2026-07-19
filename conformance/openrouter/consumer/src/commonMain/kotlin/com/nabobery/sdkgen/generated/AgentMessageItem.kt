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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A message routed between agents in a multi-agent session
 */
@Serializable(with = AgentMessageItem.Serializer::class)
public class AgentMessageItem(
  public val author: String,
  content: List<InlineComponentsSchemasAgentMessageItemPropertiesContentItems>,
  public val recipient: String,
  public val type: InlineComponentsSchemasAgentMessageItemPropertiesType,
  public val agent: InlineComponentsSchemasAgentMessageItemPropertiesAgent? = null,
  public val id: String? = null,
) {
  public val content: List<InlineComponentsSchemasAgentMessageItemPropertiesContentItems> =
      content.toList()

  public class Builder {
    private var authorValue: String? = null

    public var author: String
      get() = requireNotNull(authorValue) { "author is required" }
      set(`value`) {
        authorValue = value
      }

    private var contentValue: List<InlineComponentsSchemasAgentMessageItemPropertiesContentItems>? =
        null

    public var content: List<InlineComponentsSchemasAgentMessageItemPropertiesContentItems>
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    private var recipientValue: String? = null

    public var recipient: String
      get() = requireNotNull(recipientValue) { "recipient is required" }
      set(`value`) {
        recipientValue = value
      }

    private var typeValue: InlineComponentsSchemasAgentMessageItemPropertiesType? = null

    public var type: InlineComponentsSchemasAgentMessageItemPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var agent: InlineComponentsSchemasAgentMessageItemPropertiesAgent? = null

    public var id: String? = null

    public fun build(): AgentMessageItem {
      check(authorValue != null) { "author is required" }
      check(contentValue != null) { "content is required" }
      check(recipientValue != null) { "recipient is required" }
      check(typeValue != null) { "type is required" }
      return AgentMessageItem(
        author = author,
        content = content,
        recipient = recipient,
        type = type,
        agent = agent,
        id = id,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AgentMessageItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AgentMessageItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AgentMessageItem {
      val jsonDecoder = decoder.requireJsonDecoder("AgentMessageItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AgentMessageItem must be a JSON object")
      val author = json.decodeRequired<String>(raw, "author")
      val content = json.decodeRequired<List<InlineComponentsSchemasAgentMessageItemPropertiesContentItems>>(raw,
        "content")
      val recipient = json.decodeRequired<String>(raw, "recipient")
      val type = json.decodeRequired<InlineComponentsSchemasAgentMessageItemPropertiesType>(raw, "type")
      return AgentMessageItem(
        author = author,
        content = content,
        recipient = recipient,
        type = type,
        agent = raw["agent"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<InlineComponentsSchemasAgentMessageItemPropertiesAgent?>(element) },
        id = raw["id"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AgentMessageItem) {
      val jsonEncoder = encoder.requireJsonEncoder("AgentMessageItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("author", value.author)
        put("content", json.encodeToJsonElement(value.content))
        put("recipient", value.recipient)
        put("type", json.encodeToJsonElement(value.type))
        value.agent?.let { put("agent", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun agentMessageItem(block: AgentMessageItem.Builder.() -> Unit): AgentMessageItem = AgentMessageItem
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AgentMessageItem is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
