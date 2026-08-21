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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/acss_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/acss_debit
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitX18c92550.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitX18c92550(
  public val currency:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCurrencyX36ccf6b5? = null,
  public val mandateOptions:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXab7daf8a? = null,
  public val verificationMethod:
      InlineV1SetupIntentsPostRequestFormVerificationMethodX8e8b6da3? = null,
) {
  public class Builder {
    public var currency: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCurrencyX36ccf6b5? =
        null

    public var mandateOptions:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXab7daf8a? = null

    public var verificationMethod: InlineV1SetupIntentsPostRequestFormVerificationMethodX8e8b6da3? =
        null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitX18c92550 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitX18c92550(
      currency = currency,
      mandateOptions = mandateOptions,
      verificationMethod = verificationMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitX18c92550 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitX18c92550> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitX18c92550 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitX18c92550")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitX18c92550 must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitX18c92550(
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCurrencyX36ccf6b5>(it) },
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXab7daf8a>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormVerificationMethodX8e8b6da3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitX18c92550) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitX18c92550")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.currency?.let { put("currency", json.encodeToJsonElement(it)) }
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitX18c92550(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitX18c92550.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitX18c92550 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitX18c92550.build(block)
