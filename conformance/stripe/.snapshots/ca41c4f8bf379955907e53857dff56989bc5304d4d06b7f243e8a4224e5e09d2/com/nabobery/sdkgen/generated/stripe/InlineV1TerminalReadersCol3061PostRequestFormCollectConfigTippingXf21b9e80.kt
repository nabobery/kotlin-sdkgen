package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_payment_method/post/requestBody/conten
 * t/application~1x-www-form-urlencoded/schema/properties/collect_config/properties/tipping.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_payment_method/post/requestBody/conten
 * t/application~1x-www-form-urlencoded/schema/properties/collect_config/properties/tipping
 */
@Serializable(with = InlineV1TerminalReadersCol3061PostRequestFormCollectConfigTippingXf21b9e80.Serializer::class)
public class InlineV1TerminalReadersCol3061PostRequestFormCollectConfigTippingXf21b9e80(
  public val amountEligible: Int? = null,
) {
  public class Builder {
    public var amountEligible: Int? = null

    public fun build(): InlineV1TerminalReadersCol3061PostRequestFormCollectConfigTippingXf21b9e80 = InlineV1TerminalReadersCol3061PostRequestFormCollectConfigTippingXf21b9e80(
      amountEligible = amountEligible,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalReadersCol3061PostRequestFormCollectConfigTippingXf21b9e80 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalReadersCol3061PostRequestFormCollectConfigTippingXf21b9e80> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersCol3061PostRequestFormCollectConfigTippingXf21b9e80 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalReadersCol3061PostRequestFormCollectConfigTippingXf21b9e80")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalReadersCol3061PostRequestFormCollectConfigTippingXf21b9e80 must be a JSON object")
      return InlineV1TerminalReadersCol3061PostRequestFormCollectConfigTippingXf21b9e80(
        amountEligible = rawObject["amount_eligible"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersCol3061PostRequestFormCollectConfigTippingXf21b9e80) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalReadersCol3061PostRequestFormCollectConfigTippingXf21b9e80")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amountEligible?.let { put("amount_eligible", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalReadersCol3061PostRequestFormCollectConfigTippingXf21b9e80(block: InlineV1TerminalReadersCol3061PostRequestFormCollectConfigTippingXf21b9e80.Builder.() -> Unit): InlineV1TerminalReadersCol3061PostRequestFormCollectConfigTippingXf21b9e80 = InlineV1TerminalReadersCol3061PostRequestFormCollectConfigTippingXf21b9e80.build(block)
