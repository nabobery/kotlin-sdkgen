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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_m425/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_m425/anyOf/0
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9(
  public val splashscreen:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518b? = null,
) {
  public class Builder {
    public var splashscreen:
        InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518b? = null

    public fun build(): InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9 = InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9(
      splashscreen = splashscreen,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9 must be a JSON object")
      return InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9(
        splashscreen = rawObject["splashscreen"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneM425SplashscreenXe66c518b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.splashscreen?.let { put("splashscreen", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9(block: InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9.Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9 = InlineV1TerminalConfigurationsPostRequestFormVerifoneM425AnyOf1X104cbab9.build(block)
