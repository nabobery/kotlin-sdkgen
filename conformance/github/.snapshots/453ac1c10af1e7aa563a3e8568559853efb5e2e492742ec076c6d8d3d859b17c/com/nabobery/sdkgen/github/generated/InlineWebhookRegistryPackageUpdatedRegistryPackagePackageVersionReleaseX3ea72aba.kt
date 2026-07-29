package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-updated/properties/registry_package/propert
 * ies/package_version/properties/release.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-updated/properties/registry_package/propert
 * ies/package_version/properties/release
 */
@Serializable(with = InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseX3ea72aba.Serializer::class)
public class InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseX3ea72aba(
  public val author: InlineWebhookRegistryPacka3525RegistryPackagePackageVersionAuthorX2c8b4d1e,
  public val createdAt: String,
  public val draft: Boolean,
  public val htmlUrl: String,
  public val id: Int,
  public val name: String,
  public val prerelease: Boolean,
  public val publishedAt: String,
  public val tagName: String,
  public val targetCommitish: String,
  public val url: String,
) {
  public class Builder {
    private var authorValue:
        InlineWebhookRegistryPacka3525RegistryPackagePackageVersionAuthorX2c8b4d1e? = null

    public var author: InlineWebhookRegistryPacka3525RegistryPackagePackageVersionAuthorX2c8b4d1e
      get() = requireNotNull(authorValue) { "author is required" }
      set(`value`) {
        authorValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var draftValue: Boolean? = null

    public var draft: Boolean
      get() = requireNotNull(draftValue) { "draft is required" }
      set(`value`) {
        draftValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var prereleaseValue: Boolean? = null

    public var prerelease: Boolean
      get() = requireNotNull(prereleaseValue) { "prerelease is required" }
      set(`value`) {
        prereleaseValue = value
      }

    private var publishedAtValue: String? = null

    public var publishedAt: String
      get() = requireNotNull(publishedAtValue) { "publishedAt is required" }
      set(`value`) {
        publishedAtValue = value
      }

    private var tagNameValue: String? = null

    public var tagName: String
      get() = requireNotNull(tagNameValue) { "tagName is required" }
      set(`value`) {
        tagNameValue = value
      }

    private var targetCommitishValue: String? = null

    public var targetCommitish: String
      get() = requireNotNull(targetCommitishValue) { "targetCommitish is required" }
      set(`value`) {
        targetCommitishValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseX3ea72aba {
      check(authorValue != null) { "author is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(draftValue != null) { "draft is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(prereleaseValue != null) { "prerelease is required" }
      check(publishedAtValue != null) { "publishedAt is required" }
      check(tagNameValue != null) { "tagName is required" }
      check(targetCommitishValue != null) { "targetCommitish is required" }
      check(urlValue != null) { "url is required" }
      return InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseX3ea72aba(
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
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseX3ea72aba = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseX3ea72aba> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseX3ea72aba {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseX3ea72aba")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseX3ea72aba must be a JSON object")
      val author = json.decodeRequired<InlineWebhookRegistryPacka3525RegistryPackagePackageVersionAuthorX2c8b4d1e>(rawObject, "author")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val draft = json.decodeRequired<Boolean>(rawObject, "draft")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val prerelease = json.decodeRequired<Boolean>(rawObject, "prerelease")
      val publishedAt = json.decodeRequired<String>(rawObject, "published_at")
      val tagName = json.decodeRequired<String>(rawObject, "tag_name")
      val targetCommitish = json.decodeRequired<String>(rawObject, "target_commitish")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseX3ea72aba(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseX3ea72aba) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseX3ea72aba")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("author", json.encodeToJsonElement(value.author))
        put("created_at", value.createdAt)
        put("draft", json.encodeToJsonElement(value.draft))
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("prerelease", json.encodeToJsonElement(value.prerelease))
        put("published_at", value.publishedAt)
        put("tag_name", value.tagName)
        put("target_commitish", value.targetCommitish)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseX3ea72aba(block: InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseX3ea72aba.Builder.() -> Unit): InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseX3ea72aba = InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseX3ea72aba.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseX3ea72aba is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
