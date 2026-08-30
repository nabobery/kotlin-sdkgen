package com.nabobery.sdkgen.generated.stripe

import kotlin.String
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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/swish.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/swish
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSwishX76e8d976.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSwishX76e8d976(
  public val reference: String? = null,
) {
  public class Builder {
    public var reference: String? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSwishX76e8d976 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSwishX76e8d976(
      reference = reference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSwishX76e8d976 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSwishX76e8d976> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSwishX76e8d976 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSwishX76e8d976")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSwishX76e8d976 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSwishX76e8d976(
        reference = rawObject["reference"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSwishX76e8d976) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSwishX76e8d976")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.reference?.let { put("reference", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSwishX76e8d976(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSwishX76e8d976.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSwishX76e8d976 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSwishX76e8d976.build(block)
