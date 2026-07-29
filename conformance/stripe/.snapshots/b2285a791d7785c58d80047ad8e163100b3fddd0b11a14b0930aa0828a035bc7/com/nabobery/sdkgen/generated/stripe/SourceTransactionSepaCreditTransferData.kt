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
 * Source: sdkgen://source/openapi.json#/components/schemas/source_transaction_sepa_credit_transfer_data
 */
@Serializable(with = SourceTransactionSepaCreditTransferData.Serializer::class)
public class SourceTransactionSepaCreditTransferData(
  /**
   * Reference associated with the transfer.
   */
  public val reference: String? = null,
  /**
   * Sender's bank account IBAN.
   */
  public val senderIban: String? = null,
  /**
   * Sender's name.
   */
  public val senderName: String? = null,
) {
  public class Builder {
    /**
     * Reference associated with the transfer.
     */
    public var reference: String? = null

    /**
     * Sender's bank account IBAN.
     */
    public var senderIban: String? = null

    /**
     * Sender's name.
     */
    public var senderName: String? = null

    public fun build(): SourceTransactionSepaCreditTransferData = SourceTransactionSepaCreditTransferData(
      reference = reference,
      senderIban = senderIban,
      senderName = senderName,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceTransactionSepaCreditTransferData = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SourceTransactionSepaCreditTransferData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceTransactionSepaCreditTransferData {
      val jsonDecoder = decoder.requireJsonDecoder("SourceTransactionSepaCreditTransferData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceTransactionSepaCreditTransferData must be a JSON object")
      return SourceTransactionSepaCreditTransferData(
        reference = rawObject["reference"]?.let { json.decodeFromJsonElement<String>(it) },
        senderIban = rawObject["sender_iban"]?.let { json.decodeFromJsonElement<String>(it) },
        senderName = rawObject["sender_name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceTransactionSepaCreditTransferData) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceTransactionSepaCreditTransferData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.reference?.let { put("reference", it) }
        value.senderIban?.let { put("sender_iban", it) }
        value.senderName?.let { put("sender_name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceTransactionSepaCreditTransferData(block: SourceTransactionSepaCreditTransferData.Builder.() -> Unit): SourceTransactionSepaCreditTransferData = SourceTransactionSepaCreditTransferData.build(block)
