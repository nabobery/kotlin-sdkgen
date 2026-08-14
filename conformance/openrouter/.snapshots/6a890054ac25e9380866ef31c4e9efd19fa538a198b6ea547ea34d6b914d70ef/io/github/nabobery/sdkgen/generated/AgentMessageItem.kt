package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AgentMessageItem
 */
@Serializable(with = AgentMessageItem.Serializer::class)
public class AgentMessageItem(
  public val author: String,
  content: List<InlineAgentMessageItemContentItemX8fd09f29>,
  public val recipient: String,
  public val type: InlineAgentMessageItemTypeX27997a7b,
  public val agent: InlineAgentMessageItemAgentX7f25c0d9? = null,
  public val id: String? = null,
  additionalProperties: Map<String, JsonElement> = emptyMap(),
) {
  public val content: List<InlineAgentMessageItemContentItemX8fd09f29> = content.toList()

  /**
   * Additional JSON object members not declared as fixed properties.
   */
  public val additionalProperties: Map<String, JsonElement> =
      copyAndValidateAgentMessageItemAdditionalProperties(additionalProperties)

  public class Builder {
    private var authorValue: String? = null

    public var author: String
      get() = requireNotNull(authorValue) { "author is required" }
      set(`value`) {
        authorValue = value
      }

    private var contentValue: List<InlineAgentMessageItemContentItemX8fd09f29>? = null

    public var content: List<InlineAgentMessageItemContentItemX8fd09f29>
      get() = requireNotNull(contentValue) { "content is required" }.toList()
      set(`value`) {
        contentValue = value.toList()
      }

    private var recipientValue: String? = null

    public var recipient: String
      get() = requireNotNull(recipientValue) { "recipient is required" }
      set(`value`) {
        recipientValue = value
      }

    private var typeValue: InlineAgentMessageItemTypeX27997a7b? = null

    public var type: InlineAgentMessageItemTypeX27997a7b
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var agent: InlineAgentMessageItemAgentX7f25c0d9? = null

    public var id: String? = null

    private var additionalPropertiesValue: Map<String, JsonElement> = emptyMap()

    /**
     * Additional JSON object members not declared as fixed properties.
     */
    public var additionalProperties: Map<String, JsonElement>
      get() = additionalPropertiesValue.toMap()
      set(`value`) {
        additionalPropertiesValue = value.toMap()
      }

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
        additionalProperties = additionalProperties,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AgentMessageItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AgentMessageItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AgentMessageItem {
      val jsonDecoder = decoder.requireJsonDecoder("AgentMessageItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AgentMessageItem must be a JSON object")
      val author = json.decodeRequired<String>(rawObject, "author")
      val content = json.decodeRequired<List<InlineAgentMessageItemContentItemX8fd09f29>>(rawObject, "content")
      val recipient = json.decodeRequired<String>(rawObject, "recipient")
      val type = json.decodeRequired<InlineAgentMessageItemTypeX27997a7b>(rawObject, "type")
      return AgentMessageItem(
        author = author,
        content = content,
        recipient = recipient,
        type = type,
        agent = rawObject["agent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineAgentMessageItemAgentX7f25c0d9?>(element) },
        id = rawObject["id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        additionalProperties = rawObject.filterKeys { key -> key !in setOf("agent", "author", "content", "id", "recipient", "type") }.mapValues { (_, element) -> element }.toMap(),
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
        value.additionalProperties.keys.sorted().forEach { key ->
          val additionalValue = value.additionalProperties.getValue(key)
          check(key !in setOf("agent", "author", "content", "id", "recipient", "type")) { "AgentMessageItem additionalProperties key '" + key + "' collides with a fixed property" }
          put(key, additionalValue)
        }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

private fun copyAndValidateAgentMessageItemAdditionalProperties(additionalProperties: Map<String, JsonElement>): Map<String, JsonElement> {
  val copied = additionalProperties.toMap()
  val collision = copied.keys.sorted().firstOrNull { key -> key in setOf("agent", "author", "content", "id", "recipient", "type") }
  require(collision == null) { "AgentMessageItem additionalProperties key '" + collision + "' collides with a fixed property" }
  return copied
}

public fun agentMessageItem(block: AgentMessageItem.Builder.() -> Unit): AgentMessageItem = AgentMessageItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AgentMessageItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
