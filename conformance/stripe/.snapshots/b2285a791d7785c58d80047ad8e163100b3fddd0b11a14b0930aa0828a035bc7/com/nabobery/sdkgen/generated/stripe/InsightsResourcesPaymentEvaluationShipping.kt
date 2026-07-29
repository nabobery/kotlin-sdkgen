package com.nabobery.sdkgen.generated.stripe

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

@Serializable
public data class InsightsResourcesPaymentEvaluationShippingView(
  public val address: InsightsResourcesPaymentEvaluationAddress,
  public val name: String? = null,
  public val phone: String? = null,
)

/**
 * Shipping details attached to this payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_shipping
 */
@Serializable(with = InsightsResourcesPaymentEvaluationShipping.Serializer::class)
public class InsightsResourcesPaymentEvaluationShipping(
  public val address: InsightsResourcesPaymentEvaluationAddress,
  /**
   * Shipping name.
   */
  public val name: String? = null,
  /**
   * Shipping phone number.
   */
  public val phone: String? = null,
) {
  public class Builder {
    private var addressValue: InsightsResourcesPaymentEvaluationAddress? = null

    public var address: InsightsResourcesPaymentEvaluationAddress
      get() = requireNotNull(addressValue) { "address is required" }
      set(`value`) {
        addressValue = value
      }

    /**
     * Shipping name.
     */
    public var name: String? = null

    /**
     * Shipping phone number.
     */
    public var phone: String? = null

    public fun build(): InsightsResourcesPaymentEvaluationShipping {
      check(addressValue != null) { "address is required" }
      return InsightsResourcesPaymentEvaluationShipping(
        address = address,
        name = name,
        phone = phone,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InsightsResourcesPaymentEvaluationShipping = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InsightsResourcesPaymentEvaluationShipping> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InsightsResourcesPaymentEvaluationShipping {
      val jsonDecoder = decoder.requireJsonDecoder("InsightsResourcesPaymentEvaluationShipping")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InsightsResourcesPaymentEvaluationShipping must be a JSON object")
      val address = json.decodeRequired<InsightsResourcesPaymentEvaluationAddress>(rawObject, "address")
      return InsightsResourcesPaymentEvaluationShipping(
        address = address,
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        phone = rawObject["phone"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InsightsResourcesPaymentEvaluationShipping) {
      val jsonEncoder = encoder.requireJsonEncoder("InsightsResourcesPaymentEvaluationShipping")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("address", json.encodeToJsonElement(value.address))
        value.name?.let { put("name", it) }
        value.phone?.let { put("phone", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun insightsResourcesPaymentEvaluationShipping(block: InsightsResourcesPaymentEvaluationShipping.Builder.() -> Unit): InsightsResourcesPaymentEvaluationShipping = InsightsResourcesPaymentEvaluationShipping.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InsightsResourcesPaymentEvaluationShipping is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
