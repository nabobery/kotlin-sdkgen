package com.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_ideal
 */
@Serializable(with = PaymentMethodIdeal.Serializer::class)
public class PaymentMethodIdeal(
  /**
   * The customer's bank, if provided. Can be one of `abn_amro`, `adyen`, `asn_bank`, `bunq`, `buut`, `finom`,
   * `handelsbanken`, `ing`, `knab`, `mollie`, `moneyou`, `n26`, `nn`, `rabobank`, `regiobank`, `revolut`, `sns_bank`,
   * `triodos_bank`, `van_lanschot`, or `yoursafe`.
   */
  public val bank: InlinePaymentMethodIdealBankXa5f90098? = null,
  /**
   * The Bank Identifier Code of the customer's bank, if the bank was provided.
   */
  public val bic: InlinePaymentMethodIdealBicX5b98b2a6? = null,
) {
  public class Builder {
    /**
     * The customer's bank, if provided. Can be one of `abn_amro`, `adyen`, `asn_bank`, `bunq`, `buut`, `finom`,
     * `handelsbanken`, `ing`, `knab`, `mollie`, `moneyou`, `n26`, `nn`, `rabobank`, `regiobank`, `revolut`, `sns_bank`,
     * `triodos_bank`, `van_lanschot`, or `yoursafe`.
     */
    public var bank: InlinePaymentMethodIdealBankXa5f90098? = null

    /**
     * The Bank Identifier Code of the customer's bank, if the bank was provided.
     */
    public var bic: InlinePaymentMethodIdealBicX5b98b2a6? = null

    public fun build(): PaymentMethodIdeal = PaymentMethodIdeal(
      bank = bank,
      bic = bic,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodIdeal = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodIdeal> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodIdeal {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodIdeal")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodIdeal must be a JSON object")
      return PaymentMethodIdeal(
        bank = rawObject["bank"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodIdealBankXa5f90098?>(element) },
        bic = rawObject["bic"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodIdealBicX5b98b2a6?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodIdeal) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodIdeal")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bank?.let { put("bank", json.encodeToJsonElement(it)) }
        value.bic?.let { put("bic", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodIdeal(block: PaymentMethodIdeal.Builder.() -> Unit): PaymentMethodIdeal = PaymentMethodIdeal.build(block)
