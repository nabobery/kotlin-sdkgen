package com.nabobery.sdkgen.generated.stripe

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
 * lance/anyOf/0/properties/bank_transfer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/customer_ba
 * lance/anyOf/0/properties/bank_transfer
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsBankTransferXebc58406.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsBankTransferXebc58406(
  public val euBankTransfer:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsEuBankTransferX84554062? = null,
  public val type: String? = null,
) {
  public class Builder {
    public var euBankTransfer:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsEuBankTransferX84554062? = null

    public var type: String? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsBankTransferXebc58406 = InlineV1SubscriptionsPostRequestFormPaymentSettingsBankTransferXebc58406(
      euBankTransfer = euBankTransfer,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsBankTransferXebc58406 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsBankTransferXebc58406> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsBankTransferXebc58406 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsBankTransferXebc58406")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormPaymentSettingsBankTransferXebc58406 must be a JSON object")
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsBankTransferXebc58406(
        euBankTransfer = rawObject["eu_bank_transfer"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsEuBankTransferX84554062>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsBankTransferXebc58406) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsBankTransferXebc58406")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.euBankTransfer?.let { put("eu_bank_transfer", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsBankTransferXebc58406(block: InlineV1SubscriptionsPostRequestFormPaymentSettingsBankTransferXebc58406.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsBankTransferXebc58406 = InlineV1SubscriptionsPostRequestFormPaymentSettingsBankTransferXebc58406.build(block)
