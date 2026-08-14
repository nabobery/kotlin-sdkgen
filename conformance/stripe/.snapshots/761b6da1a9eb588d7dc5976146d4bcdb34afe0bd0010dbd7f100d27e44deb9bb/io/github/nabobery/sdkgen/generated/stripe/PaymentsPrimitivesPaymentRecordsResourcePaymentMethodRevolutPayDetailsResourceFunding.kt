package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_revolut_
 * pay_details_resource_funding
 */
@Serializable(with = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodRevolutPayDetailsResourceFunding.Serializer::class)
public class PaymentsPrimitivesPaymentRecordsResourcePaymentMethodRevolutPayDetailsResourceFunding(
  public val card:
      PaymentsPrimitivesPaymentRecordsResourcePaymentMethodRevolutPayDetailsResourceFundingResourceFundingCard? = null,
  /**
   * Funding type of the underlying payment method.
   */
  public val type: InlinePaymentsPrimitivesPaebdbTypeX7b145df9? = null,
) {
  public class Builder {
    public var card:
        PaymentsPrimitivesPaymentRecordsResourcePaymentMethodRevolutPayDetailsResourceFundingResourceFundingCard?
        = null

    /**
     * Funding type of the underlying payment method.
     */
    public var type: InlinePaymentsPrimitivesPaebdbTypeX7b145df9? = null

    public fun build(): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodRevolutPayDetailsResourceFunding = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodRevolutPayDetailsResourceFunding(
      card = card,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodRevolutPayDetailsResourceFunding = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodRevolutPayDetailsResourceFunding> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodRevolutPayDetailsResourceFunding {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodRevolutPayDetailsResourceFunding")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodRevolutPayDetailsResourceFunding must be a JSON object")
      return PaymentsPrimitivesPaymentRecordsResourcePaymentMethodRevolutPayDetailsResourceFunding(
        card = rawObject["card"]?.let { json.decodeFromJsonElement<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodRevolutPayDetailsResourceFundingResourceFundingCard>(it) },
        type = rawObject["type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentsPrimitivesPaebdbTypeX7b145df9?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodRevolutPayDetailsResourceFunding) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodRevolutPayDetailsResourceFunding")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentsPrimitivesPaymentRecordsResourcePaymentMethodRevolutPayDetailsResourceFunding(block: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodRevolutPayDetailsResourceFunding.Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodRevolutPayDetailsResourceFunding = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodRevolutPayDetailsResourceFunding.build(block)
