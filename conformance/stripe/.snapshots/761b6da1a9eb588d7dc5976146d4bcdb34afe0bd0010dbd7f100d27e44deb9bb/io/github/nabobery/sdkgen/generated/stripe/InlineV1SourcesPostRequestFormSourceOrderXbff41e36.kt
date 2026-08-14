package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Information about the items and shipping associated with the source. Required for transactional credit (for example
 * Klarna) sources before you can charge it.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/source_order
 */
@Serializable(with = InlineV1SourcesPostRequestFormSourceOrderXbff41e36.Serializer::class)
public class InlineV1SourcesPostRequestFormSourceOrderXbff41e36(
  items: List<InlineV1SourcesPostRequestFormSourceOrderItemsItemXf6e3b25a>? = null,
  public val shipping: InlineV1SourcesPostRequestFormSourceOrderShippingXaceed685? = null,
) {
  public val items: List<InlineV1SourcesPostRequestFormSourceOrderItemsItemXf6e3b25a>? =
      items?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var itemsValue: List<InlineV1SourcesPostRequestFormSourceOrderItemsItemXf6e3b25a>? =
        null

    public var items: List<InlineV1SourcesPostRequestFormSourceOrderItemsItemXf6e3b25a>?
      get() = itemsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        itemsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var shipping: InlineV1SourcesPostRequestFormSourceOrderShippingXaceed685? = null

    public fun build(): InlineV1SourcesPostRequestFormSourceOrderXbff41e36 = InlineV1SourcesPostRequestFormSourceOrderXbff41e36(
      items = items,
      shipping = shipping,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SourcesPostRequestFormSourceOrderXbff41e36 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SourcesPostRequestFormSourceOrderXbff41e36> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormSourceOrderXbff41e36 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SourcesPostRequestFormSourceOrderXbff41e36")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SourcesPostRequestFormSourceOrderXbff41e36 must be a JSON object")
      return InlineV1SourcesPostRequestFormSourceOrderXbff41e36(
        items = rawObject["items"]?.let { json.decodeFromJsonElement<List<InlineV1SourcesPostRequestFormSourceOrderItemsItemXf6e3b25a>>(it) },
        shipping = rawObject["shipping"]?.let { json.decodeFromJsonElement<InlineV1SourcesPostRequestFormSourceOrderShippingXaceed685>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormSourceOrderXbff41e36) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SourcesPostRequestFormSourceOrderXbff41e36")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.items?.let { put("items", json.encodeToJsonElement(it)) }
        value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SourcesPostRequestFormSourceOrderXbff41e36(block: InlineV1SourcesPostRequestFormSourceOrderXbff41e36.Builder.() -> Unit): InlineV1SourcesPostRequestFormSourceOrderXbff41e36 = InlineV1SourcesPostRequestFormSourceOrderXbff41e36.build(block)
