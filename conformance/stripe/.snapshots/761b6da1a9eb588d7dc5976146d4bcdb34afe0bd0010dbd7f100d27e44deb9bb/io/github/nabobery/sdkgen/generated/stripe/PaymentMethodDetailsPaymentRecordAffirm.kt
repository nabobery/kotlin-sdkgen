package io.github.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_affirm
 */
@Serializable(with = PaymentMethodDetailsPaymentRecordAffirm.Serializer::class)
public class PaymentMethodDetailsPaymentRecordAffirm(
  /**
   * ID of the location that this reader is assigned to.
   */
  public val location: String? = null,
  /**
   * ID of the reader this transaction was made on.
   */
  public val reader: String? = null,
  /**
   * The Affirm transaction ID associated with this payment.
   */
  public val transactionId: String? = null,
) {
  public class Builder {
    /**
     * ID of the location that this reader is assigned to.
     */
    public var location: String? = null

    /**
     * ID of the reader this transaction was made on.
     */
    public var reader: String? = null

    /**
     * The Affirm transaction ID associated with this payment.
     */
    public var transactionId: String? = null

    public fun build(): PaymentMethodDetailsPaymentRecordAffirm = PaymentMethodDetailsPaymentRecordAffirm(
      location = location,
      reader = reader,
      transactionId = transactionId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsPaymentRecordAffirm = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodDetailsPaymentRecordAffirm> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsPaymentRecordAffirm {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsPaymentRecordAffirm")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsPaymentRecordAffirm must be a JSON object")
      return PaymentMethodDetailsPaymentRecordAffirm(
        location = rawObject["location"]?.let { json.decodeFromJsonElement<String>(it) },
        reader = rawObject["reader"]?.let { json.decodeFromJsonElement<String>(it) },
        transactionId = rawObject["transaction_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsPaymentRecordAffirm) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsPaymentRecordAffirm")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.location?.let { put("location", it) }
        value.reader?.let { put("reader", it) }
        value.transactionId?.let { put("transaction_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsPaymentRecordAffirm(block: PaymentMethodDetailsPaymentRecordAffirm.Builder.() -> Unit): PaymentMethodDetailsPaymentRecordAffirm = PaymentMethodDetailsPaymentRecordAffirm.build(block)
