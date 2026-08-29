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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/invoices.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/invoices
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsInvoicesX86304d5e.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsInvoicesX86304d5e(
  public val hostedPaymentMethodSave:
      InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveX1edcdeae? = null,
) {
  public class Builder {
    public var hostedPaymentMethodSave:
        InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveX1edcdeae? = null

    public fun build(): InlineV1AccountsPostRequestFormSettingsInvoicesX86304d5e = InlineV1AccountsPostRequestFormSettingsInvoicesX86304d5e(
      hostedPaymentMethodSave = hostedPaymentMethodSave,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsInvoicesX86304d5e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsInvoicesX86304d5e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsInvoicesX86304d5e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsInvoicesX86304d5e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormSettingsInvoicesX86304d5e must be a JSON object")
      return InlineV1AccountsPostRequestFormSettingsInvoicesX86304d5e(
        hostedPaymentMethodSave = rawObject["hosted_payment_method_save"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveX1edcdeae>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsInvoicesX86304d5e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsInvoicesX86304d5e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.hostedPaymentMethodSave?.let { put("hosted_payment_method_save", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormSettingsInvoicesX86304d5e(block: InlineV1AccountsPostRequestFormSettingsInvoicesX86304d5e.Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsInvoicesX86304d5e = InlineV1AccountsPostRequestFormSettingsInvoicesX86304d5e.build(block)
