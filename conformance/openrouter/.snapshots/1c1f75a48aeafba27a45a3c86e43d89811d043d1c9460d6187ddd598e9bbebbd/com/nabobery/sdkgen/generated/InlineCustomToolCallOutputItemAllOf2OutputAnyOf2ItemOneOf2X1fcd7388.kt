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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/CustomToolCallOutputItem/allOf/1/properties/output/anyOf/1/items/one
 * Of/1
 */
@Serializable(with = InlineCustomToolCallOutputItemAllOf2OutputAnyOf2ItemOneOf2X1fcd7388.Serializer::class)
public class InlineCustomToolCallOutputItemAllOf2OutputAnyOf2ItemOneOf2X1fcd7388(
  public val detail: InlineInputImageDetailXd505b11e,
  public val type: InlineInputImageTypeXafc8fcb1,
  public val imageUrl: String? = null,
) {
  public class Builder {
    private var detailValue: InlineInputImageDetailXd505b11e? = null

    public var detail: InlineInputImageDetailXd505b11e
      get() = requireNotNull(detailValue) { "detail is required" }
      set(`value`) {
        detailValue = value
      }

    private var typeValue: InlineInputImageTypeXafc8fcb1? = null

    public var type: InlineInputImageTypeXafc8fcb1
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var imageUrl: String? = null

    public fun build(): InlineCustomToolCallOutputItemAllOf2OutputAnyOf2ItemOneOf2X1fcd7388 {
      check(detailValue != null) { "detail is required" }
      check(typeValue != null) { "type is required" }
      return InlineCustomToolCallOutputItemAllOf2OutputAnyOf2ItemOneOf2X1fcd7388(
        detail = detail,
        type = type,
        imageUrl = imageUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCustomToolCallOutputItemAllOf2OutputAnyOf2ItemOneOf2X1fcd7388 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCustomToolCallOutputItemAllOf2OutputAnyOf2ItemOneOf2X1fcd7388> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomToolCallOutputItemAllOf2OutputAnyOf2ItemOneOf2X1fcd7388 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomToolCallOutputItemAllOf2OutputAnyOf2ItemOneOf2X1fcd7388")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCustomToolCallOutputItemAllOf2OutputAnyOf2ItemOneOf2X1fcd7388 must be a JSON object")
      val detail = json.decodeRequired<InlineInputImageDetailXd505b11e>(rawObject, "detail")
      val type = json.decodeRequired<InlineInputImageTypeXafc8fcb1>(rawObject, "type")
      return InlineCustomToolCallOutputItemAllOf2OutputAnyOf2ItemOneOf2X1fcd7388(
        detail = detail,
        type = type,
        imageUrl = rawObject["image_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomToolCallOutputItemAllOf2OutputAnyOf2ItemOneOf2X1fcd7388) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCustomToolCallOutputItemAllOf2OutputAnyOf2ItemOneOf2X1fcd7388")
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

public fun inlineCustomToolCallOutputItemAllOf2OutputAnyOf2ItemOneOf2X1fcd7388(block: InlineCustomToolCallOutputItemAllOf2OutputAnyOf2ItemOneOf2X1fcd7388.Builder.() -> Unit): InlineCustomToolCallOutputItemAllOf2OutputAnyOf2ItemOneOf2X1fcd7388 = InlineCustomToolCallOutputItemAllOf2OutputAnyOf2ItemOneOf2X1fcd7388.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCustomToolCallOutputItemAllOf2OutputAnyOf2ItemOneOf2X1fcd7388 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
