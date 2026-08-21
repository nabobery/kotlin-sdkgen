package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/5.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/5
 */
@Serializable(with = InlineMessagesRequestToolsItemAnyOf6X04b8deff.Serializer::class)
public class InlineMessagesRequestToolsItemAnyOf6X04b8deff(
  public val model: String,
  public val name: InlineMessagesRequestToolsItemAnyOf6NameX83a61fda,
  public val type: InlineMessagesRequestToolsItemAnyOf6TypeX24072203,
  allowedCallers: List<InlineAnthropicAllowedCallersItemX2d2fed45>? = null,
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val caching: AnthropicCacheControlDirective? = null,
  public val deferLoading: Boolean? = null,
  public val maxUses: Int? = null,
) {
  public val allowedCallers: List<InlineAnthropicAllowedCallersItemX2d2fed45>? =
      allowedCallers?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var nameValue: InlineMessagesRequestToolsItemAnyOf6NameX83a61fda? = null

    public var name: InlineMessagesRequestToolsItemAnyOf6NameX83a61fda
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue: InlineMessagesRequestToolsItemAnyOf6TypeX24072203? = null

    public var type: InlineMessagesRequestToolsItemAnyOf6TypeX24072203
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

    public var cacheControl: AnthropicCacheControlDirective? = null

    public var caching: AnthropicCacheControlDirective? = null

    public var deferLoading: Boolean? = null

    public var maxUses: Int? = null

    public fun build(): InlineMessagesRequestToolsItemAnyOf6X04b8deff {
      check(modelValue != null) { "model is required" }
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return InlineMessagesRequestToolsItemAnyOf6X04b8deff(
        model = model,
        name = name,
        type = type,
        allowedCallers = allowedCallers,
        cacheControl = cacheControl,
        caching = caching,
        deferLoading = deferLoading,
        maxUses = maxUses,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesRequestToolsItemAnyOf6X04b8deff = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolsItemAnyOf6X04b8deff> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolsItemAnyOf6X04b8deff {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestToolsItemAnyOf6X04b8deff")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesRequestToolsItemAnyOf6X04b8deff must be a JSON object")
      val model = json.decodeRequired<String>(rawObject, "model")
      val name = json.decodeRequired<InlineMessagesRequestToolsItemAnyOf6NameX83a61fda>(rawObject, "name")
      val type = json.decodeRequired<InlineMessagesRequestToolsItemAnyOf6TypeX24072203>(rawObject, "type")
      return InlineMessagesRequestToolsItemAnyOf6X04b8deff(
        model = model,
        name = name,
        type = type,
        allowedCallers = rawObject["allowed_callers"]?.let { json.decodeFromJsonElement<List<InlineAnthropicAllowedCallersItemX2d2fed45>>(it) },
        cacheControl = rawObject["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
        caching = rawObject["caching"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicCacheControlDirective?>(element) },
        deferLoading = rawObject["defer_loading"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        maxUses = rawObject["max_uses"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolsItemAnyOf6X04b8deff) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesRequestToolsItemAnyOf6X04b8deff")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("model", value.model)
        put("name", json.encodeToJsonElement(value.name))
        put("type", json.encodeToJsonElement(value.type))
        value.allowedCallers?.let { put("allowed_callers", json.encodeToJsonElement(it)) }
        value.cacheControl?.let { put("cache_control", json.encodeToJsonElement(it)) }
        value.caching?.let { put("caching", json.encodeToJsonElement(it)) }
        value.deferLoading?.let { put("defer_loading", json.encodeToJsonElement(it)) }
        value.maxUses?.let { put("max_uses", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesRequestToolsItemAnyOf6X04b8deff(block: InlineMessagesRequestToolsItemAnyOf6X04b8deff.Builder.() -> Unit): InlineMessagesRequestToolsItemAnyOf6X04b8deff = InlineMessagesRequestToolsItemAnyOf6X04b8deff.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesRequestToolsItemAnyOf6X04b8deff is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
