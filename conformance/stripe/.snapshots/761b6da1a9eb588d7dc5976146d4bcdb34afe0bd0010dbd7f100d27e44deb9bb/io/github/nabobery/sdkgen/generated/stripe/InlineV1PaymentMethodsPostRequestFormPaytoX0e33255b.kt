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
 * If this is a `payto` PaymentMethod, this hash contains details about the PayTo payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payto
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormPaytoX0e33255b.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormPaytoX0e33255b(
  public val accountNumber: String? = null,
  public val bsbNumber: String? = null,
  public val payId: String? = null,
) {
  public class Builder {
    public var accountNumber: String? = null

    public var bsbNumber: String? = null

    public var payId: String? = null

    public fun build(): InlineV1PaymentMethodsPostRequestFormPaytoX0e33255b = InlineV1PaymentMethodsPostRequestFormPaytoX0e33255b(
      accountNumber = accountNumber,
      bsbNumber = bsbNumber,
      payId = payId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormPaytoX0e33255b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormPaytoX0e33255b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormPaytoX0e33255b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormPaytoX0e33255b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormPaytoX0e33255b must be a JSON object")
      return InlineV1PaymentMethodsPostRequestFormPaytoX0e33255b(
        accountNumber = rawObject["account_number"]?.let { json.decodeFromJsonElement<String>(it) },
        bsbNumber = rawObject["bsb_number"]?.let { json.decodeFromJsonElement<String>(it) },
        payId = rawObject["pay_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormPaytoX0e33255b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormPaytoX0e33255b")
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

public fun inlineV1PaymentMethodsPostRequestFormPaytoX0e33255b(block: InlineV1PaymentMethodsPostRequestFormPaytoX0e33255b.Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormPaytoX0e33255b = InlineV1PaymentMethodsPostRequestFormPaytoX0e33255b.build(block)
