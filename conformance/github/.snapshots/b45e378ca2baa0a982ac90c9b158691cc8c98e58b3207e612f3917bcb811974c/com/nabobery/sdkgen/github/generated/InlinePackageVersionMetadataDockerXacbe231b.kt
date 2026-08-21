package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.yaml#/components/schemas/package-version/properties/metadata/properties/docker.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/package-version/properties/metadata/properties/docker
 */
@Serializable(with = InlinePackageVersionMetadataDockerXacbe231b.Serializer::class)
public class InlinePackageVersionMetadataDockerXacbe231b(
  tag: List<String>? = null,
) {
  public val tag: List<String>? = tag?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var tagValue: List<String>? = null

    public var tag: List<String>?
      get() = tagValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        tagValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlinePackageVersionMetadataDockerXacbe231b = InlinePackageVersionMetadataDockerXacbe231b(
      tag = tag,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePackageVersionMetadataDockerXacbe231b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePackageVersionMetadataDockerXacbe231b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePackageVersionMetadataDockerXacbe231b {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePackageVersionMetadataDockerXacbe231b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePackageVersionMetadataDockerXacbe231b must be a JSON object")
      return InlinePackageVersionMetadataDockerXacbe231b(
        tag = rawObject["tag"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePackageVersionMetadataDockerXacbe231b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePackageVersionMetadataDockerXacbe231b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.tag?.let { put("tag", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePackageVersionMetadataDockerXacbe231b(block: InlinePackageVersionMetadataDockerXacbe231b.Builder.() -> Unit): InlinePackageVersionMetadataDockerXacbe231b = InlinePackageVersionMetadataDockerXacbe231b.build(block)
