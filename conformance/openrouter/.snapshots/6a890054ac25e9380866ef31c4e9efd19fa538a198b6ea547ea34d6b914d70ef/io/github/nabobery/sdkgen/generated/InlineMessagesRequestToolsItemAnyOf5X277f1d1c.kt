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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/4.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/4
 */
@Serializable(with = InlineMessagesRequestToolsItemAnyOf5X277f1d1c.Serializer::class)
public class InlineMessagesRequestToolsItemAnyOf5X277f1d1c(
  public val name: InlineMessagesRequestToolsItemAnyOf5NameX24a8dde1,
  public val type: InlineMessagesRequestToolsItemAnyOf5TypeXb6301416,
  allowedCallers: List<InlineAnthropicAllowedCallersItemX2d2fed45>? = null,
  allowedDomains: List<String>? = null,
  blockedDomains: List<String>? = null,
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val maxUses: Int? = null,
  public val userLocation: AnthropicWebSearchToolUserLocation? = null,
) {
  public val allowedCallers: List<InlineAnthropicAllowedCallersItemX2d2fed45>? =
      allowedCallers?.let { collection0 -> collection0.toList() }

  public val allowedDomains: List<String>? =
      allowedDomains?.let { collection0 -> collection0.toList() }

  public val blockedDomains: List<String>? =
      blockedDomains?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var nameValue: InlineMessagesRequestToolsItemAnyOf5NameX24a8dde1? = null

    public var name: InlineMessagesRequestToolsItemAnyOf5NameX24a8dde1
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue: InlineMessagesRequestToolsItemAnyOf5TypeXb6301416? = null

    public var type: InlineMessagesRequestToolsItemAnyOf5TypeXb6301416
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var allowedCallersValue: List<InlineAnthropicAllowedCallersItemX2d2fed45>? = null

    public var allowedCallers: List<InlineAnthropicAllowedCallersItemX2d2fed45>?
      get() = allowedCallersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedCallersValue = value?.let { collection0 -> collection0.toList() }
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

    public fun build(): InlineMessagesRequestToolsItemAnyOf5X277f1d1c {
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return InlineMessagesRequestToolsItemAnyOf5X277f1d1c(
        name = name,
        type = type,
        allowedCallers = allowedCallers,
        allowedDomains = allowedDomains,
        blockedDomains = blockedDomains,
        cacheControl = cacheControl,
        maxUses = maxUses,
        userLocation = userLocation,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesRequestToolsItemAnyOf5X277f1d1c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolsItemAnyOf5X277f1d1c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolsItemAnyOf5X277f1d1c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestToolsItemAnyOf5X277f1d1c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesRequestToolsItemAnyOf5X277f1d1c must be a JSON object")
      val name = json.decodeRequired<InlineMessagesRequestToolsItemAnyOf5NameX24a8dde1>(rawObject, "name")
      val type = json.decodeRequired<InlineMessagesRequestToolsItemAnyOf5TypeXb6301416>(rawObject, "type")
      return InlineMessagesRequestToolsItemAnyOf5X277f1d1c(
        name = name,
        type = type,
        allowedCallers = rawObject["allowed_callers"]?.let { json.decodeFromJsonElement<List<InlineAnthropicAllowedCallersItemX2d2fed45>>(it) },
        allowedDomains = rawObject["allowed_domains"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        blockedDomains = rawObject["blocked_domains"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        cacheControl = rawObject["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
        maxUses = rawObject["max_uses"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        userLocation = rawObject["user_location"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicWebSearchToolUserLocation?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolsItemAnyOf5X277f1d1c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesRequestToolsItemAnyOf5X277f1d1c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", json.encodeToJsonElement(value.name))
        put("type", json.encodeToJsonElement(value.type))
        value.allowedCallers?.let { put("allowed_callers", json.encodeToJsonElement(it)) }
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

public fun inlineMessagesRequestToolsItemAnyOf5X277f1d1c(block: InlineMessagesRequestToolsItemAnyOf5X277f1d1c.Builder.() -> Unit): InlineMessagesRequestToolsItemAnyOf5X277f1d1c = InlineMessagesRequestToolsItemAnyOf5X277f1d1c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesRequestToolsItemAnyOf5X277f1d1c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
