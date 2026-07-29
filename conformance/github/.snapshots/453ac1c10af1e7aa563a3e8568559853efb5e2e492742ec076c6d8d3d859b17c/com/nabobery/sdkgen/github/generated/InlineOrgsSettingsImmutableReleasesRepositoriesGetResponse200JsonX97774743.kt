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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1settings~1immutable-releases~1repositories/get/responses/200/conte
 * nt/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1settings~1immutable-releases~1repositories/get/responses/200/conte
 * nt/application~1json/schema
 */
@Serializable(with = InlineOrgsSettingsImmutableReleasesRepositoriesGetResponse200JsonX97774743.Serializer::class)
public class InlineOrgsSettingsImmutableReleasesRepositoriesGetResponse200JsonX97774743(
  repositories: List<MinimalRepository>,
  public val totalCount: Int,
) {
  public val repositories: List<MinimalRepository> = repositories.toList()

  public class Builder {
    private var repositoriesValue: List<MinimalRepository>? = null

    public var repositories: List<MinimalRepository>
      get() = requireNotNull(repositoriesValue) { "repositories is required" }.toList()
      set(`value`) {
        repositoriesValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineOrgsSettingsImmutableReleasesRepositoriesGetResponse200JsonX97774743 {
      check(repositoriesValue != null) { "repositories is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsSettingsImmutableReleasesRepositoriesGetResponse200JsonX97774743(
        repositories = repositories,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsSettingsImmutableReleasesRepositoriesGetResponse200JsonX97774743 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsSettingsImmutableReleasesRepositoriesGetResponse200JsonX97774743> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsSettingsImmutableReleasesRepositoriesGetResponse200JsonX97774743 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsSettingsImmutableReleasesRepositoriesGetResponse200JsonX97774743")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsSettingsImmutableReleasesRepositoriesGetResponse200JsonX97774743 must be a JSON object")
      val repositories = json.decodeRequired<List<MinimalRepository>>(rawObject, "repositories")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsSettingsImmutableReleasesRepositoriesGetResponse200JsonX97774743(
        repositories = repositories,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsSettingsImmutableReleasesRepositoriesGetResponse200JsonX97774743) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsSettingsImmutableReleasesRepositoriesGetResponse200JsonX97774743")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("repositories", json.encodeToJsonElement(value.repositories))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsSettingsImmutableReleasesRepositoriesGetResponse200JsonX97774743(block: InlineOrgsSettingsImmutableReleasesRepositoriesGetResponse200JsonX97774743.Builder.() -> Unit): InlineOrgsSettingsImmutableReleasesRepositoriesGetResponse200JsonX97774743 = InlineOrgsSettingsImmutableReleasesRepositoriesGetResponse200JsonX97774743.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsSettingsImmutableReleasesRepositoriesGetResponse200JsonX97774743 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
