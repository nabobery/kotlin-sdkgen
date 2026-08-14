package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/payment_method_update.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/payment_method_update
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateX68b7baa0.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateX68b7baa0(
  public val enabled: Boolean,
  public val paymentMethodConfiguration:
      InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X9aac4729? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var paymentMethodConfiguration:
        InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X9aac4729? = null

    public fun build(): InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateX68b7baa0 {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateX68b7baa0(
        enabled = enabled,
        paymentMethodConfiguration = paymentMethodConfiguration,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateX68b7baa0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateX68b7baa0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateX68b7baa0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateX68b7baa0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateX68b7baa0 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateX68b7baa0(
        enabled = enabled,
        paymentMethodConfiguration = rawObject["payment_method_configuration"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X9aac4729>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateX68b7baa0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateX68b7baa0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.paymentMethodConfiguration?.let { put("payment_method_configuration", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateX68b7baa0(block: InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateX68b7baa0.Builder.() -> Unit): InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateX68b7baa0 = InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateX68b7baa0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodUpdateX68b7baa0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
