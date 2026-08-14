package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published/properties/registry_package/prope
 * rties/package_version/properties/container_metadata.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published/properties/registry_package/prope
 * rties/package_version/properties/container_metadata
 */
@Serializable(with = InlineWebhookRegistryPackae13fRegistryPackageContainerMetadataXfd3b6a1c.Serializer::class)
public class InlineWebhookRegistryPackae13fRegistryPackageContainerMetadataXfd3b6a1c(
  public val labels: JsonObject? = null,
  public val manifest: JsonObject? = null,
  public val tag: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionTagX55b15add? = null,
) {
  public class Builder {
    public var labels: JsonObject? = null

    public var manifest: JsonObject? = null

    public var tag: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionTagX55b15add? = null

    public fun build(): InlineWebhookRegistryPackae13fRegistryPackageContainerMetadataXfd3b6a1c = InlineWebhookRegistryPackae13fRegistryPackageContainerMetadataXfd3b6a1c(
      labels = labels,
      manifest = manifest,
      tag = tag,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRegistryPackae13fRegistryPackageContainerMetadataXfd3b6a1c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookRegistryPackae13fRegistryPackageContainerMetadataXfd3b6a1c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRegistryPackae13fRegistryPackageContainerMetadataXfd3b6a1c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRegistryPackae13fRegistryPackageContainerMetadataXfd3b6a1c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRegistryPackae13fRegistryPackageContainerMetadataXfd3b6a1c must be a JSON object")
      return InlineWebhookRegistryPackae13fRegistryPackageContainerMetadataXfd3b6a1c(
        labels = rawObject["labels"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonObject?>(element) },
        manifest = rawObject["manifest"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonObject?>(element) },
        tag = rawObject["tag"]?.let { json.decodeFromJsonElement<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionTagX55b15add>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRegistryPackae13fRegistryPackageContainerMetadataXfd3b6a1c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRegistryPackae13fRegistryPackageContainerMetadataXfd3b6a1c")
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

public fun inlineWebhookRegistryPackae13fRegistryPackageContainerMetadataXfd3b6a1c(block: InlineWebhookRegistryPackae13fRegistryPackageContainerMetadataXfd3b6a1c.Builder.() -> Unit): InlineWebhookRegistryPackae13fRegistryPackageContainerMetadataXfd3b6a1c = InlineWebhookRegistryPackae13fRegistryPackageContainerMetadataXfd3b6a1c.build(block)
