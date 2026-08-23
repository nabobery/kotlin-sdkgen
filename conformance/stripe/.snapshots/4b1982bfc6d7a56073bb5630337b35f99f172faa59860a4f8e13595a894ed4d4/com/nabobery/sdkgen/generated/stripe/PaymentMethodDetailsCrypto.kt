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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_crypto
 */
@Serializable(with = PaymentMethodDetailsCrypto.Serializer::class)
public class PaymentMethodDetailsCrypto(
  /**
   * The wallet address of the customer.
   */
  public val buyerAddress: String? = null,
  /**
   * The blockchain network that the transaction was sent on.
   */
  public val network: InlinePaymentMethodDetailsCryptoNetworkX8770091f? = null,
  /**
   * The token currency that the transaction was sent with.
   */
  public val tokenCurrency: InlinePaymentMethodDetailsCryptoTokenCurrencyX63152529? = null,
  /**
   * The blockchain transaction hash of the crypto payment.
   */
  public val transactionHash: String? = null,
) {
  public class Builder {
    /**
     * The wallet address of the customer.
     */
    public var buyerAddress: String? = null

    /**
     * The blockchain network that the transaction was sent on.
     */
    public var network: InlinePaymentMethodDetailsCryptoNetworkX8770091f? = null

    /**
     * The token currency that the transaction was sent with.
     */
    public var tokenCurrency: InlinePaymentMethodDetailsCryptoTokenCurrencyX63152529? = null

    /**
     * The blockchain transaction hash of the crypto payment.
     */
    public var transactionHash: String? = null

    public fun build(): PaymentMethodDetailsCrypto = PaymentMethodDetailsCrypto(
      buyerAddress = buyerAddress,
      network = network,
      tokenCurrency = tokenCurrency,
      transactionHash = transactionHash,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsCrypto = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodDetailsCrypto> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsCrypto {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsCrypto")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsCrypto must be a JSON object")
      return PaymentMethodDetailsCrypto(
        buyerAddress = rawObject["buyer_address"]?.let { json.decodeFromJsonElement<String>(it) },
        network = rawObject["network"]?.let { json.decodeFromJsonElement<InlinePaymentMethodDetailsCryptoNetworkX8770091f>(it) },
        tokenCurrency = rawObject["token_currency"]?.let { json.decodeFromJsonElement<InlinePaymentMethodDetailsCryptoTokenCurrencyX63152529>(it) },
        transactionHash = rawObject["transaction_hash"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsCrypto) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsCrypto")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.buyerAddress?.let { put("buyer_address", it) }
        value.network?.let { put("network", json.encodeToJsonElement(it)) }
        value.tokenCurrency?.let { put("token_currency", json.encodeToJsonElement(it)) }
        value.transactionHash?.let { put("transaction_hash", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsCrypto(block: PaymentMethodDetailsCrypto.Builder.() -> Unit): PaymentMethodDetailsCrypto = PaymentMethodDetailsCrypto.build(block)
