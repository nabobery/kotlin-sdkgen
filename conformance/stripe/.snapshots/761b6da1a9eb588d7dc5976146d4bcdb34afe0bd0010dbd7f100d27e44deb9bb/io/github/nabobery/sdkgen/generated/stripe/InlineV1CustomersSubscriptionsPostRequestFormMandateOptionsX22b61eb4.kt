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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/acss_debit/anyO
 * f/0/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/acss_debit/anyO
 * f/0/properties/mandate_options
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX22b61eb4.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX22b61eb4(
  public val transactionType:
      InlineV1CustomersSubscriptionsPostRequestFormTransactionTypeXdae0e2d5? = null,
) {
  public class Builder {
    public var transactionType:
        InlineV1CustomersSubscriptionsPostRequestFormTransactionTypeXdae0e2d5? = null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX22b61eb4 = InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX22b61eb4(
      transactionType = transactionType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX22b61eb4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX22b61eb4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX22b61eb4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX22b61eb4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX22b61eb4 must be a JSON object")
      return InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX22b61eb4(
        transactionType = rawObject["transaction_type"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormTransactionTypeXdae0e2d5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX22b61eb4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX22b61eb4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.transactionType?.let { put("transaction_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX22b61eb4(block: InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX22b61eb4.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX22b61eb4 = InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX22b61eb4.build(block)
