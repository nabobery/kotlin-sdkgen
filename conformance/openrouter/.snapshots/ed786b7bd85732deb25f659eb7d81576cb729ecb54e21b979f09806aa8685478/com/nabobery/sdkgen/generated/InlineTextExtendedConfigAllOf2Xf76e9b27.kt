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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/TextExtendedConfig/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/TextExtendedConfig/allOf/1
 */
@Serializable(with = InlineTextExtendedConfigAllOf2Xf76e9b27.Serializer::class)
public class InlineTextExtendedConfigAllOf2Xf76e9b27(
  public val verbosity: InlineTextExtendedConfigAllOf2VerbosityXb0251994? = null,
) {
  public class Builder {
    public var verbosity: InlineTextExtendedConfigAllOf2VerbosityXb0251994? = null

    public fun build(): InlineTextExtendedConfigAllOf2Xf76e9b27 = InlineTextExtendedConfigAllOf2Xf76e9b27(
      verbosity = verbosity,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTextExtendedConfigAllOf2Xf76e9b27 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineTextExtendedConfigAllOf2Xf76e9b27> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTextExtendedConfigAllOf2Xf76e9b27 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTextExtendedConfigAllOf2Xf76e9b27")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTextExtendedConfigAllOf2Xf76e9b27 must be a JSON object")
      return InlineTextExtendedConfigAllOf2Xf76e9b27(
        verbosity = rawObject["verbosity"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTextExtendedConfigAllOf2VerbosityXb0251994?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTextExtendedConfigAllOf2Xf76e9b27) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTextExtendedConfigAllOf2Xf76e9b27")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.verbosity?.let { put("verbosity", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineTextExtendedConfigAllOf2Xf76e9b27(block: InlineTextExtendedConfigAllOf2Xf76e9b27.Builder.() -> Unit): InlineTextExtendedConfigAllOf2Xf76e9b27 = InlineTextExtendedConfigAllOf2Xf76e9b27.build(block)
