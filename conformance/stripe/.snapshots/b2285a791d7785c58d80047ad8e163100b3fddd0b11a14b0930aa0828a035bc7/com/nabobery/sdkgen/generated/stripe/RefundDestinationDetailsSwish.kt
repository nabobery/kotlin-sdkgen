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
 * Source: sdkgen://source/openapi.json#/components/schemas/refund_destination_details_swish
 */
@Serializable(with = RefundDestinationDetailsSwish.Serializer::class)
public class RefundDestinationDetailsSwish(
  /**
   * For refunds declined by the network, a decline code provided by the network which indicates the reason the refund
   * failed.
   */
  public val networkDeclineCode: String? = null,
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
     * For refunds declined by the network, a decline code provided by the network which indicates the reason the refund
     * failed.
     */
    public var networkDeclineCode: String? = null

    /**
     * The reference assigned to the refund.
     */
    public var reference: String? = null

    /**
     * Status of the reference on the refund. This can be `pending`, `available` or `unavailable`.
     */
    public var referenceStatus: String? = null

    public fun build(): RefundDestinationDetailsSwish = RefundDestinationDetailsSwish(
      networkDeclineCode = networkDeclineCode,
      reference = reference,
      referenceStatus = referenceStatus,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RefundDestinationDetailsSwish = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RefundDestinationDetailsSwish> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RefundDestinationDetailsSwish {
      val jsonDecoder = decoder.requireJsonDecoder("RefundDestinationDetailsSwish")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RefundDestinationDetailsSwish must be a JSON object")
      return RefundDestinationDetailsSwish(
        networkDeclineCode = rawObject["network_decline_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        reference = rawObject["reference"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        referenceStatus = rawObject["reference_status"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RefundDestinationDetailsSwish) {
      val jsonEncoder = encoder.requireJsonEncoder("RefundDestinationDetailsSwish")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.networkDeclineCode?.let { put("network_decline_code", it) }
        value.reference?.let { put("reference", it) }
        value.referenceStatus?.let { put("reference_status", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun refundDestinationDetailsSwish(block: RefundDestinationDetailsSwish.Builder.() -> Unit): RefundDestinationDetailsSwish = RefundDestinationDetailsSwish.build(block)
