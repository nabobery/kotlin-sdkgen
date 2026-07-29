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
 * An object containing device type specific settings for Verifone V660p readers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/verifone_v660p
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX20fb1fae.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX20fb1fae(
  public val splashscreen:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenX32693f91? = null,
) {
  public class Builder {
    public var splashscreen:
        InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenX32693f91? = null

    public fun build(): InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX20fb1fae = InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX20fb1fae(
      splashscreen = splashscreen,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX20fb1fae = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX20fb1fae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX20fb1fae {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX20fb1fae")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX20fb1fae must be a JSON object")
      return InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX20fb1fae(
        splashscreen = rawObject["splashscreen"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenX32693f91>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX20fb1fae) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX20fb1fae")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.splashscreen?.let { put("splashscreen", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX20fb1fae(block: InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX20fb1fae.Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX20fb1fae = InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX20fb1fae.build(block)
