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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/package/properties/package_vers
 * ion/properties/docker_metadata/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/package/properties/package_vers
 * ion/properties/docker_metadata/items
 */
@Serializable(with = InlineWebhookPackagePublishedPackageValuePackageVersionItemXc38789f8.Serializer::class)
public class InlineWebhookPackagePublishedPackageValuePackageVersionItemXc38789f8(
  public val tags: List<String>? = null,
) {
  public class Builder {
    public var tags: List<String>? = null

    public fun build(): InlineWebhookPackagePublishedPackageValuePackageVersionItemXc38789f8 = InlineWebhookPackagePublishedPackageValuePackageVersionItemXc38789f8(
      tags = tags,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPackagePublishedPackageValuePackageVersionItemXc38789f8 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPackagePublishedPackageValuePackageVersionItemXc38789f8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPackagePublishedPackageValuePackageVersionItemXc38789f8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPackagePublishedPackageValuePackageVersionItemXc38789f8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPackagePublishedPackageValuePackageVersionItemXc38789f8 must be a JSON object")
      return InlineWebhookPackagePublishedPackageValuePackageVersionItemXc38789f8(
        tags = rawObject["tags"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPackagePublishedPackageValuePackageVersionItemXc38789f8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPackagePublishedPackageValuePackageVersionItemXc38789f8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.tags?.let { put("tags", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPackagePublishedPackageValuePackageVersionItemXc38789f8(block: InlineWebhookPackagePublishedPackageValuePackageVersionItemXc38789f8.Builder.() -> Unit): InlineWebhookPackagePublishedPackageValuePackageVersionItemXc38789f8 = InlineWebhookPackagePublishedPackageValuePackageVersionItemXc38789f8.build(block)
