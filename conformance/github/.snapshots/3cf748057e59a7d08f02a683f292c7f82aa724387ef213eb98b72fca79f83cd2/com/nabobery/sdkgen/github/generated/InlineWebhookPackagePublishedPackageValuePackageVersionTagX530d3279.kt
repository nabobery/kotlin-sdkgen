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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/package/properties/package_vers
 * ion/properties/container_metadata/properties/tag.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/package/properties/package_vers
 * ion/properties/container_metadata/properties/tag
 */
@Serializable(with = InlineWebhookPackagePublishedPackageValuePackageVersionTagX530d3279.Serializer::class)
public class InlineWebhookPackagePublishedPackageValuePackageVersionTagX530d3279(
  public val digest: String? = null,
  public val name: String? = null,
) {
  public class Builder {
    public var digest: String? = null

    public var name: String? = null

    public fun build(): InlineWebhookPackagePublishedPackageValuePackageVersionTagX530d3279 = InlineWebhookPackagePublishedPackageValuePackageVersionTagX530d3279(
      digest = digest,
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPackagePublishedPackageValuePackageVersionTagX530d3279 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPackagePublishedPackageValuePackageVersionTagX530d3279> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPackagePublishedPackageValuePackageVersionTagX530d3279 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPackagePublishedPackageValuePackageVersionTagX530d3279")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPackagePublishedPackageValuePackageVersionTagX530d3279 must be a JSON object")
      return InlineWebhookPackagePublishedPackageValuePackageVersionTagX530d3279(
        digest = rawObject["digest"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPackagePublishedPackageValuePackageVersionTagX530d3279) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPackagePublishedPackageValuePackageVersionTagX530d3279")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.digest?.let { put("digest", it) }
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPackagePublishedPackageValuePackageVersionTagX530d3279(block: InlineWebhookPackagePublishedPackageValuePackageVersionTagX530d3279.Builder.() -> Unit): InlineWebhookPackagePublishedPackageValuePackageVersionTagX530d3279 = InlineWebhookPackagePublishedPackageValuePackageVersionTagX530d3279.build(block)
