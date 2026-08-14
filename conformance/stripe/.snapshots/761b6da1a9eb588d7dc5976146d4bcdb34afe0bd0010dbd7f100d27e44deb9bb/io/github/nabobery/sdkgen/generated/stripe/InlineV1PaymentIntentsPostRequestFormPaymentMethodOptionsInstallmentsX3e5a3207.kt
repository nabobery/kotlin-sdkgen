package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0/properties/installments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0/properties/installments
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX3e5a3207.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX3e5a3207(
  public val enabled: Boolean? = null,
  public val plan:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023? = null,
) {
  public class Builder {
    public var enabled: Boolean? = null

    public var plan:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX3e5a3207 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX3e5a3207(
      enabled = enabled,
      plan = plan,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX3e5a3207 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX3e5a3207> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX3e5a3207 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX3e5a3207")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX3e5a3207 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX3e5a3207(
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        plan = rawObject["plan"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX3e5a3207) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX3e5a3207")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
        value.plan?.let { put("plan", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX3e5a3207(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX3e5a3207.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX3e5a3207 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInstallmentsX3e5a3207.build(block)
