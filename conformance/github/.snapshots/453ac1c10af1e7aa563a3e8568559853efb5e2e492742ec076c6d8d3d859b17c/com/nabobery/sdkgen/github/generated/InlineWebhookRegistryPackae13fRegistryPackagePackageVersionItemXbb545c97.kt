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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published/properties/registry_package/prope
 * rties/package_version/properties/nuget_metadata/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published/properties/registry_package/prope
 * rties/package_version/properties/nuget_metadata/items
 */
@Serializable(with = InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXbb545c97.Serializer::class)
public class InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXbb545c97(
  public val id: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionIdX3d971da5? = null,
  public val name: String? = null,
  public val `value`:
      InlineWebhookRegistryPackae13fRegistryPackagePackageVersionValueX925b9d65? = null,
) {
  public class Builder {
    public var id: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionIdX3d971da5? = null

    public var name: String? = null

    public var `value`: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionValueX925b9d65? =
        null

    public fun build(): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXbb545c97 = InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXbb545c97(
      id = id,
      name = name,
      value = value,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXbb545c97 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXbb545c97> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXbb545c97 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXbb545c97")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXbb545c97 must be a JSON object")
      return InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXbb545c97(
        id = rawObject["id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionIdX3d971da5?>(element) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        value = rawObject["value"]?.let { json.decodeFromJsonElement<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionValueX925b9d65>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXbb545c97) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXbb545c97")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.value?.let { put("value", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXbb545c97(block: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXbb545c97.Builder.() -> Unit): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXbb545c97 = InlineWebhookRegistryPackae13fRegistryPackagePackageVersionItemXbb545c97.build(block)
