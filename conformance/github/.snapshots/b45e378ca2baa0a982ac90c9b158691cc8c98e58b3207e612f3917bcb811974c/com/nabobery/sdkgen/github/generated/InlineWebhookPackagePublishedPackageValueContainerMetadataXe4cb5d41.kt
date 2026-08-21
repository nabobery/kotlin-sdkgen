package com.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/package/properties/package_vers
 * ion/properties/container_metadata.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/package/properties/package_vers
 * ion/properties/container_metadata
 */
@Serializable(with = InlineWebhookPackagePublishedPackageValueContainerMetadataXe4cb5d41.Serializer::class)
public class InlineWebhookPackagePublishedPackageValueContainerMetadataXe4cb5d41(
  public val labels: JsonObject? = null,
  public val manifest: JsonObject? = null,
  public val tag: InlineWebhookPackagePublishedPackageValuePackageVersionTagX530d3279? = null,
) {
  public class Builder {
    public var labels: JsonObject? = null

    public var manifest: JsonObject? = null

    public var tag: InlineWebhookPackagePublishedPackageValuePackageVersionTagX530d3279? = null

    public fun build(): InlineWebhookPackagePublishedPackageValueContainerMetadataXe4cb5d41 = InlineWebhookPackagePublishedPackageValueContainerMetadataXe4cb5d41(
      labels = labels,
      manifest = manifest,
      tag = tag,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPackagePublishedPackageValueContainerMetadataXe4cb5d41 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPackagePublishedPackageValueContainerMetadataXe4cb5d41> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPackagePublishedPackageValueContainerMetadataXe4cb5d41 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPackagePublishedPackageValueContainerMetadataXe4cb5d41")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPackagePublishedPackageValueContainerMetadataXe4cb5d41 must be a JSON object")
      return InlineWebhookPackagePublishedPackageValueContainerMetadataXe4cb5d41(
        labels = rawObject["labels"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonObject?>(element) },
        manifest = rawObject["manifest"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonObject?>(element) },
        tag = rawObject["tag"]?.let { json.decodeFromJsonElement<InlineWebhookPackagePublishedPackageValuePackageVersionTagX530d3279>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPackagePublishedPackageValueContainerMetadataXe4cb5d41) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPackagePublishedPackageValueContainerMetadataXe4cb5d41")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.labels?.let { put("labels", json.encodeToJsonElement(it)) }
        value.manifest?.let { put("manifest", json.encodeToJsonElement(it)) }
        value.tag?.let { put("tag", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPackagePublishedPackageValueContainerMetadataXe4cb5d41(block: InlineWebhookPackagePublishedPackageValueContainerMetadataXe4cb5d41.Builder.() -> Unit): InlineWebhookPackagePublishedPackageValueContainerMetadataXe4cb5d41 = InlineWebhookPackagePublishedPackageValueContainerMetadataXe4cb5d41.build(block)
