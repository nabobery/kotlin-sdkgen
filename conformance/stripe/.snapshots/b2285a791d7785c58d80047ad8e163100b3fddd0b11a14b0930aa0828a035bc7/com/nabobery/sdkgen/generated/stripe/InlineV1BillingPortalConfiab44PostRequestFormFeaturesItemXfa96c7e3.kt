package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/subscription_update/properties/products/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/subscription_update/properties/products/anyOf/0/items
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfa96c7e3.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfa96c7e3(
  prices: List<String>,
  public val product: String,
  public val adjustableQuantity:
      InlineV1BillingPortalConfiab44PostRequestFormFeaturesAdjustableQuantityX9bb74386? = null,
) {
  public val prices: List<String> = prices.toList()

  public class Builder {
    private var pricesValue: List<String>? = null

    public var prices: List<String>
      get() = requireNotNull(pricesValue) { "prices is required" }.toList()
      set(`value`) {
        pricesValue = value.toList()
      }

    private var productValue: String? = null

    public var product: String
      get() = requireNotNull(productValue) { "product is required" }
      set(`value`) {
        productValue = value
      }

    public var adjustableQuantity:
        InlineV1BillingPortalConfiab44PostRequestFormFeaturesAdjustableQuantityX9bb74386? = null

    public fun build(): InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfa96c7e3 {
      check(pricesValue != null) { "prices is required" }
      check(productValue != null) { "product is required" }
      return InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfa96c7e3(
        prices = prices,
        product = product,
        adjustableQuantity = adjustableQuantity,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfa96c7e3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfa96c7e3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfa96c7e3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfa96c7e3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfa96c7e3 must be a JSON object")
      val prices = json.decodeRequired<List<String>>(rawObject, "prices")
      val product = json.decodeRequired<String>(rawObject, "product")
      return InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfa96c7e3(
        prices = prices,
        product = product,
        adjustableQuantity = rawObject["adjustable_quantity"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesAdjustableQuantityX9bb74386>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfa96c7e3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfa96c7e3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("prices", json.encodeToJsonElement(value.prices))
        put("product", value.product)
        value.adjustableQuantity?.let { put("adjustable_quantity", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfa96c7e3(block: InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfa96c7e3.Builder.() -> Unit): InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfa96c7e3 = InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfa96c7e3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfa96c7e3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
