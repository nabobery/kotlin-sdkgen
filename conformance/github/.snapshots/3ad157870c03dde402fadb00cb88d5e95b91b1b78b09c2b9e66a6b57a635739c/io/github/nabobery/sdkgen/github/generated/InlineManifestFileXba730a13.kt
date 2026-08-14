package io.github.nabobery.sdkgen.github.generated

import kotlin.String
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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/manifest/properties/file.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/manifest/properties/file
 */
@Serializable(with = InlineManifestFileXba730a13.Serializer::class)
public class InlineManifestFileXba730a13(
  /**
   * The path of the manifest file relative to the root of the Git repository.
   */
  public val sourceLocation: String? = null,
) {
  public class Builder {
    /**
     * The path of the manifest file relative to the root of the Git repository.
     */
    public var sourceLocation: String? = null

    public fun build(): InlineManifestFileXba730a13 = InlineManifestFileXba730a13(
      sourceLocation = sourceLocation,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineManifestFileXba730a13 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineManifestFileXba730a13> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineManifestFileXba730a13 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineManifestFileXba730a13")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineManifestFileXba730a13 must be a JSON object")
      return InlineManifestFileXba730a13(
        sourceLocation = rawObject["source_location"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineManifestFileXba730a13) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineManifestFileXba730a13")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.sourceLocation?.let { put("source_location", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineManifestFileXba730a13(block: InlineManifestFileXba730a13.Builder.() -> Unit): InlineManifestFileXba730a13 = InlineManifestFileXba730a13.build(block)
