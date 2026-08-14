package io.github.nabobery.sdkgen.generated

import kotlin.Int
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/3.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/3
 */
@Serializable(with = InlineMessagesRequestToolsItemAnyOf4X4318960b.Serializer::class)
public class InlineMessagesRequestToolsItemAnyOf4X4318960b(
  public val name: InlineMessagesRequestToolsItemAnyOf4NameXdf203565,
  public val type: InlineMessagesRequestToolsItemAnyOf4TypeX570d27e9,
  allowedDomains: List<String>? = null,
  blockedDomains: List<String>? = null,
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val maxUses: Int? = null,
  public val userLocation: AnthropicWebSearchToolUserLocation? = null,
) {
  public val allowedDomains: List<String>? =
      allowedDomains?.let { collection0 -> collection0.toList() }

  public val blockedDomains: List<String>? =
      blockedDomains?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var nameValue: InlineMessagesRequestToolsItemAnyOf4NameXdf203565? = null

    public var name: InlineMessagesRequestToolsItemAnyOf4NameXdf203565
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue: InlineMessagesRequestToolsItemAnyOf4TypeX570d27e9? = null

    public var type: InlineMessagesRequestToolsItemAnyOf4TypeX570d27e9
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var allowedDomainsValue: List<String>? = null

    public var allowedDomains: List<String>?
      get() = allowedDomainsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedDomainsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var blockedDomainsValue: List<String>? = null

    public var blockedDomains: List<String>?
      get() = blockedDomainsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        blockedDomainsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var cacheControl: AnthropicCacheControlDirective? = null

    public var maxUses: Int? = null

    public var userLocation: AnthropicWebSearchToolUserLocation? = null

    public fun build(): InlineMessagesRequestToolsItemAnyOf4X4318960b {
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return InlineMessagesRequestToolsItemAnyOf4X4318960b(
        name = name,
        type = type,
        allowedDomains = allowedDomains,
        blockedDomains = blockedDomains,
        cacheControl = cacheControl,
        maxUses = maxUses,
        userLocation = userLocation,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesRequestToolsItemAnyOf4X4318960b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolsItemAnyOf4X4318960b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolsItemAnyOf4X4318960b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestToolsItemAnyOf4X4318960b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesRequestToolsItemAnyOf4X4318960b must be a JSON object")
      val name = json.decodeRequired<InlineMessagesRequestToolsItemAnyOf4NameXdf203565>(rawObject, "name")
      val type = json.decodeRequired<InlineMessagesRequestToolsItemAnyOf4TypeX570d27e9>(rawObject, "type")
      return InlineMessagesRequestToolsItemAnyOf4X4318960b(
        name = name,
        type = type,
        allowedDomains = rawObject["allowed_domains"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        blockedDomains = rawObject["blocked_domains"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        cacheControl = rawObject["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
        maxUses = rawObject["max_uses"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        userLocation = rawObject["user_location"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicWebSearchToolUserLocation?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolsItemAnyOf4X4318960b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesRequestToolsItemAnyOf4X4318960b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", json.encodeToJsonElement(value.name))
        put("type", json.encodeToJsonElement(value.type))
        value.allowedDomains?.let { put("allowed_domains", json.encodeToJsonElement(it)) }
        value.blockedDomains?.let { put("blocked_domains", json.encodeToJsonElement(it)) }
        value.cacheControl?.let { put("cache_control", json.encodeToJsonElement(it)) }
        value.maxUses?.let { put("max_uses", json.encodeToJsonElement(it)) }
        value.userLocation?.let { put("user_location", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesRequestToolsItemAnyOf4X4318960b(block: InlineMessagesRequestToolsItemAnyOf4X4318960b.Builder.() -> Unit): InlineMessagesRequestToolsItemAnyOf4X4318960b = InlineMessagesRequestToolsItemAnyOf4X4318960b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesRequestToolsItemAnyOf4X4318960b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
