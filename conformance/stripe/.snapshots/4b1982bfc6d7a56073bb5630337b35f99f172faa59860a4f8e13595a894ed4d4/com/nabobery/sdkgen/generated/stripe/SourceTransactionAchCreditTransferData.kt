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
 * Source: sdkgen://source/openapi.json#/components/schemas/source_transaction_ach_credit_transfer_data
 */
@Serializable(with = SourceTransactionAchCreditTransferData.Serializer::class)
public class SourceTransactionAchCreditTransferData(
  /**
   * Customer data associated with the transfer.
   */
  public val customerData: String? = null,
  /**
   * Bank account fingerprint associated with the transfer.
   */
  public val fingerprint: String? = null,
  /**
   * Last 4 digits of the account number associated with the transfer.
   */
  public val last4: String? = null,
  /**
   * Routing number associated with the transfer.
   */
  public val routingNumber: String? = null,
) {
  public class Builder {
    /**
     * Customer data associated with the transfer.
     */
    public var customerData: String? = null

    /**
     * Bank account fingerprint associated with the transfer.
     */
    public var fingerprint: String? = null

    /**
     * Last 4 digits of the account number associated with the transfer.
     */
    public var last4: String? = null

    /**
     * Routing number associated with the transfer.
     */
    public var routingNumber: String? = null

    public fun build(): SourceTransactionAchCreditTransferData = SourceTransactionAchCreditTransferData(
      customerData = customerData,
      fingerprint = fingerprint,
      last4 = last4,
      routingNumber = routingNumber,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceTransactionAchCreditTransferData = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SourceTransactionAchCreditTransferData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceTransactionAchCreditTransferData {
      val jsonDecoder = decoder.requireJsonDecoder("SourceTransactionAchCreditTransferData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceTransactionAchCreditTransferData must be a JSON object")
      return SourceTransactionAchCreditTransferData(
        customerData = rawObject["customer_data"]?.let { json.decodeFromJsonElement<String>(it) },
        fingerprint = rawObject["fingerprint"]?.let { json.decodeFromJsonElement<String>(it) },
        last4 = rawObject["last4"]?.let { json.decodeFromJsonElement<String>(it) },
        routingNumber = rawObject["routing_number"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceTransactionAchCreditTransferData) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceTransactionAchCreditTransferData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customerData?.let { put("customer_data", it) }
        value.fingerprint?.let { put("fingerprint", it) }
        value.last4?.let { put("last4", it) }
        value.routingNumber?.let { put("routing_number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceTransactionAchCreditTransferData(block: SourceTransactionAchCreditTransferData.Builder.() -> Unit): SourceTransactionAchCreditTransferData = SourceTransactionAchCreditTransferData.build(block)
