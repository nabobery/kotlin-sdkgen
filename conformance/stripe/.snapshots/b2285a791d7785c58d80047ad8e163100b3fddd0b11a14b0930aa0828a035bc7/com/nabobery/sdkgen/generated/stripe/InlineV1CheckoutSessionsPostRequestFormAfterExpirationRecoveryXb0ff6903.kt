package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/after_expiration/properties/recovery.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/after_expiration/properties/recovery
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormAfterExpirationRecoveryXb0ff6903.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormAfterExpirationRecoveryXb0ff6903(
  public val enabled: Boolean,
  public val allowPromotionCodes: Boolean? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var allowPromotionCodes: Boolean? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormAfterExpirationRecoveryXb0ff6903 {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1CheckoutSessionsPostRequestFormAfterExpirationRecoveryXb0ff6903(
        enabled = enabled,
        allowPromotionCodes = allowPromotionCodes,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormAfterExpirationRecoveryXb0ff6903 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormAfterExpirationRecoveryXb0ff6903> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormAfterExpirationRecoveryXb0ff6903 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormAfterExpirationRecoveryXb0ff6903")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormAfterExpirationRecoveryXb0ff6903 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1CheckoutSessionsPostRequestFormAfterExpirationRecoveryXb0ff6903(
        enabled = enabled,
        allowPromotionCodes = rawObject["allow_promotion_codes"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormAfterExpirationRecoveryXb0ff6903) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormAfterExpirationRecoveryXb0ff6903")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.allowPromotionCodes?.let { put("allow_promotion_codes", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormAfterExpirationRecoveryXb0ff6903(block: InlineV1CheckoutSessionsPostRequestFormAfterExpirationRecoveryXb0ff6903.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormAfterExpirationRecoveryXb0ff6903 = InlineV1CheckoutSessionsPostRequestFormAfterExpirationRecoveryXb0ff6903.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormAfterExpirationRecoveryXb0ff6903 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
