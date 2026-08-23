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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published/properties/registry_package/prope
 * rties/package_version/properties/docker_metadata/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published/properties/registry_package/prope
 * rties/package_version/properties/docker_metadata/items
 */
@Serializable(with = InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemX7a7cbe99.Serializer::class)
public class InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemX7a7cbe99(
  tags: List<String>? = null,
) {
  public val tags: List<String>? = tags?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var tagsValue: List<String>? = null

    public var tags: List<String>?
      get() = tagsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        tagsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemX7a7cbe99 = InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemX7a7cbe99(
      tags = tags,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemX7a7cbe99 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemX7a7cbe99> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemX7a7cbe99 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemX7a7cbe99")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemX7a7cbe99 must be a JSON object")
      return InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemX7a7cbe99(
        tags = rawObject["tags"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemX7a7cbe99) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemX7a7cbe99")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.tags?.let { put("tags", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemX7a7cbe99(block: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemX7a7cbe99.Builder.() -> Unit): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemX7a7cbe99 = InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemX7a7cbe99.build(block)
