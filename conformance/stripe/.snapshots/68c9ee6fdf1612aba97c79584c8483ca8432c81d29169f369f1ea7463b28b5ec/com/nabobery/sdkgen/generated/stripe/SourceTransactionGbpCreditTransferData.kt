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
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_transaction_gbp_credit_transfer_data
 */
@Serializable(with = SourceTransactionGbpCreditTransferData.Serializer::class)
public class SourceTransactionGbpCreditTransferData(
  /**
   * Bank account fingerprint associated with the Stripe owned bank account receiving the transfer.
   */
  public val fingerprint: String? = null,
  /**
   * The credit transfer rails the sender used to push this transfer. The possible rails are: Faster Payments, BACS,
   * CHAPS, and wire transfers. Currently only Faster Payments is supported.
   */
  public val fundingMethod: String? = null,
  /**
   * Last 4 digits of sender account number associated with the transfer.
   */
  public val last4: String? = null,
  /**
   * Sender entered arbitrary information about the transfer.
   */
  public val reference: String? = null,
  /**
   * Sender account number associated with the transfer.
   */
  public val senderAccountNumber: String? = null,
  /**
   * Sender name associated with the transfer.
   */
  public val senderName: String? = null,
  /**
   * Sender sort code associated with the transfer.
   */
  public val senderSortCode: String? = null,
) {
  public class Builder {
    /**
     * Bank account fingerprint associated with the Stripe owned bank account receiving the transfer.
     */
    public var fingerprint: String? = null

    /**
     * The credit transfer rails the sender used to push this transfer. The possible rails are: Faster Payments, BACS,
     * CHAPS, and wire transfers. Currently only Faster Payments is supported.
     */
    public var fundingMethod: String? = null

    /**
     * Last 4 digits of sender account number associated with the transfer.
     */
    public var last4: String? = null

    /**
     * Sender entered arbitrary information about the transfer.
     */
    public var reference: String? = null

    /**
     * Sender account number associated with the transfer.
     */
    public var senderAccountNumber: String? = null

    /**
     * Sender name associated with the transfer.
     */
    public var senderName: String? = null

    /**
     * Sender sort code associated with the transfer.
     */
    public var senderSortCode: String? = null

    public fun build(): SourceTransactionGbpCreditTransferData = SourceTransactionGbpCreditTransferData(
      fingerprint = fingerprint,
      fundingMethod = fundingMethod,
      last4 = last4,
      reference = reference,
      senderAccountNumber = senderAccountNumber,
      senderName = senderName,
      senderSortCode = senderSortCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceTransactionGbpCreditTransferData = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SourceTransactionGbpCreditTransferData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceTransactionGbpCreditTransferData {
      val jsonDecoder = decoder.requireJsonDecoder("SourceTransactionGbpCreditTransferData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceTransactionGbpCreditTransferData must be a JSON object")
      return SourceTransactionGbpCreditTransferData(
        fingerprint = rawObject["fingerprint"]?.let { json.decodeFromJsonElement<String>(it) },
        fundingMethod = rawObject["funding_method"]?.let { json.decodeFromJsonElement<String>(it) },
        last4 = rawObject["last4"]?.let { json.decodeFromJsonElement<String>(it) },
        reference = rawObject["reference"]?.let { json.decodeFromJsonElement<String>(it) },
        senderAccountNumber = rawObject["sender_account_number"]?.let { json.decodeFromJsonElement<String>(it) },
        senderName = rawObject["sender_name"]?.let { json.decodeFromJsonElement<String>(it) },
        senderSortCode = rawObject["sender_sort_code"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceTransactionGbpCreditTransferData) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceTransactionGbpCreditTransferData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.fingerprint?.let { put("fingerprint", it) }
        value.fundingMethod?.let { put("funding_method", it) }
        value.last4?.let { put("last4", it) }
        value.reference?.let { put("reference", it) }
        value.senderAccountNumber?.let { put("sender_account_number", it) }
        value.senderName?.let { put("sender_name", it) }
        value.senderSortCode?.let { put("sender_sort_code", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceTransactionGbpCreditTransferData(block: SourceTransactionGbpCreditTransferData.Builder.() -> Unit): SourceTransactionGbpCreditTransferData = SourceTransactionGbpCreditTransferData.build(block)
