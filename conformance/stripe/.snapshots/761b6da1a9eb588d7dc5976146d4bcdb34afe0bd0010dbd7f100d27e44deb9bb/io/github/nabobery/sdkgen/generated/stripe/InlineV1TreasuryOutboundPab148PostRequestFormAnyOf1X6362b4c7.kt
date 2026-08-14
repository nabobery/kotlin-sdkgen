package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_options/properties/us_bank_account/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_options/properties/us_bank_account/anyOf/0
 */
@Serializable(with = InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7.Serializer::class)
public class InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7(
  public val network: InlineV1TreasuryOutboundPab148PostRequestFormNetworkXf857f5ed? = null,
) {
  public class Builder {
    public var network: InlineV1TreasuryOutboundPab148PostRequestFormNetworkXf857f5ed? = null

    public fun build(): InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7 = InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7(
      network = network,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7 must be a JSON object")
      return InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7(
        network = rawObject["network"]?.let { json.decodeFromJsonElement<InlineV1TreasuryOutboundPab148PostRequestFormNetworkXf857f5ed>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.network?.let { put("network", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7(block: InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7.Builder.() -> Unit): InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7 = InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X6362b4c7.build(block)
