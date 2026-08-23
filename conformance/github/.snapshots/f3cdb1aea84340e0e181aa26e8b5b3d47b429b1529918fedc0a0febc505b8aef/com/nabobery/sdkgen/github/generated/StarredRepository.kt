package com.nabobery.sdkgen.github.generated

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
 * Starred Repository
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/starred-repository
 */
@Serializable(with = StarredRepository.Serializer::class)
public class StarredRepository(
  public val repo: Repository,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val starredAt: String,
) {
  public class Builder {
    private var repoValue: Repository? = null

    public var repo: Repository
      get() = requireNotNull(repoValue) { "repo is required" }
      set(`value`) {
        repoValue = value
      }

    private var starredAtValue: String? = null

    public var starredAt: String
      get() = requireNotNull(starredAtValue) { "starredAt is required" }
      set(`value`) {
        starredAtValue = value
      }

    public fun build(): StarredRepository {
      check(repoValue != null) { "repo is required" }
      check(starredAtValue != null) { "starredAt is required" }
      return StarredRepository(
        repo = repo,
        starredAt = starredAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): StarredRepository = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<StarredRepository> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): StarredRepository {
      val jsonDecoder = decoder.requireJsonDecoder("StarredRepository")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("StarredRepository must be a JSON object")
      val repo = json.decodeRequired<Repository>(rawObject, "repo")
      val starredAt = json.decodeRequired<String>(rawObject, "starred_at")
      return StarredRepository(
        repo = repo,
        starredAt = starredAt,
      )
    }

    override fun serialize(encoder: Encoder, `value`: StarredRepository) {
      val jsonEncoder = encoder.requireJsonEncoder("StarredRepository")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("repo", json.encodeToJsonElement(value.repo))
        put("starred_at", value.starredAt)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun starredRepository(block: StarredRepository.Builder.() -> Unit): StarredRepository = StarredRepository.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("StarredRepository is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
