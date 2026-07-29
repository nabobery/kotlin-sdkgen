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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1codespaces~1secrets~1{secret_name}~1repositories/get/responses/200
 * /content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1codespaces~1secrets~1{secret_name}~1repositories/get/responses/200
 * /content/application~1json/schema
 */
@Serializable(with = InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e.Serializer::class)
public class InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e(
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

    public fun build(): InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e {
      check(repositoriesValue != null) { "repositories is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e(
        repositories = repositories,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e must be a JSON object")
      val repositories = json.decodeRequired<List<MinimalRepository>>(rawObject, "repositories")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e(
        repositories = repositories,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("repositories", json.encodeToJsonElement(value.repositories))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e(block: InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e.Builder.() -> Unit): InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e = InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
