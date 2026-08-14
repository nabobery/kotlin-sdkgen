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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/stripe_s700/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/stripe_s700/anyOf/0
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966(
  public val splashscreen:
      InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4f? = null,
) {
  public class Builder {
    public var splashscreen:
        InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4f? = null

    public fun build(): InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966 = InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966(
      splashscreen = splashscreen,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966 must be a JSON object")
      return InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966(
        splashscreen = rawObject["splashscreen"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.splashscreen?.let { put("splashscreen", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966(block: InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966.Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966 = InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966.build(block)
