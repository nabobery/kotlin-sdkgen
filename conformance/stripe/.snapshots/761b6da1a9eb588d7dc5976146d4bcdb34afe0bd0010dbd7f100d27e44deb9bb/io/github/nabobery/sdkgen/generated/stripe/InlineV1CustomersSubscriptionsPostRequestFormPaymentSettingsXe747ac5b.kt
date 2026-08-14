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
 * Payment settings to pass to invoices created by the subscription.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXe747ac5b.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXe747ac5b(
  public val paymentMethodOptions:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX6c6ab5ab? = null,
  public val paymentMethodTypes:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535? = null,
  public val saveDefaultPaymentMethod:
      InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX55875b2c? = null,
) {
  public class Builder {
    public var paymentMethodOptions:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX6c6ab5ab? = null

    public var paymentMethodTypes:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535? = null

    public var saveDefaultPaymentMethod:
        InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX55875b2c? = null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXe747ac5b = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXe747ac5b(
      paymentMethodOptions = paymentMethodOptions,
      paymentMethodTypes = paymentMethodTypes,
      saveDefaultPaymentMethod = saveDefaultPaymentMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXe747ac5b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXe747ac5b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXe747ac5b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXe747ac5b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXe747ac5b must be a JSON object")
      return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXe747ac5b(
        paymentMethodOptions = rawObject["payment_method_options"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodOptionsX6c6ab5ab>(it) },
        paymentMethodTypes = rawObject["payment_method_types"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535>(it) },
        saveDefaultPaymentMethod = rawObject["save_default_payment_method"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX55875b2c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXe747ac5b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXe747ac5b")
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

public fun inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXe747ac5b(block: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXe747ac5b.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXe747ac5b = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsXe747ac5b.build(block)
