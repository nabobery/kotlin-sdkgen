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
 * Afterpay gives your customers a way to pay for purchases in installments, check this
 * [page](https://docs.stripe.com/payments/afterpay-clearpay) for more details like country availability. Afterpay is
 * particularly popular among businesses selling fashion, beauty, and sports products.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/afterpay_clearpay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayX79e7b98e.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayX79e7b98e(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX89e5f8f0? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX89e5f8f0? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayX79e7b98e = InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayX79e7b98e(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayX79e7b98e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayX79e7b98e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayX79e7b98e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayX79e7b98e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayX79e7b98e must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayX79e7b98e(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX89e5f8f0>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayX79e7b98e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayX79e7b98e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayX79e7b98e(block: InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayX79e7b98e.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayX79e7b98e = InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayX79e7b98e.build(block)
