package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/invoice_settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/invoice_settings
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsXbbd5e35c.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsXbbd5e35c(
  public val accountTaxIds:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30f? = null,
  public val daysUntilDue: Int? = null,
  public val issuer: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX4a911da8? = null,
) {
  public class Builder {
    public var accountTaxIds:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30f? = null

    public var daysUntilDue: Int? = null

    public var issuer: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX4a911da8? = null

    public fun build(): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsXbbd5e35c = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsXbbd5e35c(
      accountTaxIds = accountTaxIds,
      daysUntilDue = daysUntilDue,
      issuer = issuer,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsXbbd5e35c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsXbbd5e35c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsXbbd5e35c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsXbbd5e35c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsXbbd5e35c must be a JSON object")
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsXbbd5e35c(
        accountTaxIds = rawObject["account_tax_ids"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30f>(it) },
        daysUntilDue = rawObject["days_until_due"]?.let { json.decodeFromJsonElement<Int>(it) },
        issuer = rawObject["issuer"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX4a911da8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsXbbd5e35c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsXbbd5e35c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountTaxIds?.let { put("account_tax_ids", json.encodeToJsonElement(it)) }
        value.daysUntilDue?.let { put("days_until_due", json.encodeToJsonElement(it)) }
        value.issuer?.let { put("issuer", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsXbbd5e35c(block: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsXbbd5e35c.Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsXbbd5e35c = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsXbbd5e35c.build(block)
