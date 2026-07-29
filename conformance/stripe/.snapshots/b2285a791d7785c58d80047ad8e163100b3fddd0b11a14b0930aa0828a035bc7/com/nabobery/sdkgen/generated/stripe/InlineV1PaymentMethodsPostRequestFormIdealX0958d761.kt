package com.nabobery.sdkgen.generated.stripe

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
 * If this is an `ideal` PaymentMethod, this hash contains details about the iDEAL payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/ideal
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormIdealX0958d761.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormIdealX0958d761(
  public val bank: InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc? = null,
) {
  public class Builder {
    public var bank: InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc? = null

    public fun build(): InlineV1PaymentMethodsPostRequestFormIdealX0958d761 = InlineV1PaymentMethodsPostRequestFormIdealX0958d761(
      bank = bank,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormIdealX0958d761 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormIdealX0958d761> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormIdealX0958d761 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormIdealX0958d761")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormIdealX0958d761 must be a JSON object")
      return InlineV1PaymentMethodsPostRequestFormIdealX0958d761(
        bank = rawObject["bank"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormIdealX0958d761) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormIdealX0958d761")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bank?.let { put("bank", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodsPostRequestFormIdealX0958d761(block: InlineV1PaymentMethodsPostRequestFormIdealX0958d761.Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormIdealX0958d761 = InlineV1PaymentMethodsPostRequestFormIdealX0958d761.build(block)
