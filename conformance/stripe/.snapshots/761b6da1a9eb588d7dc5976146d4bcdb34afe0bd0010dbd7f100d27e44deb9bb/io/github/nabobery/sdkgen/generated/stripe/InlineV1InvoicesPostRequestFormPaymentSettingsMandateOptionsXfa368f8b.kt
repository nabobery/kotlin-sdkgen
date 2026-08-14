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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/acss_debit/anyOf/0/properties/ma
 * ndate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/acss_debit/anyOf/0/properties/ma
 * ndate_options
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXfa368f8b.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXfa368f8b(
  public val transactionType:
      InlineV1InvoicesPostRequestFormPaymentSettingsTransactionTypeX5dd26622? = null,
) {
  public class Builder {
    public var transactionType:
        InlineV1InvoicesPostRequestFormPaymentSettingsTransactionTypeX5dd26622? = null

    public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXfa368f8b = InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXfa368f8b(
      transactionType = transactionType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXfa368f8b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXfa368f8b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXfa368f8b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXfa368f8b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXfa368f8b must be a JSON object")
      return InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXfa368f8b(
        transactionType = rawObject["transaction_type"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsTransactionTypeX5dd26622>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXfa368f8b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXfa368f8b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.transactionType?.let { put("transaction_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXfa368f8b(block: InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXfa368f8b.Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXfa368f8b = InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXfa368f8b.build(block)
