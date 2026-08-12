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
 * rties/registry.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published/properties/registry_package/prope
 * rties/registry
 */
@Serializable(with = InlineWebhookRegistryPackagePublishedRegistryPackageRegistryXd7b614d4.Serializer::class)
public class InlineWebhookRegistryPackagePublishedRegistryPackageRegistryXd7b614d4(
  public val aboutUrl: String? = null,
  public val name: String? = null,
  public val type: String? = null,
  public val url: String? = null,
  public val vendor: String? = null,
) {
  public class Builder {
    public var aboutUrl: String? = null

    public var name: String? = null

    public var type: String? = null

    public var url: String? = null

    public var vendor: String? = null

    public fun build(): InlineWebhookRegistryPackagePublishedRegistryPackageRegistryXd7b614d4 = InlineWebhookRegistryPackagePublishedRegistryPackageRegistryXd7b614d4(
      aboutUrl = aboutUrl,
      name = name,
      type = type,
      url = url,
      vendor = vendor,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRegistryPackagePublishedRegistryPackageRegistryXd7b614d4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookRegistryPackagePublishedRegistryPackageRegistryXd7b614d4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRegistryPackagePublishedRegistryPackageRegistryXd7b614d4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRegistryPackagePublishedRegistryPackageRegistryXd7b614d4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRegistryPackagePublishedRegistryPackageRegistryXd7b614d4 must be a JSON object")
      return InlineWebhookRegistryPackagePublishedRegistryPackageRegistryXd7b614d4(
        aboutUrl = rawObject["about_url"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        vendor = rawObject["vendor"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRegistryPackagePublishedRegistryPackageRegistryXd7b614d4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRegistryPackagePublishedRegistryPackageRegistryXd7b614d4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.aboutUrl?.let { put("about_url", it) }
        value.name?.let { put("name", it) }
        value.type?.let { put("type", it) }
        value.url?.let { put("url", it) }
        value.vendor?.let { put("vendor", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRegistryPackagePublishedRegistryPackageRegistryXd7b614d4(block: InlineWebhookRegistryPackagePublishedRegistryPackageRegistryXd7b614d4.Builder.() -> Unit): InlineWebhookRegistryPackagePublishedRegistryPackageRegistryXd7b614d4 = InlineWebhookRegistryPackagePublishedRegistryPackageRegistryXd7b614d4.build(block)
