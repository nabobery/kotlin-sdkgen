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
 * An object containing device type specific settings for Stripe S700 readers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/stripe_s700
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormStripeS700Xc99df5cb.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormStripeS700Xc99df5cb(
  public val splashscreen:
      InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022dd? = null,
) {
  public class Builder {
    public var splashscreen:
        InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022dd? = null

    public fun build(): InlineV1TerminalConfigurationsPostRequestFormStripeS700Xc99df5cb = InlineV1TerminalConfigurationsPostRequestFormStripeS700Xc99df5cb(
      splashscreen = splashscreen,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormStripeS700Xc99df5cb = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormStripeS700Xc99df5cb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormStripeS700Xc99df5cb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormStripeS700Xc99df5cb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormStripeS700Xc99df5cb must be a JSON object")
      return InlineV1TerminalConfigurationsPostRequestFormStripeS700Xc99df5cb(
        splashscreen = rawObject["splashscreen"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022dd>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormStripeS700Xc99df5cb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormStripeS700Xc99df5cb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.splashscreen?.let { put("splashscreen", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalConfigurationsPostRequestFormStripeS700Xc99df5cb(block: InlineV1TerminalConfigurationsPostRequestFormStripeS700Xc99df5cb.Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormStripeS700Xc99df5cb = InlineV1TerminalConfigurationsPostRequestFormStripeS700Xc99df5cb.build(block)
