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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-updated/properties/package/properties/package_versio
 * n/properties/docker_metadata/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-updated/properties/package/properties/package_versio
 * n/properties/docker_metadata/items
 */
@Serializable(with = InlineWebhookPackageUpdatedPackageValuePackageVersionDockerMetadataItemX87288dd4.Serializer::class)
public class InlineWebhookPackageUpdatedPackageValuePackageVersionDockerMetadataItemX87288dd4(
  public val tags: List<String>? = null,
) {
  public class Builder {
    public var tags: List<String>? = null

    public fun build(): InlineWebhookPackageUpdatedPackageValuePackageVersionDockerMetadataItemX87288dd4 = InlineWebhookPackageUpdatedPackageValuePackageVersionDockerMetadataItemX87288dd4(
      tags = tags,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPackageUpdatedPackageValuePackageVersionDockerMetadataItemX87288dd4 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPackageUpdatedPackageValuePackageVersionDockerMetadataItemX87288dd4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPackageUpdatedPackageValuePackageVersionDockerMetadataItemX87288dd4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPackageUpdatedPackageValuePackageVersionDockerMetadataItemX87288dd4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPackageUpdatedPackageValuePackageVersionDockerMetadataItemX87288dd4 must be a JSON object")
      return InlineWebhookPackageUpdatedPackageValuePackageVersionDockerMetadataItemX87288dd4(
        tags = rawObject["tags"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPackageUpdatedPackageValuePackageVersionDockerMetadataItemX87288dd4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPackageUpdatedPackageValuePackageVersionDockerMetadataItemX87288dd4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.tags?.let { put("tags", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPackageUpdatedPackageValuePackageVersionDockerMetadataItemX87288dd4(block: InlineWebhookPackageUpdatedPackageValuePackageVersionDockerMetadataItemX87288dd4.Builder.() -> Unit): InlineWebhookPackageUpdatedPackageValuePackageVersionDockerMetadataItemX87288dd4 = InlineWebhookPackageUpdatedPackageValuePackageVersionDockerMetadataItemX87288dd4.build(block)
