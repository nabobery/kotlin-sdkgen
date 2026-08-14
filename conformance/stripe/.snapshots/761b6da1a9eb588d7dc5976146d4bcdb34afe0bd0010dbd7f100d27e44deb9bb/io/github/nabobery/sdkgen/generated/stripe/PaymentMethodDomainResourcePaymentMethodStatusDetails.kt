package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.put

/**
 * Contains additional details about the status of a payment method for a specific payment method domain.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_domain_resource_payment_method_status_details
 */
@Serializable(with = PaymentMethodDomainResourcePaymentMethodStatusDetails.Serializer::class)
public class PaymentMethodDomainResourcePaymentMethodStatusDetails(
  /**
   * The error message associated with the status of the payment method on the domain.
   */
  public val errorMessage: String,
) {
  public class Builder {
    private var errorMessageValue: String? = null

    public var errorMessage: String
      get() = requireNotNull(errorMessageValue) { "errorMessage is required" }
      set(`value`) {
        errorMessageValue = value
      }

    public fun build(): PaymentMethodDomainResourcePaymentMethodStatusDetails {
      check(errorMessageValue != null) { "errorMessage is required" }
      return PaymentMethodDomainResourcePaymentMethodStatusDetails(
        errorMessage = errorMessage,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDomainResourcePaymentMethodStatusDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodDomainResourcePaymentMethodStatusDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDomainResourcePaymentMethodStatusDetails {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDomainResourcePaymentMethodStatusDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDomainResourcePaymentMethodStatusDetails must be a JSON object")
      val errorMessage = json.decodeRequired<String>(rawObject, "error_message")
      return PaymentMethodDomainResourcePaymentMethodStatusDetails(
        errorMessage = errorMessage,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDomainResourcePaymentMethodStatusDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDomainResourcePaymentMethodStatusDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("error_message", value.errorMessage)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDomainResourcePaymentMethodStatusDetails(block: PaymentMethodDomainResourcePaymentMethodStatusDetails.Builder.() -> Unit): PaymentMethodDomainResourcePaymentMethodStatusDetails = PaymentMethodDomainResourcePaymentMethodStatusDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentMethodDomainResourcePaymentMethodStatusDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
