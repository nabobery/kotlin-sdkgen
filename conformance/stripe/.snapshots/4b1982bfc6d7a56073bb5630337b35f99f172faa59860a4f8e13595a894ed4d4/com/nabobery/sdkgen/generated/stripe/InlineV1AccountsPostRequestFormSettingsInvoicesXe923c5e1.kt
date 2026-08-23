package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/invoices.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/invoices
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsInvoicesXe923c5e1.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsInvoicesXe923c5e1(
  public val defaultAccountTaxIds:
      InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3? = null,
  public val hostedPaymentMethodSave:
      InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveXcd8a458c? = null,
) {
  public class Builder {
    public var defaultAccountTaxIds:
        InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3? = null

    public var hostedPaymentMethodSave:
        InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveXcd8a458c? = null

    public fun build(): InlineV1AccountsPostRequestFormSettingsInvoicesXe923c5e1 = InlineV1AccountsPostRequestFormSettingsInvoicesXe923c5e1(
      defaultAccountTaxIds = defaultAccountTaxIds,
      hostedPaymentMethodSave = hostedPaymentMethodSave,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsInvoicesXe923c5e1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsInvoicesXe923c5e1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsInvoicesXe923c5e1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsInvoicesXe923c5e1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormSettingsInvoicesXe923c5e1 must be a JSON object")
      return InlineV1AccountsPostRequestFormSettingsInvoicesXe923c5e1(
        defaultAccountTaxIds = rawObject["default_account_tax_ids"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3>(it) },
        hostedPaymentMethodSave = rawObject["hosted_payment_method_save"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveXcd8a458c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsInvoicesXe923c5e1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsInvoicesXe923c5e1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.defaultAccountTaxIds?.let { put("default_account_tax_ids", json.encodeToJsonElement(it)) }
        value.hostedPaymentMethodSave?.let { put("hosted_payment_method_save", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormSettingsInvoicesXe923c5e1(block: InlineV1AccountsPostRequestFormSettingsInvoicesXe923c5e1.Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsInvoicesXe923c5e1 = InlineV1AccountsPostRequestFormSettingsInvoicesXe923c5e1.build(block)
