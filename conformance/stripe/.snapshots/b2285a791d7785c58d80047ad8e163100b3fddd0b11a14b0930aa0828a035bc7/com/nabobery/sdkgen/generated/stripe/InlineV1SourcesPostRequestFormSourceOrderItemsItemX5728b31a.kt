package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1sources~1{source}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/source_order/properties/items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources~1{source}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/source_order/properties/items/items
 */
@Serializable(with = InlineV1SourcesPostRequestFormSourceOrderItemsItemX5728b31a.Serializer::class)
public class InlineV1SourcesPostRequestFormSourceOrderItemsItemX5728b31a(
  public val amount: Int? = null,
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  public val description: String? = null,
  public val parent: String? = null,
  public val quantity: Int? = null,
  public val type: InlineV1SourcesPostRequestFormSourceOrderItemsItemTypeX1129cf6e? = null,
) {
  public class Builder {
    public var amount: Int? = null

    /**
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    public var description: String? = null

    public var parent: String? = null

    public var quantity: Int? = null

    public var type: InlineV1SourcesPostRequestFormSourceOrderItemsItemTypeX1129cf6e? = null

    public fun build(): InlineV1SourcesPostRequestFormSourceOrderItemsItemX5728b31a = InlineV1SourcesPostRequestFormSourceOrderItemsItemX5728b31a(
      amount = amount,
      currency = currency,
      description = description,
      parent = parent,
      quantity = quantity,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SourcesPostRequestFormSourceOrderItemsItemX5728b31a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SourcesPostRequestFormSourceOrderItemsItemX5728b31a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormSourceOrderItemsItemX5728b31a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SourcesPostRequestFormSourceOrderItemsItemX5728b31a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SourcesPostRequestFormSourceOrderItemsItemX5728b31a must be a JSON object")
      return InlineV1SourcesPostRequestFormSourceOrderItemsItemX5728b31a(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        parent = rawObject["parent"]?.let { json.decodeFromJsonElement<String>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineV1SourcesPostRequestFormSourceOrderItemsItemTypeX1129cf6e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormSourceOrderItemsItemX5728b31a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SourcesPostRequestFormSourceOrderItemsItemX5728b31a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
        value.description?.let { put("description", it) }
        value.parent?.let { put("parent", it) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SourcesPostRequestFormSourceOrderItemsItemX5728b31a(block: InlineV1SourcesPostRequestFormSourceOrderItemsItemX5728b31a.Builder.() -> Unit): InlineV1SourcesPostRequestFormSourceOrderItemsItemX5728b31a = InlineV1SourcesPostRequestFormSourceOrderItemsItemX5728b31a.build(block)
