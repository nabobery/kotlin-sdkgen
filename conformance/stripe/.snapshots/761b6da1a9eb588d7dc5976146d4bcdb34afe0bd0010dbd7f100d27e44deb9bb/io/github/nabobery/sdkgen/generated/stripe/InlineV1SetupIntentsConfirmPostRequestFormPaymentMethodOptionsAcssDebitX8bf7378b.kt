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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/acss_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/acss_debit
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAcssDebitX8bf7378b.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAcssDebitX8bf7378b(
  public val currency:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCurrencyXd0118cde? = null,
  public val mandateOptions:
      InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXaea8cc78? = null,
  public val verificationMethod:
      InlineV1SetupIntentsConfirmPostRequestFormVerificationMethodX363bcf2f? = null,
) {
  public class Builder {
    public var currency:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCurrencyXd0118cde? = null

    public var mandateOptions: InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXaea8cc78? =
        null

    public var verificationMethod:
        InlineV1SetupIntentsConfirmPostRequestFormVerificationMethodX363bcf2f? = null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAcssDebitX8bf7378b = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAcssDebitX8bf7378b(
      currency = currency,
      mandateOptions = mandateOptions,
      verificationMethod = verificationMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAcssDebitX8bf7378b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAcssDebitX8bf7378b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAcssDebitX8bf7378b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAcssDebitX8bf7378b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAcssDebitX8bf7378b must be a JSON object")
      return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAcssDebitX8bf7378b(
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCurrencyXd0118cde>(it) },
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXaea8cc78>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormVerificationMethodX363bcf2f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAcssDebitX8bf7378b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAcssDebitX8bf7378b")
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

public fun inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAcssDebitX8bf7378b(block: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAcssDebitX8bf7378b.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAcssDebitX8bf7378b = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAcssDebitX8bf7378b.build(block)
