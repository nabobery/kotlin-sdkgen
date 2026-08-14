package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/refund_destination_details_card
 */
@Serializable(with = RefundDestinationDetailsCard.Serializer::class)
public class RefundDestinationDetailsCard(
  /**
   * The type of refund. This can be `refund`, `reversal`, or `pending`.
   */
  public val type: InlineRefundDestinationDetailsCardTypeXeef40eed,
  /**
   * Value of the reference number assigned to the refund.
   */
  public val reference: String? = null,
  /**
   * Status of the reference number on the refund. This can be `pending`, `available` or `unavailable`.
   */
  public val referenceStatus: String? = null,
  /**
   * Type of the reference number assigned to the refund.
   */
  public val referenceType: String? = null,
) {
  public class Builder {
    private var typeValue: InlineRefundDestinationDetailsCardTypeXeef40eed? = null

    public var type: InlineRefundDestinationDetailsCardTypeXeef40eed
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Value of the reference number assigned to the refund.
     */
    public var reference: String? = null

    /**
     * Status of the reference number on the refund. This can be `pending`, `available` or `unavailable`.
     */
    public var referenceStatus: String? = null

    /**
     * Type of the reference number assigned to the refund.
     */
    public var referenceType: String? = null

    public fun build(): RefundDestinationDetailsCard {
      check(typeValue != null) { "type is required" }
      return RefundDestinationDetailsCard(
        type = type,
        reference = reference,
        referenceStatus = referenceStatus,
        referenceType = referenceType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RefundDestinationDetailsCard = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RefundDestinationDetailsCard> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RefundDestinationDetailsCard {
      val jsonDecoder = decoder.requireJsonDecoder("RefundDestinationDetailsCard")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RefundDestinationDetailsCard must be a JSON object")
      val type = json.decodeRequired<InlineRefundDestinationDetailsCardTypeXeef40eed>(rawObject, "type")
      return RefundDestinationDetailsCard(
        type = type,
        reference = rawObject["reference"]?.let { json.decodeFromJsonElement<String>(it) },
        referenceStatus = rawObject["reference_status"]?.let { json.decodeFromJsonElement<String>(it) },
        referenceType = rawObject["reference_type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RefundDestinationDetailsCard) {
      val jsonEncoder = encoder.requireJsonEncoder("RefundDestinationDetailsCard")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.reference?.let { put("reference", it) }
        value.referenceStatus?.let { put("reference_status", it) }
        value.referenceType?.let { put("reference_type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun refundDestinationDetailsCard(block: RefundDestinationDetailsCard.Builder.() -> Unit): RefundDestinationDetailsCard = RefundDestinationDetailsCard.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RefundDestinationDetailsCard is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
