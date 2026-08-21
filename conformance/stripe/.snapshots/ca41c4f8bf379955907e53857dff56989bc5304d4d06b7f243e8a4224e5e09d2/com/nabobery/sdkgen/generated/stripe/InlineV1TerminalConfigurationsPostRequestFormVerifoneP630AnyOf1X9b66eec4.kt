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
 * ion~1x-www-form-urlencoded/schema/properties/verifone_p630/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_p630/anyOf/0
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4(
  public val splashscreen:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46? = null,
) {
  public class Builder {
    public var splashscreen:
        InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46? = null

    public fun build(): InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4 = InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4(
      splashscreen = splashscreen,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4 must be a JSON object")
      return InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4(
        splashscreen = rawObject["splashscreen"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.splashscreen?.let { put("splashscreen", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4(block: InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4.Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4 = InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1X9b66eec4.build(block)
