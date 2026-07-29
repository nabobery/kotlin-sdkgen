package com.nabobery.sdkgen.generated.stripe

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
 * Hash used to generate the PaymentMethod to be used for this OutboundTransfer. Exclusive with
 * `destination_payment_method`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_transfers/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/destination_payment_method_data
 */
@Serializable(with = InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMec421X49fd33a8.Serializer::class)
public class InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMec421X49fd33a8(
  public val type: InlineV1TreasuryOutboundTrc70dPostRequestFormTypeX63a048a1,
  public val financialAccount: String? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TreasuryOutboundTrc70dPostRequestFormTypeX63a048a1? = null

    public var type: InlineV1TreasuryOutboundTrc70dPostRequestFormTypeX63a048a1
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var financialAccount: String? = null

    public fun build(): InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMec421X49fd33a8 {
      check(typeValue != null) { "type is required" }
      return InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMec421X49fd33a8(
        type = type,
        financialAccount = financialAccount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMec421X49fd33a8 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMec421X49fd33a8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMec421X49fd33a8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMec421X49fd33a8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMec421X49fd33a8 must be a JSON object")
      val type = json.decodeRequired<InlineV1TreasuryOutboundTrc70dPostRequestFormTypeX63a048a1>(rawObject, "type")
      return InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMec421X49fd33a8(
        type = type,
        financialAccount = rawObject["financial_account"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMec421X49fd33a8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMec421X49fd33a8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.financialAccount?.let { put("financial_account", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMec421X49fd33a8(block: InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMec421X49fd33a8.Builder.() -> Unit): InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMec421X49fd33a8 = InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMec421X49fd33a8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMec421X49fd33a8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
