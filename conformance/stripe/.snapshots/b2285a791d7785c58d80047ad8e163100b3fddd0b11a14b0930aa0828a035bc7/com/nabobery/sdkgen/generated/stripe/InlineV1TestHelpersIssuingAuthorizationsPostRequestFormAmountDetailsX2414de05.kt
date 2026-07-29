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
 * Detailed breakdown of amount components. These amounts are denominated in `currency` and in the [smallest currency
 * unit](https://docs.stripe.com/currencies#zero-decimal).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/amount_details
 */
@Serializable(with = InlineV1TestHelpersIssuingAuthorizationsPostRequestFormAmountDetailsX2414de05.Serializer::class)
public class InlineV1TestHelpersIssuingAuthorizationsPostRequestFormAmountDetailsX2414de05(
  public val atmFee: Int? = null,
  public val cashbackAmount: Int? = null,
) {
  public class Builder {
    public var atmFee: Int? = null

    public var cashbackAmount: Int? = null

    public fun build(): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormAmountDetailsX2414de05 = InlineV1TestHelpersIssuingAuthorizationsPostRequestFormAmountDetailsX2414de05(
      atmFee = atmFee,
      cashbackAmount = cashbackAmount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormAmountDetailsX2414de05 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TestHelpersIssuingAuthorizationsPostRequestFormAmountDetailsX2414de05> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormAmountDetailsX2414de05 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuingAuthorizationsPostRequestFormAmountDetailsX2414de05")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuingAuthorizationsPostRequestFormAmountDetailsX2414de05 must be a JSON object")
      return InlineV1TestHelpersIssuingAuthorizationsPostRequestFormAmountDetailsX2414de05(
        atmFee = rawObject["atm_fee"]?.let { json.decodeFromJsonElement<Int>(it) },
        cashbackAmount = rawObject["cashback_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuingAuthorizationsPostRequestFormAmountDetailsX2414de05) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuingAuthorizationsPostRequestFormAmountDetailsX2414de05")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.atmFee?.let { put("atm_fee", json.encodeToJsonElement(it)) }
        value.cashbackAmount?.let { put("cashback_amount", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuingAuthorizationsPostRequestFormAmountDetailsX2414de05(block: InlineV1TestHelpersIssuingAuthorizationsPostRequestFormAmountDetailsX2414de05.Builder.() -> Unit): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormAmountDetailsX2414de05 = InlineV1TestHelpersIssuingAuthorizationsPostRequestFormAmountDetailsX2414de05.build(block)
