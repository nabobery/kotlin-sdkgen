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
 * An object containing device type specific settings for Verifone UX700 readers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/verifone_ux700
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700X4d4c5e1a.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700X4d4c5e1a(
  public val splashscreen:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caad? = null,
) {
  public class Builder {
    public var splashscreen:
        InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caad? = null

    public fun build(): InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700X4d4c5e1a = InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700X4d4c5e1a(
      splashscreen = splashscreen,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700X4d4c5e1a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700X4d4c5e1a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700X4d4c5e1a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700X4d4c5e1a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700X4d4c5e1a must be a JSON object")
      return InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700X4d4c5e1a(
        splashscreen = rawObject["splashscreen"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caad>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700X4d4c5e1a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700X4d4c5e1a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.splashscreen?.let { put("splashscreen", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalConfigurationsPostRequestFormVerifoneUx700X4d4c5e1a(block: InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700X4d4c5e1a.Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700X4d4c5e1a = InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700X4d4c5e1a.build(block)
