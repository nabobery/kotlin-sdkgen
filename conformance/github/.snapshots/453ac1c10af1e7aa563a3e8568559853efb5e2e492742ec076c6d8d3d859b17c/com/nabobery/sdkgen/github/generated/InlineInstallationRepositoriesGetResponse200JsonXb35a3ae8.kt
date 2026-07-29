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
 * sdkgen://source/openapi.yaml#/paths/~1installation~1repositories/get/responses/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1installation~1repositories/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8.Serializer::class)
public class InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8(
  repositories: List<InlineInstallationRepositoriesGetResponse200JsonRepositoriesItemX7e3c1411>,
  public val totalCount: Int,
  public val repositorySelection: String? = null,
) {
  public val repositories:
      List<InlineInstallationRepositoriesGetResponse200JsonRepositoriesItemX7e3c1411> =
      repositories.toList()

  public class Builder {
    private var repositoriesValue:
        List<InlineInstallationRepositoriesGetResponse200JsonRepositoriesItemX7e3c1411>? = null

    public var repositories:
        List<InlineInstallationRepositoriesGetResponse200JsonRepositoriesItemX7e3c1411>
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

    public var repositorySelection: String? = null

    public fun build(): InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8 {
      check(repositoriesValue != null) { "repositories is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8(
        repositories = repositories,
        totalCount = totalCount,
        repositorySelection = repositorySelection,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8 must be a JSON object")
      val repositories = json.decodeRequired<List<InlineInstallationRepositoriesGetResponse200JsonRepositoriesItemX7e3c1411>>(rawObject, "repositories")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8(
        repositories = repositories,
        totalCount = totalCount,
        repositorySelection = rawObject["repository_selection"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("repositories", json.encodeToJsonElement(value.repositories))
        put("total_count", json.encodeToJsonElement(value.totalCount))
        value.repositorySelection?.let { put("repository_selection", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineInstallationRepositoriesGetResponse200JsonXb35a3ae8(block: InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8.Builder.() -> Unit): InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8 = InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
