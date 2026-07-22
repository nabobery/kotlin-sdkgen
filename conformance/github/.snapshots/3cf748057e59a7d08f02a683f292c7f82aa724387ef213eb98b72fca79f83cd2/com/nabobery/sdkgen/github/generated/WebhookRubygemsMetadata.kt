package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-rubygems-metadata.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-rubygems-metadata
 */
@Serializable(with = WebhookRubygemsMetadata.Serializer::class)
public class WebhookRubygemsMetadata(
  public val commitOid: String? = null,
  public val dependencies: List<Map<String, String>>? = null,
  public val description: String? = null,
  public val homepage: String? = null,
  public val metadata: Map<String, String>? = null,
  public val name: String? = null,
  public val platform: String? = null,
  public val readme: String? = null,
  public val repo: String? = null,
  public val versionInfo: InlineWebhookRubygemsMetadataVersionInfoX4c691777? = null,
) {
  public class Builder {
    public var commitOid: String? = null

    public var dependencies: List<Map<String, String>>? = null

    public var description: String? = null

    public var homepage: String? = null

    public var metadata: Map<String, String>? = null

    public var name: String? = null

    public var platform: String? = null

    public var readme: String? = null

    public var repo: String? = null

    public var versionInfo: InlineWebhookRubygemsMetadataVersionInfoX4c691777? = null

    public fun build(): WebhookRubygemsMetadata = WebhookRubygemsMetadata(
      commitOid = commitOid,
      dependencies = dependencies,
      description = description,
      homepage = homepage,
      metadata = metadata,
      name = name,
      platform = platform,
      readme = readme,
      repo = repo,
      versionInfo = versionInfo,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookRubygemsMetadata = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookRubygemsMetadata> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookRubygemsMetadata {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookRubygemsMetadata")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookRubygemsMetadata must be a JSON object")
      return WebhookRubygemsMetadata(
        commitOid = rawObject["commit_oid"]?.let { json.decodeFromJsonElement<String>(it) },
        dependencies = rawObject["dependencies"]?.let { json.decodeFromJsonElement<List<Map<String, String>>>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        homepage = rawObject["homepage"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        platform = rawObject["platform"]?.let { json.decodeFromJsonElement<String>(it) },
        readme = rawObject["readme"]?.let { json.decodeFromJsonElement<String>(it) },
        repo = rawObject["repo"]?.let { json.decodeFromJsonElement<String>(it) },
        versionInfo = rawObject["version_info"]?.let { json.decodeFromJsonElement<InlineWebhookRubygemsMetadataVersionInfoX4c691777>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookRubygemsMetadata) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookRubygemsMetadata")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.commitOid?.let { put("commit_oid", it) }
        value.dependencies?.let { put("dependencies", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.homepage?.let { put("homepage", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.platform?.let { put("platform", it) }
        value.readme?.let { put("readme", it) }
        value.repo?.let { put("repo", it) }
        value.versionInfo?.let { put("version_info", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookRubygemsMetadata(block: WebhookRubygemsMetadata.Builder.() -> Unit): WebhookRubygemsMetadata = WebhookRubygemsMetadata.build(block)
