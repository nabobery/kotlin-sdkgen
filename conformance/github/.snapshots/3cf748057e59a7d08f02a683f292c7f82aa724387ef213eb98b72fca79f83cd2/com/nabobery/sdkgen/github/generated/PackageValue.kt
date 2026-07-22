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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A software package
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/package
 */
@Serializable(with = PackageValue.Serializer::class)
public class PackageValue(
  public val createdAt: String,
  public val htmlUrl: String,
  /**
   * Unique identifier of the package.
   */
  public val id: Int,
  /**
   * The name of the package.
   */
  public val name: String,
  public val packageType: InlinePackageValuePackageTypeXc2deae67,
  public val updatedAt: String,
  public val url: String,
  /**
   * The number of versions of the package.
   */
  public val versionCount: Int,
  public val visibility: InlinePackageValueVisibilityX427090d5,
  public val owner: NullableSimpleUser? = null,
  public val repository: NullableMinimalRepository? = null,
) {
  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
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

    private var packageTypeValue: InlinePackageValuePackageTypeXc2deae67? = null

    public var packageType: InlinePackageValuePackageTypeXc2deae67
      get() = requireNotNull(packageTypeValue) { "packageType is required" }
      set(`value`) {
        packageTypeValue = value
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

    private var versionCountValue: Int? = null

    public var versionCount: Int
      get() = requireNotNull(versionCountValue) { "versionCount is required" }
      set(`value`) {
        versionCountValue = value
      }

    private var visibilityValue: InlinePackageValueVisibilityX427090d5? = null

    public var visibility: InlinePackageValueVisibilityX427090d5
      get() = requireNotNull(visibilityValue) { "visibility is required" }
      set(`value`) {
        visibilityValue = value
      }

    public var owner: NullableSimpleUser? = null

    public var repository: NullableMinimalRepository? = null

    public fun build(): PackageValue {
      check(createdAtValue != null) { "createdAt is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(packageTypeValue != null) { "packageType is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(versionCountValue != null) { "versionCount is required" }
      check(visibilityValue != null) { "visibility is required" }
      return PackageValue(
        createdAt = createdAt,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        packageType = packageType,
        updatedAt = updatedAt,
        url = url,
        versionCount = versionCount,
        visibility = visibility,
        owner = owner,
        repository = repository,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PackageValue = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PackageValue> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PackageValue {
      val jsonDecoder = decoder.requireJsonDecoder("PackageValue")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PackageValue must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val packageType = json.decodeRequired<InlinePackageValuePackageTypeXc2deae67>(rawObject, "package_type")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      val versionCount = json.decodeRequired<Int>(rawObject, "version_count")
      val visibility = json.decodeRequired<InlinePackageValueVisibilityX427090d5>(rawObject, "visibility")
      return PackageValue(
        createdAt = createdAt,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        packageType = packageType,
        updatedAt = updatedAt,
        url = url,
        versionCount = versionCount,
        visibility = visibility,
        owner = rawObject["owner"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(element) },
        repository = rawObject["repository"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableMinimalRepository?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PackageValue) {
      val jsonEncoder = encoder.requireJsonEncoder("PackageValue")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("package_type", json.encodeToJsonElement(value.packageType))
        put("updated_at", value.updatedAt)
        put("url", value.url)
        put("version_count", json.encodeToJsonElement(value.versionCount))
        put("visibility", json.encodeToJsonElement(value.visibility))
        value.owner?.let { put("owner", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun packageValue(block: PackageValue.Builder.() -> Unit): PackageValue = PackageValue.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PackageValue is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
