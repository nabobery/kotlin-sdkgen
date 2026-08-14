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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/customer_ba
 * lance/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/customer_ba
 * lance/anyOf/0
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b(
  public val bankTransfer:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsBankTransferXebc58406? = null,
  public val fundingType: String? = null,
) {
  public class Builder {
    public var bankTransfer:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsBankTransferXebc58406? = null

    public var fundingType: String? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b = InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b(
      bankTransfer = bankTransfer,
      fundingType = fundingType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b must be a JSON object")
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b(
        bankTransfer = rawObject["bank_transfer"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsBankTransferXebc58406>(it) },
        fundingType = rawObject["funding_type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bankTransfer?.let { put("bank_transfer", json.encodeToJsonElement(it)) }
        value.fundingType?.let { put("funding_type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b(block: InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b = InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b.build(block)
