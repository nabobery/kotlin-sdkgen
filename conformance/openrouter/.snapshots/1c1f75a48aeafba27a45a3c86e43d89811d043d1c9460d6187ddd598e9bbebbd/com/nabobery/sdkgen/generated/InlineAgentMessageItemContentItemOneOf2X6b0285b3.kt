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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AgentMessageItem/properties/content/items/oneOf/1
 */
@Serializable(with = InlineAgentMessageItemContentItemOneOf2X6b0285b3.Serializer::class)
public class InlineAgentMessageItemContentItemOneOf2X6b0285b3(
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

    public fun build(): InlineAgentMessageItemContentItemOneOf2X6b0285b3 {
      check(detailValue != null) { "detail is required" }
      check(typeValue != null) { "type is required" }
      return InlineAgentMessageItemContentItemOneOf2X6b0285b3(
        detail = detail,
        type = type,
        imageUrl = imageUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentMessageItemContentItemOneOf2X6b0285b3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentMessageItemContentItemOneOf2X6b0285b3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentMessageItemContentItemOneOf2X6b0285b3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentMessageItemContentItemOneOf2X6b0285b3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentMessageItemContentItemOneOf2X6b0285b3 must be a JSON object")
      val detail = json.decodeRequired<InlineInputImageDetailXd505b11e>(rawObject, "detail")
      val type = json.decodeRequired<InlineInputImageTypeXafc8fcb1>(rawObject, "type")
      return InlineAgentMessageItemContentItemOneOf2X6b0285b3(
        detail = detail,
        type = type,
        imageUrl = rawObject["image_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentMessageItemContentItemOneOf2X6b0285b3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentMessageItemContentItemOneOf2X6b0285b3")
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

public fun inlineAgentMessageItemContentItemOneOf2X6b0285b3(block: InlineAgentMessageItemContentItemOneOf2X6b0285b3.Builder.() -> Unit): InlineAgentMessageItemContentItemOneOf2X6b0285b3 = InlineAgentMessageItemContentItemOneOf2X6b0285b3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentMessageItemContentItemOneOf2X6b0285b3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
