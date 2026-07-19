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
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5.Serializer::class)
public class InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5(
  public val model: String,
  public val name: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesName,
  public val type: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesType,
  public val allowedCallers: List<InlineComponentsSchemasAnthropicAllowedCallersItems>? = null,
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val caching: AnthropicCacheControlDirective? = null,
  public val deferLoading: Boolean? = null,
  public val maxUses: Int? = null,
) {
  public class Builder {
    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var nameValue:
        InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesName? = null

    public var name: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesName
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue:
        InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesType? = null

    public var type: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var allowedCallers: List<InlineComponentsSchemasAnthropicAllowedCallersItems>? = null

    public var cacheControl: AnthropicCacheControlDirective? = null

    public var caching: AnthropicCacheControlDirective? = null

    public var deferLoading: Boolean? = null

    public var maxUses: Int? = null

    public fun build(): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5 {
      check(modelValue != null) { "model is required" }
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5(
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
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5 must be a JSON " +
          "object")
      val model = json.decodeRequired<String>(raw, "model")
      val name = json
        .decodeRequired<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesName>(raw, "name")
      val type = json
        .decodeRequired<InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5PropertiesType>(raw, "type")
      return InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5(
        model = model,
        name = name,
        type = type,
        allowedCallers = raw["allowed_callers"]?.let { json
          .decodeFromJsonElement<List<InlineComponentsSchemasAnthropicAllowedCallersItems>>(it) },
        cacheControl = raw["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
        caching = raw["caching"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<AnthropicCacheControlDirective?>(element) },
        deferLoading = raw["defer_loading"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        maxUses = raw["max_uses"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5")
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

public fun inlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5(block: InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5.Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5 = InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesToolsItemsAnyOf5 is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
