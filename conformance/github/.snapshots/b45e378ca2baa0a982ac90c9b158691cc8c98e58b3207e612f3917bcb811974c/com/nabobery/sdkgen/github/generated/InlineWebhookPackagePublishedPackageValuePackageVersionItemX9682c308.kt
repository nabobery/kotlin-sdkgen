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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/package/properties/package_vers
 * ion/properties/nuget_metadata/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/package/properties/package_vers
 * ion/properties/nuget_metadata/items
 */
@Serializable(with = InlineWebhookPackagePublishedPackageValuePackageVersionItemX9682c308.Serializer::class)
public class InlineWebhookPackagePublishedPackageValuePackageVersionItemX9682c308(
  public val id:
      InlineWebhookPackagePublishedPackageValuePackageVersionNugetMetadataIdX03e72d26? = null,
  public val name: String? = null,
  public val `value`: InlineWebhookPackagePublishedPackageValuePackageVersionValueXd2c7f7d9? = null,
) {
  public class Builder {
    public var id: InlineWebhookPackagePublishedPackageValuePackageVersionNugetMetadataIdX03e72d26?
        = null

    public var name: String? = null

    public var `value`: InlineWebhookPackagePublishedPackageValuePackageVersionValueXd2c7f7d9? =
        null

    public fun build(): InlineWebhookPackagePublishedPackageValuePackageVersionItemX9682c308 = InlineWebhookPackagePublishedPackageValuePackageVersionItemX9682c308(
      id = id,
      name = name,
      value = value,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPackagePublishedPackageValuePackageVersionItemX9682c308 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPackagePublishedPackageValuePackageVersionItemX9682c308> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPackagePublishedPackageValuePackageVersionItemX9682c308 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPackagePublishedPackageValuePackageVersionItemX9682c308")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPackagePublishedPackageValuePackageVersionItemX9682c308 must be a JSON object")
      return InlineWebhookPackagePublishedPackageValuePackageVersionItemX9682c308(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<InlineWebhookPackagePublishedPackageValuePackageVersionNugetMetadataIdX03e72d26>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        value = rawObject["value"]?.let { json.decodeFromJsonElement<InlineWebhookPackagePublishedPackageValuePackageVersionValueXd2c7f7d9>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPackagePublishedPackageValuePackageVersionItemX9682c308) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPackagePublishedPackageValuePackageVersionItemX9682c308")
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

public fun inlineWebhookPackagePublishedPackageValuePackageVersionItemX9682c308(block: InlineWebhookPackagePublishedPackageValuePackageVersionItemX9682c308.Builder.() -> Unit): InlineWebhookPackagePublishedPackageValuePackageVersionItemX9682c308 = InlineWebhookPackagePublishedPackageValuePackageVersionItemX9682c308.build(block)
