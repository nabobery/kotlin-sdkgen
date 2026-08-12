package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetailsView(
  public val ach: TreasuryOutboundPaymentsResourceAchTrackingDetails? = null,
  public val type: InlineTreasuryOutboundPaym5d35TypeXf770e912,
  @SerialName("us_domestic_wire")
  public val usDomesticWire: TreasuryOutboundPaymentsResourceUsDomesticWireTrackingDetails? = null,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_outbound_payments_resource_outbound_payment_resource_tracki
 * ng_details
 */
@Serializable(with = TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails.Serializer::class)
public class TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails(
  /**
   * The US bank account network used to send funds.
   */
  public val type: InlineTreasuryOutboundPaym5d35TypeXf770e912,
  public val ach: TreasuryOutboundPaymentsResourceAchTrackingDetails? = null,
  public val usDomesticWire: TreasuryOutboundPaymentsResourceUsDomesticWireTrackingDetails? = null,
) {
  public class Builder {
    private var typeValue: InlineTreasuryOutboundPaym5d35TypeXf770e912? = null

    public var type: InlineTreasuryOutboundPaym5d35TypeXf770e912
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var ach: TreasuryOutboundPaymentsResourceAchTrackingDetails? = null

    public var usDomesticWire: TreasuryOutboundPaymentsResourceUsDomesticWireTrackingDetails? = null

    public fun build(): TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails {
      check(typeValue != null) { "type is required" }
      return TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails(
        type = type,
        ach = ach,
        usDomesticWire = usDomesticWire,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails must be a JSON object")
      val type = json.decodeRequired<InlineTreasuryOutboundPaym5d35TypeXf770e912>(rawObject, "type")
      return TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails(
        type = type,
        ach = rawObject["ach"]?.let { json.decodeFromJsonElement<TreasuryOutboundPaymentsResourceAchTrackingDetails>(it) },
        usDomesticWire = rawObject["us_domestic_wire"]?.let { json.decodeFromJsonElement<TreasuryOutboundPaymentsResourceUsDomesticWireTrackingDetails>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.ach?.let { put("ach", json.encodeToJsonElement(it)) }
        value.usDomesticWire?.let { put("us_domestic_wire", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails(block: TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails.Builder.() -> Unit): TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails = TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
