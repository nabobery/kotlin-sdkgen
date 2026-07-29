package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_credit_grants_resource_applicable_price
 */
@Serializable(with = BillingCreditGrantsResourceApplicablePrice.Serializer::class)
public class BillingCreditGrantsResourceApplicablePrice(
  /**
   * Unique identifier for the object.
   */
  public val id: String? = null,
) {
  public class Builder {
    /**
     * Unique identifier for the object.
     */
    public var id: String? = null

    public fun build(): BillingCreditGrantsResourceApplicablePrice = BillingCreditGrantsResourceApplicablePrice(
      id = id,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingCreditGrantsResourceApplicablePrice = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BillingCreditGrantsResourceApplicablePrice> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingCreditGrantsResourceApplicablePrice {
      val jsonDecoder = decoder.requireJsonDecoder("BillingCreditGrantsResourceApplicablePrice")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingCreditGrantsResourceApplicablePrice must be a JSON object")
      return BillingCreditGrantsResourceApplicablePrice(
        id = rawObject["id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingCreditGrantsResourceApplicablePrice) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingCreditGrantsResourceApplicablePrice")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingCreditGrantsResourceApplicablePrice(block: BillingCreditGrantsResourceApplicablePrice.Builder.() -> Unit): BillingCreditGrantsResourceApplicablePrice = BillingCreditGrantsResourceApplicablePrice.build(block)
