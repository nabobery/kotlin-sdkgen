package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1cache~1usage-by-repository/get/responses/200/content/appl
 * ication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1cache~1usage-by-repository/get/responses/200/content/appl
 * ication~1json/schema
 */
@Serializable(with = InlineOrgsActionsCacheUsageByRepositoryGetResponse200JsonX4c8648c1.Serializer::class)
public class InlineOrgsActionsCacheUsageByRepositoryGetResponse200JsonX4c8648c1(
  repositoryCacheUsages: List<ActionsCacheUsageByRepository>,
  public val totalCount: Int,
) {
  public val repositoryCacheUsages: List<ActionsCacheUsageByRepository> =
      repositoryCacheUsages.toList()

  public class Builder {
    private var repositoryCacheUsagesValue: List<ActionsCacheUsageByRepository>? = null

    public var repositoryCacheUsages: List<ActionsCacheUsageByRepository>
      get() = requireNotNull(repositoryCacheUsagesValue) { "repositoryCacheUsages is required" }
      set(`value`) {
        repositoryCacheUsagesValue = value
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineOrgsActionsCacheUsageByRepositoryGetResponse200JsonX4c8648c1 {
      check(repositoryCacheUsagesValue != null) { "repositoryCacheUsages is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsActionsCacheUsageByRepositoryGetResponse200JsonX4c8648c1(
        repositoryCacheUsages = repositoryCacheUsages,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsCacheUsageByRepositoryGetResponse200JsonX4c8648c1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsActionsCacheUsageByRepositoryGetResponse200JsonX4c8648c1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsCacheUsageByRepositoryGetResponse200JsonX4c8648c1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsCacheUsageByRepositoryGetResponse200JsonX4c8648c1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsCacheUsageByRepositoryGetResponse200JsonX4c8648c1 must be a JSON object")
      val repositoryCacheUsages = json.decodeRequired<List<ActionsCacheUsageByRepository>>(rawObject, "repository_cache_usages")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsActionsCacheUsageByRepositoryGetResponse200JsonX4c8648c1(
        repositoryCacheUsages = repositoryCacheUsages,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsCacheUsageByRepositoryGetResponse200JsonX4c8648c1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsCacheUsageByRepositoryGetResponse200JsonX4c8648c1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("repository_cache_usages", json.encodeToJsonElement(value.repositoryCacheUsages))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsCacheUsageByRepositoryGetResponse200JsonX4c8648c1(block: InlineOrgsActionsCacheUsageByRepositoryGetResponse200JsonX4c8648c1.Builder.() -> Unit): InlineOrgsActionsCacheUsageByRepositoryGetResponse200JsonX4c8648c1 = InlineOrgsActionsCacheUsageByRepositoryGetResponse200JsonX4c8648c1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsCacheUsageByRepositoryGetResponse200JsonX4c8648c1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
