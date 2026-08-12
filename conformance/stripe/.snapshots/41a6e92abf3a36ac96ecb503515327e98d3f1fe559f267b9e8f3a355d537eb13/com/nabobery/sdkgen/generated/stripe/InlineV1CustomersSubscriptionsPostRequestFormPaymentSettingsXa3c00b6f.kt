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
 * Payment settings to pass to invoices created by the subscription.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXa3c00b6f.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXa3c00b6f(
  public val paymentMethodOptions:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX47ae48d8? = null,
  public val paymentMethodTypes:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cd? = null,
  public val saveDefaultPaymentMethod:
      InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX6f449797? = null,
) {
  public class Builder {
    public var paymentMethodOptions:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX47ae48d8? = null

    public var paymentMethodTypes:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cd? = null

    public var saveDefaultPaymentMethod:
        InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX6f449797? = null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXa3c00b6f = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXa3c00b6f(
      paymentMethodOptions = paymentMethodOptions,
      paymentMethodTypes = paymentMethodTypes,
      saveDefaultPaymentMethod = saveDefaultPaymentMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXa3c00b6f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXa3c00b6f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXa3c00b6f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXa3c00b6f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXa3c00b6f must be a JSON object")
      return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXa3c00b6f(
        paymentMethodOptions = rawObject["payment_method_options"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX47ae48d8>(it) },
        paymentMethodTypes = rawObject["payment_method_types"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cd>(it) },
        saveDefaultPaymentMethod = rawObject["save_default_payment_method"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX6f449797>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXa3c00b6f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXa3c00b6f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.paymentMethodOptions?.let { put("payment_method_options", json.encodeToJsonElement(it)) }
        value.paymentMethodTypes?.let { put("payment_method_types", json.encodeToJsonElement(it)) }
        value.saveDefaultPaymentMethod?.let { put("save_default_payment_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXa3c00b6f(block: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXa3c00b6f.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXa3c00b6f = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXa3c00b6f.build(block)
