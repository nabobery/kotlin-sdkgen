package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_intent_data/properties/transfer_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_intent_data/properties/transfer_data
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataTransferDataXc42f081a.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataTransferDataXc42f081a(
  public val destination: String,
  public val amount: Int? = null,
) {
  public class Builder {
    private var destinationValue: String? = null

    public var destination: String
      get() = requireNotNull(destinationValue) { "destination is required" }
      set(`value`) {
        destinationValue = value
      }

    public var amount: Int? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataTransferDataXc42f081a {
      check(destinationValue != null) { "destination is required" }
      return InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataTransferDataXc42f081a(
        destination = destination,
        amount = amount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataTransferDataXc42f081a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataTransferDataXc42f081a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataTransferDataXc42f081a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataTransferDataXc42f081a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataTransferDataXc42f081a must be a JSON object")
      val destination = json.decodeRequired<String>(rawObject, "destination")
      return InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataTransferDataXc42f081a(
        destination = destination,
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataTransferDataXc42f081a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataTransferDataXc42f081a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("destination", value.destination)
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentIntentDataTransferDataXc42f081a(block: InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataTransferDataXc42f081a.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataTransferDataXc42f081a = InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataTransferDataXc42f081a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataTransferDataXc42f081a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
