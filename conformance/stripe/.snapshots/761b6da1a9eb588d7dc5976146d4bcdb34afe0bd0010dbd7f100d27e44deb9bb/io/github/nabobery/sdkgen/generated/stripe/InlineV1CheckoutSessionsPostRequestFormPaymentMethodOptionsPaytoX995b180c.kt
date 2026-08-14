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
 * ded/schema/properties/payment_method_options/properties/payto.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/payto
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoX995b180c.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoX995b180c(
  public val mandateOptions: InlineV1CheckoutSessionsPostRequestFormMandateOptionsX8297295b? = null,
  public val setupFutureUsage:
      InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXe2bcc9f1? = null,
) {
  public class Builder {
    public var mandateOptions: InlineV1CheckoutSessionsPostRequestFormMandateOptionsX8297295b? =
        null

    public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXe2bcc9f1? =
        null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoX995b180c = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoX995b180c(
      mandateOptions = mandateOptions,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoX995b180c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoX995b180c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoX995b180c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoX995b180c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoX995b180c must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoX995b180c(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormMandateOptionsX8297295b>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXe2bcc9f1>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoX995b180c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoX995b180c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoX995b180c(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoX995b180c.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoX995b180c = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoX995b180c.build(block)
