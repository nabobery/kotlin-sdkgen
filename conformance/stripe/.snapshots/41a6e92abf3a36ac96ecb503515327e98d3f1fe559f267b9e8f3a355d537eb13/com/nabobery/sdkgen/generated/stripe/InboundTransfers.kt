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
public data class InboundTransfersView(
  @SerialName("billing_details")
  public val billingDetails: TreasurySharedResourceBillingDetails,
  public val type: InlineInboundTransfersTypeX4072e0f2,
  @SerialName("us_bank_account")
  public val usBankAccount: InboundTransfersPaymentMethodDetailsUsBankAccount? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/inbound_transfers
 */
@Serializable(with = InboundTransfers.Serializer::class)
public class InboundTransfers(
  public val billingDetails: TreasurySharedResourceBillingDetails,
  /**
   * The type of the payment method used in the InboundTransfer.
   */
  public val type: InlineInboundTransfersTypeX4072e0f2,
  public val usBankAccount: InboundTransfersPaymentMethodDetailsUsBankAccount? = null,
) {
  public class Builder {
    private var billingDetailsValue: TreasurySharedResourceBillingDetails? = null

    public var billingDetails: TreasurySharedResourceBillingDetails
      get() = requireNotNull(billingDetailsValue) { "billingDetails is required" }
      set(`value`) {
        billingDetailsValue = value
      }

    private var typeValue: InlineInboundTransfersTypeX4072e0f2? = null

    public var type: InlineInboundTransfersTypeX4072e0f2
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var usBankAccount: InboundTransfersPaymentMethodDetailsUsBankAccount? = null

    public fun build(): InboundTransfers {
      check(billingDetailsValue != null) { "billingDetails is required" }
      check(typeValue != null) { "type is required" }
      return InboundTransfers(
        billingDetails = billingDetails,
        type = type,
        usBankAccount = usBankAccount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InboundTransfers = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InboundTransfers> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InboundTransfers {
      val jsonDecoder = decoder.requireJsonDecoder("InboundTransfers")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InboundTransfers must be a JSON object")
      val billingDetails = json.decodeRequired<TreasurySharedResourceBillingDetails>(rawObject, "billing_details")
      val type = json.decodeRequired<InlineInboundTransfersTypeX4072e0f2>(rawObject, "type")
      return InboundTransfers(
        billingDetails = billingDetails,
        type = type,
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<InboundTransfersPaymentMethodDetailsUsBankAccount>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InboundTransfers) {
      val jsonEncoder = encoder.requireJsonEncoder("InboundTransfers")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("billing_details", json.encodeToJsonElement(value.billingDetails))
        put("type", json.encodeToJsonElement(value.type))
        value.usBankAccount?.let { put("us_bank_account", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inboundTransfers(block: InboundTransfers.Builder.() -> Unit): InboundTransfers = InboundTransfers.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InboundTransfers is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
