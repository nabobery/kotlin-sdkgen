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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate
 * _options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate
 * _options
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsX87036c28.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsX87036c28(
  public val amount: Int? = null,
  public val purpose: InlineV1InvoicesPostRequestFormPaymentSettingsPurposeXbbf36ac4? = null,
) {
  public class Builder {
    public var amount: Int? = null

    public var purpose: InlineV1InvoicesPostRequestFormPaymentSettingsPurposeXbbf36ac4? = null

    public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsX87036c28 = InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsX87036c28(
      amount = amount,
      purpose = purpose,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsX87036c28 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsX87036c28> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsX87036c28 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsX87036c28")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsX87036c28 must be a JSON object")
      return InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsX87036c28(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        purpose = rawObject["purpose"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsPurposeXbbf36ac4>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsX87036c28) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsX87036c28")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.purpose?.let { put("purpose", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsX87036c28(block: InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsX87036c28.Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsX87036c28 = InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsX87036c28.build(block)
