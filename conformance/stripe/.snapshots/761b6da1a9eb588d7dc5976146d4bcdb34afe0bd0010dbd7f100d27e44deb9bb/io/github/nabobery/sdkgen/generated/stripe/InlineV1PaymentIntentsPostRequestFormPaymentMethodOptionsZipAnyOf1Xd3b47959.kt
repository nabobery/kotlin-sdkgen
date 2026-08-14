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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/zip/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/zip/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959(
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX70f474c1? = null,
) {
  public class Builder {
    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX70f474c1? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959(
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959(
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX70f474c1>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959.build(block)
