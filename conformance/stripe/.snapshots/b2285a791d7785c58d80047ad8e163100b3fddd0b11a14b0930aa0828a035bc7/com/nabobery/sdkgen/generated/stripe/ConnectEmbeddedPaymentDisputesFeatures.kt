package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * Source: sdkgen://source/openapi.json#/components/schemas/connect_embedded_payment_disputes_features
 */
@Serializable(with = ConnectEmbeddedPaymentDisputesFeatures.Serializer::class)
public class ConnectEmbeddedPaymentDisputesFeatures(
  /**
   * Whether connected accounts can manage destination charges that are created on behalf of them. This is `false` by
   * default.
   */
  public val destinationOnBehalfOfChargeManagement: Boolean,
  /**
   * Whether responding to disputes is enabled, including submitting evidence and accepting disputes. This is `true` by
   * default.
   */
  public val disputeManagement: Boolean,
  /**
   * Whether sending refunds is enabled. This is `true` by default.
   */
  public val refundManagement: Boolean,
) {
  public class Builder {
    private var destinationOnBehalfOfChargeManagementValue: Boolean? = null

    public var destinationOnBehalfOfChargeManagement: Boolean
      get() = requireNotNull(destinationOnBehalfOfChargeManagementValue) { "destinationOnBehalfOfChargeManagement is required" }
      set(`value`) {
        destinationOnBehalfOfChargeManagementValue = value
      }

    private var disputeManagementValue: Boolean? = null

    public var disputeManagement: Boolean
      get() = requireNotNull(disputeManagementValue) { "disputeManagement is required" }
      set(`value`) {
        disputeManagementValue = value
      }

    private var refundManagementValue: Boolean? = null

    public var refundManagement: Boolean
      get() = requireNotNull(refundManagementValue) { "refundManagement is required" }
      set(`value`) {
        refundManagementValue = value
      }

    public fun build(): ConnectEmbeddedPaymentDisputesFeatures {
      check(destinationOnBehalfOfChargeManagementValue != null) { "destinationOnBehalfOfChargeManagement is required" }
      check(disputeManagementValue != null) { "disputeManagement is required" }
      check(refundManagementValue != null) { "refundManagement is required" }
      return ConnectEmbeddedPaymentDisputesFeatures(
        destinationOnBehalfOfChargeManagement = destinationOnBehalfOfChargeManagement,
        disputeManagement = disputeManagement,
        refundManagement = refundManagement,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ConnectEmbeddedPaymentDisputesFeatures = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ConnectEmbeddedPaymentDisputesFeatures> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ConnectEmbeddedPaymentDisputesFeatures {
      val jsonDecoder = decoder.requireJsonDecoder("ConnectEmbeddedPaymentDisputesFeatures")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ConnectEmbeddedPaymentDisputesFeatures must be a JSON object")
      val destinationOnBehalfOfChargeManagement = json.decodeRequired<Boolean>(rawObject, "destination_on_behalf_of_charge_management")
      val disputeManagement = json.decodeRequired<Boolean>(rawObject, "dispute_management")
      val refundManagement = json.decodeRequired<Boolean>(rawObject, "refund_management")
      return ConnectEmbeddedPaymentDisputesFeatures(
        destinationOnBehalfOfChargeManagement = destinationOnBehalfOfChargeManagement,
        disputeManagement = disputeManagement,
        refundManagement = refundManagement,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ConnectEmbeddedPaymentDisputesFeatures) {
      val jsonEncoder = encoder.requireJsonEncoder("ConnectEmbeddedPaymentDisputesFeatures")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("destination_on_behalf_of_charge_management", json.encodeToJsonElement(value.destinationOnBehalfOfChargeManagement))
        put("dispute_management", json.encodeToJsonElement(value.disputeManagement))
        put("refund_management", json.encodeToJsonElement(value.refundManagement))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun connectEmbeddedPaymentDisputesFeatures(block: ConnectEmbeddedPaymentDisputesFeatures.Builder.() -> Unit): ConnectEmbeddedPaymentDisputesFeatures = ConnectEmbeddedPaymentDisputesFeatures.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ConnectEmbeddedPaymentDisputesFeatures is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
