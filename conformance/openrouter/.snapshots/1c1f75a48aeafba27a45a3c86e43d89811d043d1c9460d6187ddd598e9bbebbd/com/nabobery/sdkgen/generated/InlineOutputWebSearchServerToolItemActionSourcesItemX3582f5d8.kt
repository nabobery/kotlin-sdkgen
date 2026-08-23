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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/OutputWebSearchServerToolItem/properties/action/properties/sources/i
 * tems.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/OutputWebSearchServerToolItem/properties/action/properties/sources/i
 * tems
 */
@Serializable(with = InlineOutputWebSearchServerToolItemActionSourcesItemX3582f5d8.Serializer::class)
public class InlineOutputWebSearchServerToolItemActionSourcesItemX3582f5d8(
  public val type: InlineOutputWebSearchServerToolItemActionSourcesItemTypeXd5a49116,
  public val url: String,
) {
  public class Builder {
    private var typeValue: InlineOutputWebSearchServerToolItemActionSourcesItemTypeXd5a49116? = null

    public var type: InlineOutputWebSearchServerToolItemActionSourcesItemTypeXd5a49116
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineOutputWebSearchServerToolItemActionSourcesItemX3582f5d8 {
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      return InlineOutputWebSearchServerToolItemActionSourcesItemX3582f5d8(
        type = type,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOutputWebSearchServerToolItemActionSourcesItemX3582f5d8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOutputWebSearchServerToolItemActionSourcesItemX3582f5d8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOutputWebSearchServerToolItemActionSourcesItemX3582f5d8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOutputWebSearchServerToolItemActionSourcesItemX3582f5d8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOutputWebSearchServerToolItemActionSourcesItemX3582f5d8 must be a JSON object")
      val type = json.decodeRequired<InlineOutputWebSearchServerToolItemActionSourcesItemTypeXd5a49116>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineOutputWebSearchServerToolItemActionSourcesItemX3582f5d8(
        type = type,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOutputWebSearchServerToolItemActionSourcesItemX3582f5d8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOutputWebSearchServerToolItemActionSourcesItemX3582f5d8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOutputWebSearchServerToolItemActionSourcesItemX3582f5d8(block: InlineOutputWebSearchServerToolItemActionSourcesItemX3582f5d8.Builder.() -> Unit): InlineOutputWebSearchServerToolItemActionSourcesItemX3582f5d8 = InlineOutputWebSearchServerToolItemActionSourcesItemX3582f5d8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOutputWebSearchServerToolItemActionSourcesItemX3582f5d8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
