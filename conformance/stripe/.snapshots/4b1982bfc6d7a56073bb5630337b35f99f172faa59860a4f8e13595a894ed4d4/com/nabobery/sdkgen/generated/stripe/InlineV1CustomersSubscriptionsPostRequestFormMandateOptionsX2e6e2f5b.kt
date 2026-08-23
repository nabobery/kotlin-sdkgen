package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/card/anyOf/0/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/card/anyOf/0/properties/mandate_options
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX2e6e2f5b.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX2e6e2f5b(
  public val amount: Int? = null,
  public val amountType:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAmountTypeX051762cd? = null,
  public val description: String? = null,
) {
  public class Builder {
    public var amount: Int? = null

    public var amountType:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAmountTypeX051762cd? = null

    public var description: String? = null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX2e6e2f5b = InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX2e6e2f5b(
      amount = amount,
      amountType = amountType,
      description = description,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX2e6e2f5b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX2e6e2f5b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX2e6e2f5b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX2e6e2f5b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX2e6e2f5b must be a JSON object")
      return InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX2e6e2f5b(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        amountType = rawObject["amount_type"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAmountTypeX051762cd>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX2e6e2f5b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX2e6e2f5b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.amountType?.let { put("amount_type", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX2e6e2f5b(block: InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX2e6e2f5b.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX2e6e2f5b = InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX2e6e2f5b.build(block)
