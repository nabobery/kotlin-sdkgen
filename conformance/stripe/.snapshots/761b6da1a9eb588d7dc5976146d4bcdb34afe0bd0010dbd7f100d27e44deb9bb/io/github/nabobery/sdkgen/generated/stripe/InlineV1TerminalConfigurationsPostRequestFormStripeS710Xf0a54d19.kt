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
 * An object containing device type specific settings for Stripe S710 readers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/stripe_s710
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormStripeS710Xf0a54d19.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormStripeS710Xf0a54d19(
  public val splashscreen:
      InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX9a797000? = null,
) {
  public class Builder {
    public var splashscreen:
        InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX9a797000? = null

    public fun build(): InlineV1TerminalConfigurationsPostRequestFormStripeS710Xf0a54d19 = InlineV1TerminalConfigurationsPostRequestFormStripeS710Xf0a54d19(
      splashscreen = splashscreen,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormStripeS710Xf0a54d19 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormStripeS710Xf0a54d19> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormStripeS710Xf0a54d19 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormStripeS710Xf0a54d19")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormStripeS710Xf0a54d19 must be a JSON object")
      return InlineV1TerminalConfigurationsPostRequestFormStripeS710Xf0a54d19(
        splashscreen = rawObject["splashscreen"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormStripeS710SplashscreenX9a797000>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormStripeS710Xf0a54d19) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormStripeS710Xf0a54d19")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.splashscreen?.let { put("splashscreen", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalConfigurationsPostRequestFormStripeS710Xf0a54d19(block: InlineV1TerminalConfigurationsPostRequestFormStripeS710Xf0a54d19.Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormStripeS710Xf0a54d19 = InlineV1TerminalConfigurationsPostRequestFormStripeS710Xf0a54d19.build(block)
