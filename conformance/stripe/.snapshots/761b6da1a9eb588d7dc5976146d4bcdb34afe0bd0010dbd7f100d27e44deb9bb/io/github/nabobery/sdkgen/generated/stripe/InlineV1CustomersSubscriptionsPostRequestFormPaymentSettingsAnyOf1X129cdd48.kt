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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/payto/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/payto/anyOf/0
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48(
  public val mandateOptions:
      InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsXca156994? = null,
) {
  public class Builder {
    public var mandateOptions: InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsXca156994?
        = null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48 = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48(
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48 must be a JSON object")
      return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsXca156994>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48(block: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48 = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48.build(block)
