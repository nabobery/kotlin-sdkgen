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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/package-version/properties/metadata/properties/container.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/package-version/properties/metadata/properties/container
 */
@Serializable(with = InlinePackageVersionMetadataContainerX21d8cc27.Serializer::class)
public class InlinePackageVersionMetadataContainerX21d8cc27(
  tags: List<String>,
) {
  public val tags: List<String> = tags.toList()

  public class Builder {
    private var tagsValue: List<String>? = null

    public var tags: List<String>
      get() = requireNotNull(tagsValue) { "tags is required" }.toList()
      set(`value`) {
        tagsValue = value.toList()
      }

    public fun build(): InlinePackageVersionMetadataContainerX21d8cc27 {
      check(tagsValue != null) { "tags is required" }
      return InlinePackageVersionMetadataContainerX21d8cc27(
        tags = tags,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePackageVersionMetadataContainerX21d8cc27 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePackageVersionMetadataContainerX21d8cc27> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePackageVersionMetadataContainerX21d8cc27 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePackageVersionMetadataContainerX21d8cc27")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePackageVersionMetadataContainerX21d8cc27 must be a JSON object")
      val tags = json.decodeRequired<List<String>>(rawObject, "tags")
      return InlinePackageVersionMetadataContainerX21d8cc27(
        tags = tags,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePackageVersionMetadataContainerX21d8cc27) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePackageVersionMetadataContainerX21d8cc27")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("tags", json.encodeToJsonElement(value.tags))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePackageVersionMetadataContainerX21d8cc27(block: InlinePackageVersionMetadataContainerX21d8cc27.Builder.() -> Unit): InlinePackageVersionMetadataContainerX21d8cc27 = InlinePackageVersionMetadataContainerX21d8cc27.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePackageVersionMetadataContainerX21d8cc27 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
