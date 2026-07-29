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
 * An object containing device type specific settings for Verifone M425 readers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/verifone_m425
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneM425Xbf878631.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneM425Xbf878631(
  public val splashscreen:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenX9e1a69e8? = null,
) {
  public class Builder {
    public var splashscreen:
        InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenX9e1a69e8? = null

    public fun build(): InlineV1TerminalConfigurationsPostRequestFormVerifoneM425Xbf878631 = InlineV1TerminalConfigurationsPostRequestFormVerifoneM425Xbf878631(
      splashscreen = splashscreen,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormVerifoneM425Xbf878631 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneM425Xbf878631> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormVerifoneM425Xbf878631 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneM425Xbf878631")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormVerifoneM425Xbf878631 must be a JSON object")
      return InlineV1TerminalConfigurationsPostRequestFormVerifoneM425Xbf878631(
        splashscreen = rawObject["splashscreen"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenX9e1a69e8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneM425Xbf878631) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneM425Xbf878631")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.splashscreen?.let { put("splashscreen", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalConfigurationsPostRequestFormVerifoneM425Xbf878631(block: InlineV1TerminalConfigurationsPostRequestFormVerifoneM425Xbf878631.Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormVerifoneM425Xbf878631 = InlineV1TerminalConfigurationsPostRequestFormVerifoneM425Xbf878631.build(block)
