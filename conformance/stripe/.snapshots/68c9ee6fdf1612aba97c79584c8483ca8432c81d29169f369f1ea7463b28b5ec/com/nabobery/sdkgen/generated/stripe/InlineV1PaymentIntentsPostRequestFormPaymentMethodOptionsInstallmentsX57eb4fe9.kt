package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/installments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/installments
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX57eb4fe9.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX57eb4fe9(
  public val enabled: Boolean? = null,
  public val plan:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56? = null,
) {
  public class Builder {
    public var enabled: Boolean? = null

    public var plan:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX57eb4fe9 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX57eb4fe9(
      enabled = enabled,
      plan = plan,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX57eb4fe9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX57eb4fe9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX57eb4fe9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX57eb4fe9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX57eb4fe9 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX57eb4fe9(
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        plan = rawObject["plan"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX57eb4fe9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX57eb4fe9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
        value.plan?.let { put("plan", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX57eb4fe9(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX57eb4fe9.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX57eb4fe9 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX57eb4fe9.build(block)
