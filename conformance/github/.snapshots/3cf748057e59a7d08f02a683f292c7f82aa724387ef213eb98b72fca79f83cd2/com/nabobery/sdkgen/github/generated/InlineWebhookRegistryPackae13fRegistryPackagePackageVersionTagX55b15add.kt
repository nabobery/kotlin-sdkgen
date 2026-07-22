package com.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published/properties/registry_package/prope
 * rties/package_version/properties/container_metadata/properties/tag.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published/properties/registry_package/prope
 * rties/package_version/properties/container_metadata/properties/tag
 */
@Serializable(with = InlineWebhookRegistryPackae13fRegistryPackagePackageVersionTagX55b15add.Serializer::class)
public class InlineWebhookRegistryPackae13fRegistryPackagePackageVersionTagX55b15add(
  public val digest: String? = null,
  public val name: String? = null,
) {
  public class Builder {
    public var digest: String? = null

    public var name: String? = null

    public fun build(): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionTagX55b15add = InlineWebhookRegistryPackae13fRegistryPackagePackageVersionTagX55b15add(
      digest = digest,
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionTagX55b15add = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionTagX55b15add> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionTagX55b15add {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRegistryPackae13fRegistryPackagePackageVersionTagX55b15add")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRegistryPackae13fRegistryPackagePackageVersionTagX55b15add must be a JSON object")
      return InlineWebhookRegistryPackae13fRegistryPackagePackageVersionTagX55b15add(
        digest = rawObject["digest"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionTagX55b15add) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRegistryPackae13fRegistryPackagePackageVersionTagX55b15add")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.digest?.let { put("digest", it) }
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRegistryPackae13fRegistryPackagePackageVersionTagX55b15add(block: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionTagX55b15add.Builder.() -> Unit): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionTagX55b15add = InlineWebhookRegistryPackae13fRegistryPackagePackageVersionTagX55b15add.build(block)
