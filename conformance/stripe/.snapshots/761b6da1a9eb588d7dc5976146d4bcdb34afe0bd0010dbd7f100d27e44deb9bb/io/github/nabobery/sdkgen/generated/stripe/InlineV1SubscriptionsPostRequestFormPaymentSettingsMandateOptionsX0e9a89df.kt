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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_optio
 * ns.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_optio
 * ns
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX0e9a89df.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX0e9a89df(
  public val amount: Int? = null,
  public val purpose: InlineV1SubscriptionsPostRequestFormPaymentSettingsPurposeX70d6d814? = null,
) {
  public class Builder {
    public var amount: Int? = null

    public var purpose: InlineV1SubscriptionsPostRequestFormPaymentSettingsPurposeX70d6d814? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX0e9a89df = InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX0e9a89df(
      amount = amount,
      purpose = purpose,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX0e9a89df = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX0e9a89df> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX0e9a89df {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX0e9a89df")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX0e9a89df must be a JSON object")
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX0e9a89df(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        purpose = rawObject["purpose"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsPurposeX70d6d814>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX0e9a89df) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX0e9a89df")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.purpose?.let { put("purpose", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX0e9a89df(block: InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX0e9a89df.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX0e9a89df = InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX0e9a89df.build(block)
