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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1codespaces~1devcontainers/get/responses/200/content/app
 * lication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1codespaces~1devcontainers/get/responses/200/content/app
 * lication~1json/schema
 */
@Serializable(with = InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6.Serializer::class)
public class InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6(
  devcontainers: List<InlineReposCodespacesDevcontainersGetResponse200JsonDevcontainersItemX09de1fb8>,
  public val totalCount: Int,
) {
  public val devcontainers:
      List<InlineReposCodespacesDevcontainersGetResponse200JsonDevcontainersItemX09de1fb8> =
      devcontainers.toList()

  public class Builder {
    private var devcontainersValue:
        List<InlineReposCodespacesDevcontainersGetResponse200JsonDevcontainersItemX09de1fb8>? = null

    public var devcontainers:
        List<InlineReposCodespacesDevcontainersGetResponse200JsonDevcontainersItemX09de1fb8>
      get() = requireNotNull(devcontainersValue) { "devcontainers is required" }
      set(`value`) {
        devcontainersValue = value
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6 {
      check(devcontainersValue != null) { "devcontainers is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6(
        devcontainers = devcontainers,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6 must be a JSON object")
      val devcontainers = json.decodeRequired<List<InlineReposCodespacesDevcontainersGetResponse200JsonDevcontainersItemX09de1fb8>>(rawObject, "devcontainers")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6(
        devcontainers = devcontainers,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("devcontainers", json.encodeToJsonElement(value.devcontainers))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6(block: InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6.Builder.() -> Unit): InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6 = InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
