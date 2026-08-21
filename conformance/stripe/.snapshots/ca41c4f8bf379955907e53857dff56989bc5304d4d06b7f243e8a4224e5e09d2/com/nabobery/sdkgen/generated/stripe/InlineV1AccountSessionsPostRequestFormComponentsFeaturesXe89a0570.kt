package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/account_onboarding/properties/features.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/account_onboarding/properties/features
 */
@Serializable(with = InlineV1AccountSessionsPostRequestFormComponentsFeaturesXe89a0570.Serializer::class)
public class InlineV1AccountSessionsPostRequestFormComponentsFeaturesXe89a0570(
  public val disableStripeUserAuthentication: Boolean? = null,
  public val externalAccountCollection: Boolean? = null,
) {
  public class Builder {
    public var disableStripeUserAuthentication: Boolean? = null

    public var externalAccountCollection: Boolean? = null

    public fun build(): InlineV1AccountSessionsPostRequestFormComponentsFeaturesXe89a0570 = InlineV1AccountSessionsPostRequestFormComponentsFeaturesXe89a0570(
      disableStripeUserAuthentication = disableStripeUserAuthentication,
      externalAccountCollection = externalAccountCollection,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsFeaturesXe89a0570 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountSessionsPostRequestFormComponentsFeaturesXe89a0570> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountSessionsPostRequestFormComponentsFeaturesXe89a0570 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountSessionsPostRequestFormComponentsFeaturesXe89a0570")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountSessionsPostRequestFormComponentsFeaturesXe89a0570 must be a JSON object")
      return InlineV1AccountSessionsPostRequestFormComponentsFeaturesXe89a0570(
        disableStripeUserAuthentication = rawObject["disable_stripe_user_authentication"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        externalAccountCollection = rawObject["external_account_collection"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountSessionsPostRequestFormComponentsFeaturesXe89a0570) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountSessionsPostRequestFormComponentsFeaturesXe89a0570")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.disableStripeUserAuthentication?.let { put("disable_stripe_user_authentication", json.encodeToJsonElement(it)) }
        value.externalAccountCollection?.let { put("external_account_collection", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountSessionsPostRequestFormComponentsFeaturesXe89a0570(block: InlineV1AccountSessionsPostRequestFormComponentsFeaturesXe89a0570.Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsFeaturesXe89a0570 = InlineV1AccountSessionsPostRequestFormComponentsFeaturesXe89a0570.build(block)
