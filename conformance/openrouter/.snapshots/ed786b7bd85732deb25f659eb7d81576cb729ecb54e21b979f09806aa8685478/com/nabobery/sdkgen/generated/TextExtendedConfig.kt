package com.nabobery.sdkgen.generated

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Text output configuration including format and verbosity
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/TextExtendedConfig
 */
@Serializable(with = TextExtendedConfig.Serializer::class)
public class TextExtendedConfig(
  public val format: Formats? = null,
  public val verbosity: InlineTextConfigVerbosityXf95166af? = null,
) {
  public class Builder {
    public var format: Formats? = null

    public var verbosity: InlineTextConfigVerbosityXf95166af? = null

    public fun build(): TextExtendedConfig = TextExtendedConfig(
      format = format,
      verbosity = verbosity,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TextExtendedConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TextExtendedConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TextExtendedConfig {
      val jsonDecoder = decoder.requireJsonDecoder("TextExtendedConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TextExtendedConfig must be a JSON object")
      return TextExtendedConfig(
        format = rawObject["format"]?.let { json.decodeFromJsonElement<Formats>(it) },
        verbosity = rawObject["verbosity"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTextConfigVerbosityXf95166af?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TextExtendedConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("TextExtendedConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.format?.let { put("format", json.encodeToJsonElement(it)) }
        value.verbosity?.let { put("verbosity", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun textExtendedConfig(block: TextExtendedConfig.Builder.() -> Unit): TextExtendedConfig = TextExtendedConfig.build(block)
