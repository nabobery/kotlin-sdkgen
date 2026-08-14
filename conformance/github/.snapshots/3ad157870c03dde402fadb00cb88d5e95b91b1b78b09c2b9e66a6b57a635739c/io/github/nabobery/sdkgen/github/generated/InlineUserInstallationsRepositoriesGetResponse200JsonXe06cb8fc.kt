package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1user~1installations~1{installation_id}~1repositories/get/responses/200/content/
 * application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1installations~1{installation_id}~1repositories/get/responses/200/content/
 * application~1json/schema
 */
@Serializable(with = InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc.Serializer::class)
public class InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc(
  repositories: List<InlineUserInstallationsRepositoriesGetResponse200JsonRepositoriesItemX95ab4dd7>,
  public val totalCount: Int,
  public val repositorySelection: String? = null,
) {
  public val repositories:
      List<InlineUserInstallationsRepositoriesGetResponse200JsonRepositoriesItemX95ab4dd7> =
      repositories.toList()

  public class Builder {
    private var repositoriesValue:
        List<InlineUserInstallationsRepositoriesGetResponse200JsonRepositoriesItemX95ab4dd7>? = null

    public var repositories:
        List<InlineUserInstallationsRepositoriesGetResponse200JsonRepositoriesItemX95ab4dd7>
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

    public fun build(): InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc {
      check(repositoriesValue != null) { "repositories is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc(
        repositories = repositories,
        totalCount = totalCount,
        repositorySelection = repositorySelection,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc must be a JSON object")
      val repositories = json.decodeRequired<List<InlineUserInstallationsRepositoriesGetResponse200JsonRepositoriesItemX95ab4dd7>>(rawObject, "repositories")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc(
        repositories = repositories,
        totalCount = totalCount,
        repositorySelection = rawObject["repository_selection"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc")
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

public fun inlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc(block: InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc.Builder.() -> Unit): InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc = InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
