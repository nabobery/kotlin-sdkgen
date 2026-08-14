package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/customer_update.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/customer_update
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateX5eb21c80.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateX5eb21c80(
  public val allowedUpdates:
      InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaaba? = null,
  public val enabled: Boolean? = null,
) {
  public class Builder {
    public var allowedUpdates:
        InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaaba? = null

    public var enabled: Boolean? = null

    public fun build(): InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateX5eb21c80 = InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateX5eb21c80(
      allowedUpdates = allowedUpdates,
      enabled = enabled,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateX5eb21c80 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateX5eb21c80> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateX5eb21c80 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateX5eb21c80")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateX5eb21c80 must be a JSON object")
      return InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateX5eb21c80(
        allowedUpdates = rawObject["allowed_updates"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaaba>(it) },
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateX5eb21c80) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateX5eb21c80")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.allowedUpdates?.let { put("allowed_updates", json.encodeToJsonElement(it)) }
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateX5eb21c80(block: InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateX5eb21c80.Builder.() -> Unit): InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateX5eb21c80 = InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateX5eb21c80.build(block)
