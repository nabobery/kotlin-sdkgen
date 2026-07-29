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
 * This property is used to set up permissions for various actions (e.g., update) on the CheckoutSession object. Can
 * only be set when creating `embedded` or `custom` sessions.
 *
 * For specific permissions, please refer to their dedicated subsections, such as `permissions.update_shipping_details`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/permissions
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPermissionsX7c93388c.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPermissionsX7c93388c(
  public val updateShippingDetails:
      InlineV1CheckoutSessionsPostRequestFormPermissionsUpdateShippingDetailsXdf83a055? = null,
) {
  public class Builder {
    public var updateShippingDetails:
        InlineV1CheckoutSessionsPostRequestFormPermissionsUpdateShippingDetailsXdf83a055? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPermissionsX7c93388c = InlineV1CheckoutSessionsPostRequestFormPermissionsX7c93388c(
      updateShippingDetails = updateShippingDetails,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPermissionsX7c93388c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPermissionsX7c93388c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPermissionsX7c93388c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPermissionsX7c93388c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPermissionsX7c93388c must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormPermissionsX7c93388c(
        updateShippingDetails = rawObject["update_shipping_details"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPermissionsUpdateShippingDetailsXdf83a055>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPermissionsX7c93388c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPermissionsX7c93388c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.updateShippingDetails?.let { put("update_shipping_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPermissionsX7c93388c(block: InlineV1CheckoutSessionsPostRequestFormPermissionsX7c93388c.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPermissionsX7c93388c = InlineV1CheckoutSessionsPostRequestFormPermissionsX7c93388c.build(block)
