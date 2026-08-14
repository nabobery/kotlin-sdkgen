package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_processing_customer_notification
 */
@Serializable(with = PaymentIntentProcessingCustomerNotification.Serializer::class)
public class PaymentIntentProcessingCustomerNotification(
  /**
   * Whether customer approval has been requested for this payment. For payments greater than INR 15000 or mandate
   * amount, the customer must provide explicit approval of the payment with their bank.
   */
  public val approvalRequested: Boolean? = null,
  /**
   * If customer approval is required, they need to provide approval before this time.
   */
  public val completesAt: Int? = null,
) {
  public class Builder {
    /**
     * Whether customer approval has been requested for this payment. For payments greater than INR 15000 or mandate
     * amount, the customer must provide explicit approval of the payment with their bank.
     */
    public var approvalRequested: Boolean? = null

    /**
     * If customer approval is required, they need to provide approval before this time.
     */
    public var completesAt: Int? = null

    public fun build(): PaymentIntentProcessingCustomerNotification = PaymentIntentProcessingCustomerNotification(
      approvalRequested = approvalRequested,
      completesAt = completesAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentProcessingCustomerNotification = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentIntentProcessingCustomerNotification> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentProcessingCustomerNotification {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentProcessingCustomerNotification")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentProcessingCustomerNotification must be a JSON object")
      return PaymentIntentProcessingCustomerNotification(
        approvalRequested = rawObject["approval_requested"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        completesAt = rawObject["completes_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentProcessingCustomerNotification) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentProcessingCustomerNotification")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.approvalRequested?.let { put("approval_requested", json.encodeToJsonElement(it)) }
        value.completesAt?.let { put("completes_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentProcessingCustomerNotification(block: PaymentIntentProcessingCustomerNotification.Builder.() -> Unit): PaymentIntentProcessingCustomerNotification = PaymentIntentProcessingCustomerNotification.build(block)
