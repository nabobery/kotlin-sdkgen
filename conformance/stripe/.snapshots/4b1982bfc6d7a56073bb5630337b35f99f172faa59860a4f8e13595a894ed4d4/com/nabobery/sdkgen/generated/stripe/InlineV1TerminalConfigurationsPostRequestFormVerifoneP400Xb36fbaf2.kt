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
 * An object containing device type specific settings for Verifone P400 readers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/verifone_p400
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneP400Xb36fbaf2.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneP400Xb36fbaf2(
  public val splashscreen:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91ccc? = null,
) {
  public class Builder {
    public var splashscreen:
        InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91ccc? = null

    public fun build(): InlineV1TerminalConfigurationsPostRequestFormVerifoneP400Xb36fbaf2 = InlineV1TerminalConfigurationsPostRequestFormVerifoneP400Xb36fbaf2(
      splashscreen = splashscreen,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormVerifoneP400Xb36fbaf2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneP400Xb36fbaf2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormVerifoneP400Xb36fbaf2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneP400Xb36fbaf2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormVerifoneP400Xb36fbaf2 must be a JSON object")
      return InlineV1TerminalConfigurationsPostRequestFormVerifoneP400Xb36fbaf2(
        splashscreen = rawObject["splashscreen"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX51e91ccc>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneP400Xb36fbaf2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneP400Xb36fbaf2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.splashscreen?.let { put("splashscreen", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalConfigurationsPostRequestFormVerifoneP400Xb36fbaf2(block: InlineV1TerminalConfigurationsPostRequestFormVerifoneP400Xb36fbaf2.Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormVerifoneP400Xb36fbaf2 = InlineV1TerminalConfigurationsPostRequestFormVerifoneP400Xb36fbaf2.build(block)
