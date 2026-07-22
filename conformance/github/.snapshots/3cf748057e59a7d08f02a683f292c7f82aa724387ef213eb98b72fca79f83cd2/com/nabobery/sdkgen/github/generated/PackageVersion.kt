package com.nabobery.sdkgen.github.generated

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
 * A version of a software package
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/package-version
 */
@Serializable(with = PackageVersion.Serializer::class)
public class PackageVersion(
  public val createdAt: String,
  /**
   * Unique identifier of the package version.
   */
  public val id: Int,
  /**
   * The name of the package version.
   */
  public val name: String,
  public val packageHtmlUrl: String,
  public val updatedAt: String,
  public val url: String,
  public val deletedAt: String? = null,
  public val description: String? = null,
  public val htmlUrl: String? = null,
  public val license: String? = null,
  public val metadata: InlinePackageVersionMetadataXa969c2d8? = null,
) {
  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
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

    private var packageHtmlUrlValue: String? = null

    public var packageHtmlUrl: String
      get() = requireNotNull(packageHtmlUrlValue) { "packageHtmlUrl is required" }
      set(`value`) {
        packageHtmlUrlValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public var deletedAt: String? = null

    public var description: String? = null

    public var htmlUrl: String? = null

    public var license: String? = null

    public var metadata: InlinePackageVersionMetadataXa969c2d8? = null

    public fun build(): PackageVersion {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(packageHtmlUrlValue != null) { "packageHtmlUrl is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      return PackageVersion(
        createdAt = createdAt,
        id = id,
        name = name,
        packageHtmlUrl = packageHtmlUrl,
        updatedAt = updatedAt,
        url = url,
        deletedAt = deletedAt,
        description = description,
        htmlUrl = htmlUrl,
        license = license,
        metadata = metadata,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PackageVersion = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PackageVersion> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PackageVersion {
      val jsonDecoder = decoder.requireJsonDecoder("PackageVersion")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PackageVersion must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val packageHtmlUrl = json.decodeRequired<String>(rawObject, "package_html_url")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      return PackageVersion(
        createdAt = createdAt,
        id = id,
        name = name,
        packageHtmlUrl = packageHtmlUrl,
        updatedAt = updatedAt,
        url = url,
        deletedAt = rawObject["deleted_at"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        license = rawObject["license"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlinePackageVersionMetadataXa969c2d8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PackageVersion) {
      val jsonEncoder = encoder.requireJsonEncoder("PackageVersion")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("package_html_url", value.packageHtmlUrl)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        value.deletedAt?.let { put("deleted_at", it) }
        value.description?.let { put("description", it) }
        value.htmlUrl?.let { put("html_url", it) }
        value.license?.let { put("license", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun packageVersion(block: PackageVersion.Builder.() -> Unit): PackageVersion = PackageVersion.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PackageVersion is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
