package io.github.nabobery.sdkgen.github.generated

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
 * ion/properties/nuget_metadata/items/properties/value/oneOf/3.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/package/properties/package_vers
 * ion/properties/nuget_metadata/items/properties/value/oneOf/3
 */
@Serializable(with = InlineWebhookPackagePublishedPackageValuePackageVersionOneOf4X51921735.Serializer::class)
public class InlineWebhookPackagePublishedPackageValuePackageVersionOneOf4X51921735(
  public val branch: String? = null,
  public val commit: String? = null,
  public val type: String? = null,
  public val url: String? = null,
) {
  public class Builder {
    public var branch: String? = null

    public var commit: String? = null

    public var type: String? = null

    public var url: String? = null

    public fun build(): InlineWebhookPackagePublishedPackageValuePackageVersionOneOf4X51921735 = InlineWebhookPackagePublishedPackageValuePackageVersionOneOf4X51921735(
      branch = branch,
      commit = commit,
      type = type,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPackagePublishedPackageValuePackageVersionOneOf4X51921735 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPackagePublishedPackageValuePackageVersionOneOf4X51921735> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPackagePublishedPackageValuePackageVersionOneOf4X51921735 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPackagePublishedPackageValuePackageVersionOneOf4X51921735")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPackagePublishedPackageValuePackageVersionOneOf4X51921735 must be a JSON object")
      return InlineWebhookPackagePublishedPackageValuePackageVersionOneOf4X51921735(
        branch = rawObject["branch"]?.let { json.decodeFromJsonElement<String>(it) },
        commit = rawObject["commit"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPackagePublishedPackageValuePackageVersionOneOf4X51921735) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPackagePublishedPackageValuePackageVersionOneOf4X51921735")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.branch?.let { put("branch", it) }
        value.commit?.let { put("commit", it) }
        value.type?.let { put("type", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPackagePublishedPackageValuePackageVersionOneOf4X51921735(block: InlineWebhookPackagePublishedPackageValuePackageVersionOneOf4X51921735.Builder.() -> Unit): InlineWebhookPackagePublishedPackageValuePackageVersionOneOf4X51921735 = InlineWebhookPackagePublishedPackageValuePackageVersionOneOf4X51921735.build(block)
