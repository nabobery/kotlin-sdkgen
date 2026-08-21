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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-updated/properties/registry_package/propert
 * ies/package_version/properties/package_files/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-updated/properties/registry_package/propert
 * ies/package_version/properties/package_files/items
 */
@Serializable(with = InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemXc3992072.Serializer::class)
public class InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemXc3992072(
  public val contentType: String? = null,
  public val createdAt: String? = null,
  public val downloadUrl: String? = null,
  public val id: Int? = null,
  public val md5: String? = null,
  public val name: String? = null,
  public val sha1: String? = null,
  public val sha256: String? = null,
  public val size: Int? = null,
  public val state: String? = null,
  public val updatedAt: String? = null,
) {
  public class Builder {
    public var contentType: String? = null

    public var createdAt: String? = null

    public var downloadUrl: String? = null

    public var id: Int? = null

    public var md5: String? = null

    public var name: String? = null

    public var sha1: String? = null

    public var sha256: String? = null

    public var size: Int? = null

    public var state: String? = null

    public var updatedAt: String? = null

    public fun build(): InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemXc3992072 = InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemXc3992072(
      contentType = contentType,
      createdAt = createdAt,
      downloadUrl = downloadUrl,
      id = id,
      md5 = md5,
      name = name,
      sha1 = sha1,
      sha256 = sha256,
      size = size,
      state = state,
      updatedAt = updatedAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemXc3992072 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemXc3992072> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemXc3992072 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemXc3992072")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemXc3992072 must be a JSON object")
      return InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemXc3992072(
        contentType = rawObject["content_type"]?.let { json.decodeFromJsonElement<String>(it) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        downloadUrl = rawObject["download_url"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        md5 = rawObject["md5"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        sha1 = rawObject["sha1"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        sha256 = rawObject["sha256"]?.let { json.decodeFromJsonElement<String>(it) },
        size = rawObject["size"]?.let { json.decodeFromJsonElement<Int>(it) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<String>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemXc3992072) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemXc3992072")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.contentType?.let { put("content_type", it) }
        value.createdAt?.let { put("created_at", it) }
        value.downloadUrl?.let { put("download_url", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.md5?.let { put("md5", it) }
        value.name?.let { put("name", it) }
        value.sha1?.let { put("sha1", it) }
        value.sha256?.let { put("sha256", it) }
        value.size?.let { put("size", json.encodeToJsonElement(it)) }
        value.state?.let { put("state", it) }
        value.updatedAt?.let { put("updated_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemXc3992072(block: InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemXc3992072.Builder.() -> Unit): InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemXc3992072 = InlineWebhookRegistryPacka3525RegistryPackagePackageVersionItemXc3992072.build(block)
