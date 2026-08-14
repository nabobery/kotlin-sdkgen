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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/upi.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/upi
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsUpiX1701d4cd.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsUpiX1701d4cd(
  public val mandateOptions: InlineV1CheckoutSessionsPostRequestFormMandateOptionsXa2d6b1b9? = null,
  public val setupFutureUsage:
      InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXc3c6545b? = null,
) {
  public class Builder {
    public var mandateOptions: InlineV1CheckoutSessionsPostRequestFormMandateOptionsXa2d6b1b9? =
        null

    public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXc3c6545b? =
        null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsUpiX1701d4cd = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsUpiX1701d4cd(
      mandateOptions = mandateOptions,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsUpiX1701d4cd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsUpiX1701d4cd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsUpiX1701d4cd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsUpiX1701d4cd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsUpiX1701d4cd must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsUpiX1701d4cd(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormMandateOptionsXa2d6b1b9>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXc3c6545b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsUpiX1701d4cd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsUpiX1701d4cd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsUpiX1701d4cd(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsUpiX1701d4cd.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsUpiX1701d4cd = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsUpiX1701d4cd.build(block)
