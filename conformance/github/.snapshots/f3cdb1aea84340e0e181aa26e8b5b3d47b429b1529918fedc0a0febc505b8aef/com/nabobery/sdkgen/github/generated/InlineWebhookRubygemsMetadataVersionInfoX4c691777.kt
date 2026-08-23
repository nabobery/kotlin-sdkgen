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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-rubygems-metadata/properties/version_info.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-rubygems-metadata/properties/version_info
 */
@Serializable(with = InlineWebhookRubygemsMetadataVersionInfoX4c691777.Serializer::class)
public class InlineWebhookRubygemsMetadataVersionInfoX4c691777(
  public val version: String? = null,
) {
  public class Builder {
    public var version: String? = null

    public fun build(): InlineWebhookRubygemsMetadataVersionInfoX4c691777 = InlineWebhookRubygemsMetadataVersionInfoX4c691777(
      version = version,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRubygemsMetadataVersionInfoX4c691777 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookRubygemsMetadataVersionInfoX4c691777> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRubygemsMetadataVersionInfoX4c691777 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRubygemsMetadataVersionInfoX4c691777")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRubygemsMetadataVersionInfoX4c691777 must be a JSON object")
      return InlineWebhookRubygemsMetadataVersionInfoX4c691777(
        version = rawObject["version"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRubygemsMetadataVersionInfoX4c691777) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRubygemsMetadataVersionInfoX4c691777")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.version?.let { put("version", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRubygemsMetadataVersionInfoX4c691777(block: InlineWebhookRubygemsMetadataVersionInfoX4c691777.Builder.() -> Unit): InlineWebhookRubygemsMetadataVersionInfoX4c691777 = InlineWebhookRubygemsMetadataVersionInfoX4c691777.build(block)
