package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/payto/anyOf/0/p
 * roperties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/payto/anyOf/0/p
 * roperties/mandate_options
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX026a69fb.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX026a69fb(
  public val amount: Int? = null,
  public val purpose:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeX7990a44b? = null,
) {
  public class Builder {
    public var amount: Int? = null

    public var purpose:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeX7990a44b? = null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX026a69fb = InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX026a69fb(
      amount = amount,
      purpose = purpose,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX026a69fb = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX026a69fb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX026a69fb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX026a69fb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX026a69fb must be a JSON object")
      return InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX026a69fb(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        purpose = rawObject["purpose"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeX7990a44b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX026a69fb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX026a69fb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.purpose?.let { put("purpose", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX026a69fb(block: InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX026a69fb.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX026a69fb = InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX026a69fb.build(block)
