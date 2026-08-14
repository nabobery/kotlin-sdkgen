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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_transfers/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/destination_payment_method_options/properties/us_bank_account/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_transfers/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/destination_payment_method_options/properties/us_bank_account/anyOf/0
 */
@Serializable(with = InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b.Serializer::class)
public class InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b(
  public val network: InlineV1TreasuryOutboundTrc70dPostRequestFormNetworkX56d3a4af? = null,
) {
  public class Builder {
    public var network: InlineV1TreasuryOutboundTrc70dPostRequestFormNetworkX56d3a4af? = null

    public fun build(): InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b = InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b(
      network = network,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b must be a JSON object")
      return InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b(
        network = rawObject["network"]?.let { json.decodeFromJsonElement<InlineV1TreasuryOutboundTrc70dPostRequestFormNetworkX56d3a4af>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.network?.let { put("network", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b(block: InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b.Builder.() -> Unit): InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b = InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b.build(block)
