package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-updated/properties/registry_package/propert
 * ies/package_version/properties/docker_metadata/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-updated/properties/registry_package/propert
 * ies/package_version/properties/docker_metadata/items
 */
@Serializable(with = InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemX5af8e11e.Serializer::class)
public class InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemX5af8e11e(
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

    public fun build(): InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemX5af8e11e = InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemX5af8e11e(
      tags = tags,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemX5af8e11e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemX5af8e11e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemX5af8e11e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemX5af8e11e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemX5af8e11e must be a JSON object")
      return InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemX5af8e11e(
        tags = rawObject["tags"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemX5af8e11e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemX5af8e11e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.tags?.let { put("tags", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemX5af8e11e(block: InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemX5af8e11e.Builder.() -> Unit): InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemX5af8e11e = InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemX5af8e11e.build(block)
