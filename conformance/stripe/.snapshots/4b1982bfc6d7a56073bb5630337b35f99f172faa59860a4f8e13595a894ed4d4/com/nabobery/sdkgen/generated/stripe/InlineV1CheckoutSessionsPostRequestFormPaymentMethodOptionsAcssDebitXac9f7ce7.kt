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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/acss_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/acss_debit
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAcssDebitXac9f7ce7.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAcssDebitXac9f7ce7(
  public val currency:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCurrencyX3fb01c97? = null,
  public val mandateOptions: InlineV1CheckoutSessionsPostRequestFormMandateOptionsXc3032ce8? = null,
  public val setupFutureUsage:
      InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX8f2449e3? = null,
  public val targetDate: String? = null,
  public val verificationMethod:
      InlineV1CheckoutSessionsPostRequestFormVerificationMethodX4c4035c9? = null,
) {
  public class Builder {
    public var currency:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCurrencyX3fb01c97? = null

    public var mandateOptions: InlineV1CheckoutSessionsPostRequestFormMandateOptionsXc3032ce8? =
        null

    public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX8f2449e3? =
        null

    public var targetDate: String? = null

    public var verificationMethod:
        InlineV1CheckoutSessionsPostRequestFormVerificationMethodX4c4035c9? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAcssDebitXac9f7ce7 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAcssDebitXac9f7ce7(
      currency = currency,
      mandateOptions = mandateOptions,
      setupFutureUsage = setupFutureUsage,
      targetDate = targetDate,
      verificationMethod = verificationMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAcssDebitXac9f7ce7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAcssDebitXac9f7ce7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAcssDebitXac9f7ce7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAcssDebitXac9f7ce7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAcssDebitXac9f7ce7 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAcssDebitXac9f7ce7(
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCurrencyX3fb01c97>(it) },
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormMandateOptionsXc3032ce8>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX8f2449e3>(it) },
        targetDate = rawObject["target_date"]?.let { json.decodeFromJsonElement<String>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormVerificationMethodX4c4035c9>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAcssDebitXac9f7ce7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAcssDebitXac9f7ce7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.currency?.let { put("currency", json.encodeToJsonElement(it)) }
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
        value.targetDate?.let { put("target_date", it) }
        value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAcssDebitXac9f7ce7(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAcssDebitXac9f7ce7.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAcssDebitXac9f7ce7 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAcssDebitXac9f7ce7.build(block)
