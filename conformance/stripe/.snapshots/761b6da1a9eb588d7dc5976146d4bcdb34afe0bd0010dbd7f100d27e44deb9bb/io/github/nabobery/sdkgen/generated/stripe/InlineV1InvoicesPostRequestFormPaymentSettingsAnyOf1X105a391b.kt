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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b(
  public val installments:
      InlineV1InvoicesPostRequestFormPaymentSettingsInstallmentsX599bfad7? = null,
  public val requestThreeDSecure:
      InlineV1InvoicesPostRequestFormPaymentSettingsRequestThreeDSecureX054a7b71? = null,
) {
  public class Builder {
    public var installments: InlineV1InvoicesPostRequestFormPaymentSettingsInstallmentsX599bfad7? =
        null

    public var requestThreeDSecure:
        InlineV1InvoicesPostRequestFormPaymentSettingsRequestThreeDSecureX054a7b71? = null

    public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b(
      installments = installments,
      requestThreeDSecure = requestThreeDSecure,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b must be a JSON object")
      return InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b(
        installments = rawObject["installments"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsInstallmentsX599bfad7>(it) },
        requestThreeDSecure = rawObject["request_three_d_secure"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsRequestThreeDSecureX054a7b71>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.installments?.let { put("installments", json.encodeToJsonElement(it)) }
        value.requestThreeDSecure?.let { put("request_three_d_secure", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b(block: InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b.Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b.build(block)
