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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published/properties/registry_package/prope
 * rties/package_version/properties/nuget_metadata/items/properties/value/oneOf/3.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published/properties/registry_package/prope
 * rties/package_version/properties/nuget_metadata/items/properties/value/oneOf/3
 */
@Serializable(with = InlineWebhookRegistryPackae13fRegistryPackagePackageVersionOneOf4Xb8c03daf.Serializer::class)
public class InlineWebhookRegistryPackae13fRegistryPackagePackageVersionOneOf4Xb8c03daf(
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

    public fun build(): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionOneOf4Xb8c03daf = InlineWebhookRegistryPackae13fRegistryPackagePackageVersionOneOf4Xb8c03daf(
      branch = branch,
      commit = commit,
      type = type,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionOneOf4Xb8c03daf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionOneOf4Xb8c03daf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionOneOf4Xb8c03daf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRegistryPackae13fRegistryPackagePackageVersionOneOf4Xb8c03daf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRegistryPackae13fRegistryPackagePackageVersionOneOf4Xb8c03daf must be a JSON object")
      return InlineWebhookRegistryPackae13fRegistryPackagePackageVersionOneOf4Xb8c03daf(
        branch = rawObject["branch"]?.let { json.decodeFromJsonElement<String>(it) },
        commit = rawObject["commit"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionOneOf4Xb8c03daf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRegistryPackae13fRegistryPackagePackageVersionOneOf4Xb8c03daf")
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

public fun inlineWebhookRegistryPackae13fRegistryPackagePackageVersionOneOf4Xb8c03daf(block: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionOneOf4Xb8c03daf.Builder.() -> Unit): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionOneOf4Xb8c03daf = InlineWebhookRegistryPackae13fRegistryPackagePackageVersionOneOf4Xb8c03daf.build(block)
