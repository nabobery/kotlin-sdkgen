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
 * An object containing device type specific settings for BBPOS WisePad 3 readers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/bbpos_wisepad3
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xac3389d6.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xac3389d6(
  public val splashscreen:
      InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenX6df7c316? = null,
) {
  public class Builder {
    public var splashscreen:
        InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenX6df7c316? = null

    public fun build(): InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xac3389d6 = InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xac3389d6(
      splashscreen = splashscreen,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xac3389d6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xac3389d6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xac3389d6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xac3389d6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xac3389d6 must be a JSON object")
      return InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xac3389d6(
        splashscreen = rawObject["splashscreen"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenX6df7c316>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xac3389d6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xac3389d6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.splashscreen?.let { put("splashscreen", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xac3389d6(block: InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xac3389d6.Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xac3389d6 = InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xac3389d6.build(block)
