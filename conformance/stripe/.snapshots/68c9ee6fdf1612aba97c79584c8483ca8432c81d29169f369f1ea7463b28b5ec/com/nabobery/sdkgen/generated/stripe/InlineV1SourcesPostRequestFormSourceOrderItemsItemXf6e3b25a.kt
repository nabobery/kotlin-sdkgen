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
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/source_order/properties/items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/source_order/properties/items/items
 */
@Serializable(with = InlineV1SourcesPostRequestFormSourceOrderItemsItemXf6e3b25a.Serializer::class)
public class InlineV1SourcesPostRequestFormSourceOrderItemsItemXf6e3b25a(
  public val amount: Int? = null,
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  public val description: String? = null,
  public val parent: String? = null,
  public val quantity: Int? = null,
  public val type: InlineV1SourcesPostRequestFormSourceOrderItemsItemTypeX2221255e? = null,
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

    public var type: InlineV1SourcesPostRequestFormSourceOrderItemsItemTypeX2221255e? = null

    public fun build(): InlineV1SourcesPostRequestFormSourceOrderItemsItemXf6e3b25a = InlineV1SourcesPostRequestFormSourceOrderItemsItemXf6e3b25a(
      amount = amount,
      currency = currency,
      description = description,
      parent = parent,
      quantity = quantity,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SourcesPostRequestFormSourceOrderItemsItemXf6e3b25a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SourcesPostRequestFormSourceOrderItemsItemXf6e3b25a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormSourceOrderItemsItemXf6e3b25a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SourcesPostRequestFormSourceOrderItemsItemXf6e3b25a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SourcesPostRequestFormSourceOrderItemsItemXf6e3b25a must be a JSON object")
      return InlineV1SourcesPostRequestFormSourceOrderItemsItemXf6e3b25a(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        parent = rawObject["parent"]?.let { json.decodeFromJsonElement<String>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineV1SourcesPostRequestFormSourceOrderItemsItemTypeX2221255e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormSourceOrderItemsItemXf6e3b25a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SourcesPostRequestFormSourceOrderItemsItemXf6e3b25a")
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

public fun inlineV1SourcesPostRequestFormSourceOrderItemsItemXf6e3b25a(block: InlineV1SourcesPostRequestFormSourceOrderItemsItemXf6e3b25a.Builder.() -> Unit): InlineV1SourcesPostRequestFormSourceOrderItemsItemXf6e3b25a = InlineV1SourcesPostRequestFormSourceOrderItemsItemXf6e3b25a.build(block)
