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
 * An object containing device type specific settings for Verifone P630 readers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/verifone_p630
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneP630Xbfb55acf.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneP630Xbfb55acf(
  public val splashscreen:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6f? = null,
) {
  public class Builder {
    public var splashscreen:
        InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6f? = null

    public fun build(): InlineV1TerminalConfigurationsPostRequestFormVerifoneP630Xbfb55acf = InlineV1TerminalConfigurationsPostRequestFormVerifoneP630Xbfb55acf(
      splashscreen = splashscreen,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormVerifoneP630Xbfb55acf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneP630Xbfb55acf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormVerifoneP630Xbfb55acf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneP630Xbfb55acf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormVerifoneP630Xbfb55acf must be a JSON object")
      return InlineV1TerminalConfigurationsPostRequestFormVerifoneP630Xbfb55acf(
        splashscreen = rawObject["splashscreen"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX1504be6f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneP630Xbfb55acf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneP630Xbfb55acf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.splashscreen?.let { put("splashscreen", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalConfigurationsPostRequestFormVerifoneP630Xbfb55acf(block: InlineV1TerminalConfigurationsPostRequestFormVerifoneP630Xbfb55acf.Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormVerifoneP630Xbfb55acf = InlineV1TerminalConfigurationsPostRequestFormVerifoneP630Xbfb55acf.build(block)
