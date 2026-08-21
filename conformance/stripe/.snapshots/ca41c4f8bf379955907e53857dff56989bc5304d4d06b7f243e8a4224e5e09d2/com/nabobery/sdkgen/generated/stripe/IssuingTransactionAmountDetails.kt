package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class IssuingTransactionAmountDetailsView(
  @SerialName("atm_fee")
  public val atmFee: Int? = null,
  @SerialName("cashback_amount")
  public val cashbackAmount: Int? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_transaction_amount_details
 */
@Serializable(with = IssuingTransactionAmountDetails.Serializer::class)
public class IssuingTransactionAmountDetails(
  /**
   * The fee charged by the ATM for the cash withdrawal.
   */
  public val atmFee: Int? = null,
  /**
   * The amount of cash requested by the cardholder.
   */
  public val cashbackAmount: Int? = null,
) {
  public class Builder {
    /**
     * The fee charged by the ATM for the cash withdrawal.
     */
    public var atmFee: Int? = null

    /**
     * The amount of cash requested by the cardholder.
     */
    public var cashbackAmount: Int? = null

    public fun build(): IssuingTransactionAmountDetails = IssuingTransactionAmountDetails(
      atmFee = atmFee,
      cashbackAmount = cashbackAmount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingTransactionAmountDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingTransactionAmountDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingTransactionAmountDetails {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingTransactionAmountDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingTransactionAmountDetails must be a JSON object")
      return IssuingTransactionAmountDetails(
        atmFee = rawObject["atm_fee"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        cashbackAmount = rawObject["cashback_amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingTransactionAmountDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingTransactionAmountDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.atmFee?.let { put("atm_fee", json.encodeToJsonElement(it)) }
        value.cashbackAmount?.let { put("cashback_amount", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingTransactionAmountDetails(block: IssuingTransactionAmountDetails.Builder.() -> Unit): IssuingTransactionAmountDetails = IssuingTransactionAmountDetails.build(block)
