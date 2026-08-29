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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/refund_destination_details_br_bank_transfer
 */
@Serializable(with = RefundDestinationDetailsBrBankTransfer.Serializer::class)
public class RefundDestinationDetailsBrBankTransfer(
  /**
   * The reference assigned to the refund.
   */
  public val reference: String? = null,
  /**
   * Status of the reference on the refund. This can be `pending`, `available` or `unavailable`.
   */
  public val referenceStatus: String? = null,
) {
  public class Builder {
    /**
     * The reference assigned to the refund.
     */
    public var reference: String? = null

    /**
     * Status of the reference on the refund. This can be `pending`, `available` or `unavailable`.
     */
    public var referenceStatus: String? = null

    public fun build(): RefundDestinationDetailsBrBankTransfer = RefundDestinationDetailsBrBankTransfer(
      reference = reference,
      referenceStatus = referenceStatus,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RefundDestinationDetailsBrBankTransfer = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RefundDestinationDetailsBrBankTransfer> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RefundDestinationDetailsBrBankTransfer {
      val jsonDecoder = decoder.requireJsonDecoder("RefundDestinationDetailsBrBankTransfer")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RefundDestinationDetailsBrBankTransfer must be a JSON object")
      return RefundDestinationDetailsBrBankTransfer(
        reference = rawObject["reference"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        referenceStatus = rawObject["reference_status"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RefundDestinationDetailsBrBankTransfer) {
      val jsonEncoder = encoder.requireJsonEncoder("RefundDestinationDetailsBrBankTransfer")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.reference?.let { put("reference", it) }
        value.referenceStatus?.let { put("reference_status", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun refundDestinationDetailsBrBankTransfer(block: RefundDestinationDetailsBrBankTransfer.Builder.() -> Unit): RefundDestinationDetailsBrBankTransfer = RefundDestinationDetailsBrBankTransfer.build(block)
