package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/paypal.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/paypal
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalXb8119ff4.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalXb8119ff4(
  public val billingAgreementId: String? = null,
) {
  public class Builder {
    public var billingAgreementId: String? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalXb8119ff4 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalXb8119ff4(
      billingAgreementId = billingAgreementId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalXb8119ff4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalXb8119ff4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalXb8119ff4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalXb8119ff4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalXb8119ff4 must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalXb8119ff4(
        billingAgreementId = rawObject["billing_agreement_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalXb8119ff4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalXb8119ff4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.billingAgreementId?.let { put("billing_agreement_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalXb8119ff4(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalXb8119ff4.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalXb8119ff4 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalXb8119ff4.build(block)
