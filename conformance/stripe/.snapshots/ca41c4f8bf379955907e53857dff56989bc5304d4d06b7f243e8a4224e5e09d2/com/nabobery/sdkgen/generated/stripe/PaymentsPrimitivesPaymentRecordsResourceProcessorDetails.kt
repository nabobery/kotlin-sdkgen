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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Processor information associated with this payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_processor_details
 */
@Serializable(with = PaymentsPrimitivesPaymentRecordsResourceProcessorDetails.Serializer::class)
public class PaymentsPrimitivesPaymentRecordsResourceProcessorDetails(
  /**
   * The processor used for this payment attempt.
   */
  public val type: InlinePaymentsPrimitivesPaymentRecordsResourceProcessorDetailsTypeXb87541af,
  public val custom:
      PaymentsPrimitivesPaymentRecordsResourceProcessorDetailsResourceCustomDetails? = null,
) {
  public class Builder {
    private var typeValue:
        InlinePaymentsPrimitivesPaymentRecordsResourceProcessorDetailsTypeXb87541af? = null

    public var type: InlinePaymentsPrimitivesPaymentRecordsResourceProcessorDetailsTypeXb87541af
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var custom:
        PaymentsPrimitivesPaymentRecordsResourceProcessorDetailsResourceCustomDetails? = null

    public fun build(): PaymentsPrimitivesPaymentRecordsResourceProcessorDetails {
      check(typeValue != null) { "type is required" }
      return PaymentsPrimitivesPaymentRecordsResourceProcessorDetails(
        type = type,
        custom = custom,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourceProcessorDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentsPrimitivesPaymentRecordsResourceProcessorDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentsPrimitivesPaymentRecordsResourceProcessorDetails {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentsPrimitivesPaymentRecordsResourceProcessorDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourceProcessorDetails must be a JSON object")
      val type = json.decodeRequired<InlinePaymentsPrimitivesPaymentRecordsResourceProcessorDetailsTypeXb87541af>(rawObject, "type")
      return PaymentsPrimitivesPaymentRecordsResourceProcessorDetails(
        type = type,
        custom = rawObject["custom"]?.let { json.decodeFromJsonElement<PaymentsPrimitivesPaymentRecordsResourceProcessorDetailsResourceCustomDetails>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentsPrimitivesPaymentRecordsResourceProcessorDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentsPrimitivesPaymentRecordsResourceProcessorDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.custom?.let { put("custom", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentsPrimitivesPaymentRecordsResourceProcessorDetails(block: PaymentsPrimitivesPaymentRecordsResourceProcessorDetails.Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourceProcessorDetails = PaymentsPrimitivesPaymentRecordsResourceProcessorDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourceProcessorDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
