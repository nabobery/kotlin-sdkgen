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
 * When you enable this parameter, this SetupIntent accepts payment methods that you enable in the Dashboard and that
 * are compatible with its other parameters.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/automatic_payment_methods
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormAutomaticPaymentMethodsX305652f7.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormAutomaticPaymentMethodsX305652f7(
  public val enabled: Boolean,
  public val allowRedirects: InlineV1SetupIntentsPostRequestFormAllowRedirectsXe4d208f9? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var allowRedirects: InlineV1SetupIntentsPostRequestFormAllowRedirectsXe4d208f9? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormAutomaticPaymentMethodsX305652f7 {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1SetupIntentsPostRequestFormAutomaticPaymentMethodsX305652f7(
        enabled = enabled,
        allowRedirects = allowRedirects,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormAutomaticPaymentMethodsX305652f7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormAutomaticPaymentMethodsX305652f7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormAutomaticPaymentMethodsX305652f7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormAutomaticPaymentMethodsX305652f7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormAutomaticPaymentMethodsX305652f7 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1SetupIntentsPostRequestFormAutomaticPaymentMethodsX305652f7(
        enabled = enabled,
        allowRedirects = rawObject["allow_redirects"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormAllowRedirectsXe4d208f9>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormAutomaticPaymentMethodsX305652f7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormAutomaticPaymentMethodsX305652f7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.allowRedirects?.let { put("allow_redirects", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormAutomaticPaymentMethodsX305652f7(block: InlineV1SetupIntentsPostRequestFormAutomaticPaymentMethodsX305652f7.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormAutomaticPaymentMethodsX305652f7 = InlineV1SetupIntentsPostRequestFormAutomaticPaymentMethodsX305652f7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormAutomaticPaymentMethodsX305652f7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
