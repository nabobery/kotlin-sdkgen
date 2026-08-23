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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/pix.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/pix
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPixXd32d3655.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPixXd32d3655(
  public val amountIncludesIof:
      InlineV1CheckoutSessionsPostRequestFormAmountIncludesIofXf2f684bb? = null,
  public val expiresAfterSeconds: Int? = null,
  public val mandateOptions: InlineV1CheckoutSessionsPostRequestFormMandateOptionsXb7111296? = null,
  public val setupFutureUsage:
      InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX42ba80c7? = null,
) {
  public class Builder {
    public var amountIncludesIof: InlineV1CheckoutSessionsPostRequestFormAmountIncludesIofXf2f684bb?
        = null

    public var expiresAfterSeconds: Int? = null

    public var mandateOptions: InlineV1CheckoutSessionsPostRequestFormMandateOptionsXb7111296? =
        null

    public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX42ba80c7? =
        null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPixXd32d3655 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPixXd32d3655(
      amountIncludesIof = amountIncludesIof,
      expiresAfterSeconds = expiresAfterSeconds,
      mandateOptions = mandateOptions,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPixXd32d3655 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPixXd32d3655> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPixXd32d3655 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPixXd32d3655")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPixXd32d3655 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPixXd32d3655(
        amountIncludesIof = rawObject["amount_includes_iof"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormAmountIncludesIofXf2f684bb>(it) },
        expiresAfterSeconds = rawObject["expires_after_seconds"]?.let { json.decodeFromJsonElement<Int>(it) },
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormMandateOptionsXb7111296>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX42ba80c7>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPixXd32d3655) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPixXd32d3655")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amountIncludesIof?.let { put("amount_includes_iof", json.encodeToJsonElement(it)) }
        value.expiresAfterSeconds?.let { put("expires_after_seconds", json.encodeToJsonElement(it)) }
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPixXd32d3655(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPixXd32d3655.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPixXd32d3655 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPixXd32d3655.build(block)
