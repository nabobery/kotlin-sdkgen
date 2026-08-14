package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1{subject_digest}~1metadata~1storage-records/get/respons
 * es/200/content/application~1json/schema/properties/storage_records/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1{subject_digest}~1metadata~1storage-records/get/respons
 * es/200/content/application~1json/schema/properties/storage_records/items
 */
@Serializable(with = InlineOrgsArtifactsMetadat231aGetResponse200JsonStorageRecordsItemXf3143052.Serializer::class)
public class InlineOrgsArtifactsMetadat231aGetResponse200JsonStorageRecordsItemXf3143052(
  public val artifactUrl: String? = null,
  public val createdAt: String? = null,
  public val digest: String? = null,
  public val id: Int? = null,
  public val name: String? = null,
  public val registryUrl: String? = null,
  public val repository: String? = null,
  public val status: String? = null,
  public val updatedAt: String? = null,
) {
  public class Builder {
    public var artifactUrl: String? = null

    public var createdAt: String? = null

    public var digest: String? = null

    public var id: Int? = null

    public var name: String? = null

    public var registryUrl: String? = null

    public var repository: String? = null

    public var status: String? = null

    public var updatedAt: String? = null

    public fun build(): InlineOrgsArtifactsMetadat231aGetResponse200JsonStorageRecordsItemXf3143052 = InlineOrgsArtifactsMetadat231aGetResponse200JsonStorageRecordsItemXf3143052(
      artifactUrl = artifactUrl,
      createdAt = createdAt,
      digest = digest,
      id = id,
      name = name,
      registryUrl = registryUrl,
      repository = repository,
      status = status,
      updatedAt = updatedAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsArtifactsMetadat231aGetResponse200JsonStorageRecordsItemXf3143052 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsArtifactsMetadat231aGetResponse200JsonStorageRecordsItemXf3143052> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsArtifactsMetadat231aGetResponse200JsonStorageRecordsItemXf3143052 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsArtifactsMetadat231aGetResponse200JsonStorageRecordsItemXf3143052")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsArtifactsMetadat231aGetResponse200JsonStorageRecordsItemXf3143052 must be a JSON object")
      return InlineOrgsArtifactsMetadat231aGetResponse200JsonStorageRecordsItemXf3143052(
        artifactUrl = rawObject["artifact_url"]?.let { json.decodeFromJsonElement<String>(it) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        digest = rawObject["digest"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        registryUrl = rawObject["registry_url"]?.let { json.decodeFromJsonElement<String>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<String>(it) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<String>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsArtifactsMetadat231aGetResponse200JsonStorageRecordsItemXf3143052) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsArtifactsMetadat231aGetResponse200JsonStorageRecordsItemXf3143052")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.artifactUrl?.let { put("artifact_url", it) }
        value.createdAt?.let { put("created_at", it) }
        value.digest?.let { put("digest", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.registryUrl?.let { put("registry_url", it) }
        value.repository?.let { put("repository", it) }
        value.status?.let { put("status", it) }
        value.updatedAt?.let { put("updated_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsArtifactsMetadat231aGetResponse200JsonStorageRecordsItemXf3143052(block: InlineOrgsArtifactsMetadat231aGetResponse200JsonStorageRecordsItemXf3143052.Builder.() -> Unit): InlineOrgsArtifactsMetadat231aGetResponse200JsonStorageRecordsItemXf3143052 = InlineOrgsArtifactsMetadat231aGetResponse200JsonStorageRecordsItemXf3143052.build(block)
