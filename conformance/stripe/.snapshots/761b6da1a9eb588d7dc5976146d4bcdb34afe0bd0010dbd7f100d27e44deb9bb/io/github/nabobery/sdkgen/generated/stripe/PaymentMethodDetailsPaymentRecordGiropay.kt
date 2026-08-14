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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_giropay
 */
@Serializable(with = PaymentMethodDetailsPaymentRecordGiropay.Serializer::class)
public class PaymentMethodDetailsPaymentRecordGiropay(
  /**
   * Bank code of bank associated with the bank account.
   */
  public val bankCode: String? = null,
  /**
   * Name of the bank associated with the bank account.
   */
  public val bankName: String? = null,
  /**
   * Bank Identifier Code of the bank associated with the bank account.
   */
  public val bic: String? = null,
  /**
   * Owner's verified full name. Values are verified or provided by Giropay directly (if supported) at the time of
   * authorization or settlement. They cannot be set or mutated. Giropay rarely provides this information so the
   * attribute is usually empty.
   */
  public val verifiedName: String? = null,
) {
  public class Builder {
    /**
     * Bank code of bank associated with the bank account.
     */
    public var bankCode: String? = null

    /**
     * Name of the bank associated with the bank account.
     */
    public var bankName: String? = null

    /**
     * Bank Identifier Code of the bank associated with the bank account.
     */
    public var bic: String? = null

    /**
     * Owner's verified full name. Values are verified or provided by Giropay directly (if supported) at the time of
     * authorization or settlement. They cannot be set or mutated. Giropay rarely provides this information so the
     * attribute is usually empty.
     */
    public var verifiedName: String? = null

    public fun build(): PaymentMethodDetailsPaymentRecordGiropay = PaymentMethodDetailsPaymentRecordGiropay(
      bankCode = bankCode,
      bankName = bankName,
      bic = bic,
      verifiedName = verifiedName,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsPaymentRecordGiropay = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodDetailsPaymentRecordGiropay> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsPaymentRecordGiropay {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsPaymentRecordGiropay")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsPaymentRecordGiropay must be a JSON object")
      return PaymentMethodDetailsPaymentRecordGiropay(
        bankCode = rawObject["bank_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        bankName = rawObject["bank_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        bic = rawObject["bic"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        verifiedName = rawObject["verified_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsPaymentRecordGiropay) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsPaymentRecordGiropay")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bankCode?.let { put("bank_code", it) }
        value.bankName?.let { put("bank_name", it) }
        value.bic?.let { put("bic", it) }
        value.verifiedName?.let { put("verified_name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsPaymentRecordGiropay(block: PaymentMethodDetailsPaymentRecordGiropay.Builder.() -> Unit): PaymentMethodDetailsPaymentRecordGiropay = PaymentMethodDetailsPaymentRecordGiropay.build(block)
