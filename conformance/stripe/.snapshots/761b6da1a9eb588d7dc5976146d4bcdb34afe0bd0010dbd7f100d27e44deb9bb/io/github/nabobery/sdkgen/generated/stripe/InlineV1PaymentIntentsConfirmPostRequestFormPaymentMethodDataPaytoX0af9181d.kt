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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/payto.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/payto
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPaytoX0af9181d.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPaytoX0af9181d(
  public val accountNumber: String? = null,
  public val bsbNumber: String? = null,
  public val payId: String? = null,
) {
  public class Builder {
    public var accountNumber: String? = null

    public var bsbNumber: String? = null

    public var payId: String? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPaytoX0af9181d = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPaytoX0af9181d(
      accountNumber = accountNumber,
      bsbNumber = bsbNumber,
      payId = payId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPaytoX0af9181d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPaytoX0af9181d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPaytoX0af9181d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPaytoX0af9181d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPaytoX0af9181d must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPaytoX0af9181d(
        accountNumber = rawObject["account_number"]?.let { json.decodeFromJsonElement<String>(it) },
        bsbNumber = rawObject["bsb_number"]?.let { json.decodeFromJsonElement<String>(it) },
        payId = rawObject["pay_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPaytoX0af9181d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPaytoX0af9181d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountNumber?.let { put("account_number", it) }
        value.bsbNumber?.let { put("bsb_number", it) }
        value.payId?.let { put("pay_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPaytoX0af9181d(block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPaytoX0af9181d.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPaytoX0af9181d = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPaytoX0af9181d.build(block)
