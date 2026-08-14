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
 * [Affirm](https://www.affirm.com/) gives your customers a way to split purchases over a series of payments. Depending
 * on the purchase, they can pay with four interest-free payments (Split Pay) or pay over a longer term (Installments),
 * which might include interest. Check this [page](https://docs.stripe.com/payments/affirm) for more details like
 * country availability.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/affirm
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXb63acbe0.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXb63acbe0(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormAffirmDisplayPreferenceXfadd0e78? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormAffirmDisplayPreferenceXfadd0e78? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXb63acbe0 = InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXb63acbe0(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXb63acbe0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXb63acbe0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXb63acbe0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXb63acbe0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXb63acbe0 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXb63acbe0(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormAffirmDisplayPreferenceXfadd0e78>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXb63acbe0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXb63acbe0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormAffirmXb63acbe0(block: InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXb63acbe0.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXb63acbe0 = InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXb63acbe0.build(block)
