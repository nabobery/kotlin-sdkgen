package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Image input content item
 */
@Serializable(with = InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1.Serializer::class)
public class InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1(
  public val detail: InlineComponentsSchemasInputImagePropertiesDetail,
  public val type: InlineComponentsSchemasInputImagePropertiesType,
  public val imageUrl: String? = null,
) {
  public class Builder {
    private var detailValue: InlineComponentsSchemasInputImagePropertiesDetail? = null

    public var detail: InlineComponentsSchemasInputImagePropertiesDetail
      get() = requireNotNull(detailValue) { "detail is required" }
      set(`value`) {
        detailValue = value
      }

    private var typeValue: InlineComponentsSchemasInputImagePropertiesType? = null

    public var type: InlineComponentsSchemasInputImagePropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var imageUrl: String? = null

    public fun build(): InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1 {
      check(detailValue != null) { "detail is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1(
        detail = detail,
        type = type,
        imageUrl = imageUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1 must be a " +
          "JSON object")
      val detail = json.decodeRequired<InlineComponentsSchemasInputImagePropertiesDetail>(raw, "detail")
      val type = json.decodeRequired<InlineComponentsSchemasInputImagePropertiesType>(raw, "type")
      return InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1(
        detail = detail,
        type = type,
        imageUrl = raw["image_url"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("detail", json.encodeToJsonElement(value.detail))
        put("type", json.encodeToJsonElement(value.type))
        value.imageUrl?.let { put("image_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1(block: InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1.Builder.() -> Unit): InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1 = InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1 is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
