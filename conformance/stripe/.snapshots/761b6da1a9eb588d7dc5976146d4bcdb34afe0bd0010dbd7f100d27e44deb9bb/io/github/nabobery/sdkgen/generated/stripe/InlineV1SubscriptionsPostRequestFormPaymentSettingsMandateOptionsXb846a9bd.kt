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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/properties/mandate_option
 * s.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/properties/mandate_option
 * s
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsXb846a9bd.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsXb846a9bd(
  public val amount: Int? = null,
  public val amountType:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeX23792521? = null,
  public val description: String? = null,
) {
  public class Builder {
    public var amount: Int? = null

    public var amountType: InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeX23792521? =
        null

    public var description: String? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsXb846a9bd = InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsXb846a9bd(
      amount = amount,
      amountType = amountType,
      description = description,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsXb846a9bd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsXb846a9bd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsXb846a9bd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsXb846a9bd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsXb846a9bd must be a JSON object")
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsXb846a9bd(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        amountType = rawObject["amount_type"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeX23792521>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsXb846a9bd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsXb846a9bd")
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

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsXb846a9bd(block: InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsXb846a9bd.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsXb846a9bd = InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsXb846a9bd.build(block)
