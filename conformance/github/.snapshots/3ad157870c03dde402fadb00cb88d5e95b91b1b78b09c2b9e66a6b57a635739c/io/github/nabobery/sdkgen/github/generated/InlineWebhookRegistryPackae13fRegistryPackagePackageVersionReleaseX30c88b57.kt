package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * rties/package_version/properties/release.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published/properties/registry_package/prope
 * rties/package_version/properties/release
 */
@Serializable(with = InlineWebhookRegistryPackae13fRegistryPackagePackageVersionReleaseX30c88b57.Serializer::class)
public class InlineWebhookRegistryPackae13fRegistryPackagePackageVersionReleaseX30c88b57(
  public val author:
      InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXb556904f? = null,
  public val createdAt: String? = null,
  public val draft: Boolean? = null,
  public val htmlUrl: String? = null,
  public val id: Int? = null,
  public val name: String? = null,
  public val prerelease: Boolean? = null,
  public val publishedAt: String? = null,
  public val tagName: String? = null,
  public val targetCommitish: String? = null,
  public val url: String? = null,
) {
  public class Builder {
    public var author: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXb556904f? =
        null

    public var createdAt: String? = null

    public var draft: Boolean? = null

    public var htmlUrl: String? = null

    public var id: Int? = null

    public var name: String? = null

    public var prerelease: Boolean? = null

    public var publishedAt: String? = null

    public var tagName: String? = null

    public var targetCommitish: String? = null

    public var url: String? = null

    public fun build(): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionReleaseX30c88b57 = InlineWebhookRegistryPackae13fRegistryPackagePackageVersionReleaseX30c88b57(
      author = author,
      createdAt = createdAt,
      draft = draft,
      htmlUrl = htmlUrl,
      id = id,
      name = name,
      prerelease = prerelease,
      publishedAt = publishedAt,
      tagName = tagName,
      targetCommitish = targetCommitish,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionReleaseX30c88b57 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionReleaseX30c88b57> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionReleaseX30c88b57 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRegistryPackae13fRegistryPackagePackageVersionReleaseX30c88b57")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRegistryPackae13fRegistryPackagePackageVersionReleaseX30c88b57 must be a JSON object")
      return InlineWebhookRegistryPackae13fRegistryPackagePackageVersionReleaseX30c88b57(
        author = rawObject["author"]?.let { json.decodeFromJsonElement<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXb556904f>(it) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        draft = rawObject["draft"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        prerelease = rawObject["prerelease"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        publishedAt = rawObject["published_at"]?.let { json.decodeFromJsonElement<String>(it) },
        tagName = rawObject["tag_name"]?.let { json.decodeFromJsonElement<String>(it) },
        targetCommitish = rawObject["target_commitish"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionReleaseX30c88b57) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRegistryPackae13fRegistryPackagePackageVersionReleaseX30c88b57")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.author?.let { put("author", json.encodeToJsonElement(it)) }
        value.createdAt?.let { put("created_at", it) }
        value.draft?.let { put("draft", json.encodeToJsonElement(it)) }
        value.htmlUrl?.let { put("html_url", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.prerelease?.let { put("prerelease", json.encodeToJsonElement(it)) }
        value.publishedAt?.let { put("published_at", it) }
        value.tagName?.let { put("tag_name", it) }
        value.targetCommitish?.let { put("target_commitish", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRegistryPackae13fRegistryPackagePackageVersionReleaseX30c88b57(block: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionReleaseX30c88b57.Builder.() -> Unit): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionReleaseX30c88b57 = InlineWebhookRegistryPackae13fRegistryPackagePackageVersionReleaseX30c88b57.build(block)
