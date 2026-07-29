package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1sources~1{source}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/source_order
 */
@Serializable(with = InlineV1SourcesPostRequestFormSourceOrderX4330303b.Serializer::class)
public class InlineV1SourcesPostRequestFormSourceOrderX4330303b(
  items: List<InlineV1SourcesPostRequestFormSourceOrderItemsItemX5728b31a>? = null,
  public val shipping: InlineV1SourcesPostRequestFormSourceOrderShippingXe8073dfa? = null,
) {
  public val items: List<InlineV1SourcesPostRequestFormSourceOrderItemsItemX5728b31a>? =
      items?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var itemsValue: List<InlineV1SourcesPostRequestFormSourceOrderItemsItemX5728b31a>? =
        null

    public var items: List<InlineV1SourcesPostRequestFormSourceOrderItemsItemX5728b31a>?
      get() = itemsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        itemsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var shipping: InlineV1SourcesPostRequestFormSourceOrderShippingXe8073dfa? = null

    public fun build(): InlineV1SourcesPostRequestFormSourceOrderX4330303b = InlineV1SourcesPostRequestFormSourceOrderX4330303b(
      items = items,
      shipping = shipping,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SourcesPostRequestFormSourceOrderX4330303b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SourcesPostRequestFormSourceOrderX4330303b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormSourceOrderX4330303b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SourcesPostRequestFormSourceOrderX4330303b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SourcesPostRequestFormSourceOrderX4330303b must be a JSON object")
      return InlineV1SourcesPostRequestFormSourceOrderX4330303b(
        items = rawObject["items"]?.let { json.decodeFromJsonElement<List<InlineV1SourcesPostRequestFormSourceOrderItemsItemX5728b31a>>(it) },
        shipping = rawObject["shipping"]?.let { json.decodeFromJsonElement<InlineV1SourcesPostRequestFormSourceOrderShippingXe8073dfa>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormSourceOrderX4330303b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SourcesPostRequestFormSourceOrderX4330303b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.items?.let { put("items", json.encodeToJsonElement(it)) }
        value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SourcesPostRequestFormSourceOrderX4330303b(block: InlineV1SourcesPostRequestFormSourceOrderX4330303b.Builder.() -> Unit): InlineV1SourcesPostRequestFormSourceOrderX4330303b = InlineV1SourcesPostRequestFormSourceOrderX4330303b.build(block)
