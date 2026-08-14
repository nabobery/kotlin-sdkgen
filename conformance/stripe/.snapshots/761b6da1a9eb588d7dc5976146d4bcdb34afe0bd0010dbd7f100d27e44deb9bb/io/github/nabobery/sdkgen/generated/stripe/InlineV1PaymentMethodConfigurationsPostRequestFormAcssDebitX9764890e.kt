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
 * Canadian pre-authorized debit payments, check this [page](https://docs.stripe.com/payments/acss-debit) for more
 * details like country availability.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/acss_debit
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX9764890e.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX9764890e(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitDisplayPreferenceX0de9ccd7? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitDisplayPreferenceX0de9ccd7? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX9764890e = InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX9764890e(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX9764890e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX9764890e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX9764890e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX9764890e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX9764890e must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX9764890e(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitDisplayPreferenceX0de9ccd7>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX9764890e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX9764890e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX9764890e(block: InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX9764890e.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX9764890e = InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX9764890e.build(block)
